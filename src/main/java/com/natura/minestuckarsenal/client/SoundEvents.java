package com.natura.minestuckarsenal.client;

import com.mraof.minestuck.util.MinestuckSoundHandler;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class SoundEvents {
	
	public static final SoundEvents instance = new SoundEvents();

	public static ResourceLocation gristLocation = new ResourceLocation("minestuckarsenal", "pickup_grist");
	public static SoundEvent gristEvent = new SoundEvent(gristLocation).setRegistryName("pickup_grist");
	
	public static ResourceLocation gelLocation = new ResourceLocation("minestuckarsenal", "pickup_vitality_gel");
	public static SoundEvent gelEvent = new SoundEvent(gelLocation).setRegistryName("pickup_vitality_gel");
	
	public static ResourceLocation hornLocation = new ResourceLocation("minestuckarsenal", "horn_honk");
	public static SoundEvent hornEvent = new SoundEvent(hornLocation).setRegistryName("horn_honk");

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event)
	{
		IForgeRegistry<SoundEvent> registry = event.getRegistry();
		
		registry.register(gristEvent);
		registry.register(gelEvent);
		registry.register(hornEvent);
		
	}
}
