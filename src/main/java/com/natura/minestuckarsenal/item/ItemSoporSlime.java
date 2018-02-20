package com.natura.minestuckarsenal.item;

import com.mraof.minestuck.item.MinestuckItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSoporSlime extends ItemFood {

	public ItemSoporSlime() {
		super(2, 0, false);
		setUnlocalizedName("soporSlime");
		setRegistryName("sopor_slime");
		this.setCreativeTab(MinestuckItems.tabMinestuck);
		setAlwaysEdible();
		setMaxStackSize(16);
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 200, 1));
		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 200, 1));
		player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 200, 1));
	}
	
}
