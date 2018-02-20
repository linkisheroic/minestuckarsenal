package com.natura.minestuckarsenal.captchalouge;

import java.util.Iterator;

import com.mraof.minestuck.MinestuckConfig;
import com.mraof.minestuck.client.gui.captchalouge.SylladexGuiHandler;
import com.mraof.minestuck.inventory.captchalouge.CaptchaDeckHandler;
import com.mraof.minestuck.inventory.captchalouge.Modus;
import com.mraof.minestuck.item.MinestuckItems;
import com.mraof.minestuck.network.MinestuckChannelHandler;
import com.mraof.minestuck.network.MinestuckPacket;
import com.mraof.minestuck.network.PlayerDataPacket;
import com.mraof.minestuck.network.MinestuckPacket.Type;
import com.mraof.minestuck.util.AlchemyRecipeHandler;
import com.mraof.minestuck.util.MinestuckPlayerData;
import com.mraof.minestuck.util.MinestuckPlayerData.PlayerData;
import com.natura.minestuckarsenal.client.MoneyGuiHandler;
import com.natura.minestuckarsenal.client.WalletGuiHandler;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MoneyModus extends Modus
{
	
	protected int size;
	protected NonNullList<ItemStack> list;
	
	@SideOnly(Side.CLIENT)
	protected boolean changed;
	@SideOnly(Side.CLIENT)
	protected NonNullList<ItemStack> items;
	@SideOnly(Side.CLIENT)
	protected SylladexGuiHandler gui;
	
	@Override
	public void initModus(NonNullList<ItemStack> prev, int size)
	{
		this.size = size;
		list = NonNullList.<ItemStack>create();
		/*if(prev != null)
		{
			for(ItemStack stack : prev)
				if(stack != null)
					list.add(stack);
		}*/
		
		if(player.world.isRemote)
		{
			items = NonNullList.<ItemStack>create();
			changed = true;
		}
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		size = nbt.getInteger("size");
		list = NonNullList.<ItemStack>create();
		
		for(int i = 0; i < size; i++)
			if(nbt.hasKey("item"+i))
				list.add(new ItemStack(nbt.getCompoundTag("item"+i)));
			else break;
		if(side.isClient())
		{
			if(items == null)
				items = NonNullList.create();
			changed = true;
		}
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt)
	{
		nbt.setInteger("size", size);
		Iterator<ItemStack> iter = list.iterator();
		for(int i = 0; i < list.size(); i++)
		{
			ItemStack stack = iter.next();
			nbt.setTag("item"+i, stack.writeToNBT(new NBTTagCompound()));
		}
		return nbt;
	}
	
	@Override
	public boolean putItemStack(ItemStack item)
	{
		if(size <= list.size() || item.isEmpty())
			return false;
		
		list.add(item);
		
		return true;
	}
	
	@Override
	public NonNullList<ItemStack> getItems()
	{
		if(side.isServer())	//Used only when replacing the modus
		{
			NonNullList<ItemStack> items = NonNullList.<ItemStack>create();
			fillList(items);
			return items;
		}
		
		if(changed)
		{
			fillList(items);
		}
		return items;
	}
	
	protected void fillList(NonNullList<ItemStack> items)
	{
		items.clear();
		Iterator<ItemStack> iter = list.iterator();
		for(int i = 0; i < size; i++)
			if(iter.hasNext())
				items.add(iter.next());
			else items.add(ItemStack.EMPTY);
	}
	
	@Override
	public boolean increaseSize()
	{
		if(MinestuckConfig.modusMaxSize > 0 && size >= MinestuckConfig.modusMaxSize)
			return false;
		
		size++;
		
		return true;
	}
	
	@Override
	public ItemStack getItem(int id, boolean asCard)
	{
		if(id == CaptchaDeckHandler.EMPTY_CARD)
		{
			if(list.size() < size)
			{
				size--;
				return new ItemStack(MinestuckItems.captchaCard);
			} else return ItemStack.EMPTY;
		}
		
		if(list.isEmpty())
			return ItemStack.EMPTY;
		
		if(id == CaptchaDeckHandler.EMPTY_SYLLADEX)
		{
			PlayerData data = MinestuckPlayerData.getData(player);
			int counter = 0;
			for(ItemStack item : list) {
				if(data.boondollars >= item.getCount()) {
					CaptchaDeckHandler.launchAnyItem(player, item);
					list.remove(counter);
					data.boondollars -= item.getCount();
					ITextComponent message = new TextComponentTranslation("You spent " + String.valueOf(item.getCount()) + " boondollars to remove this from your Sylladex.");
					player.sendMessage(message);
					
					if(!player.world.isRemote) {
						MinestuckChannelHandler.sendToPlayer(
								MinestuckPacket.makePacket(Type.PLAYER_DATA, PlayerDataPacket.BOONDOLLAR, data.boondollars),
								player);
					}
				}
				else if(data.boondollars < item.getCount()) {
					ITextComponent message = new TextComponentTranslation("You don't have enough boondollars to remove that item!");
					return ItemStack.EMPTY;
				}
				counter += 1;
			}
			
			return ItemStack.EMPTY;
		}
		
		if(id < 0 || id >= list.size())
			return ItemStack.EMPTY;
		
		PlayerData data = MinestuckPlayerData.getData(player);
		ItemStack items = list.get(id);
		
		if(data.boondollars >= items.getCount()) {
			ItemStack item = list.remove(id);
			ITextComponent message = new TextComponentTranslation("You spent " + String.valueOf(items.getCount()) + " boondollars to remove this from your Sylladex.");
			
			if(asCard)
			{
				size--;
				item = AlchemyRecipeHandler.createCard(item, false);
			}
			
			data.boondollars -= items.getCount();
			player.sendMessage(message);
			if(!player.world.isRemote) {
				MinestuckChannelHandler.sendToPlayer(
						MinestuckPacket.makePacket(Type.PLAYER_DATA, PlayerDataPacket.BOONDOLLAR, data.boondollars),
						player);
			}
			return item;
		}
		
		else return ItemStack.EMPTY;
	}
	
	
	@Override
	public int getSize()
	{
		return size;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public SylladexGuiHandler getGuiHandler()
	{
		if(gui == null)
			gui = new MoneyGuiHandler(this);
		return gui;
	}

	@Override
	public boolean canSwitchFrom(Modus modus) {
		// TODO Auto-generated method stub
		return false;
	}
}