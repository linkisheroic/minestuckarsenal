package com.natura.minestuckarsenal;

import com.natura.minestuckarsenal.block.MinestuckArsenalBlocks;
import com.natura.minestuckarsenal.captchalouge.ModusHandler;
import com.natura.minestuckarsenal.client.SoundEvents;
import com.natura.minestuckarsenal.entity.MinestuckArsenalEntities;
import com.natura.minestuckarsenal.item.MinestuckArsenalItems;
import com.natura.minestuckarsenal.proxy.CommonProxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MinestuckArsenal.MODID, name = MinestuckArsenal.MODNAME, version = MinestuckArsenal.VERSION, useMetadata = true, acceptedMinecraftVersions = "[1.12,1.12.2]")
public class MinestuckArsenal {

    public static final String MODID = "minestuckarsenal";
    public static final String MODNAME = "Minestuck Arsenal";
    public static final String VERSION = "1.0.9";

    @SidedProxy(clientSide = "com.natura.minestuckarsenal.proxy.ClientProxy", serverSide = "com.natura.minestuckarsenal.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MODID)
    public static MinestuckArsenal instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
		MinecraftForge.EVENT_BUS.register(SoundEvents.instance);
      	MinecraftForge.EVENT_BUS.register(MinestuckArsenalBlocks.class);
    	MinecraftForge.EVENT_BUS.register(MinestuckArsenalItems.class);
    	MinecraftForge.EVENT_BUS.register(new ArsenalGrist());
    	proxy.preInit();
    	
    }
    

    @EventHandler
    public void init(FMLInitializationEvent e) {
    	
    	MinestuckArsenalEntities.registerEntities();
    	
    	MinecraftForge.EVENT_BUS.register(new LootTableEventHandler());
    	MinecraftForge.EVENT_BUS.register(new ItemAttackEventHandler());
    	MinecraftForge.EVENT_BUS.register(new GristDropEventHandler());
    	MinecraftForge.EVENT_BUS.register(new EntityInteractEventHandler());
    	MinecraftForge.EVENT_BUS.register(new PlayerRespawnEvent());
		/*
		ArsenalKindAbstratusList.registerTypes();
		*/
    	ModusHandler.registerModus();
        proxy.init();
        AlchemyRecipes.registerVanillaRecipes();
    	AlchemyRecipes.registerMinestuckRecipes();
    	AlchemyRecipes.registerModRecipes();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	
        proxy.postInit();
    
    }
    
    
}

