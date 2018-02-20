package com.natura.minestuckarsenal.item;

import java.util.Random;

import com.mraof.minestuck.item.MinestuckItems;
import com.mraof.minestuck.network.MinestuckChannelHandler;
import com.mraof.minestuck.network.MinestuckPacket;
import com.mraof.minestuck.network.MinestuckPacket.Type;
import com.mraof.minestuck.network.PlayerDataPacket;
import com.mraof.minestuck.util.MinestuckPlayerData;
import com.mraof.minestuck.util.MinestuckPlayerData.PlayerData;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBoondollar extends Item {
	
	int value;

	public ItemBoondollar(String name, int value)
	{
		super();
		this.setCreativeTab(MinestuckItems.tabMinestuck);
		this.setUnlocalizedName(name);
		this.value = value;
		
	}

	@Override
	protected boolean isInCreativeTab(CreativeTabs targetTab)
	{
		return targetTab == CreativeTabs.SEARCH || targetTab == MinestuckItems.tabMinestuck;
	}
	
	@Override
	public CreativeTabs[] getCreativeTabs()
	{
		return new CreativeTabs[] {MinestuckItems.tabMinestuck};
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean isFull3D()
	{
		return true;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
			
			ItemStack held = playerIn.getHeldItem(handIn);
			PlayerData data = MinestuckPlayerData.getData(playerIn);
			ITextComponent message = new TextComponentTranslation("You recieved " + String.valueOf(value) + " boondollars!");
			if(held.getItem() == MinestuckArsenalItems.boondollar) {
				Random rand = new Random();
				this.value = rand.nextInt(100) + 1;
			}
			if(!worldIn.isRemote) {
				data.boondollars += value;	
				playerIn.sendMessage(message);
				EntityPlayerMP player = (EntityPlayerMP) playerIn;
				MinestuckChannelHandler.sendToPlayer(MinestuckPacket.makePacket(Type.PLAYER_DATA, PlayerDataPacket.BOONDOLLAR, data.boondollars), player);
			}
			held.shrink(1);
			return new ActionResult<ItemStack>(EnumActionResult.PASS, held);
	}
}
