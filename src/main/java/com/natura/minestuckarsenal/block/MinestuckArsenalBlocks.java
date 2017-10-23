package com.natura.minestuckarsenal.block;

import com.mraof.minestuck.block.BlockCustom;
import com.mraof.minestuck.item.MinestuckItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class MinestuckArsenalBlocks {

	//Blocks
	public static Block uniqueObject = new BlockCustom(Material.GOURD, MapColor.LIME, SoundType.WOOD).setRegistryName("unique_object").setUnlocalizedName("uniqueObject").setHardness(1.0F).setCreativeTab(MinestuckItems.tabMinestuck);

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		IForgeRegistry<Block> registry = event.getRegistry();
		//blocks
		registry.register(uniqueObject);
	}
}
