package com.natura.minestuckarsenal.client;

import static com.mraof.minestuck.item.MinestuckItems.candy;
import static com.mraof.minestuck.item.MinestuckItems.catClaws;
import static com.mraof.minestuck.item.MinestuckItems.crockerSpork;
import static com.natura.minestuckarsenal.item.MinestuckArsenalItems.brokenCaledfwlch;
import static com.natura.minestuckarsenal.item.MinestuckArsenalItems.brokenNinjaSword;
import static com.natura.minestuckarsenal.item.MinestuckArsenalItems.brokenRoyalDeringer;
import static com.natura.minestuckarsenal.item.MinestuckArsenalItems.brokenScarletRibbitar;
import static com.natura.minestuckarsenal.item.MinestuckArsenalItems.lipstickChainsaw;
import static com.natura.minestuckarsenal.item.MinestuckArsenalItems.nepetaClaws;
import static com.natura.minestuckarsenal.item.MinestuckArsenalItems.*;
import static com.natura.minestuckarsenal.block.MinestuckArsenalBlocks.*;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import com.mraof.minestuck.client.util.MinestuckModelManager;
import com.mraof.minestuck.item.ItemMinestuckCandy;
import com.mraof.minestuck.item.weapon.ItemDualWeapon;
import com.mraof.minestuck.util.GristType;
import com.natura.minestuckarsenal.ArsenalGrist;
import com.natura.minestuckarsenal.item.ItemScalemate;

@SideOnly(Side.CLIENT)
public class ModelManager {

	@SubscribeEvent
	public static void handleModelRegistry(ModelRegistryEvent event)
	{
		itemModels();
		blockModels();
	}
	
