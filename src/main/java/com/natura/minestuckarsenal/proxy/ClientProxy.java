package com.natura.minestuckarsenal.proxy;

import com.natura.minestuckarsenal.client.ClientEventHandler;
import com.natura.minestuckarsenal.client.ModelManager;
import com.natura.minestuckarsenal.entity.EntityBarbasolBomb;
import com.natura.minestuckarsenal.entity.EntitySuitarang;
import com.natura.minestuckarsenal.entity.RenderBarbasolBomb;
import com.natura.minestuckarsenal.entity.RenderSuitarang;

import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {

	public static ModelBiped modelClothes = new ModelBiped(0.5F);
	
	@Override
	public void preInit() {
		MinecraftForge.EVENT_BUS.register(ModelManager.class);
		MinecraftForge.EVENT_BUS.register(new ClientEventHandler());
		RenderingRegistry.registerEntityRenderingHandler(EntityBarbasolBomb.class, RenderBarbasolBomb.getFactory(1.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySuitarang.class, RenderSuitarang.getFactory(1.0F));
	}
	
	@Override
	public void init() {
	
	}
	
	
}
