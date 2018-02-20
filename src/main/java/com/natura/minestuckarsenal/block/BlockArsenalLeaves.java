package com.natura.minestuckarsenal.block;

import java.util.Random;

import com.mraof.minestuck.item.MinestuckItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockArsenalLeaves extends Block {

	
	public BlockArsenalLeaves(String name, String unlocalizedName) {
		super(Material.LEAVES, MapColor.GREEN);
		setCreativeTab(MinestuckItems.tabMinestuck);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(name);
		this.setHardness(0.2F);
        this.setLightOpacity(1);
        this.setSoundType(SoundType.PLANT);
        this.setTickRandomly(true);

	}
	
	 @SideOnly(Side.CLIENT)
	    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
	    {
	        if (worldIn.isRainingAt(pos.up()) && !worldIn.getBlockState(pos.down()).isTopSolid() && rand.nextInt(15) == 1)
	        {
	            double d0 = (double)((float)pos.getX() + rand.nextFloat());
	            double d1 = (double)pos.getY() - 0.05D;
	            double d2 = (double)((float)pos.getZ() + rand.nextFloat());
	            worldIn.spawnParticle(EnumParticleTypes.DRIP_WATER, d0, d1, d2, 0.0D, 0.0D, 0.0D);
	        }
	    }
	 
	 @Override
	 public Item getItemDropped(IBlockState state, Random rand, int fortune)
	 {
	      return ItemStack.EMPTY.getItem();
	 }


	 @Override
	 public boolean isOpaqueCube(IBlockState state)
	 {
	      return false;
	 }
	 
	 

	 @Override
	 @SideOnly(Side.CLIENT)
	 public BlockRenderLayer getBlockLayer()
	 {
	     return BlockRenderLayer.CUTOUT_MIPPED;
	 }

	@Override
	public boolean causesSuffocation(IBlockState state)
	{
	     return false;
	}
}
