package com.natura.minestuckarsenal.entity;

import com.natura.minestuckarsenal.item.MinestuckArsenalItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntitySuitarang extends EntityThrowable {

	private EntityLivingBase throwerIn;
	 
	 public EntitySuitarang(World worldIn)
	    {
	        super(worldIn);
	    }

	    public EntitySuitarang(World worldIn, EntityLivingBase throwerIn)
	    {
	        super(worldIn, throwerIn);
	    }

	    public EntitySuitarang(World worldIn, double x, double y, double z)
	    {
	        super(worldIn, x, y, z);
	    }

	    public static void registerFixesSuitarang(DataFixer fixer)
	    {
	        EntityThrowable.registerFixesThrowable(fixer, "Suitarang");
	    }
	    
	    @Override
	    protected void onImpact(RayTraceResult result)
	    {
	    	if(!this.world.isRemote) {
	    		
	    		
	    		if(result.entityHit != null && result.entityHit instanceof EntityLiving) {
	    			Entity entity = result.entityHit;
	    			entity.attackEntityFrom(DamageSource.GENERIC, 8);
	    		}
	    		
	    		
	    		
	    		
	    	}

	        if (!this.world.isRemote)
	        {
	            this.world.setEntityState(this, (byte)3);
	            this.setDead();
	        }
	    }
	    
}
