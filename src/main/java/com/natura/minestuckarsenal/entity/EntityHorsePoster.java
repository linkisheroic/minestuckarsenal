package com.natura.minestuckarsenal.entity;

import java.util.EnumSet;
import java.util.Set;

import com.mraof.minestuck.entity.item.EntityHangingArt;
import com.natura.minestuckarsenal.item.MinestuckArsenalItems;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityHorsePoster extends EntityHangingArt<EntityHorsePoster.HorseArt>
{
	
	public EntityHorsePoster(World worldIn)
	{
		super(worldIn);
	}
	
	public EntityHorsePoster(World worldIn, BlockPos pos, EnumFacing facing)
	{
		super(worldIn, pos, facing);
	}
	
	@Override
	public Set<HorseArt> getArtSet()
	{
		return EnumSet.allOf(HorseArt.class);
	}
	
	@Override
	public HorseArt getDefault()
	{
		return HorseArt.NORMAL;
	}
	
	@Override
	public ItemStack getStackDropped()
	{
		return new ItemStack(MinestuckArsenalItems.horseFootballPlayer);
	}
	
	public static enum HorseArt implements EntityHangingArt.IArt
	{
		NORMAL("Normal", 16, 16, 0, 0);
		
		private final String title;
		private final int sizeX, sizeY;
		private final int offsetX, offsetY;
		
		private HorseArt(String title, int sizeX, int sizeY, int offsetX, int offsetY)
		{
			this.title = title;
			this.sizeX = sizeX;
			this.sizeY = sizeY;
			this.offsetX = offsetX;
			this.offsetY = offsetY;
		}
		
		@Override
		public String getTitle()
		{return title;}
		@Override
		public int getSizeX()
		{return sizeX;}
		@Override
		public int getSizeY()
		{return sizeY;}
		@Override
		public int getOffsetX()
		{return offsetX;}
		@Override
		public int getOffsetY()
		{return offsetY;}
	}

	@Override
	public int getWidthPixels() {
		// TODO Auto-generated method stub
		return 16;
	}

	@Override
	public int getHeightPixels() {
		// TODO Auto-generated method stub
		return 16;
	}

	@Override
	public void playPlaceSound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBroken(Entity brokenEntity) {
		// TODO Auto-generated method stub
		
	}
}
