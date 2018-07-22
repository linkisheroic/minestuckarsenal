package com.natura.minestuckarsenal.block;

import com.mraof.minestuck.block.BlockCustom;
import com.mraof.minestuck.block.BlockMinestuckLog;
import com.mraof.minestuck.item.MinestuckItems;
import com.natura.minestuckarsenal.MinestuckArsenal;
import com.natura.minestuckarsenal.TabArsenal;
import com.natura.minestuckarsenal.tileentity.TileEntityGristGatherer;
import com.natura.minestuckarsenal.tileentity.TileEntityHub;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.BlockFluidFinite;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class MinestuckArsenalBlocks {

	//Blocks
	public static Block uniqueObject = new BlockCustom(Material.GOURD, MapColor.LIME, SoundType.WOOD).setRegistryName("unique_object").setUnlocalizedName("uniqueObject").setHardness(1.0F).setCreativeTab(TabArsenal.instance);
	public static Block uraniumBlock = new BlockCustom(Material.ROCK, MapColor.GREEN, SoundType.METAL).setRegistryName("uranium_block").setUnlocalizedName("uraniumBlock").setHardness(4.0F).setCreativeTab(TabArsenal.instance);
	
	public static Block chalk = new BlockCustom(Material.CLAY, MapColor.QUARTZ, SoundType.SAND).setRegistryName("chalk").setUnlocalizedName("chalk").setHardness(1.0F).setCreativeTab(TabArsenal.instance);
	public static Block chalkPolished = new BlockCustom(Material.ROCK, MapColor.QUARTZ, SoundType.STONE).setRegistryName("chalk_polished").setUnlocalizedName("chalkPolished").setHardness(2.0F).setCreativeTab(TabArsenal.instance);
	public static Block chalkBricks = new BlockCustom(Material.ROCK, MapColor.QUARTZ, SoundType.STONE).setRegistryName("chalk_bricks").setUnlocalizedName("chalkBricks").setHardness(2.0F).setCreativeTab(TabArsenal.instance);
	public static Block chalkBricksChiseled = new BlockCustom(Material.ROCK, MapColor.QUARTZ, SoundType.STONE).setRegistryName("chalk_bricks_chiseled").setUnlocalizedName("chalkBricksChiseled").setHardness(2.0F).setCreativeTab(TabArsenal.instance);
	
	
	public static Block pinkStone = new BlockCustom(Material.ROCK, MapColor.PINK, SoundType.STONE).setRegistryName("pink_stone").setUnlocalizedName("pinkStone").setHardness(3.0F).setCreativeTab(TabArsenal.instance);
	public static Block pinkStonePolished = new BlockCustom(Material.ROCK, MapColor.PINK, SoundType.STONE).setRegistryName("pink_stone_polished").setUnlocalizedName("pinkStonePolished").setHardness(3.0F).setCreativeTab(TabArsenal.instance);
	public static Block pinkStoneBricks = new BlockCustom(Material.ROCK, MapColor.PINK, SoundType.STONE).setRegistryName("pink_stone_bricks").setUnlocalizedName("pinkStoneBricks").setHardness(3.0F).setCreativeTab(TabArsenal.instance);
	public static Block pinkStoneBricksChiseled = new BlockCustom(Material.ROCK, MapColor.PINK, SoundType.STONE).setRegistryName("pink_stone_bricks_chiseled").setUnlocalizedName("pinkStoneBricksChiseled").setHardness(3.0F).setCreativeTab(TabArsenal.instance);
	public static Block pinkStoneBricksCracked = new BlockCustom(Material.ROCK, MapColor.PINK, SoundType.STONE).setRegistryName("pink_stone_bricks_cracked").setUnlocalizedName("pinkStoneBricksCracked").setHardness(3.0F).setCreativeTab(TabArsenal.instance);
	public static Block pinkStoneBricksMossy = new BlockCustom(Material.ROCK, MapColor.PINK, SoundType.STONE).setRegistryName("pink_stone_bricks_mossy").setUnlocalizedName("pinkStoneBricksMossy").setHardness(3.0F).setCreativeTab(TabArsenal.instance);

	public static Block frostPlanks = new BlockCustom(Material.WOOD, MapColor.CYAN, SoundType.WOOD).setRegistryName("frost_planks").setUnlocalizedName("frostPlanks").setHardness(3.0F).setCreativeTab(TabArsenal.instance);
	public static Block frostLog = new BlockArsenalLog("frost_log", "frostLog").setHardness(3.0F).setCreativeTab(TabArsenal.instance);
	public static Block frostLeaves = new BlockArsenalLeaves("frost_leaves", "frostLeaves").setCreativeTab(TabArsenal.instance);
	
	public static Block deadLog = new BlockArsenalLog("dead_log", "deadLog").setHardness(3.0F).setCreativeTab(TabArsenal.instance);
	
	public static Block sendificator = new BlockSendificator("sendificator", "sendificator").setCreativeTab(TabArsenal.instance);
	public static Block powerHub = new BlockPowerHub();
	public static Block gristGatherer = new BlockGristGatherer();
	
	public static Block kringlefucker = new BlockKringlefucker().setCreativeTab(TabArsenal.instance);
	
	public static final Fluid moltenCastIron;
	public static final ResourceLocation moltenCastIronStill = new ResourceLocation(MinestuckArsenal.MODID, "blocks/molten_cast_iron_still");
	public static final ResourceLocation moltenCastIronFlow = new ResourceLocation(MinestuckArsenal.MODID, "blocks/molten_cast_iron_flowing");
	
	static {
		moltenCastIron  = registerFluid(new Fluid("cast_iron" , moltenCastIronStill, moltenCastIronFlow).setTemperature(2000).setLuminosity(15));
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		IForgeRegistry<Block> registry = event.getRegistry();
		//blocks
		registry.register(uniqueObject);
		
		registry.register(frostLog);
		registry.register(frostPlanks);
		registry.register(frostLeaves);
		registry.register(deadLog);
		
		registry.register(sendificator);
		registry.register(kringlefucker);
		registry.register(powerHub);
		registry.register(gristGatherer);
		
		registry.register(uraniumBlock);
		
		registry.register(chalk);
		registry.register(chalkPolished);
		registry.register(chalkBricks);
		registry.register(chalkBricksChiseled);
		
		registry.register(pinkStone);
		registry.register(pinkStonePolished);
		registry.register(pinkStoneBricks);
		registry.register(pinkStoneBricksChiseled);
		registry.register(pinkStoneBricksCracked);
		registry.register(pinkStoneBricksMossy);
		
		registerFluidBlock(moltenCastIron);
		GameRegistry.registerTileEntity(TileEntityHub.class, "power_hub");
		GameRegistry.registerTileEntity(TileEntityGristGatherer.class, "grist_gatherer");
	}
	
	private static Fluid registerFluid(Fluid fluid) {
		fluid.setUnlocalizedName(fluid.getName());
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
		return fluid;
	}
	
	private static void registerFluidBlock(Fluid fluid) {
		registerFluidBlock("molten_" + fluid.getName(), fluid);
	}

	private static void registerFluidBlock(String registryName, Fluid fluid) {
		Block block = new BlockFluidClassic(fluid, Material.LAVA).setUnlocalizedName(fluid.getName()).setLightLevel(15.0F);
		block.setRegistryName("cast_iron");
		registerFluid(fluid);
	}
}
