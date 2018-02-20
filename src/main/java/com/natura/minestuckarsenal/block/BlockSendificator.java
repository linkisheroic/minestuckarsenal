package com.natura.minestuckarsenal.block;

import com.mraof.minestuck.item.MinestuckItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSendificator extends Block {
	
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    public static final AxisAlignedBB AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.6D, 1.0D);

	
	public BlockSendificator(String name, String unlocalizedName) {
		super(Material.IRON);
		setCreativeTab(MinestuckItems.tabMinestuck);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(name);
		this.setHardness(5.0F);
        this.setSoundType(SoundType.METAL);
	}

	 @Override
	 public boolean isOpaqueCube(IBlockState state)
	 {
	      return false;
	 }
	 
	 @Override
	public boolean isFullBlock(IBlockState state) {
		return false;
	}
	 
	 @Override
	public boolean isFullCube(IBlockState state) {
		// TODO Auto-generated method stub
		return false;
	}
	 
	 @Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		// TODO Auto-generated method stub
		return AABB;
	}
	 
	 @Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		return AABB;
	}
	 
	 @Override
	    public BlockStateContainer createBlockState() {
	        return new BlockStateContainer(this, FACING);
	    }
		
		@Override
		 public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase entity, ItemStack stack) {
		     EnumFacing entityFacing = entity.getHorizontalFacing();

		     if(!world.isRemote) {
		         if(entityFacing == EnumFacing.NORTH) {
		             entityFacing = EnumFacing.NORTH;
		         } else if(entityFacing == EnumFacing.EAST) {
		             entityFacing = EnumFacing.EAST;
		         } else if(entityFacing == EnumFacing.SOUTH) {
		             entityFacing = EnumFacing.SOUTH;
		         } else if(entityFacing == EnumFacing.WEST) {
		             entityFacing = EnumFacing.WEST;
		         }

		         world.setBlockState(pos, state.withProperty(FACING, entityFacing), 2);
		     }
		 }
		
		@Override
	    public int getMetaFromState(IBlockState state) {
	        return ((EnumFacing)state.getValue(FACING)).getHorizontalIndex();
	    }
		
		 @Override
		    public IBlockState getStateFromMeta(int meta) {
		        return getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
		}
	
}
