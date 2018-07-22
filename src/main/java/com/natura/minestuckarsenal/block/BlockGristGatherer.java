package com.natura.minestuckarsenal.block;

import javax.annotation.Nullable;

import com.mraof.minestuck.util.IdentifierHandler;
import com.mraof.minestuck.util.IdentifierHandler.PlayerIdentifier;
import com.natura.minestuckarsenal.MinestuckArsenal;
import com.natura.minestuckarsenal.TabArsenal;
import com.natura.minestuckarsenal.tileentity.TileEntityGristGatherer;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGristGatherer extends Block implements ITickable {
		
	public BlockGristGatherer() {
		super(Material.IRON, MapColor.GREEN);
		this.setUnlocalizedName("gristGatherer");
		this.setRegistryName(MinestuckArsenal.MODID, "grist_gatherer");
		this.setHardness(4.0F);
		this.setResistance(8.0F);
		this.setLightLevel(6.0F);
		this.setCreativeTab(TabArsenal.instance);
		this.setTickRandomly(true);
	}
	
	public Class<TileEntityGristGatherer> getTileEntityClass() {
		return TileEntityGristGatherer.class;
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
		return (TileEntity) new TileEntityGristGatherer();
	}
	
	@Override
	public void update() {
		// Ticking Methods here.
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if(!worldIn.isRemote) { 
		if(playerIn != null) {
				TileEntityGristGatherer te = (TileEntityGristGatherer)worldIn.getTileEntity(pos);
				
				if(te.getPlayer() == null) {
					PlayerIdentifier player = IdentifierHandler.encode(playerIn);
					te.setPlayer(player);
					
					
						playerIn.sendMessage(new TextComponentString("You are now the owner of this block."));
					
				}
				
				else if(te.getPlayer().getPlayer().getName() == playerIn.getName()) {
					
					playerIn.sendMessage(new TextComponentString("You are the owner of this block."));
				}
				
				else {
				
						playerIn.sendMessage(new TextComponentString("This block already has an owner!"));
						
				}
			}
		}
		return true;
	}
	
	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer,
			ItemStack stack) {
		
		super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
		TileEntityGristGatherer te = (TileEntityGristGatherer)worldIn.getTileEntity(pos);
		
		if(te != null && placer instanceof EntityPlayer) {
			PlayerIdentifier player = IdentifierHandler.encode((EntityPlayer) placer);
			te.setPlayer(player);
		}
		
	}

}
