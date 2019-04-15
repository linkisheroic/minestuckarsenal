package com.natura.minestuckarsenal.item;

import com.mraof.minestuck.item.TabMinestuck;
import com.natura.minestuckarsenal.block.MinestuckArsenalBlocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class ItemArsenalBucket extends ItemBucket {
	
	public ItemArsenalBucket() 
	{
		super(Blocks.AIR);
		setUnlocalizedName("teaBucket");
		setCreativeTab(TabMinestuck.instance);
		setContainerItem(Items.BUCKET);
		setHasSubtypes(true);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack stack = playerIn.getHeldItem(handIn);
		RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, false);
		
		ActionResult<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onBucketUse(playerIn, worldIn, stack, raytraceresult);
		if (ret != null) return ret;
		
		if (raytraceresult == null)
		{
			return new ActionResult(EnumActionResult.PASS, stack);
		}
		else if (raytraceresult.typeOfHit != RayTraceResult.Type.BLOCK)
		{
			return new ActionResult(EnumActionResult.PASS, stack);
		}
		else
		{
			BlockPos blockpos = raytraceresult.getBlockPos();
			
			if (!worldIn.isBlockModifiable(playerIn, blockpos))
			{
				return new ActionResult(EnumActionResult.FAIL, stack);
			}
			else
			{
				boolean flag1 = worldIn.getBlockState(blockpos).getBlock().isReplaceable(worldIn, blockpos);
				BlockPos blockpos1 = flag1 && raytraceresult.sideHit == EnumFacing.UP ? blockpos : blockpos.offset(raytraceresult.sideHit);
				
				if (!playerIn.canPlayerEdit(blockpos1, raytraceresult.sideHit, stack))
				{
					return new ActionResult(EnumActionResult.FAIL, stack);
				}
				else if (this.tryPlaceContainedLiquid(playerIn, worldIn, blockpos1, MinestuckArsenalBlocks.blockTea.getDefaultState()))
				{
					playerIn.addStat(StatList.getObjectUseStats(this));
					return new ActionResult(EnumActionResult.SUCCESS, !playerIn.capabilities.isCreativeMode ? new ItemStack(Items.BUCKET) : stack);
				}
				else
				{
					return new ActionResult(EnumActionResult.FAIL, stack);
				}
			}
		}
	}

	/**
	 * Attempts to place the liquid contained inside the bucket.
	 */
	public boolean tryPlaceContainedLiquid(EntityPlayer player, World world, BlockPos pos, IBlockState block)
	{
		Material material = world.getBlockState(pos).getMaterial();
		boolean flag = !material.isSolid();

		if (!world.isAirBlock(pos) && !flag)
		{
			return false;
		}
		else
		{
			if (!world.isRemote && flag && !material.isLiquid())
			{
				world.destroyBlock(pos, true);
			}

			world.playSound(player, pos, SoundEvents.ITEM_BUCKET_EMPTY, SoundCategory.BLOCKS, 1.0F, 1.0F);
			world.setBlockState(pos, block, 3);
			
			return true;
		}
	}

}
