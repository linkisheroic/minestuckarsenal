package com.natura.minestuckarsenal.item;

import com.mraof.minestuck.item.MinestuckItems;
import com.mraof.minestuck.util.AlchemyRecipeHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSBAHJifier extends Item {

	public ItemSBAHJifier()
	{
		super();
		this.maxStackSize = 1;
		this.setMaxDamage(64);
		this.setCreativeTab(MinestuckItems.tabMinestuck);
		this.setUnlocalizedName("sbahjifier");
		this.setRegistryName("sbahjifier");
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
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		
		if(!worldIn.isRemote) {
			ItemStack poster = new ItemStack(MinestuckItems.sbahjPoster);
			ITextComponent message = new TextComponentTranslation("snop");
			player.inventory.addItemStackToInventory(poster);
			player.sendMessage(message);
			player.getHeldItem(hand).damageItem(1, player);
			return EnumActionResult.PASS;
		}
		
		return EnumActionResult.SUCCESS;
	}
}
