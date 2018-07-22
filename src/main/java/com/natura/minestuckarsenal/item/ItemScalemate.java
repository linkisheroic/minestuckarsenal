package com.natura.minestuckarsenal.item;

import com.mraof.minestuck.item.MinestuckItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemScalemate extends Item {

	public static final String[] names = new String[] {"lemonsnout", "pyralspite", "witness", "pucefoot", "berrybreath", "honeytongue", "pumpkinsnuffle", "applescab", "cinnamonwhiff", "pinesnort"};
	
	public ItemScalemate() {
		this.setHasSubtypes(true);
		this.setUnlocalizedName("scalemate");
		this.setRegistryName("scalemate");
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return this.getUnlocalizedName() + names[stack.getItemDamage()].substring(0, 1).toUpperCase() + names[stack.getItemDamage()].substring(1, names[stack.getItemDamage()].length());
	}
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if(this.isInCreativeTab(tab))
			for(int i = 0; i < 10; i++)
				items.add(new ItemStack(this, 1, i));
	}
}
