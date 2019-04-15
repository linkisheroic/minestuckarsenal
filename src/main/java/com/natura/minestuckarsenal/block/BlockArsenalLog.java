package com.natura.minestuckarsenal.block;

import com.mraof.minestuck.item.MinestuckItems;

import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockLog.EnumAxis;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockArsenalLog extends BlockLog {

	public BlockArsenalLog(String name, String unlocalizedName)
	{
		super();
		setCreativeTab(MinestuckItems.tabMinestuck);
		setDefaultState(blockState.getBaseState().withProperty(LOG_AXIS, BlockLog.EnumAxis.Y));
		setUnlocalizedName(unlocalizedName);
		setRegistryName(name);
		
	}
	
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {LOG_AXIS});
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		IBlockState iblockstate = this.getDefaultState();
		iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.values()[(meta>>2)&3]);
		
		return iblockstate;
	}
	
	@Override
	public int getMetaFromState(IBlockState state)
	{
		int i = 0;
		
		i |= state.getValue(LOG_AXIS).ordinal()<<2;
		
		return i;
	}
	
	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	{
		return MapColor.GREEN;
	}
	
	@Override
	public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face)
	{
		return 5;
	}
	
	@Override
	public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face)
	{
		return 5;
	}
}
