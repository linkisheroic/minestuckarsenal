package com.natura.minestuckarsenal;

import com.mraof.minestuck.item.MinestuckItems;
import com.mraof.minestuck.util.CombinationRegistry;
import com.mraof.minestuck.util.GristRegistry;
import com.mraof.minestuck.util.GristSet;
import com.mraof.minestuck.util.GristType;
import com.natura.minestuckarsenal.item.MinestuckArsenalItems;
import static com.natura.minestuckarsenal.item.MinestuckArsenalItems.*;
import static com.natura.minestuckarsenal.block.MinestuckArsenalBlocks.*;

import com.ibm.icu.text.Normalizer.Mode;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class AlchemyRecipes {

	public static void registerMinestuckRecipes() {
		//Grist Registries
		
		GristRegistry.addGristConversion(new ItemStack(MinestuckArsenalItems.paperSword), false, new GristSet(GristType.Build, 12));	
		GristRegistry.addGristConversion(new ItemStack(MinestuckItems.caledfwlch), new GristSet(new GristType[] {GristType.Build, GristType.Gold, GristType.Diamond}, new int[] {14000, 8000, 4000}));
		
		GristRegistry.addGristConversion(new ItemStack(brokenCaledfwlch), new GristSet(new GristType[] {GristType.Build, GristType.Gold, GristType.Diamond}, new int[] {7000, 4000, 2000}));
		GristRegistry.addGristConversion(new ItemStack(brokenRoyalDeringer), new GristSet(new GristType[] {GristType.Build, GristType.Gold, GristType.Diamond}, new int[] {3000, 500, 650}));
		GristRegistry.addGristConversion(new ItemStack(MinestuckItems.royalDeringer), new GristSet(new GristType[] {GristType.Build, GristType.Gold, GristType.Diamond}, new int[] {6000, 1000, 1300}));
		GristRegistry.addGristConversion(new ItemStack(brokenNinjaSword), new GristSet(new GristType[] {GristType.Chalk, GristType.Quartz, GristType.Rust}, new int[] {6, 5, 3}));
		GristRegistry.addGristConversion(new ItemStack(MinestuckItems.scarletRibbitar), new GristSet(new GristType[] {GristType.Build, GristType.Ruby, GristType.Quartz}, new int[] {100000, 40000, 20000}));
		GristRegistry.addGristConversion(new ItemStack(brokenScarletRibbitar), new GristSet(new GristType[] {GristType.Build, GristType.Ruby, GristType.Quartz}, new int[] {50000, 200000, 10000}));
		
		GristRegistry.addGristConversion(new ItemStack(wrinklefucker), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale, GristType.Tar}, new int[] {55, 44, 66}));
	
		GristRegistry.addGristConversion(new ItemStack(hemeoreaper), false, new GristSet(new GristType[] {GristType.Build, GristType.Rust, GristType.Garnet, GristType.Iodine}, new int[] {250, 85, 75, 24}));
		
		GristRegistry.addGristConversion(new ItemStack(joustingLance), false, new GristSet(GristType.Build, 15));
		GristRegistry.addGristConversion(new ItemStack(fiduspawnLance), false, new GristSet(new GristType[] {GristType.Build, GristType.Tar, GristType.Shale}, new int[] {30, 22, 16}));
		
		GristRegistry.addGristConversion(new ItemStack(leatherWhip), false, new GristSet(GristType.Build, 12));
		
		GristRegistry.addGristConversion(new ItemStack(hostPlush), false, new GristSet(GristType.Build, 5));
		
		GristRegistry.addGristConversion(new ItemStack(uniqueObject), false, new GristSet(new GristType[] {GristType.Amber, GristType.Amethyst, GristType.Artifact, GristType.Build, GristType.Caulk, GristType.Chalk, GristType.Cobalt, GristType.Diamond, GristType.Garnet, GristType.Gold, GristType.Iodine, GristType.Marble, GristType.Mercury, GristType.Quartz, GristType.Ruby, GristType.Rust, GristType.Shale, GristType.Sulfur, GristType.Tar, GristType.Uranium, GristType.Zillium}, new int[] {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}));
		
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.katana), new ItemStack(Items.PAPER), CombinationRegistry.MODE_AND, new ItemStack(paperSword));
		CombinationRegistry.addCombination(new ItemStack(brokenRoyalDeringer), new ItemStack(magicCueball), CombinationRegistry.MODE_AND, new ItemStack(MinestuckItems.caledfwlch));
		
		CombinationRegistry.addCombination(new ItemStack(Items.LEATHER), new ItemStack(Items.STRING), CombinationRegistry.MODE_AND, new ItemStack(MinestuckArsenalItems.leatherWhip));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.homesSmellYaLater), new ItemStack(MinestuckItems.minestuckBucket, 2), CombinationRegistry.MODE_AND, new ItemStack(hemeoreaper));
		CombinationRegistry.addCombination(new ItemStack(hostPlush), new ItemStack(joustingLance), CombinationRegistry.MODE_AND, new ItemStack(fiduspawnLance));
	
	}
	
	public static void registerVanillaRecipes() 
	{
		
	}
	public static void registerModRecipes() 
	{
		
	}
}
