package com.natura.minestuckarsenal.item;

import com.mraof.minestuck.item.MinestuckItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPhlegmGushers extends ItemFood {

	public ItemPhlegmGushers() {
		super(4, 0.8F, false);
		setUnlocalizedName("phlegmGushers");
		setRegistryName("phlegm_gushers");
		setAlwaysEdible();
		this.setCreativeTab(MinestuckItems.tabMinestuck);
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		player.heal(4.0F);
	}
	
}
