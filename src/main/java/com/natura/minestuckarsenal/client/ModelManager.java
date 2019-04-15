package com.natura.minestuckarsenal.client;

import static com.mraof.minestuck.item.MinestuckItems.candy;
import static com.natura.minestuckarsenal.block.MinestuckArsenalBlocks.gristGatherer;
import static com.natura.minestuckarsenal.block.MinestuckArsenalBlocks.kringlefucker;
import static com.natura.minestuckarsenal.block.MinestuckArsenalBlocks.powerHub;
import static com.natura.minestuckarsenal.block.MinestuckArsenalBlocks.sendificator;
import static com.natura.minestuckarsenal.block.MinestuckArsenalBlocks.uniqueObject;
import static com.natura.minestuckarsenal.item.MinestuckArsenalItems.*;

import com.mraof.minestuck.alchemy.GristType;
import com.mraof.minestuck.client.util.MinestuckModelManager;
import com.mraof.minestuck.item.MinestuckItems;
import com.mraof.minestuck.item.weapon.ItemDualWeapon;
import com.natura.minestuckarsenal.ArsenalGrist;
import com.natura.minestuckarsenal.MinestuckArsenalConfig;
import com.natura.minestuckarsenal.block.MinestuckArsenalBlocks;
import com.natura.minestuckarsenal.item.ItemDualGunWeapon;
import com.natura.minestuckarsenal.item.ItemHarpoonWeapon;
import com.natura.minestuckarsenal.item.ItemScalemate;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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
		
		//High def textures
		if(MinestuckArsenalConfig.use32Textures) {
			
			register(caledfwlch, 0, "caledfwlch_32");
			register(poseidonsEntente, 0, "poseidons_entente_32");
			register(imperialFork, 0, "emperial_fork_32");
			register(woodenTrident, 0, "wooden_trident_32");
			register(silverTrident, 0, "silver_trident_32");
			register(goldTrident, 0, "gold_trident_32");
			register(ahabsCrosshairs, 0, "ahabs_crosshairs_32");
			
		}
		
		//Normal textures
		else {
			
			register(caledfwlch);
			register(poseidonsEntente);
			register(imperialFork);
			register(woodenTrident);
			register(silverTrident);
			register(goldTrident);
			register(ahabsCrosshairs);
			
		}
		
		register(paperSword);
		register(chainsawKatana);
		register(ancestralSword);
		register(cutlass);
		register(candySword);
		
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
		
		ModelLoader.registerItemVariants(houseKey, new ResourceLocation("minestuckarsenal:house_key_sheathed"), new ResourceLocation("minestuckarsenal:house_key_drawn"));
		ModelLoader.setCustomMeshDefinition(houseKey, new DualGunWeaponDefinition(houseKey));
		
		register(keyboardKey);
		register(keyblade);
		register(trueBlue);
		register(candyKey);
		register(chronolatch);
		register(yaldabaothsKeyton);
		register(allweddol);
		
		register(twirlingBaton);
		register(conductorsBaton);
		register(nightstick);
		register(uraniumBaton);
		register(windwaker);
		register(celestialFulcrum);
		
		register(keyAxe);
		register(stoneColdKeyAxe);
		
		register(candyAxe);
		register(shadowAxe);
		register(massDeduction);
		register(aks);
		
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
		ModelLoader.setCustomMeshDefinition(blackStaff, new DualGunWeaponDefinition(blackStaff));
		
		ModelLoader.registerItemVariants(goldStaff, new ResourceLocation("minestuckarsenal:gold_staff_sheathed"), new ResourceLocation("minestuckarsenal:gold_staff_drawn"));
		ModelLoader.setCustomMeshDefinition(goldStaff, new DualGunWeaponDefinition(goldStaff));
		
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
		
		ModelLoader.registerItemVariants(daintyDisembowler, new ResourceLocation("minestuckarsenal:dainty_disembowler_sheathed"), new ResourceLocation("minestuckarsenal:dainty_disembowler_drawn"));
		ModelLoader.setCustomMeshDefinition(daintyDisembowler, new DualWeaponDefinition(daintyDisembowler));
		
		ModelLoader.registerItemVariants(uraniumChainsaw, new ResourceLocation("minestuckarsenal:uranium_chainsaw_sheathed"), new ResourceLocation("minestuckarsenal:uranium_chainsaw_drawn"));
		ModelLoader.setCustomMeshDefinition(uraniumChainsaw, new DualWeaponDefinition(uraniumChainsaw));
		
		ModelLoader.registerItemVariants(horseHitcher, new ResourceLocation("minestuckarsenal:horse_hitcher_sheathed"), new ResourceLocation("minestuckarsenal:horse_hitcher_drawn"));
		ModelLoader.setCustomMeshDefinition(horseHitcher, new DualWeaponDefinition(horseHitcher));
		
		ModelLoader.registerItemVariants(cuestick, new ResourceLocation("minestuckarsenal:cuestick_sheathed"), new ResourceLocation("minestuckarsenal:cuestick_drawn"));
		ModelLoader.setCustomMeshDefinition(cuestick, new DualWeaponDefinition(cuestick));
		
		ModelLoader.registerItemVariants(clubOfFelony, new ResourceLocation("minestuckarsenal:club_of_felony_sheathed"), new ResourceLocation("minestuckarsenal:club_of_felony_drawn"));
		ModelLoader.setCustomMeshDefinition(clubOfFelony, new DualWeaponDefinition(clubOfFelony));
		
		register(branch);
		register(broom);
		
		register(scythe);
		register(eightballScythe);
		register(mineNGrist);
		
		register(horseFootballPlayer);
		
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
		register(cakeMix);
		
		register(barbasol);
		register(clothesIron);
		register(magicCueball);
		register(fridgeMagnet);
		register(hostPlush);
		register(magicEightBall);
		register(crystalBall);
		register(wiseguyBook);
		register(sassacreText);
		register(flarpManual);
		register(athManual);
		register(trollRomance);
		register(wizardStatue);
		register(inkSquidProQuo);
		register(blueEctoSlime);
		register(faygoEcto);
		register(seahorseIdol);
		
		for(int i = 0; i < ItemScalemate.names.length; i++)
			register(scalemate, i, "scalemate_" + ItemScalemate.names[i]);
		
		register(barbasolBomb);
		
		register(suitarangHeart);
		register(suitarangClub);
		register(suitarangDiamond);
		register(suitarangSpade);
		
		register(sbahjifier);
		
		register(horn);
		
		//register(boondollar);
		register(boonbuck);
		register(booncase);
		
		register(ringOfVoid);
		register(ringOfLife);
		
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
		
		register(bullet);
		register(huntingRifle);
		
		ModelLoader.registerItemVariants(harpoonGun, new ResourceLocation("minestuckarsenal:harpoon_gun_loaded"), new ResourceLocation("minestuckarsenal:harpoon_gun_unloaded"));
		ModelLoader.setCustomMeshDefinition(harpoonGun, new HarpoonWeaponDefinition(harpoonGun));
		
		register(girlsBestFriend);
		register(greenSunStreetSweeper);
		register(beretta);
		register(goldBeretta);
		register(gunblade);
		register(gunOfSouls);
		
		register(arrayModus);
		register(walletModus);
		register(moneyModus);
		
		//Grist candy models.
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
		
		ModelLoader.setCustomModelResourceLocation(MinestuckItems.minestuckBucket, 6, new ModelResourceLocation("minestuck:bucket_tea", "inventory"));

	}
	
	private static void blockModels()
	{
		register(uniqueObject);
		register(kringlefucker);
		
		register(sendificator);
		register(powerHub);
		register(gristGatherer);
		
		ModelLoader.setCustomStateMapper(MinestuckArsenalBlocks.blockTea, (new StateMap.Builder()).ignore(BlockFluidBase.LEVEL).build());
		
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
				
			}
			
			else {
				
				return new ModelResourceLocation(item.getRegistryName() + "_sheathed","inventory");
				
			}
				
		}
		
	}	
	
	private static class HarpoonWeaponDefinition implements ItemMeshDefinition
	{
		private Item item;
		public HarpoonWeaponDefinition(Item item){
			this.item=item;
		}
		@Override
		public ModelResourceLocation getModelLocation(ItemStack stack)
		{
			if(((ItemHarpoonWeapon)this.item).isLoaded(stack, 0)){
				
				return new ModelResourceLocation(item.getRegistryName() + "_loaded","inventory");
			}else
				return new ModelResourceLocation(item.getRegistryName() + "_unloaded","inventory");
			
		}
	}
	
	private static class DualGunWeaponDefinition implements ItemMeshDefinition
	{
		private Item item;
		public DualGunWeaponDefinition(Item item){
			this.item=item;
		}
		@Override
		public ModelResourceLocation getModelLocation(ItemStack stack)
		{
			if(((ItemDualGunWeapon)this.item).isDrawn(stack)){
				
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
