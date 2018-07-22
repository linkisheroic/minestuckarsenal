package com.natura.minestuckarsenal.item;

import com.mraof.minestuck.item.MinestuckItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemEctoFood extends ItemFood {
	
	public float healAmount;
	
	public ItemEctoFood(int feedAmount, float saturation, boolean isWolfFood, String name, float healAmount) {
		super(feedAmount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setAlwaysEdible();
		this.healAmount = healAmount;
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		player.heal(healAmount);
	}

}
