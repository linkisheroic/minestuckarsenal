package com.natura.minestuckarsenal.lands.decorator;

import java.util.Random;

import com.mraof.minestuck.world.lands.decorator.structure.SimpleStructureDecorator;
import com.mraof.minestuck.world.lands.gen.ChunkProviderLands;

import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;

public class TeapotDecorator extends SimpleStructureDecorator {

	@Override
	public float getPriority() {
		// TODO Auto-generated method stub
		return 1.0F;
	}

	@Override
	protected BlockPos generateStructure(World world, Random random, BlockPos pos, ChunkProviderLands provider) {
		
		rotation = random.nextBoolean();
		
		final Template template = world.getSaveHandler().getStructureTemplateManager().getTemplate(world.getMinecraftServer(), new ResourceLocation("minestuckarsenal:teapot"));
        final PlacementSettings settings = new PlacementSettings().setRotation(rotation ? Rotation.CLOCKWISE_180 : Rotation.COUNTERCLOCKWISE_90);
		
		
		if(world.getBlockState(new BlockPos(pos)).getMaterial().isLiquid() || !world.getBlockState(pos).getBlock().isTopSolid(world.getBlockState(pos)) || pos.getY() < 80 || world.getBlockState(pos.up()) != Blocks.AIR.getDefaultState())
			return null;
		
		
		template.addBlocksToWorld(world, pos, settings);
		
		return pos;
	}

	@Override
	public int getCount(Random random) {
		// TODO Auto-generated method stub
		return 12;
	}

}