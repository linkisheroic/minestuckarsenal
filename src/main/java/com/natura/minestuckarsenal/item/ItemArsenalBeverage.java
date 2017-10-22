package com.natura.minestuckarsenal.item;

import com.mraof.minestuck.item.MinestuckItems;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemArsenalBeverage extends ItemFood {

	public ItemArsenalBeverage(String unlocalizedName) {
		super(0, 0, false);
		setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(MinestuckItems.tabMinestuck);
		setAlwaysEdible();
		setMaxStackSize(16);
	}

	@Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.DRINK;
    }
}
