package com.natura.minestuckarsenal.lands.terrain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.mraof.minestuck.block.MinestuckBlocks;
import com.mraof.minestuck.entity.consort.EnumConsort;
import com.mraof.minestuck.world.lands.decorator.ILandDecorator;
import com.mraof.minestuck.world.lands.decorator.OceanRundown;
import com.mraof.minestuck.world.lands.decorator.UndergroundDecoratorVein;
import com.mraof.minestuck.world.lands.gen.ChunkProviderLands;
import com.mraof.minestuck.world.lands.gen.DefaultTerrainGen;
import com.mraof.minestuck.world.lands.gen.ILandTerrainGen;
import com.mraof.minestuck.world.lands.structure.blocks.StructureBlockRegistry;
import com.mraof.minestuck.world.lands.terrain.TerrainLandAspect;
import com.natura.minestuckarsenal.block.MinestuckArsenalBlocks;
import com.natura.minestuckarsenal.lands.decorator.TeapotDecorator;

import net.minecraft.block.BlockColored;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.math.Vec3d;

public class LandAspectSugar extends TerrainLandAspect 
{
	static Vec3d skyColor = new Vec3d(0.8D, 0.7D, 0.0D);

	@Override
	public String getPrimaryName() {
		
		return "sugar";
	}

	@Override
	public String[] getNames() {
		
		return new String[] {"sugar","saccharin","little_cubes"};
	}

	@Override
	public void registerBlocks(StructureBlockRegistry registry) {
		registry.setBlockState("ground", Blocks.STONE.getDefaultState());
		registry.setBlockState("upper", MinestuckBlocks.sugarCube.getDefaultState());
		registry.setBlockState("surface", MinestuckBlocks.sugarCube.getDefaultState());
		registry.setBlockState("ocean", MinestuckArsenalBlocks.blockTea.getDefaultState());
		registry.setBlockState("river", MinestuckArsenalBlocks.blockTea.getDefaultState());
		registry.setBlockState("structure_primary", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLACK));
		registry.setBlockState("structure_primary_decorative", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PINK));
		registry.setBlockState("structure_primary_stairs", Blocks.BIRCH_STAIRS.getDefaultState());
		registry.setBlockState("structure_secondary", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE));
		registry.setBlockState("structure_secondary_decorative", Blocks.PINK_GLAZED_TERRACOTTA.getDefaultState());
		registry.setBlockState("structure_secondary_stairs", Blocks.BIRCH_STAIRS.getDefaultState());
		registry.setBlockState("fall_fluid", MinestuckArsenalBlocks.blockTea.getDefaultState());
		registry.setBlockState("light_block", Blocks.GLOWSTONE.getDefaultState());
		registry.setBlockState("structure_wool_1", Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PINK));
		registry.setBlockState("structure_wool_3", Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE));
	}

	@Override
	public List<ILandDecorator> getDecorators() {
		ArrayList<ILandDecorator> list = new ArrayList<ILandDecorator>();
		
		list.add(new OceanRundown(0.6F, 6));
		list.add(new TeapotDecorator());
		
		list.add(new UndergroundDecoratorVein(Blocks.REDSTONE_ORE.getDefaultState(), 18, 10, 45));
		list.add(new UndergroundDecoratorVein(Blocks.EMERALD_ORE.getDefaultState(), 12, 8, 45));
		list.add(new UndergroundDecoratorVein(Blocks.LAPIS_ORE.getDefaultState(), 14, 16, 45));
		list.add(new UndergroundDecoratorVein(Blocks.DIAMOND_ORE.getDefaultState(), 10, 6, 45));

		return list;
	}

	@Override
	public Vec3d getFogColor() {
		
		return skyColor;
	}
	
	@Override
	public Vec3d getCloudColor() {
		// TODO Auto-generated method stub
		return skyColor;
	}
	
	@Override
	public float getSkylightBase() {
		// TODO Auto-generated method stub
		return 1.0F;
	}
	

	@Override
	public EnumConsort getConsortType() {
		
		return EnumConsort.TURTLE;
	}
	
	@Override
	public float getOceanChance() {
		// TODO Auto-generated method stub
		return 0.1F;
	}
	
	@Override
	public float getRainfall() {
		// TODO Auto-generated method stub
		return 0F;
	}
	
	@Override
	public float getRoughChance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
    public ILandTerrainGen createTerrainGenerator(ChunkProviderLands chunkProvider, Random rand)
    {
        DefaultTerrainGen terrainGen = new DefaultTerrainGen(chunkProvider, rand);
        
        terrainGen.normalHeight = 0.5F;
        terrainGen.roughHeight = 0.1F;
        terrainGen.normalVariation = 1.2F;
        terrainGen.roughVariation = 0.0F;
        terrainGen.oceanVariation = 0.1F;
        
        return terrainGen;
    }
}

