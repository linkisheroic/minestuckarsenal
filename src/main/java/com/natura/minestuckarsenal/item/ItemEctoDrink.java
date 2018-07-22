package com.natura.minestuckarsenal.item;

import com.mraof.minestuck.item.MinestuckItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemEctoDrink extends ItemFood {

	float healAmount;
	
	public ItemEctoDrink(String unlocalizedName, float healAmount) {
		super(1, 0, false);
		setUnlocalizedName(unlocalizedName);
		setAlwaysEdible();
		setMaxStackSize(16);
		this.healAmount = healAmount;
	}

	@Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.DRINK;
    }
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		player.heal(healAmount);
	}
}
