package com.natura.minestuckarsenal.item;

import com.mraof.minestuck.item.weapon.ItemCandyWeapon;
import com.mraof.minestuck.item.weapon.ItemDualWeapon;
import com.mraof.minestuck.item.weapon.ItemPogoWeapon;
import com.mraof.minestuck.item.weapon.ItemWeapon;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class MinestuckArsenalItems {

	//Instantiate items.
	
	//bladeKind
	public static Item paperSword = new ItemWeapon(65, 4, -2.4D, 15, "paperSword").setRegistryName("paper_sword");
	
	//1/2bladeKind
	public static Item brokenNinjaSword = new ItemWeapon(100, 3, -2.4D, 15, "brokenNinjaSword").setRegistryName("broken_katana");
	public static Item brokenCaledfwlch = new ItemWeapon(800, 4, -2.4D, 28, "brokenCaledfwlch").setRegistryName("broken_caledfwlch");
	public static Item brokenRoyalDeringer = new ItemWeapon(1200, 6, -2.4D, 28, "brokenRoyalDeringer").setRegistryName("broken_royal_deringer");
	public static Item brokenScarletRibbitar = new ItemWeapon(1800, 6, -2.4D, 28, "brokenScarletRibbitar").setRegistryName("broken_scarlet_ribbitar");
	
	//sickleKind
	public static Item babysFirstThresher = new ItemWeapon(250, 5, -2.4D, 12, "babysFirstThresher").setRegistryName("babys_first_thresher");
	
	//hammerKind
	public static Item wrinklefucker = new ItemPogoWeapon(500, 9.0D, -2.8D, 12, "wrinklefucker", 0.4).setRegistryName("wrinklefucker");
	
	//needleKind
	public static Item knittingNeedles = new ItemWeapon(150, 3, -1.8D, 6, "knittingNeedles").setRegistryName("knitting_needles");
	public static Item needleWands = new ItemWeapon(250, 5, -1.8D, 15, "needleWands").setRegistryName("needle_wands");
	public static Item thornsOfOglogoth = new ItemWeapon(400, 7, -1.8D, 16, "thornsOfOglogoth").setRegistryName("thorns_of_oglogoth");
	public static Item quillsOfEchidna = new ItemWeapon(750, 10, -1.8D, 18, "quillsOfEchidna").setRegistryName("quills_of_echidna");
	
	//pistolKind
	
	
	//rifleKind
	
	
	//bowKind
	
	
	//tridentKind
	public static Item woodenTrident = new ItemWeapon(150, 4, -2.5D, 4, "woodenTrident").setRegistryName("wooden_trident");
	public static Item silverTrident = new ItemWeapon(300, 6, -2.5D, 7, "silverTrident").setRegistryName("silver_trident");
	public static Item goldTrident = new ItemWeapon(450, 7, -2.5D, 10, "goldTrident").setRegistryName("gold_trident");
	
	//2x3dentKind
	public static Item posiedonsEntente = new ItemWeapon(650, 8, -2.6D, 10, "poseidonsEntente").setRegistryName("poseidons_entente");
	public static Item imperialFork = new ItemWeapon(1200, 10, -2.6D, 12, "imperialFork").setRegistryName("imperialFork");
	
	//makeupKind
	public static Item lipstickChainsaw = new ItemDualWeapon(250, 1.0D, 5.0D, -1.5D,-2.5D, 10, "lipstickChainsaw").setRegistryName("lipstick_chainsaw");
	
	
	//clubKind
	
	
	//sporkKind
	
	
	//lanceKind
	public static Item joustingLance = new ItemWeapon(250, 5.0D, -2.8D, 6, "joustingLance").setRegistryName("jousting_lance");
	public static Item fiduspawnLance = new ItemWeapon(100, 4.0D, -2.8D, 5, "fiduspawnLance").setRegistryName("fiduspawnLance");
	public static Item cigaretteHolderLance = new ItemWeapon(450, 6.0D, -2.8D, 8, "cigaretteLance").setRegistryName("cigarette_lance");
	public static Item rocketPopLance = new ItemCandyWeapon(500, 6.0D, -2.8D, 10, "rocketPopLance").setRegistryName("rocketpop_lance");
	
	//caneKind
	
	
	//batKind
	public static Item woodenBat = new ItemWeapon(300, 4.0D, -2.2D, 4, "woodenBat").setRegistryName("wooden_bat");
	public static Item cricketBat = new ItemWeapon(400, 5.0D, -2.2D, 6, "cricketBat").setRegistryName("cricket_bat");
	
	
	//clawKind
	public static Item nepetaClaws = new ItemDualWeapon(700, 6.0D, 1.0D, -1.5D,-1.0D, 10, "nepetaClaws").setRegistryName("nepeta_claws");
	public static Item blueClaws = new ItemDualWeapon(1200, 8.0D, 1.0D, -1.5D, -1.0D, 12, "blueClaws").setRegistryName("blue_claws");
	
	
	//axeKind
	
	
	//whipKind
	public static Item leatherWhip = new ItemWeapon(250, 5.0D, -1.5D, 6, "leatherWhip").setRegistryName("leather_whip");
	
	//thrwstrKind
	
	
	//Other
	public static Item clothesIron = new Item().setRegistryName("clothes_iron").setUnlocalizedName("clothesIron");
	public static Item barbasol = new Item().setRegistryName("barbasol").setUnlocalizedName("barbasol");
	public static Item magicCueball = new Item().setRegistryName("magic_cueball").setUnlocalizedName("magicCueball");
	public static Item fridgeMagnet = new Item().setRegistryName("fridge_magnet").setUnlocalizedName("fridgeMagnet");
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		IForgeRegistry<Item> registry = event.getRegistry();
		
		//bladeKind
		registry.register(paperSword);
		
		//1/2bladeKind
		registry.register(brokenNinjaSword);
		registry.register(brokenCaledfwlch);
		registry.register(brokenRoyalDeringer);
		registry.register(brokenScarletRibbitar);
		
		//sickleKind
		registry.register(babysFirstThresher);
		
		//hammerKind
		registry.register(wrinklefucker);
		
		//needleKind
		registry.register(knittingNeedles);
		registry.register(needleWands);
		registry.register(thornsOfOglogoth);
		registry.register(quillsOfEchidna);
		
		//tridentKind
		registry.register(woodenTrident);
		registry.register(silverTrident);
		registry.register(goldTrident);
		
		//2x3dentKind
		registry.register(posiedonsEntente);
		registry.register(imperialFork);
		
		//makeupKind
		registry.register(lipstickChainsaw);
		
		//lanceKind
		registry.register(joustingLance);
		registry.register(fiduspawnLance);
		
		//batKind
		registry.register(woodenBat);
		registry.register(cricketBat);
		
		//clawKind
		registry.register(nepetaClaws);
		registry.register(blueClaws);
		
		//whipKind
		registry.register(leatherWhip);
		
		//other
		registry.register(clothesIron);
		registry.register(barbasol);
		registry.register(magicCueball);
		registry.register(fridgeMagnet);
	}
	
}
