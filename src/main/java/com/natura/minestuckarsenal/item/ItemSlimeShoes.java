package com.natura.minestuckarsenal.item;

import java.util.Random;

import org.lwjgl.input.Keyboard;

import com.mraof.minestuck.item.MinestuckItems;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class ItemSlimeShoes extends ItemArmor {

	public ItemSlimeShoes(String name,ItemArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setCreativeTab(MinestuckItems.tabMinestuck);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		player.fallDistance = 0.0F; 
	}
}
