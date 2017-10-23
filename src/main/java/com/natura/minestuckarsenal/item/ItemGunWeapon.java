package com.natura.minestuckarsenal.item;

import com.mraof.minestuck.item.MinestuckItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemGunWeapon extends Item {
	protected double projectileDamage;
	protected double fireRate;
	
	public ItemGunWeapon(int maxUses, double damageVsEntity, double fireRate, String name)
	{
		super();
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.COMBAT);	//Needed to place recipes in the combat/tools tab
		this.setMaxDamage(maxUses);
		this.projectileDamage = damageVsEntity;
		this.fireRate = fireRate;
		this.setUnlocalizedName(name);
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
	
	protected double getAttackDamage(ItemStack stack)
	{
		return projectileDamage;
	}
	
	protected double getAttackSpeed(ItemStack stack)
	{
		return fireRate;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean isFull3D()
	{
		return true;
	}
}
