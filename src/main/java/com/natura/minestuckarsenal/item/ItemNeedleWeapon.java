package com.natura.minestuckarsenal.item;

import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.mraof.minestuck.entity.underling.EntityUnderling;
import com.mraof.minestuck.item.MinestuckItems;
import com.mraof.minestuck.item.weapon.ItemWeapon;
import com.mraof.minestuck.util.MinestuckPlayerData;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IEntityMultiPart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemNeedleWeapon extends ItemWeapon {
	
	private static float damage;
	private static double meleeDamage;
	private static double meleeSpeed;
	public static float range = 50;
	private int counter = 0;
	
	public ItemNeedleWeapon(int maxUses, float laserDamage, double weaponDamage, double weaponSpeed, int enchantibility, String name)
	{
		super(maxUses, weaponDamage, weaponDamage, enchantibility, name);
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.COMBAT);	//Needed to place recipes in the combat/tools tab
		this.setMaxDamage(maxUses);
		this.damage = laserDamage;
		this.meleeDamage = weaponDamage;
		this.meleeSpeed = weaponSpeed;
		this.setUnlocalizedName(name);
	}
	
	private NBTTagCompound checkTagCompound(ItemStack stack)
	{
		NBTTagCompound tagCompound = stack.getTagCompound();
		if(tagCompound == null)
		{
			tagCompound = new NBTTagCompound();
			stack.setTagCompound(tagCompound);
		}
		if(!tagCompound.hasKey("LastFired"))
		{
			tagCompound.setDouble("LastFired", Minecraft.getMinecraft().world.getTotalWorldTime());
		}
		return tagCompound;
	}
	
	public void setFireTime(ItemStack stack){
		NBTTagCompound tagCompound = checkTagCompound(stack);
		tagCompound.setDouble("LastFired", Minecraft.getMinecraft().world.getTotalWorldTime());
	}
	

	@Override
	protected boolean isInCreativeTab(CreativeTabs targetTab)
	{
		return targetTab == CreativeTabs.SEARCH || targetTab == MinestuckItems.tabMinestuck;
	}
	
	@Override
	public CreativeTabs[] getCreativeTabs()
	{
		return new CreativeTabs[] {MinestuckItems.tabMinestuck};
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean isFull3D()
	{
		return true;
	}
	
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
			ItemStack stack = playerIn.getHeldItem(handIn);
			
			if(stack.getTagCompound() == null) {
				checkTagCompound(stack);
			}
			
			if(stack.getTagCompound().getDouble("LastFired") + 10.0D <= worldIn.getTotalWorldTime()) {
				if(!worldIn.isRemote) {
				
					if(raytraceEntityPlayerLookWithPred(playerIn, range, ent -> !(ent instanceof IEntityMultiPart)).entityHit != null && raytraceEntityPlayerLookWithPred(playerIn, range, ent -> !(ent instanceof IEntityMultiPart)).entityHit instanceof EntityLiving) {
						EntityLiving entity = (EntityLiving) raytraceEntityPlayerLookWithPred(playerIn, range, ent -> !(ent instanceof IEntityMultiPart)).entityHit;
		
						if(entity instanceof EntityUnderling) {
							double modifier = MinestuckPlayerData.getData(playerIn).echeladder.getUnderlingDamageModifier();
							damage = (float) (damage * modifier);
						}
				
				
						entity.attackEntityFrom(DamageSource.causePlayerDamage(playerIn), this.damage);
						stack.damageItem(5, playerIn);
						return new ActionResult<>(EnumActionResult.SUCCESS, stack);
					}
				}
			}
			
			return new ActionResult<>(EnumActionResult.FAIL, stack);
				
	}
	
	 public static RayTraceResult raytraceEntityPlayerLook(EntityPlayer player, float range) {
		    Vec3d eye = new Vec3d(player.posX, player.posY + player.getEyeHeight(), player.posZ); // Entity.getPositionEyes
		    Vec3d look = player.getLook(1.0f);

		    return raytraceEntity(player, eye, look, range, true);
	 }
	 

		  // based on EntityRenderer.getMouseOver
	 public static RayTraceResult raytraceEntity(Entity entity, Vec3d start, Vec3d look, double range, boolean ignoreCanBeCollidedWith) {
		    //Vec3 look = entity.getLook(partialTicks);
		    Vec3d direction = start.addVector(look.x * range, look.y * range, look.z * range);

		    //Vec3 direction = vec3.addVector(vec31.x * d0, vec31.y * d0, vec31.z * d0);
		    Entity pointedEntity = null;
		    Vec3d hit = null;
		    AxisAlignedBB bb = entity.getEntityBoundingBox().expand(look.x * range, look.y * range, look.z * range).expand(1, 1, 1);
		    List<Entity> entitiesInArea = entity.getEntityWorld().getEntitiesWithinAABBExcludingEntity(entity, bb);
		    double range2 = range; // range to the current candidate. Used to find the closest entity.

		    for(Entity candidate : entitiesInArea) {
		      if(ignoreCanBeCollidedWith || candidate.canBeCollidedWith()) {
		        // does our vector go through the entity?
		        double colBorder = candidate.getCollisionBorderSize();
		        AxisAlignedBB entityBB = candidate.getEntityBoundingBox().expand(colBorder, colBorder, colBorder);
		        RayTraceResult movingobjectposition = entityBB.calculateIntercept(start, direction);

		        // needs special casing: vector starts inside the entity
		        if(entityBB.contains(start)) {
		          if(0.0D < range2 || range2 == 0.0D) {
		            pointedEntity = candidate;
		            hit = movingobjectposition == null ? start : movingobjectposition.hitVec;
		            range2 = 0.0D;
		          }
		        }
		        else if(movingobjectposition != null) {
		          double dist = start.distanceTo(movingobjectposition.hitVec);

		          if(dist < range2 || range2 == 0.0D) {
		            if(candidate == entity.getRidingEntity() && !entity.canRiderInteract()) {
		              if(range2 == 0.0D) {
		                pointedEntity = candidate;
		                hit = movingobjectposition.hitVec;
		              }
		            }
		            else {
		              pointedEntity = candidate;
		              hit = movingobjectposition.hitVec;
		              range2 = dist;
		            }
		          }
		        }
		      }
		    }

		    if(pointedEntity != null && range2 < range) {
		      return new RayTraceResult(pointedEntity, hit);
		    }
		    return null;
		  }
	
	/**
	 * Based on
	 * {@link slimeknights.tconstruct.library.utils.EntityUtil#raytraceEntityPlayerLook(EntityPlayer, float)},
	 * except with a predicate to filter out unwanted entities.
	 */
	public static RayTraceResult raytraceEntityPlayerLookWithPred(EntityPlayer player, float range,
			Predicate<? super Entity> pred) {
		Vec3d eye = new Vec3d(player.posX, player.posY + player.getEyeHeight(), player.posZ); // Entity.getPositionEyes
		Vec3d look = player.getLook(1.0f);
		
		return raytraceEntityWithPred(player, eye, look, range, true, pred);
	}
	
	/**
	 * Based on
	 * {@link slimeknights.tconstruct.library.utils.EntityUtil#raytraceEntity(Entity, Vec3d, Vec3d, double, boolean)},
	 * except with a predicate to filter out unwanted entities.
	 */
	public static RayTraceResult raytraceEntityWithPred(Entity entity, Vec3d start, Vec3d look, double range,
			boolean ignoreCanBeCollidedWith, Predicate<? super Entity> pred) {
		// Vec3 look = entity.getLook(partialTicks);
		Vec3d direction = start.addVector(look.x * range, look.y * range, look.z * range);
		
		// Vec3 direction = vec3.addVector(vec31.x * d0, vec31.y * d0, vec31.z *
		// d0);
		Entity pointedEntity = null;
		Vec3d hit = null;
		AxisAlignedBB bb = entity.getEntityBoundingBox().expand(look.x * range, look.y * range, look.z * range)
				.expand(1, 1, 1);
		List<Entity> entitiesInArea = entity.getEntityWorld().getEntitiesInAABBexcluding(entity, bb,
				Predicates.and(pred, EntitySelectors.NOT_SPECTATING));
		double range2 = range; // range to the current candidate. Used to find
								// the closest entity.
		
		for (Entity candidate : entitiesInArea) {
			if (ignoreCanBeCollidedWith || candidate.canBeCollidedWith()) {
				// does our vector go through the entity?
				double colBorder = candidate.getCollisionBorderSize();
				AxisAlignedBB entityBB = candidate.getEntityBoundingBox().expand(colBorder, colBorder, colBorder);
				RayTraceResult movingobjectposition = entityBB.calculateIntercept(start, direction);
				
				// needs special casing: vector starts inside the entity
				if (entityBB.contains(start)) {
					if (0.0D < range2 || range2 == 0.0D) {
						pointedEntity = candidate;
						hit = movingobjectposition == null ? start : movingobjectposition.hitVec;
						range2 = 0.0D;
					}
				} else if (movingobjectposition != null) {
					double dist = start.distanceTo(movingobjectposition.hitVec);
					
					if (dist < range2 || range2 == 0.0D) {
						if (candidate == entity.getRidingEntity() && !entity.canRiderInteract()) {
							if (range2 == 0.0D) {
								pointedEntity = candidate;
								hit = movingobjectposition.hitVec;
							}
						} else {
							pointedEntity = candidate;
							hit = movingobjectposition.hitVec;
							range2 = dist;
						}
					}
				}
			}
		}
		
		if (pointedEntity != null && range2 < range) {
			return new RayTraceResult(pointedEntity, hit);
		}
		return null;
	}

}
