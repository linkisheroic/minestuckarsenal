package com.natura.minestuckarsenal.client;

import static com.mraof.minestuck.item.MinestuckItems.catClaws;
import static com.mraof.minestuck.item.MinestuckItems.crockerSpork;
import static com.natura.minestuckarsenal.item.MinestuckArsenalItems.brokenCaledfwlch;
import static com.natura.minestuckarsenal.item.MinestuckArsenalItems.brokenNinjaSword;
import static com.natura.minestuckarsenal.item.MinestuckArsenalItems.brokenRoyalDeringer;
import static com.natura.minestuckarsenal.item.MinestuckArsenalItems.brokenScarletRibbitar;
import static com.natura.minestuckarsenal.item.MinestuckArsenalItems.lipstickChainsaw;
import static com.natura.minestuckarsenal.item.MinestuckArsenalItems.nepetaClaws;
import static com.natura.minestuckarsenal.item.MinestuckArsenalItems.*;

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
import com.mraof.minestuck.item.weapon.ItemDualWeapon;

@SideOnly(Side.CLIENT)
public class ModelManager {

	@SubscribeEvent
	public static void handleModelRegistry(ModelRegistryEvent event)
	{
		itemModels();
	}
	
	private static void itemModels()
	{
		register(paperSword);
		
		register(brokenNinjaSword);
		register(brokenCaledfwlch);
		register(brokenRoyalDeringer);
		register(brokenScarletRibbitar);
		
		register(babysFirstThresher);
		
		register(wrinklefucker);
		
		register(knittingNeedles);
		register(needleWands);
		register(thornsOfOglogoth);
		register(quillsOfEchidna);
		
		register(woodenTrident);
		register(silverTrident);
		register(goldTrident);
		
		register(posiedonsEntente);
		register(imperialFork);
		
		register(joustingLance);
		register(fiduspawnLance);
		register(cigaretteHolderLance);
		register(rocketPopLance);
		
		register(woodenBat);
		register(cricketBat);
		
		register(leatherWhip);
		
		register(nepetaClaws);
		ModelLoader.registerItemVariants(nepetaClaws, new ResourceLocation("minestuckarsenal:nepeta_claws_sheathed"), new ResourceLocation("minestuckarsenal:nepeta_claws_drawn"));
		ModelLoader.setCustomMeshDefinition(nepetaClaws, new DualWeaponDefinition(nepetaClaws));
		register(blueClaws);
		ModelLoader.registerItemVariants(blueClaws, new ResourceLocation("minestuckarsenal:blue_claws_sheathed"), new ResourceLocation("minestuckarsenal:blue_claws_drawn"));
		ModelLoader.setCustomMeshDefinition(blueClaws, new DualWeaponDefinition(blueClaws));

		
		register(lipstickChainsaw);
		ModelLoader.registerItemVariants(lipstickChainsaw, new ResourceLocation("minestuckarsenal:lipstick"), new ResourceLocation("minestuckarsenal:chainsaw"));
		ModelLoader.setCustomMeshDefinition(lipstickChainsaw, new ChainsawDefinition(lipstickChainsaw));

		register(barbasol);
		register(clothesIron);
		register(magicCueball);
		register(fridgeMagnet);
		
	}
	
	private static void register(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Item.REGISTRY.getNameForObject(item), "inventory"));
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
				
				return new ModelResourceLocation("minestuckarsenal:" + ((ItemDualWeapon)this.item).Prefex + "_drawn","inventory");
			}else
				return new ModelResourceLocation("minestuckarsenal:" + ((ItemDualWeapon)this.item).Prefex + "_sheathed","inventory");
			
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
