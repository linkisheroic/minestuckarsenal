package com.natura.minestuckarsenal;

import java.io.File;

import com.mraof.minestuck.Minestuck;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MinestuckArsenalConfig {
	
	public static Configuration config;
	public static Side gameSide;
	
	public static boolean connectionGrist = true;
	public static boolean use32Textures = false;
	public static boolean tinkersCompat = true;
	public static int impMulti = 0;
	public static int ogreMulti = 20;
	public static int basiliskMulti = 50;
	public static int lichMulti = 120;
	public static int giclopsMulti = 300;
	public static int powerHubOutput = 1000;
	public static int powerHubStorage = 1000000;
	public static int powerHubBurnTime = 2400;
	public static int gristGathererRange = 8;
	
	static void loadConfigFile(File file, Side side)
	{
		gameSide = side;
		config = new Configuration(file, true);
		config.load();
		
		impMulti = config.get("General", "impMulti", 1, "Multiplies the of grist that drops from imps. Set to 1 to disable the multiplier.").setMinValue(0).setLanguageKey("minestuckarsenal.config.impMulti").setRequiresMcRestart(false).getInt();
		ogreMulti = config.get("General", "ogreMulti", 20, "Multiplies the of grist that drops from ogres. Set to 1 to disable the multiplier.").setMinValue(0).setLanguageKey("minestuckarsenal.config.ogreMulti").setRequiresMcRestart(false).getInt();
		basiliskMulti = config.get("General", "basiliskMulti", 50, "Multiplies the of grist that drops from basilisks. Set to 1 to disable the multiplier.").setMinValue(0).setLanguageKey("minestuckarsenal.config.basiliskMulti").setRequiresMcRestart(false).getInt();
		lichMulti = config.get("General", "lichMulti", 120, "Multiplies the of grist that drops from liches. Set to 1 to disable the multiplier.").setMinValue(0).setLanguageKey("minestuckarsenal.config.lichMulti").setRequiresMcRestart(false).getInt();
		giclopsMulti = config.get("General", "giclopsMulti", 300, "Multiplies the of grist that drops from giclops. Set to 1 to disable the multiplier.").setMinValue(0).setLanguageKey("minestuckarsenal.config.giclopsMulti").setRequiresMcRestart(false).getInt();
		connectionGrist = config.getBoolean("connectionGrist", "General", true, "Choose whether or not the starting amount of build grist you recieve is scaled with more players");
		use32Textures = config.getBoolean("use32Textures", "General", false, "Choose whether or not to use higher resolution textures.");
		tinkersCompat = config.getBoolean("tinkersCompat", "General", true, "Use Tinker's Construct support.");
		powerHubOutput = config.getInt("powerHubOutput", "General", 1000, 1, 1000000, "Power Hub RF Output in ticks. 20 ticks = 1 second.");
		powerHubStorage = config.getInt("powerHubStorage", "General", 1000000, 10000, 1000000, "Power Hub RF Internal Storage. Caps at 1 million, minimum of 10000.");
		powerHubBurnTime = config.getInt("powerHubBurnTime", "General", 2400, 1, 1000000, "Amount of time it takes the power hub to burn through 1 uranium lump.");
		gristGathererRange = config.getInt("gristGathererRange", "General", 8, 1, 16, "Range at which the grist gatherer picks up grist. Max of 16 blocks.");

		
		config.save();
		
	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if(event.getModID().equals(MinestuckArsenal.class.getAnnotation(Mod.class).modid()))
		{
			
			config.save();
			
		}
	}

}
