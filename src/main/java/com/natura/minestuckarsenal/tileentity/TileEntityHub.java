package com.natura.minestuckarsenal.tileentity;

import java.util.ArrayList;

import javax.annotation.Nullable;

import com.mraof.minestuck.item.MinestuckItems;
import com.natura.minestuckarsenal.MinestuckArsenalConfig;

import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.EnergyStorage;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

/*
 * Thanks to the Actually Additions author for the energy transfer code.
 * https://github.com/Ellpeck/ActuallyAdditions
 */

@SuppressWarnings("hiding")
public class TileEntityHub<IItemHandler,IEnergyStorage> extends TileEntity implements ICapabilityProvider,ITickable {
	
	private StackMaster inventory = new StackMaster(1);
	private EnergyMaster energy = new EnergyMaster(MinestuckArsenalConfig.powerHubStorage);
	protected TileEntity[] tilesAround = new TileEntity[6];
	protected int ticksElapsed;
	protected int timerMax = MinestuckArsenalConfig.powerHubBurnTime;

	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		
		super.writeToNBT(compound);
		
		compound.setTag("inventory", inventory.serializeNBT());
		compound.setInteger("energy", energy.getEnergyStored());
		return compound;
		
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		
		super.readFromNBT(compound);
		
		inventory.deserializeNBT(compound.getCompoundTag("inventory"));
		this.energy.setEnergy(compound.getInteger("energy"));
		
	}

	//Called each tick. Put the stuff that makes power and transfers it out here.
	@Override
	public void update() {
		
		
		if(ticksElapsed == timerMax) {
			
			if(inventory.getStackInSlot(0).getItem() == MinestuckItems.rawUranium) {
				
				if(energy.getEnergyStored() == energy.getMaxEnergyStored()) {
				
				}
				
				else if((energy.getEnergyStored() + MinestuckArsenalConfig.powerHubOutput * 2) <= energy.getMaxEnergyStored()) {
					
					energy.increaseEnergy(MinestuckArsenalConfig.powerHubOutput * 2);
					inventory.extractItem(0, 1, false);
					
				}
				
				else {
					
					int mod = energy.getMaxEnergyStored() - energy.getEnergyStored();
				
					energy.increaseEnergy(mod);
					inventory.extractItem(0, 1, false);
					
				}
				
			}
			
			ticksElapsed = 0;
			
		}
		
		else {
			
			ticksElapsed ++;
			
			if(inventory.getStackInSlot(0).getItem() == MinestuckItems.rawUranium) {
				
				if(energy.getEnergyStored() == energy.getMaxEnergyStored()) {
				
				}
				
				else if((energy.getEnergyStored() + MinestuckArsenalConfig.powerHubOutput) <= energy.getMaxEnergyStored()) {
					
					energy.increaseEnergy(MinestuckArsenalConfig.powerHubOutput);
					
					
				}
				
				else {
					
					int mod = energy.getMaxEnergyStored() - energy.getEnergyStored();
					energy.increaseEnergy(mod);
					
				}
				
			}
			
		}
		
		this.markDirty();
		this.updateEntity();
	}
	
	//Called at the end of update() each tick.
	public void updateEntity() {
		
        int total = energy.getEnergyStored();
        
        if(total > 0){
        	
            EnumFacing[] sides = EnumFacing.VALUES;
            
            for(EnumFacing side : sides){
            	
                TileEntity tile = world.getTileEntity(pos.offset(sides[side.ordinal()]));
                
                if(tile != null){
                	
                	tilesAround[side.ordinal()] = tile;
                	int amount = total/sides.length;
                	
                	if(amount <= 0){
                    	
                        amount = total;
                        
                    }
                	
                    doEnergyInteraction(this, tile, side, amount);
                    
                }
                
            }
            
            tilesAround = new TileEntity[6];
            
        }

	}

	//Energy transfers out, but not in.
	public void doEnergyInteraction(TileEntity tileFrom, TileEntity tileTo, EnumFacing sideTo, int maxTransfer) {
		
			if (maxTransfer > 0) {
			
				EnumFacing opp = sideTo == null ? null : sideTo.getOpposite();
				
				if (tileFrom.hasCapability(CapabilityEnergy.ENERGY, sideTo) && tileTo.hasCapability(CapabilityEnergy.ENERGY, opp)) {
					
					net.minecraftforge.energy.IEnergyStorage handlerFrom = tileFrom.getCapability(CapabilityEnergy.ENERGY, sideTo);
					net.minecraftforge.energy.IEnergyStorage handlerTo = tileTo.getCapability(CapabilityEnergy.ENERGY, opp);
					
					if (handlerFrom != null && handlerTo != null) {
						
						int drain = handlerFrom.extractEnergy(maxTransfer, true);
						
						if (drain > 0) {
							
							int filled = handlerTo.receiveEnergy(drain, false);
							handlerFrom.extractEnergy(filled, false);
							
						}
						
					}
					
				}
				
			}
		
	}
	
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
	  
		if (capability == CapabilityEnergy.ENERGY || capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
			return true;
			
		}
		
		return super.hasCapability(capability, facing);
	  
	}
	
	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		
		if(capability == CapabilityEnergy.ENERGY) {	
			
			return (T)energy;
			
		}
		
		else if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
			
			return (T)inventory;
			
		}
		
        return super.getCapability(capability, facing);
        
	}
	
}
