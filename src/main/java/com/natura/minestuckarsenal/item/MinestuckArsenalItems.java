package com.natura.minestuckarsenal.item;

import static com.natura.minestuckarsenal.block.MinestuckArsenalBlocks.*;
import static com.natura.minestuckarsenal.block.MinestuckArsenalBlocks.uniqueObject;

import com.mraof.minestuck.item.ItemModus;
import com.mraof.minestuck.item.MinestuckItems;
import com.mraof.minestuck.item.weapon.ItemCandyWeapon;
import com.mraof.minestuck.item.weapon.ItemDualWeapon;
import com.mraof.minestuck.item.weapon.ItemPogoWeapon;
import com.mraof.minestuck.item.weapon.ItemPotionWeapon;
import com.mraof.minestuck.item.weapon.ItemSord;
import com.mraof.minestuck.item.weapon.ItemWeapon;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class MinestuckArsenalItems {
	
	//Items to override from Minestuck
	public static Item caledfwlch = new ItemWeapon(1200, 25, -2.4D, 30, "caledfwlch").setRegistryName("caledfwlch");
	public static Item mwrthwl = new ItemWeapon(1200, 25, -2.4D, 30, "mwrthwl").setTool("pickaxe", 4, 5.0F).setRegistryName("mwrthwl");
	public static Item fearNoAnvil = new ItemPotionWeapon(20000, 16, -2.8D, 50, "fearNoAnvil", new PotionEffect(MobEffects.SLOWNESS, 100, 100)).setTool("pickaxe", 4, 6.0F).setRegistryName("fear_no_anvil");
	
	//Instantiate items.
	public static ItemArmor.ArmorMaterial armorTrollHeadband = EnumHelper.addArmorMaterial("TROLL_HEADBAND", "minestuckarsenal:troll_headband", 50, new int[]{2, 2, 2, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static ItemArmor.ArmorMaterial armorDirkGlasses = EnumHelper.addArmorMaterial("DIRK_SHADES", "minestuckarsenal:dirk_glasses", 250, new int[] {4, 5,  4,  5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static ItemArmor.ArmorMaterial armorDerse = EnumHelper.addArmorMaterial("DERSE", "minestuckarsenal:pajamas_derse", 100, new int[] {2, 6, 4, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static ItemArmor.ArmorMaterial armorProspit = EnumHelper.addArmorMaterial("PROSPIT", "minestuckarsenal:pajamas_prospit", 100, new int[] {2, 6, 4, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static ItemArmor.ArmorMaterial armorRocket = EnumHelper.addArmorMaterial("ROCKET", "minestuckarsenal:rocket", 500, new int[] {2, 4, 6, 2}, 4, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static ItemArmor.ArmorMaterial armorIronLass = EnumHelper.addArmorMaterial("IRON_LASS", "minestuckarsenal:iron_lass", 4130, new int[] {4, 10, 8, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ItemArmor.ArmorMaterial armorSuit = EnumHelper.addArmorMaterial("SUIT", "minestuckarsenal:suit", 250, new int[] {1, 4, 5, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static ItemArmor.ArmorMaterial armorSlimeSuit = EnumHelper.addArmorMaterial("SLIME_SUIT", "minestuckarsenal:slime_suit", 350, new int[] {2, 5, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static ItemArmor.ArmorMaterial armorWiseguy = EnumHelper.addArmorMaterial("WISEGUY", "minestuckarsenal:wiseguy_slimesuit", 500, new int[] {3, 6, 7, 4}, 14, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	
	public static ItemArmor.ArmorMaterial armorSlime = EnumHelper.addArmorMaterial("SLIME", "minestuckarsenal:slime", 150, new int[] {2, 4, 6, 2}, 5, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static ItemArmor.ArmorMaterial armorJadeGlasses = EnumHelper.addArmorMaterial("GLASSES_JADE", "minestuckarsenal:glasses_jade", 100, new int[] {2, 2, 2, 2}, 5, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static ItemArmor.ArmorMaterial armorJohnGlasses = EnumHelper.addArmorMaterial("GLASSES_JOHN", "minestuckarsenal:glasses_john", 100, new int[] {2, 2, 2, 2}, 5, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static ItemArmor.ArmorMaterial armorSoothSpecs = EnumHelper.addArmorMaterial("SOOTH_SPECS", "minestuckarsenal:sooth_specs", 250, new int[] {3, 3, 3, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static ItemArmor.ArmorMaterial armorDaveGlasses = EnumHelper.addArmorMaterial("GLASSES_DAVE", "minestuckarsenal:glasses_dave", 100, new int[] {2,  2,  2,  2}, 5, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	
	//bladeKind
	public static Item paperSword = new ItemWeapon(65, 2, -2.4D, 15, "paperSword").setRegistryName("paper_sword");
	public static Item chainsawKatana = new ItemWeapon(850, 10.0D, -2.4D, 15, "chainsawKatana").setRegistryName("chainsaw_katana");
	public static Item ancestralSword = new ItemWeapon(1200,16.0D, -2.4D, 30, "ancestralSword").setRegistryName("ancestral_sword");
	public static Item cutlass = new ItemWeapon(260, 6.5D, -2.4D, 8, "cutlass").setRegistryName("cutlass");
	
	//1/2bladeKind
	public static Item brokenNinjaSword = new ItemWeapon(100, 3, -2.4D, 15, "brokenNinjaSword").setRegistryName("broken_katana");
	public static Item brokenCaledfwlch = new ItemWeapon(800, 24, -2.4D, 28, "brokenCaledfwlch").setRegistryName("broken_caledfwlch");
	public static Item brokenRoyalDeringer = new ItemWeapon(1200, 15, -2.4D, 28, "brokenRoyalDeringer").setRegistryName("broken_royal_deringer");
	public static Item brokenScarletRibbitar = new ItemWeapon(1800, 19, -2.4D, 28, "brokenScarletRibbitar").setRegistryName("broken_scarlet_ribbitar");
	
	//sickleKind
	public static Item thornySubject = new ItemWeapon(300, 5.0D, -2.4D, 8, "thornySubject").setRegistryName("thorny_subject");
	public static Item babysFirstThresher = new ItemWeapon(250, 5, -2.4D, 12, "babysFirstThresher").setRegistryName("babys_first_thresher");
	public static Item derseReaper = new ItemWeapon(200, 4, -2.4D, 12, "derseReaper").setRegistryName("derse_reaper");
	public static Item prospitReaper = new ItemWeapon(200, 4, -2.4D, 12, "prospitReaper").setRegistryName("prospit_reaper");
	public static Item hemeoreaper = new ItemWeapon(550, 9, -2.4D, 15, "hemeoreaper").setRegistryName("hemeoreaper");
	public static Item owTheEdge = new ItemSord(25, 2, -2.4D, 2, "owTheEdge").setRegistryName("ow_the_edge");
	
	//hammerKind
	public static Item wrinklefucker = new ItemPogoWeapon(500, 9.0D, -2.8D, 12, "wrinklefucker", 0.4).setRegistryName("wrinklefucker");
	public static Item barberBasher = new ItemWeapon(450, 7.0D, -2.8D, 11, "barberBasher").setRegistryName("barber_basher");
	
	//needleKind
	public static Item knittingNeedles = new ItemWeapon(150, 3, -1.8D, 6, "knittingNeedles").setRegistryName("knitting_needles");
	public static Item needleWands = new ItemWeapon(250, 7, -1.8D, 15, "needleWands").setRegistryName("needle_wands");
	public static Item thornsOfOglogoth = new ItemWeapon(400, 15, -1.8D, 16, "thornsOfOglogoth").setRegistryName("thorns_of_oglogoth");
	public static Item quillsOfEchidna = new ItemWeapon(750, 60, -1.8D, 18, "quillsOfEchidna").setRegistryName("quills_of_echidna");
	
	
	//Guns to be added later.
	//pistolKind
	public static Item beretta = new Item().setRegistryName("beretta").setUnlocalizedName("beretta").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item goldBeretta = new Item().setRegistryName("gold_beretta").setUnlocalizedName("goldBeretta").setCreativeTab(MinestuckItems.tabMinestuck);
		
	//rifleKind
	public static Item huntingRifle = new Item().setRegistryName("hunting_rifle").setUnlocalizedName("huntingRifle").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item girlsBestFriend = new Item().setRegistryName("girls_best_friend").setUnlocalizedName("girlsBestFriend").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item greenSunStreetSweeper = new Item().setRegistryName("green_sun_street_sweeper").setUnlocalizedName("greenSunStreetSweeper").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item ahabsCrosshairs = new Item().setRegistryName("ahabs_crosshairs").setUnlocalizedName("ahabsCrosshairs").setCreativeTab(MinestuckItems.tabMinestuck);
	
	//bowKind
	
	
	//tridentKind
	public static Item woodenTrident = new ItemWeapon(150, 4, -2.5D, 4, "woodenTrident").setRegistryName("wooden_trident");
	public static Item silverTrident = new ItemWeapon(300, 6, -2.5D, 7, "silverTrident").setRegistryName("silver_trident");
	public static Item goldTrident = new ItemWeapon(450, 7, -2.5D, 10, "goldTrident").setRegistryName("gold_trident");
	
	//2x3dentKind
	public static Item poseidonsEntente = new ItemWeapon(650, 12, -2.6D, 10, "poseidonsEntente").setRegistryName("poseidons_entente");
	public static Item imperialFork = new ItemWeapon(1200, 22, -2.6D, 12, "emperialFork").setRegistryName("emperial_fork");
	
	//makeupKind
	public static Item lipstickChainsaw = new ItemDualWeapon(250, 5.0D, 1.0D, -1.5D, -2.5D, 10, "lipstickChainsaw").setTool("axe", 3, 3.0F).setRegistryName("lipstick_chainsaw");
	public static Item ragripper = new ItemDualWeapon(800, 16.0D, 1.0D, -1.5D, -2.5D, 25, "demonbaneRagripper").setTool("axe", 5, 6.0F).setRegistryName("demonbane_ragripper");
	
	//clubKind
	public static Item horseHitcher = new ItemDualWeapon(500, 6.0D, 0.5D, -2.4D, -1.0D, 10, "horseHitcher").setRegistryName("horse_hitcher");
	public static Item cuestick = new ItemDualWeapon(500, 8.0D, 0.5D, -2.6D, -1.0D, 10, "cuestick").setRegistryName("cuestick");
	public static Item clubOfFelony = new ItemDualWeapon(500, 8.0D, 0.5D, -2.4D, -1.0D, 10, "clubOfFelony").setRegistryName("club_of_felony");
	
	public static Item branch = new ItemWeapon(65, 3.0D, -2.0D, 2, "branch").setRegistryName("branch");
	public static Item broom = new ItemWeapon(125, 4.0D, -2.4D, 5, "broom").setRegistryName("broom");
	
	//spearkind
	
	//sporkKind
	public static Item goldenSpork = new ItemWeapon(750, 8.0D, -2.2D, 20, "goldenSpork").setRegistryName("golden_spork");
	
	//lanceKind
	public static Item joustingLance = new ItemWeapon(250, 5.0D, -2.8D, 6, "joustingLance").setRegistryName("jousting_lance");
	public static Item fiduspawnLance = new ItemWeapon(100, 4.0D, -2.8D, 5, "fiduspawnLance").setRegistryName("fiduspawn_lance");
	public static Item cigaretteHolderLance = new ItemWeapon(450, 6.0D, -2.8D, 8, "cigaretteLance").setRegistryName("cigarette_lance");
	public static Item rocketPopLance = new ItemCandyWeapon(500, 6.0D, -2.8D, 10, "rocketPopLance").setRegistryName("rocketpop_lance");
	
	//caneKind
	public static Item blindmansDirections = new ItemWeapon(600, 8.0D, -2.4D, 12, "blindmansDirections").setRegistryName("blindmans_directions");
	public static Item blackStaff = new ItemDualWeapon(250, 4.0D, 0.0D, -2.6D, -1.0D, 4, "blackStaff").setRegistryName("black_staff");
	public static Item goldStaff = new ItemDualWeapon(450, 9.0D, 0.0D, -2.6D, 1.0D, 10, "goldStaff").setRegistryName("gold_staff");
	public static Item crowbar = new ItemWeapon(500, 8.0D, -2.6D, 20, "crowbar").setRegistryName("crowbar");
	public static Item pogoCane = new ItemPogoWeapon(400, 7.0D, -2.0D, 8, "pogoCane", 0.7).setRegistryName("pogo_cane");
	public static Item regicane = new ItemWeapon(812, 6, -2.4D, 10, "regicane").setRegistryName("regicane");
	public static Item bladedCane = new ItemWeapon(350, 6.0D, -2.0D, 10, "bladedCane").setRegistryName("bladed_cane");
	public static Item blazingGlory = new ItemWeapon(950, 7.0D, -2.0D, 14, "blazingGlory").setRegistryName("blazing_glory");
	public static Item radioactiveStaff = new ItemWeapon(650, 6.5D, -2.0D, 12, "radioactiveStaff").setRegistryName("radioactive_staff");
	
	//batKind
	public static Item woodenBat = new ItemWeapon(300, 4.0D, -2.2D, 4, "woodenBat").setRegistryName("wooden_bat");
	public static Item cricketBat = new ItemWeapon(400, 5.0D, -2.2D, 6, "cricketBat").setRegistryName("cricket_bat");
	
	//clawKind
	public static Item nepetaClaws = new ItemDualWeapon(700, 7.0D, 1.0D, -1.5D,-1.0D, 10, "nepetaClaws").setRegistryName("nepeta_claws");
	public static Item blueClaws = new ItemDualWeapon(1200, 14.0D, 1.0D, -1.5D, -1.0D, 12, "blueClaws").setRegistryName("blue_claws");
	
	//axeKind
	public static Item aks = new ItemSord(59, 3, -3.0D, 5, "aks").setRegistryName("aks");
	
	//whipKind
	public static Item leatherWhip = new ItemWeapon(250, 5.0D, -1.5D, 6, "leatherWhip").setRegistryName("leather_whip");
	
	//thrwstrKind
	public static Item suitarangHeart = new ItemSuitarang("suitarangHeart").setRegistryName("suitarang_heart");
	public static Item suitarangSpade = new ItemSuitarang("suitarangSpade").setRegistryName("suitarang_spade");
	public static Item suitarangDiamond = new ItemSuitarang("suitarangDiamond").setRegistryName("suitarang_diamond");
	public static Item suitarangClub = new ItemSuitarang("suitarangClub").setRegistryName("suitarang_club");

	//scythekind
	public static Item eightballScythe = new ItemWeapon(888, 8.0D, -2.2D, 8, "eightballScythe").setRegistryName("eightball_scythe");
	
	//bookKind
	
	//bombKind
	public static Item barbasolBomb = new ItemBarbasolBomb("barbasolBomb").setRegistryName("barbasol_bomb");
	
	//Misc Weapons
	public static Item jujuSucker = new ItemWeapon(413, 12.0D, -2.4D, 30, "jujuSucker").setRegistryName("juju_sucker");
	
	public static Item mineNGrist = new ItemMineNGrist().setUnlocalizedName("mineAndGrist").setRegistryName("mine_and_grist").setCreativeTab(MinestuckItems.tabMinestuck);
	
	//Food
	public static Item appleJuice = new ItemArsenalBeverage("appleJuice").setRegistryName("apple_juice");
	public static Item scottyDog = new ItemFood(2, 0.4F, false).setRegistryName("scotty_dog").setUnlocalizedName("scottyDog").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item licoriceGummyBear = new ItemFood(2, 0.4F, false).setRegistryName("licorice_gummy_bear").setUnlocalizedName("licoriceGummyBear").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item licoriceFish = new ItemFood(2, 0.4F, false).setRegistryName("licorice_fish").setUnlocalizedName("licoriceFish").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item cottonCandy = new ItemFood(4, 0.5F, false).setRegistryName("cotton_candy").setUnlocalizedName("cottonCandy").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item cuttlefish = new ItemFood(5, 0.5F, false).setRegistryName("cuttlefish").setUnlocalizedName("cuttlefish").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item soporSlime = new ItemSoporSlime();
	public static Item sorrowGushers = new ItemSorrowGushers();
	public static Item phlegmGushers = new ItemPhlegmGushers();
	public static Item ectoCookie = new ItemEctoFood(4, 0.4F, false, "ectoCookie", 4).setRegistryName("ecto_cookie");
	public static Item ectoLoaf = new ItemEctoFood(6, 0.5F, false, "ectoLoaf", 4).setRegistryName("ecto_loaf");
	public static Item ectoSteak = new ItemEctoFood(8, 0.6F, false, "ectoSteak", 4).setRegistryName("ecto_steak");
	public static Item faygoEcto = new ItemEctoDrink("faygoEcto", 8).setRegistryName("faygo_ecto");
	
	//Other
	public static Item clothesIron = new Item().setRegistryName("clothes_iron").setUnlocalizedName("clothesIron").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item barbasol = new Item().setRegistryName("barbasol").setUnlocalizedName("barbasol").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item magicEightBall = new Item().setRegistryName("magic_eight_ball").setUnlocalizedName("magicEightBall").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item magicCueball = new Item().setRegistryName("magic_cueball").setUnlocalizedName("magicCueball").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item crystalBall = new Item().setRegistryName("crystal_ball").setUnlocalizedName("crystalBall").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item fridgeMagnet = new Item().setRegistryName("fridge_magnet").setUnlocalizedName("fridgeMagnet").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item hostPlush = new Item().setRegistryName("host_plush").setUnlocalizedName("hostPlush").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item wizardStatue = new Item().setRegistryName("wizard_statue").setUnlocalizedName("wizardStatue").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item wiseguyBook = new Item().setRegistryName("wiseguy").setUnlocalizedName("wiseguy").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item grimoire = new Item().setRegistryName("grimoire").setUnlocalizedName("grimoire").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item flarpManual = new Item().setRegistryName("flarp_manual").setUnlocalizedName("flarpManual").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item athManual = new Item().setRegistryName("ath_manual").setUnlocalizedName("athManual").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item trollRomance = new Item().setRegistryName("troll_romance").setUnlocalizedName("trollRomance").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item inkSquidProQuo = new Item().setRegistryName("ink_squid_pro_quo").setUnlocalizedName("inkSquidProQuo").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item blueEctoSlime = new Item().setRegistryName("blue_ecto_slime").setUnlocalizedName("blueEctoSlime").setCreativeTab(MinestuckItems.tabMinestuck);
	
	public static Item scalemate = new ItemScalemate();
	
	public static Item captcharoidCamera = new ItemCaptcharoidCamera();
	public static Item sbahjifier = new ItemSBAHJifier();
	
	public static Item horn = new ItemHorn();
	
	public static Item boondollar = new ItemBoondollar("boondollar", 1).setRegistryName("boondollar");
	public static Item boonbuck = new ItemBoondollar("boonbuck", 1000000).setRegistryName("boonbuck");
	public static Item booncase = new ItemBoondollar("booncase", 1000000000).setRegistryName("booncase");
	
	//Clothing
	public static Item trollHeadband = new ItemArmor(armorTrollHeadband, 0, EntityEquipmentSlot.HEAD).setRegistryName("troll_horn_headband").setUnlocalizedName("trollHornHeadband").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item dirkShades = new ItemArmor(armorDirkGlasses, 0, EntityEquipmentSlot.HEAD).setRegistryName("dirk_glasses").setUnlocalizedName("dirkGlasses").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item daveGlasses = new ItemArmor(armorDaveGlasses, 0, EntityEquipmentSlot.HEAD).setRegistryName("aviators").setUnlocalizedName("aviators");
	public static Item johnGlasses = new ItemArmor(armorJohnGlasses, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("glassesJohn").setRegistryName("glasses_john").setCreativeTab(MinestuckItems.tabMinestuck);
	
	
	//Jade Glasses
	public static Item jadeGlasses = new ItemArmor(armorJadeGlasses, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("glassesJade").setRegistryName("glasses_jade").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item soothSpecs = new ItemArmor(armorSoothSpecs, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("soothSpecs").setRegistryName("sooth_specs").setCreativeTab(MinestuckItems.tabMinestuck);

	//Iron Lass
	public static Item ironLassGlasses = new ItemArmor(armorIronLass, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("ironLassGlasses").setRegistryName("iron_lass_glasses").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item ironLassChestplate = new ItemArmor(armorIronLass, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("ironLassChestplate").setRegistryName("iron_lass_chestplate").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item ironLassSkirt = new ItemArmor(armorIronLass, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("ironLassSkirt").setRegistryName("iron_lass_skirt").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item ironLassShoes = new ItemRocketArmor("ironLassShoes", armorIronLass, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("ironLassShoes").setRegistryName("iron_lass_shoes");
	
	
	//Derse Pajamas
	public static Item derseShirt = new ItemArmor(armorDerse, 0, EntityEquipmentSlot.CHEST).setRegistryName("derse_shirt").setUnlocalizedName("derseShirt").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item dersePants = new ItemArmor(armorDerse, 0, EntityEquipmentSlot.LEGS).setRegistryName("derse_pants").setUnlocalizedName("dersePants").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item derseShoes = new ItemArmor(armorDerse, 0, EntityEquipmentSlot.FEET).setRegistryName("derse_shoes").setUnlocalizedName("derseShoes").setCreativeTab(MinestuckItems.tabMinestuck);
	
	//Prospit Pajamas
	public static Item prospitShirt = new ItemArmor(armorProspit, 0, EntityEquipmentSlot.CHEST).setRegistryName("prospit_shirt").setUnlocalizedName("prospitShirt").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item prospitPants = new ItemArmor(armorProspit, 0, EntityEquipmentSlot.LEGS).setRegistryName("prospit_pants").setUnlocalizedName("prospitPants").setCreativeTab(MinestuckItems.tabMinestuck);
	public static Item prospitShoes = new ItemArmor(armorProspit, 0, EntityEquipmentSlot.FEET).setRegistryName("prospit_shoes").setUnlocalizedName("prospitShoes").setCreativeTab(MinestuckItems.tabMinestuck);
	
	//Rocket Items
	public static Item rocketShoes = new ItemRocketArmor("rocketShoes", armorRocket, 0, EntityEquipmentSlot.FEET).setRegistryName("rocket_shoes");
	
	//Slime Armor
	public static Item slimeShoes = new ItemSlimeShoes("slimeShoes", armorSlime, 0, EntityEquipmentSlot.FEET).setRegistryName("slime_shoes");
	
	//Suits
	public static Item suitJacket = new ItemArmor(armorSuit, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("suitJacket").setRegistryName("suit_jacket");
	public static Item suitPants = new ItemArmor(armorSuit, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("suitPants").setRegistryName("suit_pants");
	public static Item suitShoes = new ItemArmor(armorSuit, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("suitShoes").setRegistryName("suit_shoes");
	
	public static Item slimeSuitJacket = new ItemArmor(armorSlimeSuit, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("slimeSuitJacket").setRegistryName("slime_suit_jacket");
	public static Item slimeSuitPants = new ItemArmor(armorSlimeSuit, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("slimeSuitPants").setRegistryName("slime_suit_pants");
	public static Item slimeSuitShoes = new ItemArmor(armorSlimeSuit, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("slimeSuitShoes").setRegistryName("slime_suit_shoes");
	
	public static Item wiseguySlimesuitJacket = new ItemArmor(armorWiseguy, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("wiseguySlimesuitJacket").setRegistryName("wiseguy_slimesuit_jacket");
	public static Item wiseguySlimesuitPants = new ItemArmor(armorWiseguy, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("wiseguySlimesuitPants").setRegistryName("wiseguy_slimesuit_pants");
	public static Item wiseguySlimesuitShoes = new ItemArmor(armorWiseguy, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("wiseguySlimesuitShoes").setRegistryName("wiseguy_slimesuit_shoes");
	
	//Modus Cards
	public static Item arrayModus = new Item().setRegistryName("array_modus").setUnlocalizedName("arrayModus").setCreativeTab(MinestuckItems.tabMinestuck).setMaxStackSize(1);
	public static Item walletModus = new Item().setRegistryName("wallet_modus").setUnlocalizedName("walletModus").setCreativeTab(MinestuckItems.tabMinestuck).setMaxStackSize(1);
	public static Item moneyModus = new Item().setRegistryName("money_modus").setUnlocalizedName("moneyModus").setCreativeTab(MinestuckItems.tabMinestuck).setMaxStackSize(1);
	
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		IForgeRegistry<Item> registry = event.getRegistry();
		
		//ItemBlocks
		registerItemBlock(registry, new ItemBlock(uniqueObject));
		registerItemBlock(registry, new ItemBlock(frostLog));
		registerItemBlock(registry, new ItemBlock(frostLeaves));
		registerItemBlock(registry, new ItemBlock(sendificator));
		registerItemBlock(registry, new ItemBlock(kringlefucker));
		
		//Override Minestuck Items
		registry.register(caledfwlch);
		registry.register(fearNoAnvil);
		registry.register(mwrthwl);
		
		//bladeKind
		registry.register(paperSword);
		registry.register(chainsawKatana);
		registry.register(ancestralSword);
		registry.register(cutlass);
		
		//1/2bladeKind
		registry.register(brokenNinjaSword);
		registry.register(brokenCaledfwlch);
		registry.register(brokenRoyalDeringer);
		registry.register(brokenScarletRibbitar);
		
		//sickleKind
		registry.register(thornySubject);
		registry.register(babysFirstThresher);
		registry.register(derseReaper);
		registry.register(prospitReaper);
		registry.register(hemeoreaper);
		registry.register(owTheEdge);
		
		//hammerKind
		registry.register(wrinklefucker);
		registry.register(barberBasher);
		
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
		registry.register(ragripper);
		
		//clubKind
		registry.register(horseHitcher);
		registry.register(cuestick);
		registry.register(clubOfFelony);
		registry.register(branch);
		registry.register(broom);
		
		//axeKind
		registry.register(aks);
		
		//sporkKind
		registry.register(goldenSpork);
		
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
		
		//caneKind
		registry.register(blindmansDirections);
		registry.register(pogoCane);
		registry.register(bladedCane);
		registry.register(regicane);
		registry.register(blackStaff);
		registry.register(goldStaff);
		registry.register(crowbar);
		registry.register(blazingGlory);
		registry.register(radioactiveStaff);
		
		//scythekind
		registry.register(eightballScythe);
		
		//guns
		registry.register(huntingRifle);
		registry.register(girlsBestFriend);
		registry.register(greenSunStreetSweeper);
		registry.register(beretta);
		registry.register(goldBeretta);
		registry.register(ahabsCrosshairs);
		
		//Mic weapon
		registry.register(jujuSucker);
		registry.register(mineNGrist);
		
		//bombKind
		registry.register(barbasolBomb);
		
		//thrwstrKind
		registry.register(suitarangClub);
		registry.register(suitarangDiamond);
		registry.register(suitarangHeart);
		registry.register(suitarangSpade);
		
		//food
		registry.register(appleJuice);
		registry.register(scottyDog);
		registry.register(licoriceFish);
		registry.register(licoriceGummyBear);
		registry.register(cottonCandy);
		registry.register(cuttlefish);
		registry.register(soporSlime);
		registry.register(phlegmGushers);
		registry.register(sorrowGushers);
		registry.register(ectoCookie);
		registry.register(ectoLoaf);
		registry.register(ectoSteak);
		registry.register(faygoEcto);
		
		//other
		registry.register(captcharoidCamera);
		registry.register(sbahjifier);
		
		registry.register(horn);
		
		registry.register(clothesIron);
		registry.register(barbasol);
		registry.register(magicEightBall);
		registry.register(magicCueball);
		registry.register(crystalBall);
		registry.register(fridgeMagnet);
		registry.register(hostPlush);
		registry.register(wizardStatue);
		registry.register(wiseguyBook);
		registry.register(grimoire);
		registry.register(flarpManual);
		registry.register(athManual);
		registry.register(trollRomance);
		registry.register(inkSquidProQuo);
		registry.register(blueEctoSlime);
		
		registry.register(scalemate);
		
		registry.register(boondollar);
		registry.register(boonbuck);
		registry.register(booncase);
		
		//armor
		registry.register(trollHeadband);
		registry.register(dirkShades);
		registry.register(daveGlasses);
		registry.register(johnGlasses);
		
		registry.register(jadeGlasses);
		registry.register(soothSpecs);
		registry.register(ironLassGlasses);
		registry.register(ironLassChestplate);
		registry.register(ironLassSkirt);
		registry.register(ironLassShoes);
		
		registry.register(derseShirt);
		registry.register(dersePants);
		registry.register(derseShoes);
		
		registry.register(prospitShirt);
		registry.register(prospitPants);
		registry.register(prospitShoes);
		
		registry.register(rocketShoes);
		
		registry.register(slimeShoes);
		
		registry.register(suitJacket);
		registry.register(suitPants);
		registry.register(suitShoes);
		
		registry.register(slimeSuitJacket);
		registry.register(slimeSuitPants);
		registry.register(slimeSuitShoes);
		
		registry.register(wiseguySlimesuitJacket);
		registry.register(wiseguySlimesuitPants);
		registry.register(wiseguySlimesuitShoes);
	
		registry.register(arrayModus);
		registry.register(walletModus);
		registry.register(moneyModus);
		
		
	}
	
	private static Item registerItemBlock(IForgeRegistry<Item> registry, ItemBlock item)
	{
		registry.register(item.setRegistryName(item.getBlock().getRegistryName()));
		return item;
	}
	
}
