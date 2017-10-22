package com.natura.minestuckarsenal.item;

import com.mraof.minestuck.item.MinestuckItems;
import com.mraof.minestuck.item.weapon.ItemCandyWeapon;
import com.mraof.minestuck.item.weapon.ItemDualWeapon;
import com.mraof.minestuck.item.weapon.ItemPogoWeapon;
import com.mraof.minestuck.item.weapon.ItemWeapon;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
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
	public static Item derseReaper = new ItemWeapon(200, 4, -2.4D, 12, "derseReaper").setRegistryName("derse_reaper");
	public static Item prospitReaper = new ItemWeapon(200, 4, -2.4D, 12, "prospitReaper").setRegistryName("prospit_reaper");
	public static Item hemeoreaper = new ItemWeapon(550, 6, -2.4D, 15, "hemeoreaper").setRegistryName("hemeoreaper");
	
	
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
	public static Item poseidonsEntente = new ItemWeapon(650, 8, -2.6D, 10, "poseidonsEntente").setRegistryName("poseidons_entente");
	public static Item imperialFork = new ItemWeapon(1200, 10, -2.6D, 12, "emperialFork").setRegistryName("emperial_fork");
	
	//makeupKind
	public static Item lipstickChainsaw = new ItemDualWeapon(250, 1.0D, 5.0D, -1.5D,-2.5D, 10, "lipstickChainsaw").setRegistryName("lipstick_chainsaw");
	
	
	//clubKind
	
	
	//sporkKind
	
	
	//lanceKind
	public static Item joustingLance = new ItemWeapon(250, 5.0D, -2.8D, 6, "joustingLance").setRegistryName("jousting_lance");
	public static Item fiduspawnLance = new ItemWeapon(100, 4.0D, -2.8D, 5, "fiduspawnLance").setRegistryName("fiduspawn_lance");
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
	
	//Food
	public static Item appleJuice = new ItemArsenalBeverage("appleJuice").setRegistryName("apple_juice");
	public static Item scottyDog = new ItemFood(2, 0.4F, false).setRegistryName("scotty_dog").setUnlocalizedName("scottyDog").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item licoriceGummyBear = new ItemFood(2, 0.4F, false).setRegistryName("licorice_gummy_bear").setUnlocalizedName("licoriceGummyBear").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item licoriceFish = new ItemFood(2, 0.4F, false).setRegistryName("licorice_fish").setUnlocalizedName("licoriceFish").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item cottonCandy = new ItemFood(4, 0.5F, false).setRegistryName("cotton_candy").setUnlocalizedName("cottonCandy").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item cuttlefish = new ItemFood(5, 0.5F, false).setRegistryName("cuttlefish").setUnlocalizedName("cuttlefish").setCreativeTab(MinestuckItems.tabMinestuck);

	//Other
	public static Item clothesIron = new Item().setRegistryName("clothes_iron").setUnlocalizedName("clothesIron").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item barbasol = new Item().setRegistryName("barbasol").setUnlocalizedName("barbasol").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item magicCueball = new Item().setRegistryName("magic_cueball").setUnlocalizedName("magicCueball").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item fridgeMagnet = new Item().setRegistryName("fridge_magnet").setUnlocalizedName("fridgeMagnet").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item hostPlush = new Item().setRegistryName("host_plush").setUnlocalizedName("hostPlush").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item magicEightBall = new Item().setRegistryName("magic_eight_ball").setUnlocalizedName("magicEightBall").setCreativeTab(MinestuckItems.tabMinestuck);

	
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
		registry.register(derseReaper);
		registry.register(prospitReaper);
		registry.register(hemeoreaper);
		
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
		registry.register(poseidonsEntente);
		registry.register(imperialFork);
		
		//makeupKind
		registry.register(lipstickChainsaw);
		
		//lanceKind
		registry.register(joustingLance);
		registry.register(fiduspawnLance);
		registry.register(cigaretteHolderLance);
		registry.register(rocketPopLance);
		
		//batKind
		registry.register(woodenBat);
		registry.register(cricketBat);
		
		//clawKind
		registry.register(nepetaClaws);
		registry.register(blueClaws);
		
		//whipKind
		registry.register(leatherWhip);
		
		//food
		registry.register(appleJuice);
		registry.register(scottyDog);
		registry.register(licoriceFish);
		registry.register(licoriceGummyBear);
		registry.register(cottonCandy);
		registry.register(cuttlefish);
		
		//other
		registry.register(clothesIron);
		registry.register(barbasol);
		registry.register(magicCueball);
		registry.register(fridgeMagnet);
		registry.register(hostPlush);
		registry.register(magicEightBall);
	}
	
}
