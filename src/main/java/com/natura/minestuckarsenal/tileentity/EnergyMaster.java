package com.natura.minestuckarsenal.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.energy.EnergyStorage;

public class EnergyMaster extends EnergyStorage {
	
	@Override
	public int receiveEnergy(int maxReceive, boolean simulate) {
		return 0;
	}
	
	public EnergyMaster(int capacity) {
		super(capacity);
	}
	
	public void increaseEnergy(int amount) {
		this.energy += amount;
	}
	
	public void decreaseEnergy(int amount) {
		this.energy -= amount;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public NBTTagCompound serializeNBT()
	{
	        NBTTagCompound nbt = new NBTTagCompound();
	        nbt.setInteger("energy", this.getEnergyStored());
	        return nbt;
	}

	public void deserializeNBT(NBTTagCompound nbt)
	{
	        setEnergy(nbt.hasKey("energy", Constants.NBT.TAG_INT) ? nbt.getInteger("energy") : this.energy);	        
	        onLoad();
	}
	 
	protected void onLoad()
	{

	}

}
