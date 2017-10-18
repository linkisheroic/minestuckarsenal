package com.natura.minestuckarsenal;

import com.mraof.minestuck.item.MinestuckItems;
import com.natura.minestuckarsenal.client.ModelManager;
import com.natura.minestuckarsenal.item.MinestuckArsenalItems;
import com.natura.minestuckarsenal.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = MinestuckArsenal.MODID, name = MinestuckArsenal.MODNAME, version = MinestuckArsenal.VERSION, useMetadata = true)
public class MinestuckArsenal {

    public static final String MODID = "minestuckarsenal";
    public static final String MODNAME = "Minestuck Arsenal";
    public static final String VERSION = "0.1.0";

    @SidedProxy(clientSide = "com.natura.minestuckarsenal.proxy.ClientProxy", serverSide = "com.natura.minestuckarsenal.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MODID)
    public static MinestuckArsenal instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	MinecraftForge.EVENT_BUS.register(MinestuckItems.class);
    	proxy.preInit();
    }
    

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
    	AlchemyRecipes.registerVanillaRecipes();
    	AlchemyRecipes.registerMinestuckRecipes();
    	AlchemyRecipes.registerModRecipes();
    	
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit();
    }
    
    
}

