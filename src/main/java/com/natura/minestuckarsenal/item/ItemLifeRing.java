package com.natura.minestuckarsenal.item;

import org.lwjgl.input.Keyboard;

import com.mraof.minestuck.item.MinestuckItems;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.InventoryEnderChest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scala.swing.event.Key;

public class ItemLifeRing extends Item implements IBauble {
	
	public ItemLifeRing()
	{
		super();
		this.maxStackSize = 1;
		this.setUnlocalizedName("ringOfLife");
		this.setRegistryName("ring_of_life");
	}
	
	@Override
	public boolean isEnchantable(ItemStack stack) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean isFull3D()
	{
		return true;
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		// TODO Auto-generated method stub
		return BaubleType.RING;
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 2));
		player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 2));
	}
}
