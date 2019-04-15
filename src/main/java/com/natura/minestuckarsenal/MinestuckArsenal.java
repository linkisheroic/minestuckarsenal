package com.natura.minestuckarsenal;

import com.mraof.minestuck.MinestuckConfig;
import com.natura.minestuckarsenal.block.MinestuckArsenalBlocks;
import com.natura.minestuckarsenal.captchalouge.ModusHandler;
import com.natura.minestuckarsenal.client.SoundEvents;
import com.natura.minestuckarsenal.entity.MinestuckArsenalEntities;
import com.natura.minestuckarsenal.item.MinestuckArsenalItems;
import com.natura.minestuckarsenal.lands.ArsenalLandRegistry;
import com.natura.minestuckarsenal.packets.KeyPressSpacePacket;
import com.natura.minestuckarsenal.packets.MinestuckArsenalNetworkHandler;
import com.natura.minestuckarsenal.proxy.CommonProxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = MinestuckArsenal.MODID, name = MinestuckArsenal.MODNAME, version = MinestuckArsenal.VERSION, useMetadata = true, dependencies = "required-after:minestuck@[1.2.258,);required-after:baubles@[1.5.2,);" ,acceptedMinecraftVersions = "[1.12,1.12.2]")
public class MinestuckArsenal {

    public static final String MODID = "minestuckarsenal";
    public static final String MODNAME = "Minestuck Arsenal";
    public static final String VERSION = "3.0.0";

    @SidedProxy(clientSide = "com.natura.minestuckarsenal.proxy.ClientProxy", serverSide = "com.natura.minestuckarsenal.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MODID)
    public static MinestuckArsenal instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	proxy.preInit(event);
    	
    }
    

    @EventHandler
    public void init(FMLInitializationEvent e) {
    	
    	proxy.init();
    	
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	
        proxy.postInit();
    
    }
    
}

