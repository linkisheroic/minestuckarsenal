package com.natura.minestuckarsenal.item;

import com.mraof.minestuck.item.MinestuckItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ItemSorrowGushers extends ItemFood {

	public ItemSorrowGushers() {
		super(0, 0.0F, false);
		setUnlocalizedName("sorrowGushers");
		setRegistryName("sorrow_gushers");
		this.setCreativeTab(MinestuckItems.tabMinestuck);
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		player.attackEntityFrom(DamageSource.MAGIC, 4);
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(19), 200, 2));
	}
	
}
