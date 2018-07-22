package com.natura.minestuckarsenal.compat.tcon;
/*
import com.mraof.minestuck.block.BlockMinestuckStone;
import com.mraof.minestuck.block.MinestuckBlocks;
import com.mraof.minestuck.item.MinestuckItems;
import com.natura.minestuckarsenal.block.MinestuckArsenalBlocks;
import com.natura.minestuckarsenal.compat.tcon.traits.TraitCarvable;
import com.natura.minestuckarsenal.compat.tcon.traits.TraitRusting;

import net.minecraft.item.ItemStack;
/*
import slimeknights.tconstruct.library.MaterialIntegration;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.ExtraMaterialStats;
import slimeknights.tconstruct.library.materials.HandleMaterialStats;
import slimeknights.tconstruct.library.materials.HeadMaterialStats;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.library.traits.AbstractTrait;
import slimeknights.tconstruct.library.utils.HarvestLevels;


public class TConstruct {
	
	public static Material cruxite  = new Material("cruxite" , 0xA5_E1_FF);
	public static Material castIron  = new Material("cast_iron" , 0x61_1F_19);
	
    public static final AbstractTrait carvable = new TraitCarvable();
    public static final AbstractTrait rusting = new TraitRusting();
    
    public static void preInit() {
    	TinkerRegistry.addMaterialStats(TConstruct.cruxite,
            new HeadMaterialStats(250, 4f, 6f, HarvestLevels.IRON),
            new HandleMaterialStats(0.4f, 120),
            new ExtraMaterialStats(100));           
    	TinkerRegistry.integrate(new MaterialIntegration(TConstruct.cruxite, null, "cruxite")).toolforge().preInit();
    	
    	TinkerRegistry.addMaterialStats(TConstruct.castIron,
                new HeadMaterialStats(400, 5f, 8f, HarvestLevels.DIAMOND),
                new HandleMaterialStats(1.5f, 100),
                new ExtraMaterialStats(200));           
        	TinkerRegistry.integrate(new MaterialIntegration(TConstruct.castIron, MinestuckArsenalBlocks.moltenCastIron, "cast_iron")).toolforge().preInit();
        	
    }
    
    public static void init() {
    	 TConstruct.cruxite.addItem(MinestuckItems.rawCruxite, 1, Material.VALUE_Ingot);
         TConstruct.cruxite
                 .addTrait(TConstruct.carvable)
                 .setCraftable(true).setCastable(false)
                 .setRepresentativeItem(MinestuckItems.rawCruxite);
         
         TConstruct.castIron.addItem(new ItemStack(MinestuckBlocks.stone, 1, BlockMinestuckStone.CAST_META), Material.VALUE_BrickBlock, Material.VALUE_BrickBlock);
         TConstruct.castIron
                 .addTrait(TConstruct.rusting)
                 .setCraftable(true).setCastable(true)
                 .setRepresentativeItem(new ItemStack(MinestuckBlocks.stone, 1, BlockMinestuckStone.CAST_META));
    }
    
    public static void postInit() {
    	
    }
    
}
*/
