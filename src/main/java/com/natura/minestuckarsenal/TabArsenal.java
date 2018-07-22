package com.natura.minestuckarsenal;

import com.mraof.minestuck.item.MinestuckItems;
import com.mraof.minestuck.item.TabMinestuck;
import com.natura.minestuckarsenal.item.MinestuckArsenalItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabArsenal extends CreativeTabs {
	
public static final TabArsenal instance = new TabArsenal("tabArsenal");
	
	private TabArsenal(String label)
	{
		super(label);
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(MinestuckArsenalItems.wrinklefucker);
	}

}
