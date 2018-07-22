package com.natura.minestuckarsenal.entity;

import com.mraof.minestuck.entity.underling.EntityUnderling;
import com.mraof.minestuck.util.MinestuckPlayerData;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityBullet extends EntityThrowable {

		private EntityLivingBase throwerIn;
		private float damage;
		
		public EntityBullet(World worldIn) {
			super(worldIn);
		}
	 
	 	public EntityBullet(World worldIn, EntityLivingBase throwerIn, float damage)
	 	{
	        super(worldIn, throwerIn);
	        this.throwerIn = throwerIn;
	        this.damage = damage;
	 	}

	    public EntityBullet(World worldIn, EntityLivingBase throwerIn)
	    {
	        super(worldIn, throwerIn);
	    }

	    public EntityBullet(World worldIn, double x, double y, double z)
	    {
	        super(worldIn, x, y, z);
	    }

	    public static void registerFixesBullet(DataFixer fixer)
	    {
	        EntityThrowable.registerFixesThrowable(fixer, "Bullet");
	    }
	    
	    @Override
	    protected float getGravityVelocity() {
	    	// TODO Auto-generated method stub
	    	return 0F;
	    }
	    
	    @Override
	    protected void onImpact(RayTraceResult result)
	    {
	    	if(!this.world.isRemote) {
	    		
	    		
	    		if(result.entityHit != null && result.entityHit instanceof EntityLiving && result.entityHit != throwerIn) {
	    			Entity entity = result.entityHit;
	    			
	    			if(entity instanceof EntityUnderling) {
	    				double modifier = MinestuckPlayerData.getData((EntityPlayer) thrower).echeladder.getUnderlingDamageModifier();
						damage = (float) (damage * modifier);
	    			}
	    			
	    			entity.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)getThrower()), damage);
	    		}
	    		
	    		else if(result.entityHit != null && result.entityHit instanceof EntityLivingBase && result.entityHit != throwerIn) {
	    			Entity entity = result.entityHit;
	    			
	    			entity.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)getThrower()), damage);
	    		}
	    		
	    		else if(result.entityHit != null && result.entityHit instanceof EntityDragon) {
	    			Entity entity = result.entityHit;
	    			
	    			entity.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)getThrower()), damage);
	    		}
	    		
	    	}

	        if (!this.world.isRemote)
	        {
	            this.world.setEntityState(this, (byte)3);
	            
	            this.setDead();
	        }
	    }
	    
}
