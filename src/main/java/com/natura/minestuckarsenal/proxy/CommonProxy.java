package com.natura.minestuckarsenal.proxy;

import com.natura.minestuckarsenal.AlchemyRecipes;
import com.natura.minestuckarsenal.ArsenalGrist;
import com.natura.minestuckarsenal.MinestuckArsenalConfig;
import com.natura.minestuckarsenal.block.MinestuckArsenalBlocks;
import com.natura.minestuckarsenal.captchalouge.ModusHandler;
import com.natura.minestuckarsenal.client.SoundEvents;
import com.natura.minestuckarsenal.entity.MinestuckArsenalEntities;
import com.natura.minestuckarsenal.event.ServerEventHandler;
import com.natura.minestuckarsenal.item.MinestuckArsenalItems;
import com.natura.minestuckarsenal.lands.ArsenalLandRegistry;
import com.natura.minestuckarsenal.packets.KeyPressSpacePacket;
import com.natura.minestuckarsenal.packets.MinestuckArsenalNetworkHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event)
	{
	
		MinestuckArsenalConfig.loadConfigFile(event.getSuggestedConfigurationFile(), event.getSide());
    	
		MinecraftForge.EVENT_BUS.register(SoundEvents.instance);
		
      	MinecraftForge.EVENT_BUS.register(MinestuckArsenalBlocks.class);
    	MinecraftForge.EVENT_BUS.register(MinestuckArsenalItems.class);
    	MinecraftForge.EVENT_BUS.register(new ArsenalGrist());
    	
	}
	
	public void init()
	{
	
		MinestuckArsenalEntities.registerEntities();
    	
    	MinecraftForge.EVENT_BUS.register(new ServerEventHandler());
    	
    	MinestuckArsenalNetworkHandler.INSTANCE.registerMessage(MinestuckArsenalNetworkHandler.class, KeyPressSpacePacket.class, 0, Side.SERVER);
		
		//ArsenalKindAbstratusList.registerTypes();
		
    	ModusHandler.registerModus();
    	
        AlchemyRecipes.registerVanillaRecipes();
    	AlchemyRecipes.registerMinestuckRecipes();
    	AlchemyRecipes.registerModRecipes();
    	
    	ArsenalLandRegistry.registerLandAspects();
    	
	}
	
	public void postInit()
	{
		
	}
}
