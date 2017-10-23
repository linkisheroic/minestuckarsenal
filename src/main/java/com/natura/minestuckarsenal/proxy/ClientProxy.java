package com.natura.minestuckarsenal.proxy;

import com.natura.minestuckarsenal.client.ClientEventHandler;
import com.natura.minestuckarsenal.client.ModelManager;
import com.natura.minestuckarsenal.entity.EntityBarbasolBomb;
import com.natura.minestuckarsenal.entity.RenderBarbasolBomb;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {

	@Override
	public void preInit() {
		MinecraftForge.EVENT_BUS.register(ModelManager.class);
		MinecraftForge.EVENT_BUS.register(new ClientEventHandler());
		RenderingRegistry.registerEntityRenderingHandler(EntityBarbasolBomb.class, RenderBarbasolBomb.getFactory(1.0F));
	}
	
	@Override
	public void init() {
	
	}
	
	
}
