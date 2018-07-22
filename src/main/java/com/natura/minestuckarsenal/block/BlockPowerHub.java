package com.natura.minestuckarsenal.block;

import javax.annotation.Nullable;

import com.mraof.minestuck.item.MinestuckItems;
import com.natura.minestuckarsenal.MinestuckArsenal;
import com.natura.minestuckarsenal.TabArsenal;
import com.natura.minestuckarsenal.tileentity.EnergyMaster;
import com.natura.minestuckarsenal.tileentity.TileEntityHub;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class BlockPowerHub extends Block implements ITickable {
	
    protected static final AxisAlignedBB AABB_HALF = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D);

	public BlockPowerHub() {
		super(Material.IRON, MapColor.GREEN);
		this.setUnlocalizedName("powerHub");
		this.setRegistryName(MinestuckArsenal.MODID, "power_hub");
		this.setHardness(6.0F);
		this.setResistance(8.0F);
		this.setLightLevel(6.0F);
		this.setCreativeTab(TabArsenal.instance);
		this.setTickRandomly(true);
	}
	
	public Class<TileEntityHub> getTileEntityClass() {
		return TileEntityHub.class;
	}
	
	public TileEntity getTileEntity(IBlockAccess world, BlockPos pos) {
		return world.getTileEntity(pos);
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}
	
	@Nullable
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return (TileEntity) new TileEntityHub();
	}

	@Override
	public void update() {
		// Ticking Methods here.
	}
	
	@Override
	public boolean isFullBlock(IBlockState state) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
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
		return AABB_HALF;
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		return AABB_HALF;
	}
	
	@Override
	public boolean isTopSolid(IBlockState state) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public BlockFaceShape getBlockFaceShape(IBlockAccess p_193383_1_, IBlockState p_193383_2_, BlockPos p_193383_3_,
			EnumFacing p_193383_4_) {
		// TODO Auto-generated method stub
		if(p_193383_4_ == EnumFacing.UP) {
			return BlockFaceShape.UNDEFINED;
		}
		
		else return BlockFaceShape.SOLID;
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		
		if (!worldIn.isRemote) {
			TileEntityHub tile = (TileEntityHub) getTileEntity(worldIn, pos);
			IItemHandler itemHandler = (IItemHandler) tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, playerIn.getHorizontalFacing().getOpposite());
			IEnergyStorage energyHandler = (IEnergyStorage) tile.getCapability(CapabilityEnergy.ENERGY, playerIn.getHorizontalFacing().getOpposite());
			if (!playerIn.isSneaking()) {
				if (playerIn.getHeldItem(playerIn.getActiveHand()) == null) {
				} else {
					if(playerIn.getHeldItem(playerIn.getActiveHand()).getItem() == MinestuckItems.rawUranium) {
						ItemStack uranium = playerIn.getHeldItem(playerIn.getActiveHand());
						if(itemHandler.getStackInSlot(0).getCount() + playerIn.getHeldItem(playerIn.getActiveHand()).getCount() <= 64) {
							itemHandler.insertItem(0, playerIn.getHeldItem(playerIn.getActiveHand()), false);
							playerIn.setHeldItem(playerIn.getActiveHand(), ItemStack.EMPTY);
						}
						else {
							int amountToAdd = 0;
							amountToAdd = 64 - itemHandler.getStackInSlot(0).getCount();
							int amountLeft = 0;
							amountLeft = playerIn.getHeldItem(playerIn.getActiveHand()).getCount() - amountToAdd;
							
							itemHandler.insertItem(0, new ItemStack(MinestuckItems.rawUranium), false);
							playerIn.setHeldItem(playerIn.getActiveHand(), new ItemStack(MinestuckItems.rawUranium, amountLeft));
						}
					}
				}
				tile.markDirty();
			} 
				ItemStack stack = itemHandler.getStackInSlot(0);
				if (stack.getCount() != 0) {
					playerIn.sendMessage(new TextComponentString(String.valueOf(stack.getCount()) + " Uranium Lumps. Storing " + String.valueOf(energyHandler.getEnergyStored() + "FE")));
				} else {
					playerIn.sendMessage(new TextComponentString("No Uranium! Storing " + String.valueOf(energyHandler.getEnergyStored() + "FE.")));
				}
			
		}
		
		return true;
	}
	
	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		TileEntityHub tile = (TileEntityHub) getTileEntity(world, pos);
		IItemHandler itemHandler = (IItemHandler) tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		ItemStack stack = itemHandler.getStackInSlot(0);
		if (stack != null) {
			EntityItem item = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), stack);
			world.spawnEntity(item);
		}
		super.breakBlock(world, pos, state);
	}


}
