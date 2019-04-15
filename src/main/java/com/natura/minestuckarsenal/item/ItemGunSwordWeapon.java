package com.natura.minestuckarsenal.item;

import java.util.List;

import com.mraof.minestuck.item.MinestuckItems;
import com.mraof.minestuck.item.weapon.ItemWeapon;
import com.natura.minestuckarsenal.entity.EntityBullet;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemGunSwordWeapon extends ItemWeapon {
	
	protected float projectileDamage;
	protected double fireRate;
	protected float speed;
	protected float inaccuracy;
	int counter = 0;

	public ItemGunSwordWeapon(int maxUses, float speed, float inaccuracy, double meleeDamage, float damageVsEntity, double fireRate, double weaponSpeed, int enchantability, String name) {
		super(maxUses, damageVsEntity, weaponSpeed, enchantability, name);
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.COMBAT);	//Needed to place recipes in the combat/tools tab
		this.setMaxDamage(maxUses);
		this.projectileDamage = damageVsEntity;
		this.fireRate = fireRate;
		this.speed = speed;
		this.inaccuracy = inaccuracy;
		this.setUnlocalizedName(name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if(stack.getItem() == MinestuckArsenalItems.gunblade) {
			tooltip.add(1, "12 Gun Damage");
			tooltip.add(2, "10 Cooldown");
		}
		
		if(stack.getItem() == MinestuckArsenalItems.gunOfSouls) {
			tooltip.add(1, "18 Gun Damage");
			tooltip.add(2, "10 Cooldown");
		}
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		
		if(itemstack.getTagCompound() == null) {
			checkTagCompound(itemstack, worldIn.getTotalWorldTime());
		}
		
		if(itemstack.getTagCompound().getDouble("LastFired") + fireRate <= worldIn.getTotalWorldTime()) {
			if (!playerIn.capabilities.isCreativeMode)
			{
				itemstack.damageItem(1, playerIn);
			}
		
			if (!worldIn.isRemote)
			{
				EntityBullet entityBullet = new EntityBullet(worldIn, playerIn, projectileDamage);
				entityBullet.setHeadingFromThrower(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, speed, inaccuracy);
				worldIn.spawnEntity(entityBullet);
			}

			setFireTime(itemstack, worldIn.getTotalWorldTime());
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		}
		
		else {
			return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
		}
		
	}
	
	private NBTTagCompound checkTagCompound(ItemStack stack, long time)
	{
		NBTTagCompound tagCompound = stack.getTagCompound();
		if(tagCompound == null)
		{
			tagCompound = new NBTTagCompound();
			stack.setTagCompound(tagCompound);
		}
		if(!tagCompound.hasKey("LastFired"))
		{
			tagCompound.setDouble("LastFired", time);
		}
		return tagCompound;
	}
	
	public void setFireTime(ItemStack stack, long time){
		NBTTagCompound tagCompound = checkTagCompound(stack, time);
		tagCompound.setDouble("LastFired", time);
	}
	
	protected double getAttackDamage(ItemStack stack)
	{
		return projectileDamage;
	}
	
	protected double getAttackSpeed(ItemStack stack)
	{
		return speed;
	}
	
	protected double getFireRate(ItemStack stack) 
	{
		return fireRate;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean isFull3D()
	{
		return true;
	}

}
