package com.natura.minestuckarsenal.entity;

import com.mraof.minestuck.Minestuck;
import com.mraof.minestuck.entity.item.EntityCrewPoster;
import com.natura.minestuckarsenal.MinestuckArsenal;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class MinestuckArsenalEntities {

	public static int currentEntityIdOffset = 0;
	
	public static void registerEntities()
	{
		registerEntity(EntityBullet.class, "bullet");
		registerEntity(EntityBarbasolBomb.class, "barbasol_bomb");
		registerEntity(EntitySuitarang.class, "suitarang");
		registerEntity(EntityHorsePoster.class, "horseFootballPlayerPoster", "horse_football_player_poster");
	}
	
	public static void registerEntity(Class<? extends Entity> entityClass, String name)
	{
		registerEntity(entityClass, name, name, 80, 3, true);
	}
	
	//registers entity with forge and minecraft, and increases currentEntityIdOffset by one in order to prevent id collision
	public static void registerEntity(Class<? extends Entity> entityClass, String name, String registryName)
	{
		registerEntity(entityClass, name, registryName, 100, 3, true);
	}

	public static void registerEntity(Class<? extends Entity> entityClass, String name, String registryName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates)
	{
		EntityRegistry.registerModEntity(new ResourceLocation("minestuckarsenal", registryName), entityClass, "minestuckarsenal." + name, currentEntityIdOffset, MinestuckArsenal.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
		currentEntityIdOffset++;
	}
}
