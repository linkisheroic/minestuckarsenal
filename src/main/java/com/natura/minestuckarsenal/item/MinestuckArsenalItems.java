package com.natura.minestuckarsenal.item;

import static com.natura.minestuckarsenal.block.MinestuckArsenalBlocks.*;
import static com.natura.minestuckarsenal.block.MinestuckArsenalBlocks.uniqueObject;

import com.mraof.minestuck.entity.item.EntityCrewPoster;
import com.mraof.minestuck.item.ItemHanging;
import com.mraof.minestuck.item.ItemModus;
import com.mraof.minestuck.item.MinestuckItems;
import com.mraof.minestuck.item.TabMinestuck;
import com.mraof.minestuck.item.weapon.ItemCandyWeapon;
import com.mraof.minestuck.item.weapon.ItemDualWeapon;
import com.mraof.minestuck.item.weapon.ItemPogoWeapon;
import com.mraof.minestuck.item.weapon.ItemPotionWeapon;
import com.mraof.minestuck.item.weapon.ItemSord;
import com.mraof.minestuck.item.weapon.ItemWeapon;
import com.natura.minestuckarsenal.TabArsenal;
import com.natura.minestuckarsenal.entity.EntityHorsePoster;

import net.minecraft.entity.EntityHanging;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ItemLayerModel.Loader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class MinestuckArsenalItems {
	
	//Items to override from Minestuck
	public static Item caledfwlch = new ItemWeapon(12000, 47.0D, -2.4D, 30, "caledfwlch").setRegistryName("minestuck", "caledfwlch").setCreativeTab(TabArsenal.instance);
	public static Item mwrthwl = new ItemWeapon(12000, 47.0D, -2.4D, 30, "mwrthwl").setTool("pickaxe", 4, 5.0F).setRegistryName("minestuck", "mwrthwl").setCreativeTab(TabArsenal.instance);
	public static Item fearNoAnvil = new ItemPotionWeapon(20000, 24.0D, -2.8D, 50, "fearNoAnvil", new PotionEffect(MobEffects.SLOWNESS, 100, 100)).setTool("pickaxe", 4, 6.0F).setRegistryName("minestuck", "fear_no_anvil").setCreativeTab(TabArsenal.instance);
	
	//Instantiate items.
	public static ItemArmor.ArmorMaterial armorTrollHeadband = EnumHelper.addArmorMaterial("TROLL_HEADBAND", "minestuckarsenal:troll_headband", 50, new int[]{2, 2, 2, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static ItemArmor.ArmorMaterial armorDirkGlasses = EnumHelper.addArmorMaterial("DIRK_SHADES", "minestuckarsenal:dirk_glasses", 250, new int[] {4, 5,  4,  5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static ItemArmor.ArmorMaterial armorDerse = EnumHelper.addArmorMaterial("DERSE", "minestuckarsenal:pajamas_derse", 100, new int[] {2, 6, 4, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static ItemArmor.ArmorMaterial armorProspit = EnumHelper.addArmorMaterial("PROSPIT", "minestuckarsenal:pajamas_prospit", 100, new int[] {2, 6, 4, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static ItemArmor.ArmorMaterial armorRocket = EnumHelper.addArmorMaterial("ROCKET", "minestuckarsenal:rocket", 500, new int[] {2, 4, 6, 2}, 4, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static ItemArmor.ArmorMaterial armorIronLass = EnumHelper.addArmorMaterial("IRON_LASS", "minestuckarsenal:iron_lass", 4130, new int[] {4, 10, 8, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ItemArmor.ArmorMaterial armorSuit = EnumHelper.addArmorMaterial("SUIT", "minestuckarsenal:suit", 250, new int[] {1, 4, 5, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static ItemArmor.ArmorMaterial armorSlimeSuit = EnumHelper.addArmorMaterial("SLIME_SUIT", "minestuckarsenal:slime_suit", 350, new int[] {2, 5, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static ItemArmor.ArmorMaterial armorWiseguy = EnumHelper.addArmorMaterial("WISEGUY", "minestuckarsenal:wiseguy_slimesuit", 500, new int[] {5, 9, 8, 6}, 14, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	
	public static ItemArmor.ArmorMaterial armorSlime = EnumHelper.addArmorMaterial("SLIME", "minestuckarsenal:slime", 150, new int[] {2, 4, 6, 2}, 5, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static ItemArmor.ArmorMaterial armorJadeGlasses = EnumHelper.addArmorMaterial("GLASSES_JADE", "minestuckarsenal:glasses_jade", 100, new int[] {2, 2, 2, 2}, 5, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static ItemArmor.ArmorMaterial armorJohnGlasses = EnumHelper.addArmorMaterial("GLASSES_JOHN", "minestuckarsenal:glasses_john", 100, new int[] {2, 2, 2, 2}, 5, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static ItemArmor.ArmorMaterial armorSoothSpecs = EnumHelper.addArmorMaterial("SOOTH_SPECS", "minestuckarsenal:sooth_specs", 250, new int[] {3, 3, 3, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static ItemArmor.ArmorMaterial armorDaveGlasses = EnumHelper.addArmorMaterial("GLASSES_DAVE", "minestuckarsenal:glasses_dave", 100, new int[] {2,  2,  2,  2}, 5, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//rings
	public static Item ringOfVoid = new ItemVoidRing().setCreativeTab(TabArsenal.instance);
	public static Item ringOfLife = new ItemLifeRing().setCreativeTab(TabArsenal.instance);
	
	//bladeKind
	public static Item paperSword = new ItemWeapon(65, 2, -2.4D, 15, "paperSword").setRegistryName("paper_sword").setCreativeTab(TabArsenal.instance);
	public static Item chainsawKatana = new ItemWeapon(850, 16.0D, -2.4D, 15, "chainsawKatana").setRegistryName("chainsaw_katana").setCreativeTab(TabArsenal.instance);
	public static Item ancestralSword = new ItemWeapon(1200, 16.0D, -2.4D, 30, "ancestralSword").setRegistryName("ancestral_sword").setCreativeTab(TabArsenal.instance);
	public static Item cutlass = new ItemWeapon(260, 5.5D, -2.4D, 8, "cutlass").setRegistryName("cutlass").setCreativeTab(TabArsenal.instance);
	public static Item candySword = new ItemWeapon(450, 5.0D, -2.4D, 6, "candySword").setRegistryName("candy_sword").setCreativeTab(TabArsenal.instance);
	
	//1/2bladeKind
	public static Item brokenNinjaSword = new ItemWeapon(100, 3, -2.4D, 15, "brokenNinjaSword").setRegistryName("broken_katana").setCreativeTab(TabArsenal.instance);
	public static Item brokenCaledfwlch = new ItemWeapon(800, 40.0D, -2.4D, 28, "brokenCaledfwlch").setRegistryName("broken_caledfwlch").setCreativeTab(TabArsenal.instance);
	public static Item brokenRoyalDeringer = new ItemWeapon(1200, 15.0D, -2.4D, 28, "brokenRoyalDeringer").setRegistryName("broken_royal_deringer").setCreativeTab(TabArsenal.instance);
	public static Item brokenScarletRibbitar = new ItemWeapon(1800, 19, -2.4D, 28, "brokenScarletRibbitar").setRegistryName("broken_scarlet_ribbitar").setCreativeTab(TabArsenal.instance);
	
	//sickleKind
	public static Item thornySubject = new ItemWeapon(300, 5.0D, -2.4D, 8, "thornySubject").setRegistryName("thorny_subject").setCreativeTab(TabArsenal.instance);
	public static Item babysFirstThresher = new ItemWeapon(250, 5, -2.4D, 12, "babysFirstThresher").setRegistryName("babys_first_thresher").setCreativeTab(TabArsenal.instance);
	public static Item derseReaper = new ItemWeapon(200, 4, -2.4D, 12, "derseReaper").setRegistryName("derse_reaper").setCreativeTab(TabArsenal.instance);
	public static Item prospitReaper = new ItemWeapon(200, 4, -2.4D, 12, "prospitReaper").setRegistryName("prospit_reaper").setCreativeTab(TabArsenal.instance);
	public static Item hemeoreaper = new ItemWeapon(550, 9, -2.4D, 15, "hemeoreaper").setRegistryName("hemeoreaper").setCreativeTab(TabArsenal.instance);
	public static Item owTheEdge = new ItemSord(25, 2, -2.4D, 2, "owTheEdge").setRegistryName("ow_the_edge").setCreativeTab(TabArsenal.instance);
	
	//hammerKind
	public static Item wrinklefucker = new ItemPogoWeapon(500, 13.0D, -2.8D, 12, "wrinklefucker", 0.4).setRegistryName("wrinklefucker").setCreativeTab(TabArsenal.instance);
	public static Item barberBasher = new ItemWeapon(450, 7.0D, -2.8D, 11, "barberBasher").setRegistryName("barber_basher").setCreativeTab(TabArsenal.instance);
	
	//needleKind
	public static Item knittingNeedles = new ItemWeapon(150, 4.0D, -1.8D, 6, "knittingNeedles").setRegistryName("knitting_needles").setCreativeTab(TabArsenal.instance);
	public static Item needleWands = new ItemNeedleWeapon(250, 4.0F, 9.0D, -1.8D, 15, "needleWands").setRegistryName("needle_wands").setCreativeTab(TabArsenal.instance);
	public static Item thornsOfOglogoth = new ItemNeedleWeapon(400, 7.0F, 17.0D, -1.8D, 16, "thornsOfOglogoth").setRegistryName("thorns_of_oglogoth").setCreativeTab(TabArsenal.instance);
	public static Item quillsOfEchidna = new ItemNeedleWeapon(750, 40.0F, 47.0D, -1.8D, 18, "quillsOfEchidna").setRegistryName("quills_of_echidna").setCreativeTab(TabArsenal.instance);
	
	
	//Guns to be added later.
	
	//bulletDummy
	public static Item bullet = new Item().setRegistryName("bullet").setUnlocalizedName("bullet");
	
	//pistolKind
	public static Item beretta = new ItemGunWeapon(450, 5.0F, 10.0D, 2, 0.5F, "beretta").setRegistryName("beretta").setCreativeTab(TabArsenal.instance);
	public static Item goldBeretta = new ItemGunWeapon(850, 10.0F, 10.0D, 3, 0.5F, "goldBeretta").setRegistryName("gold_beretta").setCreativeTab(TabArsenal.instance);
	public static Item gunblade = new ItemGunSwordWeapon(800, 3F, 0.5F, 9.0D, 12.0F, 10.0D, -2.4D, 12, "gunblade").setRegistryName("gunblade").setCreativeTab(TabArsenal.instance);
	public static Item gunOfSouls = new ItemGunSwordWeapon(1400, 3F, 0.5F, 16.0D, 18.0F, 10.0D, -2.4D, 16, "gunOfSouls").setRegistryName("gun_of_souls").setCreativeTab(TabArsenal.instance);
	
	//rifleKind
	public static Item huntingRifle = new ItemGunWeapon(450, 7.0F, 20.0D, 2, 0.5F, "huntingRifle").setRegistryName("hunting_rifle").setCreativeTab(TabArsenal.instance);
	public static Item harpoonGun = new ItemHarpoonWeapon(650, 9.0F, 20.0D, "harpoonGun").setRegistryName("harpoon_gun").setCreativeTab(TabArsenal.instance);
	public static Item girlsBestFriend = new ItemGunWeapon(1200, 19.0F, 1.0D, 4, 4.0F, "girlsBestFriend").setRegistryName("girls_best_friend").setCreativeTab(TabArsenal.instance);
	public static Item greenSunStreetSweeper = new ItemGunWeapon(1600, 28.0F, 1.0D, 4, 5.0F, "greenSunStreetSweeper").setRegistryName("green_sun_street_sweeper").setCreativeTab(TabArsenal.instance);
	public static Item ahabsCrosshairs = new ItemLaserWeapon(4000, 50.0F, "ahabsCrosshairs").setRegistryName("ahabs_crosshairs").setCreativeTab(TabArsenal.instance);
	
	public static Item blackStaff = new ItemDualGunWeapon(250, 0.0D, 4.0D, -1.0D, -2.6D, 4, 5.0F, 2.0D, 3, 4.0F, "blackStaff").setRegistryName("black_staff").setCreativeTab(TabArsenal.instance);
	public static Item goldStaff = new ItemDualGunWeapon(850, 0.0D, 7.0D, -1.0D, -2.6D, 12, 12.0F, 2.0D, 4, 4.0F, "goldStaff").setRegistryName("gold_staff").setCreativeTab(TabArsenal.instance);
	
	//bowKind
	
	
	//tridentKind
	public static Item woodenTrident = new ItemWeapon(150, 4, -2.5D, 4, "woodenTrident").setRegistryName("wooden_trident").setCreativeTab(TabArsenal.instance);
	public static Item silverTrident = new ItemWeapon(300, 7.0D, -2.5D, 7, "silverTrident").setRegistryName("silver_trident").setCreativeTab(TabArsenal.instance);
	public static Item goldTrident = new ItemWeapon(450, 13.0D, -2.5D, 10, "goldTrident").setRegistryName("gold_trident").setCreativeTab(TabArsenal.instance);
	
	//2x3dentKind
	public static Item poseidonsEntente = new ItemWeapon(650, 17.0D, -2.6D, 10, "poseidonsEntente").setRegistryName("poseidons_entente").setCreativeTab(TabArsenal.instance);
	public static Item imperialFork = new ItemWeapon(1200, 23.0D, -2.6D, 12, "emperialFork").setRegistryName("emperial_fork").setCreativeTab(TabArsenal.instance);
	
	//makeupKind
	public static Item lipstickChainsaw = new ItemDualWeapon(250, 5.0D, 1.0D, -1.5D, -2.5D, 10, "lipstickChainsaw").setTool("axe", 3, 3.0F).setRegistryName("lipstick_chainsaw").setCreativeTab(TabArsenal.instance);
	public static Item ragripper = new ItemDualWeapon(800, 17.0D, 1.0D, -1.5D, -2.5D, 25, "demonbaneRagripper").setTool("axe", 5, 6.0F).setRegistryName("demonbane_ragripper").setCreativeTab(TabArsenal.instance);
	public static Item daintyDisembowler = new ItemDualWeapon(550, 12.0D, 1.0D, -1.5D, -2.5D, 17, "daintyDisembowler").setTool("axe", 2, 4.0F).setRegistryName("dainty_disembowler").setCreativeTab(TabArsenal.instance);
	public static Item uraniumChainsaw = new ItemDualWeapon(700, 9.5D, 1.0D, -1.5D, -2.5D, 10, "uraniumChainsaw").setTool("axe", 2, 3.0F).setRegistryName("uranium_chainsaw").setCreativeTab(TabArsenal.instance);
	
	//clubKind
	public static Item horseHitcher = new ItemDualWeapon(500, 6.0D, 0.5D, -2.4D, -1.0D, 10, "horseHitcher").setRegistryName("horse_hitcher").setCreativeTab(TabArsenal.instance);
	public static Item cuestick = new ItemDualWeapon(500, 8.0D, 0.5D, -2.6D, -1.0D, 10, "cuestick").setRegistryName("cuestick").setCreativeTab(TabArsenal.instance);
	public static Item clubOfFelony = new ItemDualWeapon(500, 8.0D, 0.5D, -2.4D, -1.0D, 10, "clubOfFelony").setRegistryName("club_of_felony").setCreativeTab(TabArsenal.instance);
	
	public static Item branch = new ItemWeapon(65, 3.0D, -2.0D, 2, "branch").setRegistryName("branch").setCreativeTab(TabArsenal.instance);
	public static Item broom = new ItemWeapon(125, 4.0D, -2.4D, 5, "broom").setRegistryName("broom").setCreativeTab(TabArsenal.instance);
	
	//spearkind
	
	//sporkKind
	public static Item goldenSpork = new ItemWeapon(750, 8.0D, -2.2D, 20, "goldenSpork").setRegistryName("golden_spork").setCreativeTab(TabArsenal.instance);
	
	//lanceKind
	public static Item joustingLance = new ItemWeapon(250, 5.0D, -2.8D, 6, "joustingLance").setRegistryName("jousting_lance").setCreativeTab(TabArsenal.instance);
	public static Item fiduspawnLance = new ItemWeapon(100, 4.0D, -2.8D, 5, "fiduspawnLance").setRegistryName("fiduspawn_lance").setCreativeTab(TabArsenal.instance);
	public static Item cigaretteHolderLance = new ItemWeapon(450, 6.0D, -2.8D, 8, "cigaretteLance").setRegistryName("cigarette_lance").setCreativeTab(TabArsenal.instance);
	public static Item rocketPopLance = new ItemCandyWeapon(500, 6.0D, -2.8D, 10, "rocketPopLance").setRegistryName("rocketpop_lance").setCreativeTab(TabArsenal.instance);
	
	//caneKind
	public static Item blindmansDirections = new ItemWeapon(600, 8.0D, -2.4D, 12, "blindmansDirections").setRegistryName("blindmans_directions").setCreativeTab(TabArsenal.instance);
	public static Item crowbar = new ItemWeapon(500, 8.0D, -2.6D, 20, "crowbar").setRegistryName("crowbar").setCreativeTab(TabArsenal.instance);
	public static Item pogoCane = new ItemPogoWeapon(400, 7.0D, -2.0D, 8, "pogoCane", 0.7).setRegistryName("minestuck", "pogo_cane").setCreativeTab(TabArsenal.instance);
	public static Item regicane = new ItemWeapon(812, 6, -2.4D, 10, "regicane").setRegistryName("regicane").setCreativeTab(TabArsenal.instance);
	public static Item bladedCane = new ItemWeapon(350, 6.0D, -2.0D, 10, "bladedCane").setRegistryName("bladed_cane").setCreativeTab(TabArsenal.instance);
	public static Item blazingGlory = new ItemWeapon(950, 7.0D, -2.0D, 14, "blazingGlory").setRegistryName("blazing_glory").setCreativeTab(TabArsenal.instance);
	public static Item radioactiveStaff = new ItemWeapon(650, 6.5D, -2.0D, 12, "radioactiveStaff").setRegistryName("radioactive_staff").setCreativeTab(TabArsenal.instance);
	
	//batKind
	public static Item woodenBat = new ItemWeapon(300, 4.0D, -2.2D, 4, "woodenBat").setRegistryName("wooden_bat").setCreativeTab(TabArsenal.instance);
	public static Item cricketBat = new ItemWeapon(400, 5.0D, -2.2D, 6, "cricketBat").setRegistryName("cricket_bat").setCreativeTab(TabArsenal.instance);
	
	//clawKind
	public static Item nepetaClaws = new ItemDualWeapon(700, 7.0D, 1.0D, -1.5D,-1.0D, 10, "nepetaClaws").setRegistryName("nepeta_claws").setCreativeTab(TabArsenal.instance);
	public static Item blueClaws = new ItemDualWeapon(1200, 14.0D, 1.0D, -1.5D, -1.0D, 12, "blueClaws").setRegistryName("blue_claws").setCreativeTab(TabArsenal.instance);
	
	//axeKind
	public static Item candyAxe = new ItemCandyWeapon(700, 7.0D, -3.0D, 5, "candyAxe").setRegistryName("candy_axe").setCreativeTab(TabArsenal.instance);
	public static Item shadowAxe = new ItemWeapon(450, 11.0D, -3.0D, 12, "shadowAxe").setRegistryName("shadow_axe").setCreativeTab(TabArsenal.instance);
	public static Item massDeduction = new ItemWeapon(800, 15.0D, -3.0D, 8, "massDeduction").setRegistryName("mass_deduction").setCreativeTab(TabArsenal.instance);
	public static Item aks = new ItemSord(59, 3, -3.0D, 5, "aks").setRegistryName("aks").setCreativeTab(TabArsenal.instance);
	
	//whipKind
	public static Item leatherWhip = new ItemWeapon(250, 5.0D, -1.5D, 6, "leatherWhip").setRegistryName("leather_whip").setCreativeTab(TabArsenal.instance);
	
	//thrwstrKind
	public static Item suitarangHeart = new ItemSuitarang("suitarangHeart").setRegistryName("suitarang_heart").setCreativeTab(TabArsenal.instance);
	public static Item suitarangSpade = new ItemSuitarang("suitarangSpade").setRegistryName("suitarang_spade").setCreativeTab(TabArsenal.instance);
	public static Item suitarangDiamond = new ItemSuitarang("suitarangDiamond").setRegistryName("suitarang_diamond").setCreativeTab(TabArsenal.instance);
	public static Item suitarangClub = new ItemSuitarang("suitarangClub").setRegistryName("suitarang_club").setCreativeTab(TabArsenal.instance);

	//scythekind
	public static Item scythe = new ItemWeapon(400, 5.0D, -2.2D, 4, "scythe").setRegistryName("scythe").setCreativeTab(TabArsenal.instance);
	public static Item eightballScythe = new ItemWeapon(888, 7.0D, -2.2D, 8, "eightballScythe").setRegistryName("eightball_scythe").setCreativeTab(TabArsenal.instance);
	
	//bookKind
	
	//bombKind
	public static Item barbasolBomb = new ItemBarbasolBomb("barbasolBomb").setRegistryName("barbasol_bomb").setCreativeTab(TabArsenal.instance);
	
	//keykind
	public static Item houseKey = new ItemDualGunWeapon(250, 0.0D, 5.0D, -1.0D, -2.4D, 5, 4.0F, 25.0D, 3, 2.0F, "houseKey").setRegistryName("house_key").setCreativeTab(TabArsenal.instance);
	public static Item keyboardKey = new ItemWeapon(150, 4.0D, -2.4D, 3, "keyboardKey").setRegistryName("keyboard_key").setCreativeTab(TabArsenal.instance);
	public static Item keyblade = new ItemWeapon(450, 7.0D, -2.4D, 11, "keyblade").setRegistryName("keyblade").setCreativeTab(TabArsenal.instance);
	public static Item trueBlue = new ItemWeapon(550, 9.0D, -2.4D, 13, "trueBlue").setRegistryName("true_blue").setCreativeTab(TabArsenal.instance);
	public static Item candyKey = new ItemWeapon(450, 6.0D, -2.4D, 6, "candyKey").setRegistryName("candy_key").setCreativeTab(TabArsenal.instance);
	public static Item chronolatch = new ItemPotionWeapon(1600, 24.0D, -2.4D, 18, "chronolatch", new PotionEffect(MobEffects.SLOWNESS, 100, 100)).setRegistryName("chronolatch").setCreativeTab(TabArsenal.instance);
	public static Item yaldabaothsKeyton = new ItemWeapon(2400, 33.0D, -2.4D, 30, "yaldabaothsKeyton").setRegistryName("yaldabaoths_keyton").setCreativeTab(TabArsenal.instance);
	public static Item allweddol = new ItemWeapon(12000, 47.0D, -2.4D, 30, "allweddol").setRegistryName("allweddol").setCreativeTab(TabArsenal.instance);
	
	//batonkind
	public static Item twirlingBaton = new ItemWeapon(200, 4.0D, -2.2D, 4, "twirlingBaton").setRegistryName("twirling_baton").setCreativeTab(TabArsenal.instance);
	public static Item conductorsBaton = new ItemWeapon(250, 5.0D, -2.2D, 4, "conductorsBaton").setRegistryName("conductors_baton").setCreativeTab(TabArsenal.instance);
	public static Item nightstick = new ItemWeapon(500, 7.0D, -2.2D, 8, "nightstick").setRegistryName("nightstick").setCreativeTab(TabArsenal.instance);
	public static Item uraniumBaton = new ItemWeapon(800, 8.0D, -2.2D, 7, "uraniumBaton").setRegistryName("uranium_baton").setCreativeTab(TabArsenal.instance);
	public static Item windwaker = new ItemWeapon(1200, 15.0D, -2.2D, 12, "windwaker").setRegistryName("windwaker").setCreativeTab(TabArsenal.instance);
	public static Item celestialFulcrum = new ItemWeapon(2000, 23.0D, -2.2D, 25, "celestialFulcrum").setRegistryName("celestial_fulcrum").setCreativeTab(TabArsenal.instance);
	
	//keyaxe
	public static Item keyAxe = new ItemWeapon(700, 12.0D, -2.8D, 10, "keyAxe").setRegistryName("key_axe").setCreativeTab(TabArsenal.instance);
	public static Item stoneColdKeyAxe = new ItemWeapon(1200, 19.0D, -2.8D, 14, "stoneColdKeyAxe").setRegistryName("stone_cold_key_axe").setCreativeTab(TabArsenal.instance);
	
	//Misc Weapons
	public static Item jujuSucker = new ItemWeapon(413, 12.0D, -2.4D, 30, "jujuSucker").setRegistryName("juju_sucker").setCreativeTab(TabArsenal.instance);
	public static Item mineNGrist = new ItemMineNGrist().setUnlocalizedName("mineAndGrist").setRegistryName("mine_and_grist").setCreativeTab(TabArsenal.instance);
	
	
	//Food
	public static Item appleJuice = new ItemArsenalBeverage("appleJuice").setRegistryName("apple_juice").setCreativeTab(TabArsenal.instance);
	public static Item scottyDog = new ItemFood(2, 0.4F, false).setRegistryName("scotty_dog").setUnlocalizedName("scottyDog").setCreativeTab(TabArsenal.instance);
	public static Item licoriceGummyBear = new ItemFood(2, 0.4F, false).setRegistryName("licorice_gummy_bear").setUnlocalizedName("licoriceGummyBear").setCreativeTab(TabArsenal.instance);
	public static Item licoriceFish = new ItemFood(2, 0.4F, false).setRegistryName("licorice_fish").setUnlocalizedName("licoriceFish").setCreativeTab(TabArsenal.instance);
	public static Item cottonCandy = new ItemFood(4, 0.5F, false).setRegistryName("cotton_candy").setUnlocalizedName("cottonCandy").setCreativeTab(TabArsenal.instance);
	public static Item cuttlefish = new ItemFood(5, 0.5F, false).setRegistryName("cuttlefish").setUnlocalizedName("cuttlefish").setCreativeTab(TabArsenal.instance);
	public static Item soporSlime = new ItemSoporSlime().setCreativeTab(TabArsenal.instance);
	public static Item sorrowGushers = new ItemSorrowGushers().setCreativeTab(TabArsenal.instance);
	public static Item phlegmGushers = new ItemPhlegmGushers().setCreativeTab(TabArsenal.instance);
	public static Item ectoCookie = new ItemEctoFood(4, 0.4F, false, "ectoCookie", 4).setRegistryName("ecto_cookie").setCreativeTab(TabArsenal.instance);
	public static Item ectoLoaf = new ItemEctoFood(6, 0.5F, false, "ectoLoaf", 4).setRegistryName("ecto_loaf").setCreativeTab(TabArsenal.instance);
	public static Item ectoSteak = new ItemEctoFood(8, 0.6F, false, "ectoSteak", 4).setRegistryName("ecto_steak").setCreativeTab(TabArsenal.instance);
	public static Item faygoEcto = new ItemEctoDrink("faygoEcto", 8).setRegistryName("faygo_ecto").setCreativeTab(TabArsenal.instance);
	public static Item cakeMix = new ItemFood(1, 0.2F, false).setRegistryName("cake_mix").setUnlocalizedName("cakeMix").setCreativeTab(TabArsenal.instance);
	
	//Other
	public static Item clothesIron = new Item().setRegistryName("clothes_iron").setUnlocalizedName("clothesIron").setCreativeTab(TabArsenal.instance);
	public static Item barbasol = new Item().setRegistryName("barbasol").setUnlocalizedName("barbasol").setCreativeTab(TabArsenal.instance);
	public static Item magicEightBall = new Item().setRegistryName("magic_eight_ball").setUnlocalizedName("magicEightBall").setCreativeTab(TabArsenal.instance);
	public static Item magicCueball = new Item().setRegistryName("magic_cueball").setUnlocalizedName("magicCueball").setCreativeTab(TabArsenal.instance);
	public static Item crystalBall = new Item().setRegistryName("crystal_ball").setUnlocalizedName("crystalBall").setCreativeTab(TabArsenal.instance);
	public static Item fridgeMagnet = new Item().setRegistryName("fridge_magnet").setUnlocalizedName("fridgeMagnet").setCreativeTab(TabArsenal.instance);
	public static Item hostPlush = new Item().setRegistryName("host_plush").setUnlocalizedName("hostPlush").setCreativeTab(TabArsenal.instance);
	public static Item wizardStatue = new Item().setRegistryName("wizard_statue").setUnlocalizedName("wizardStatue").setCreativeTab(TabArsenal.instance);
	public static Item wiseguyBook = new Item().setRegistryName("wiseguy").setUnlocalizedName("wiseguy").setCreativeTab(TabArsenal.instance);
	public static Item sassacreText = new Item().setRegistryName("sassacre_text").setUnlocalizedName("sassacreText").setCreativeTab(TabArsenal.instance);
	public static Item grimoire = new Item().setRegistryName("grimoire").setUnlocalizedName("grimoire").setCreativeTab(TabArsenal.instance);
	public static Item flarpManual = new Item().setRegistryName("flarp_manual").setUnlocalizedName("flarpManual").setCreativeTab(TabArsenal.instance);
	public static Item athManual = new Item().setRegistryName("ath_manual").setUnlocalizedName("athManual").setCreativeTab(TabArsenal.instance);
	public static Item trollRomance = new Item().setRegistryName("troll_romance").setUnlocalizedName("trollRomance").setCreativeTab(TabArsenal.instance);
	public static Item inkSquidProQuo = new Item().setRegistryName("ink_squid_pro_quo").setUnlocalizedName("inkSquidProQuo").setCreativeTab(TabArsenal.instance);
	public static Item blueEctoSlime = new Item().setRegistryName("blue_ecto_slime").setUnlocalizedName("blueEctoSlime").setCreativeTab(TabArsenal.instance);
	public static Item seahorseIdol = new Item().setRegistryName("seahorse_idol").setUnlocalizedName("seahorseIdol").setCreativeTab(TabArsenal.instance);
	
	public static Item scalemate = new ItemScalemate().setCreativeTab(TabArsenal.instance);
	
	public static Item captcharoidCamera = new ItemCaptcharoidCamera().setCreativeTab(TabArsenal.instance);
	public static Item sbahjifier = new ItemSBAHJifier().setCreativeTab(TabArsenal.instance);
	
	public static Item horn = new ItemHorn().setCreativeTab(TabArsenal.instance);
	
	//public static Item boondollar = new ItemBoondollar("boondollar", 1).setRegistryName("boondollar");
	public static Item boonbuck = new ItemBoondollar("boonbuck", 1000000).setRegistryName("boonbuck").setCreativeTab(TabArsenal.instance);
	public static Item booncase = new ItemBoondollar("booncase", 1000000000).setRegistryName("booncase").setCreativeTab(TabArsenal.instance);
	
	//paintings
	public static Item horseFootballPlayer = new ItemHanging()
	{
		@Override
		public EntityHanging createEntity(World worldIn, BlockPos pos, EnumFacing facing, ItemStack stack)
		{
			return new EntityHorsePoster(worldIn, pos, facing);
		}
	}.setUnlocalizedName("horseFootballPlayerPoster").setRegistryName("horse_football_player_poster").setMaxStackSize(1).setCreativeTab(TabMinestuck.instance);
	
	//Clothing
	public static Item trollHeadband = new ItemArmor(armorTrollHeadband, 0, EntityEquipmentSlot.HEAD).setRegistryName("troll_horn_headband").setUnlocalizedName("trollHornHeadband").setCreativeTab(TabArsenal.instance);
	public static Item dirkShades = new ItemArmor(armorDirkGlasses, 0, EntityEquipmentSlot.HEAD).setRegistryName("dirk_glasses").setUnlocalizedName("dirkGlasses").setCreativeTab(TabArsenal.instance);
	public static Item daveGlasses = new ItemArmor(armorDaveGlasses, 0, EntityEquipmentSlot.HEAD).setRegistryName("aviators").setUnlocalizedName("aviators").setCreativeTab(TabArsenal.instance);
	public static Item johnGlasses = new ItemArmor(armorJohnGlasses, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("glassesJohn").setRegistryName("glasses_john").setCreativeTab(TabArsenal.instance);
	
	
	//Jade Glasses
	public static Item jadeGlasses = new ItemArmor(armorJadeGlasses, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("glassesJade").setRegistryName("glasses_jade").setCreativeTab(TabArsenal.instance);
	public static Item soothSpecs = new ItemArmor(armorSoothSpecs, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("soothSpecs").setRegistryName("sooth_specs").setCreativeTab(TabArsenal.instance);

	//Iron Lass
	public static Item ironLassGlasses = new ItemArmor(armorIronLass, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("ironLassGlasses").setRegistryName("iron_lass_glasses").setCreativeTab(TabArsenal.instance);
	public static Item ironLassChestplate = new ItemArmor(armorIronLass, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("ironLassChestplate").setRegistryName("iron_lass_chestplate").setCreativeTab(TabArsenal.instance);
	public static Item ironLassSkirt = new ItemArmor(armorIronLass, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("ironLassSkirt").setRegistryName("iron_lass_skirt").setCreativeTab(TabArsenal.instance);
	public static Item ironLassShoes = new ItemRocketArmor("ironLassShoes", armorIronLass, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("ironLassShoes").setRegistryName("iron_lass_shoes").setCreativeTab(TabArsenal.instance);
	
	
	//Derse Pajamas
	public static Item derseShirt = new ItemDreamArmor("derseShirt", armorDerse, 0, EntityEquipmentSlot.CHEST).setRegistryName("derse_shirt").setUnlocalizedName("derseShirt").setCreativeTab(TabArsenal.instance);
	public static Item dersePants = new ItemDreamArmor("dersePants", armorDerse, 0, EntityEquipmentSlot.LEGS).setRegistryName("derse_pants").setUnlocalizedName("dersePants").setCreativeTab(TabArsenal.instance);
	public static Item derseShoes = new ItemDreamArmor("derseShoes", armorDerse, 0, EntityEquipmentSlot.FEET).setRegistryName("derse_shoes").setUnlocalizedName("derseShoes").setCreativeTab(TabArsenal.instance);
	
	//Prospit Pajamas
	public static Item prospitShirt = new ItemDreamArmor("prospitShirt", armorProspit, 0, EntityEquipmentSlot.CHEST).setRegistryName("prospit_shirt").setUnlocalizedName("prospitShirt").setCreativeTab(TabArsenal.instance);
	public static Item prospitPants = new ItemDreamArmor("prospitPants", armorProspit, 0, EntityEquipmentSlot.LEGS).setRegistryName("prospit_pants").setUnlocalizedName("prospitPants").setCreativeTab(TabArsenal.instance);
	public static Item prospitShoes = new ItemDreamArmor("prospitShoes", armorProspit, 0, EntityEquipmentSlot.FEET).setRegistryName("prospit_shoes").setUnlocalizedName("prospitShoes").setCreativeTab(TabArsenal.instance);
	
	//Rocket Items
	public static Item rocketShoes = new ItemRocketArmor("rocketShoes", armorRocket, 0, EntityEquipmentSlot.FEET).setRegistryName("rocket_shoes").setCreativeTab(TabArsenal.instance);
	
	//Slime Armor
	public static Item slimeShoes = new ItemSlimeShoes("slimeShoes", armorSlime, 0, EntityEquipmentSlot.FEET).setRegistryName("slime_shoes").setCreativeTab(TabArsenal.instance);
	
	//Suits
	public static Item suitJacket = new ItemArmor(armorSuit, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("suitJacket").setRegistryName("suit_jacket").setCreativeTab(TabArsenal.instance);
	public static Item suitPants = new ItemArmor(armorSuit, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("suitPants").setRegistryName("suit_pants").setCreativeTab(TabArsenal.instance);
	public static Item suitShoes = new ItemArmor(armorSuit, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("suitShoes").setRegistryName("suit_shoes").setCreativeTab(TabArsenal.instance);
	
	public static Item slimeSuitJacket = new ItemArmor(armorSlimeSuit, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("slimeSuitJacket").setRegistryName("slime_suit_jacket").setCreativeTab(TabArsenal.instance);
	public static Item slimeSuitPants = new ItemArmor(armorSlimeSuit, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("slimeSuitPants").setRegistryName("slime_suit_pants").setCreativeTab(TabArsenal.instance);
	public static Item slimeSuitShoes = new ItemArmor(armorSlimeSuit, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("slimeSuitShoes").setRegistryName("slime_suit_shoes").setCreativeTab(TabArsenal.instance);
	
	public static Item wiseguySlimesuitJacket = new ItemArmor(armorWiseguy, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("wiseguySlimesuitJacket").setRegistryName("wiseguy_slimesuit_jacket").setCreativeTab(TabArsenal.instance);
	public static Item wiseguySlimesuitPants = new ItemArmor(armorWiseguy, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("wiseguySlimesuitPants").setRegistryName("wiseguy_slimesuit_pants").setCreativeTab(TabArsenal.instance);
	public static Item wiseguySlimesuitShoes = new ItemArmor(armorWiseguy, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("wiseguySlimesuitShoes").setRegistryName("wiseguy_slimesuit_shoes").setCreativeTab(TabArsenal.instance);
	
	//Modus Cards
	public static Item arrayModus = new Item().setRegistryName("array_modus").setUnlocalizedName("arrayModus").setCreativeTab(TabArsenal.instance).setMaxStackSize(1);
	public static Item walletModus = new Item().setRegistryName("wallet_modus").setUnlocalizedName("walletModus").setCreativeTab(TabArsenal.instance).setMaxStackSize(1);
	public static Item moneyModus = new Item().setRegistryName("money_modus").setUnlocalizedName("moneyModus").setCreativeTab(TabArsenal.instance).setMaxStackSize(1);
	
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		IForgeRegistry<Item> registry = event.getRegistry();
		
		//ItemBlocks
		registerItemBlock(registry, new ItemBlock(uniqueObject));
		registerItemBlock(registry, new ItemBlock(frostLog));
		registerItemBlock(registry, new ItemBlock(frostPlanks));
		registerItemBlock(registry, new ItemBlock(frostLeaves));
		registerItemBlock(registry, new ItemBlock(deadLog));
		registerItemBlock(registry, new ItemBlock(sendificator));
		registerItemBlock(registry, new ItemBlock(kringlefucker));
		registerItemBlock(registry, new ItemBlock(uraniumBlock));
		registerItemBlock(registry, new ItemBlock(chalk));
		registerItemBlock(registry, new ItemBlock(chalkPolished));
		registerItemBlock(registry, new ItemBlock(chalkBricks));
		registerItemBlock(registry, new ItemBlock(chalkBricksChiseled));
		registerItemBlock(registry, new ItemBlock(pinkStone));
		registerItemBlock(registry, new ItemBlock(pinkStonePolished));
		registerItemBlock(registry, new ItemBlock(pinkStoneBricks));
		registerItemBlock(registry, new ItemBlock(pinkStoneBricksChiseled));
		registerItemBlock(registry, new ItemBlock(pinkStoneBricksCracked));
		registerItemBlock(registry, new ItemBlock(pinkStoneBricksMossy));
		registerItemBlock(registry, new ItemBlock(powerHub));
		registerItemBlock(registry, new ItemBlock(gristGatherer));

		
		//Override Minestuck Items
		registry.register(caledfwlch);
		registry.register(fearNoAnvil);
		registry.register(mwrthwl);
		
		registry.register(houseKey);
		registry.register(keyboardKey);
		registry.register(keyblade);
		registry.register(trueBlue);
		registry.register(candyKey);
		registry.register(chronolatch);
		registry.register(yaldabaothsKeyton);
		registry.register(allweddol);
		
		registry.register(twirlingBaton);
		registry.register(conductorsBaton);
		registry.register(nightstick);
		registry.register(uraniumBaton);
		registry.register(windwaker);
		registry.register(celestialFulcrum);
		
		registry.register(keyAxe);
		registry.register(stoneColdKeyAxe);
		
		//bladeKind
		registry.register(paperSword);
		registry.register(chainsawKatana);
		registry.register(ancestralSword);
		registry.register(cutlass);
		registry.register(candySword);
		
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
		registry.register(daintyDisembowler);
		registry.register(uraniumChainsaw);
		
		//clubKind
		registry.register(horseHitcher);
		registry.register(cuestick);
		registry.register(clubOfFelony);
		registry.register(branch);
		registry.register(broom);
		
		//axeKind
		registry.register(candyAxe);
		registry.register(shadowAxe);
		registry.register(massDeduction);
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
		registry.register(scythe);
		registry.register(eightballScythe);
		
		//guns
		registry.register(bullet);
		registry.register(huntingRifle);
		registry.register(harpoonGun);
		registry.register(girlsBestFriend);
		registry.register(greenSunStreetSweeper);
		registry.register(beretta);
		registry.register(goldBeretta);
		registry.register(gunblade);
		registry.register(gunOfSouls);
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
		
		registry.register(horseFootballPlayer);
		
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
		registry.register(sassacreText);
		registry.register(grimoire);
		registry.register(flarpManual);
		registry.register(athManual);
		registry.register(trollRomance);
		registry.register(inkSquidProQuo);
		registry.register(blueEctoSlime);
		registry.register(seahorseIdol);
		registry.register(cakeMix);
		
		registry.register(scalemate);
		
		//registry.register(boondollar);
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
		
		registry.register(ringOfVoid);
		registry.register(ringOfLife);
	
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
