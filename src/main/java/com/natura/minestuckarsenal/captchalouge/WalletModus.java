package com.natura.minestuckarsenal.captchalouge;

import java.util.Iterator;

import com.mraof.minestuck.MinestuckConfig;
import com.mraof.minestuck.alchemy.AlchemyRecipes;
import com.mraof.minestuck.client.gui.captchalouge.SylladexGuiHandler;
import com.mraof.minestuck.inventory.captchalouge.CaptchaDeckHandler;
import com.mraof.minestuck.inventory.captchalouge.Modus;
import com.mraof.minestuck.item.MinestuckItems;
import com.natura.minestuckarsenal.client.WalletGuiHandler;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WalletModus extends Modus
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
			for(ItemStack item : list)
				CaptchaDeckHandler.launchAnyItem(player, item);
			list.clear();
			return ItemStack.EMPTY;
		}
		
		if(id < 0 || id >= list.size())
			return ItemStack.EMPTY;
		
		ItemStack item = list.remove(id);
		
		if(asCard)
		{
			size--;
			item = AlchemyRecipes.createCard(item, false);
		}
		return item;
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
			gui = new WalletGuiHandler(this);
		return gui;
	}

	@Override
	public boolean canSwitchFrom(Modus modus) {
		// TODO Auto-generated method stub
		return false;
	}
}