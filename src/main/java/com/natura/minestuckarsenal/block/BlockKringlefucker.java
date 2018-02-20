package com.natura.minestuckarsenal.block;

import com.mraof.minestuck.item.MinestuckItems;

import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockKringlefucker extends BlockBush {
	public BlockKringlefucker() {
		setUnlocalizedName("kringlefucker");
		setRegistryName("kringlefucker");
		this.setSoundType(SoundType.PLANT);
		setCreativeTab(MinestuckItems.tabMinestuck);
	}
	
	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public boolean isFullBlock(IBlockState state) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean isBlockNormalCube(IBlockState state) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
