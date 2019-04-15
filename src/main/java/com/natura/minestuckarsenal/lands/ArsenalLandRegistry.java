package com.natura.minestuckarsenal.lands;

import com.mraof.minestuck.world.lands.LandAspectRegistry;
import com.natura.minestuckarsenal.lands.terrain.LandAspectSugar;

public class ArsenalLandRegistry {
	
	public static void registerLandAspects()
	{
		LandAspectRegistry.registerLandAspect(new LandAspectSugar());
	}

}
