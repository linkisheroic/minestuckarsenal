package com.natura.minestuckarsenal.item;

import java.util.Random;

import org.lwjgl.input.Keyboard;

import com.mraof.minestuck.item.MinestuckItems;
import com.natura.minestuckarsenal.client.ModelClothes;
import com.natura.minestuckarsenal.packets.KeyPressSpacePacket;
import com.natura.minestuckarsenal.packets.MinestuckArsenalNetworkHandler;
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

public class ItemRocketArmor extends ItemArmor {

	/*@SideOnly(Side.CLIENT)
	public ModelBiped model = new ModelClothes();*/
	
	private boolean isPressed = false;
	private boolean isForwardPressed = false;
	private boolean isHover = false;
	
	public ItemRocketArmor(String name,ItemArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		
		if(world.isRemote) {
			if(Keyboard.isKeyDown(Keyboard.KEY_SPACE) && Minecraft.getMinecraft().inGameHasFocus && !Minecraft.getMinecraft().isGamePaused()) {
				isPressed = true;
				if(Keyboard.isKeyDown(Keyboard.KEY_W)) {
					isForwardPressed = true;
				}
				if(player.isSneaking()) isHover = true;
			}
			
			else {
				isPressed = false;
				isHover = false;
				isForwardPressed = false;
			}
		}
		
		if(world.isRemote && isPressed == true) {
			double x = player.motionX;
			double y = player.motionY;
			double z = player.motionZ;
			EnumFacing facing = player.getHorizontalFacing();
			Random rand = new Random();
	
		
			x += rand.nextInt(1);
			y += 0.5;
			z += rand.nextInt(1);

			if(player.isAirBorne && y > 0.5) {
				y = 0.5;
			}
			
			if(isHover) y = 0;
			/*if(isForwardPressed) {
				if(facing == EnumFacing.EAST) {
					x = x + 1;
					if(x > 1) x = 1;
				}
				
				if(facing == EnumFacing.WEST) {
					x = x - 1;
					if( x < -1) x = -1;
				}
				
				if(facing == EnumFacing.NORTH) {
					z = z - 1;
					if(z < -1) z = -1;
				}
				
				if(facing == EnumFacing.SOUTH) {
					z = z + 1;
					if(z > 1) z = 1;
				}
			}*/
		
			player.setVelocity(x, y, z);
			
		
			
		}
		
		if(isPressed == true && !world.isRemote) 
		{
			if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == MinestuckArsenalItems.rocketShoes || player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == MinestuckArsenalItems.ironLassShoes) {
				ItemStack stack = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);
				stack.damageItem(1, player);
			}
		}
		
		player.fallDistance = 0.0F; 
	}	
	
	/*@SideOnly(Side.CLIENT)
	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
		return model;
	}*/
	
}