	private static void itemModels()
	{
		register(paperSword);
		register(chainsawKatana);
		register(ancestralSword);
		register(cutlass);
		
		register(caledfwlch);
		register(fearNoAnvil);
		register(mwrthwl);
	
		register(brokenNinjaSword);
		register(brokenCaledfwlch);
		register(brokenRoyalDeringer);
		register(brokenScarletRibbitar);
		
		register(thornySubject);
		register(babysFirstThresher);
		register(derseReaper);
		register(prospitReaper);
		register(hemeoreaper);
		register(owTheEdge);
		
		register(wrinklefucker);
		register(barberBasher);
		
		register(knittingNeedles);
		register(needleWands);
		register(thornsOfOglogoth);
		register(quillsOfEchidna);
		
		register(goldenSpork);
		
		register(aks);
		
		register(woodenTrident);
		register(silverTrident);
		register(goldTrident);
		
		register(poseidonsEntente);
		register(imperialFork);
		
		register(joustingLance);
		register(fiduspawnLance);
		register(cigaretteHolderLance);
		register(rocketPopLance);
		
		register(woodenBat);
		register(cricketBat);
		
		register(leatherWhip);
		
		register(blindmansDirections);
		register(bladedCane);
		
		ModelLoader.registerItemVariants(blackStaff, new ResourceLocation("minestuckarsenal:black_staff_sheathed"), new ResourceLocation("minestuckarsenal:black_staff_drawn"));
		ModelLoader.setCustomMeshDefinition(blackStaff, new DualWeaponDefinition(blackStaff));
		
		ModelLoader.registerItemVariants(goldStaff, new ResourceLocation("minestuckarsenal:gold_staff_sheathed"), new ResourceLocation("minestuckarsenal:gold_staff_drawn"));
		ModelLoader.setCustomMeshDefinition(goldStaff, new DualWeaponDefinition(goldStaff));
		
		register(crowbar);
		register(pogoCane);
		register(regicane);
		register(blazingGlory);
		register(jujuSucker);
		register(radioactiveStaff);
		
		ModelLoader.registerItemVariants(nepetaClaws, new ResourceLocation("minestuckarsenal:nepeta_claws_sheathed"), new ResourceLocation("minestuckarsenal:nepeta_claws_drawn"));
		ModelLoader.setCustomMeshDefinition(nepetaClaws, new DualWeaponDefinition(nepetaClaws));
		
		ModelLoader.registerItemVariants(blueClaws, new ResourceLocation("minestuckarsenal:blue_claws_sheathed"), new ResourceLocation("minestuckarsenal:blue_claws_drawn"));
		ModelLoader.setCustomMeshDefinition(blueClaws, new DualWeaponDefinition(blueClaws));

		ModelLoader.registerItemVariants(lipstickChainsaw, new ResourceLocation("minestuckarsenal:lipstick_chainsaw_sheathed"), new ResourceLocation("minestuckarsenal:lipstick_chainsaw_drawn"));
		ModelLoader.setCustomMeshDefinition(lipstickChainsaw, new DualWeaponDefinition(lipstickChainsaw));

		ModelLoader.registerItemVariants(ragripper, new ResourceLocation("minestuckarsenal:demonbane_ragripper_sheathed"), new ResourceLocation("minestuckarsenal:demonbane_ragripper_drawn"));
		ModelLoader.setCustomMeshDefinition(ragripper, new DualWeaponDefinition(ragripper));
		
		ModelLoader.registerItemVariants(horseHitcher, new ResourceLocation("minestuckarsenal:horse_hitcher_sheathed"), new ResourceLocation("minestuckarsenal:horse_hitcher_drawn"));
		ModelLoader.setCustomMeshDefinition(horseHitcher, new DualWeaponDefinition(horseHitcher));
		
		ModelLoader.registerItemVariants(cuestick, new ResourceLocation("minestuckarsenal:cuestick_sheathed"), new ResourceLocation("minestuckarsenal:cuestick_drawn"));
		ModelLoader.setCustomMeshDefinition(cuestick, new DualWeaponDefinition(cuestick));
		
		ModelLoader.registerItemVariants(clubOfFelony, new ResourceLocation("minestuckarsenal:club_of_felony_sheathed"), new ResourceLocation("minestuckarsenal:club_of_felony_drawn"));
		ModelLoader.setCustomMeshDefinition(clubOfFelony, new DualWeaponDefinition(clubOfFelony));
		
		register(branch);
		register(broom);
		
		register(eightballScythe);
		register(mineNGrist);
		
		register(appleJuice);
		register(scottyDog);
		register(licoriceFish);
		register(licoriceGummyBear);
		register(cottonCandy);
		register(cuttlefish);
		register(soporSlime);
		register(sorrowGushers);
		register(phlegmGushers);
		register(ectoCookie);
		register(ectoLoaf);
		register(ectoSteak);
		
		register(barbasol);
		register(clothesIron);
		register(magicCueball);
		register(fridgeMagnet);
		register(hostPlush);
		register(magicEightBall);
		register(crystalBall);
		register(wiseguyBook);
		register(grimoire);
		register(flarpManual);
		register(athManual);
		register(trollRomance);
		register(wizardStatue);
		register(inkSquidProQuo);
		register(blueEctoSlime);
		register(faygoEcto);
		
		for(int i = 0; i < ItemScalemate.names.length; i++)
			register(scalemate, i, "scalemate_" + ItemScalemate.names[i]);
		
		register(barbasolBomb);
		
		register(suitarangHeart);
		register(suitarangClub);
		register(suitarangDiamond);
		register(suitarangSpade);
		
		register(captcharoidCamera);
		register(sbahjifier);
		
		register(horn);
		
		register(boondollar);
		register(boonbuck);
		register(booncase);
		
		register(trollHeadband);
		register(dirkShades);
		register(daveGlasses);
		register(jadeGlasses);
		register(johnGlasses);
		register(soothSpecs);
		
		register(derseShirt);
		register(dersePants);
		register(derseShoes);
		
		register(prospitShirt);
		register(prospitPants);
		register(prospitShoes);
		
		register(rocketShoes);
		
		register(slimeShoes);
		
		register(ironLassGlasses);
		register(ironLassChestplate);
		register(ironLassSkirt);
		register(ironLassShoes);
		
		register(suitJacket);
		register(suitPants);
		register(suitShoes);
		
		register(slimeSuitJacket);
		register(slimeSuitPants);
		register(slimeSuitShoes);
		
		register(wiseguySlimesuitJacket);
		register(wiseguySlimesuitPants);
		register(wiseguySlimesuitShoes);
		
		register(huntingRifle);
		register(girlsBestFriend);
		register(greenSunStreetSweeper);
		register(beretta);
		register(goldBeretta);
		register(ahabsCrosshairs);
		
		register(arrayModus);
		register(walletModus);
		register(moneyModus);
		
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Acid) + 1, "acid_soda");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Aquamarine) + 1, "aquamarine_candy_buttons");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Blood) + 1, "blood_kool_aid");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Copper) + 1, "copper_fondant_pumpkin");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Emerald) + 1, "emerald_sprinkles");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Flourite) + 1, "flourite_lifesaver");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Frosting) + 1, "frosting");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Iron) + 1, "iron_gobstopper");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Jet) + 1, "jet_candy_cane");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Lead) + 1, "lead_chocolate_bunny");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Lux) + 1, "lux_gummy");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Malachite) + 1, "malachite_malt_balls");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Meta) + 1, "meta_mentos");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Mist) + 1, "mist_marshmallows");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Moonstone) + 1, "moonstone_starburst");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Neon) + 1, "neon_sweetheart");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Nitrogen) + 1, "nitrogen_dragons_breath");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Obsidian) + 1, "obsidian_pop_rocks");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Onyx) + 1, "onyx_gumdrops");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Opal) + 1, "opal_konpeito");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Permafrost) + 1, "permafrost_ice_cream");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Plasma) + 1, "plasma_konpeito");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Polychromite) + 1, "polychromite_konpeito");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Rainbow) + 1, "rainbow_konpeito");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Redstone) + 1, "redstone_roll_up");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.RockCandy) + 1, "rock_candy");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.RoseQuartz) + 1, "rose_quartz_ring_pop");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Sandstone) + 1, "sandstone_peanutbutter_cup");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Silicon) + 1, "silicon_swedish_fish");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Silk) + 1, "silk_cotton_candy");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Slime) + 1, "slime_jello");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.StarSapphire) + 1, "star_sapphire_stardust");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Sunstone) + 1, "sunstone_starburst");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Titanium) + 1, "titanium_twizzler");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Topaz) + 1, "topaz_taffy");
		register(candy, GristType.REGISTRY.getID(ArsenalGrist.Wood) + 1, "wood_chocolate_log");

	}
	
	private static void blockModels()
	{
		register(uniqueObject);
		register(kringlefucker);
		register(frostLog);
		register(frostLeaves);
		register(sendificator);
	}
	
	private static void register(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Item.REGISTRY.getNameForObject(item), "inventory"));
	}
	
	private static void register(Item item, int meta, String modelResource)
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation("minestuckarsenal:"+modelResource, "inventory"));
	}
	
	private static void register(Block block)
	{
		register(Item.getItemFromBlock(block));
	}
	
	private static class DualWeaponDefinition implements ItemMeshDefinition
	{
		private Item item;
		public DualWeaponDefinition(Item item){
			this.item=item;
		}
		@Override
		public ModelResourceLocation getModelLocation(ItemStack stack)
		{
			if(((ItemDualWeapon)this.item).IsDrawn(stack)){
				
				return new ModelResourceLocation(item.getRegistryName() + "_drawn","inventory");
			}else
				return new ModelResourceLocation(item.getRegistryName() + "_sheathed","inventory");
			
		}
	}	
	private static class ChainsawDefinition implements ItemMeshDefinition
	{
		private Item item;
		public ChainsawDefinition(Item item){
			this.item=item;
		}
		@Override
		public ModelResourceLocation getModelLocation(ItemStack stack)
		{
			if(((ItemDualWeapon)this.item).IsDrawn(stack)){
				
				return new ModelResourceLocation("minestuckarsenal:lipstick" ,"inventory");
			}
			
			else {
				return new ModelResourceLocation("minestuckarsenal:chainsaw" ,"inventory");
			}
		}
	}
}
