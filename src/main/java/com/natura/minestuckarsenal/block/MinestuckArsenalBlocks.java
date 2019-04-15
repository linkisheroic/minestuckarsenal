package com.natura.minestuckarsenal.block;

import com.mraof.minestuck.block.BlockCustom;
import com.natura.minestuckarsenal.MinestuckArsenal;
import com.natura.minestuckarsenal.TabArsenal;
import com.natura.minestuckarsenal.tileentity.TileEntityGristGatherer;
import com.natura.minestuckarsenal.tileentity.TileEntityHub;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class MinestuckArsenalBlocks {

	//Blocks
	public static Block uniqueObject = new BlockCustom(Material.GOURD, MapColor.LIME, SoundType.WOOD).setRegistryName("unique_object").setUnlocalizedName("uniqueObject").setHardness(1.0F).setCreativeTab(TabArsenal.instance);
	
	public static Block sendificator = new BlockSendificator("sendificator", "sendificator").setCreativeTab(TabArsenal.instance);
	public static Block powerHub = new BlockPowerHub();
	public static Block gristGatherer = new BlockGristGatherer();
	
	public static Block kringlefucker = new BlockKringlefucker().setCreativeTab(TabArsenal.instance);
	
	public static Fluid fluidTea = createFluid("tea", new ResourceLocation("minestuckarsenal", "blocks/tea_still"), new ResourceLocation("minestuckarsenal", "blocks/tea_flow"), "tile.tea");
	
	public static Block blockTea = new BlockFluidClassic(fluidTea, Material.WATER){
		@SideOnly (Side.CLIENT)
		@Override
		public Vec3d getFogColor(World world, BlockPos pos, IBlockState state, Entity entity, Vec3d originalColor, float partialTicks)
		{
			return new Vec3d(0.5, 0.8, 0.6);
		}
	}.setUnlocalizedName("tea").setLightOpacity(1);
	
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
		
		registry.register(sendificator);
		registry.register(kringlefucker);
		registry.register(powerHub);
		registry.register(gristGatherer);
		
		registry.register(blockTea.setRegistryName("block_tea"));
		
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
	
	private static Fluid createFluid(String name, ResourceLocation still, ResourceLocation flowing, String unlocalizedName)
	{
		Fluid fluid = new Fluid(name, still, flowing);
		
		boolean useFluid = FluidRegistry.registerFluid(fluid);
		
		if(useFluid)
			fluid.setUnlocalizedName(unlocalizedName);
		else fluid = FluidRegistry.getFluid(name);
		
		return fluid;
	}
}
