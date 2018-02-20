package com.natura.minestuckarsenal.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityBarbasolBomb extends EntityThrowable {
	
	 private EntityLivingBase throwerIn;
	 
	 public EntityBarbasolBomb(World worldIn)
	    {
	        super(worldIn);
	    }

	    public EntityBarbasolBomb(World worldIn, EntityLivingBase throwerIn)
	    {
	        super(worldIn, throwerIn);
	    }

	    public EntityBarbasolBomb(World worldIn, double x, double y, double z)
	    {
	        super(worldIn, x, y, z);
	    }

	    public static void registerFixesBarbasolBomb(DataFixer fixer)
	    {
	        EntityThrowable.registerFixesThrowable(fixer, "Barbasol Bomb");
	    }
	    
	    @Override
	    protected void onImpact(RayTraceResult result)
	    {
	    	if(!this.world.isRemote) {
	        Entity entity = result.entityHit;
	       
	        world.createExplosion(throwerIn, result.hitVec.x, result.hitVec.y, result.hitVec.z, 3F, true);
	    	}

	        if (!this.world.isRemote)
	        {
	            this.world.setEntityState(this, (byte)3);
	            this.setDead();
	        }
	    }
	    

}
