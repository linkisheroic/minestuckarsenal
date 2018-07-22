package com.natura.minestuckarsenal.item;

import java.util.Random;

import org.lwjgl.input.Keyboard;

import com.mraof.minestuck.item.MinestuckItems;
import com.natura.minestuckarsenal.client.ModelClothes;
import com.natura.minestuckarsenal.proxy.ClientProxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemDreamArmor extends ItemArmor {

	/*@SideOnly(Side.CLIENT)
	public ModelBiped model = new ModelClothes();*/
	
	public ItemDreamArmor(String name,ItemArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		
	}
	
	
	/*@SideOnly(Side.CLIENT)
	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
		return model;
	}*/
	
}
