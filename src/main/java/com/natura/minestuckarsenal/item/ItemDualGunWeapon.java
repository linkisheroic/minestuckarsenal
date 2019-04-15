package com.natura.minestuckarsenal.item;


import java.util.List;

import com.mraof.minestuck.item.MinestuckItems;
import com.mraof.minestuck.item.weapon.ItemWeapon;
import com.natura.minestuckarsenal.entity.EntityBullet;
import com.natura.minestuckarsenal.entity.EntitySuitarang;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemDualGunWeapon extends ItemWeapon {
	protected float projectileDamage;
	protected double fireRate;
	protected float speed;
	protected float inaccuracy;
	public String prefix;
	public double power;
	public double sheathedPower;
	public double swingSpeed;
	public double sheathedSwingSpeed;
	
	public ItemDualGunWeapon(int maxUses, double meleeDrawn, double meleeSheathed, double swingSpeedDrawn, double swingSpeedSheathed, int enchantibility, float damageVsEntity, double fireRate, float speed, float inaccuracy, String name)
	{
		super(maxUses, meleeDrawn, swingSpeedDrawn, enchantibility, name);
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.COMBAT);	//Needed to place recipes in the combat/tools tab
		this.setMaxDamage(maxUses);
		this.prefix = name;
		this.power = meleeDrawn;
		this.sheathedPower = meleeSheathed;
		this.swingSpeed = swingSpeedDrawn;
		this.sheathedSwingSpeed = swingSpeedSheathed;
		this.projectileDamage = damageVsEntity;
		this.fireRate = fireRate;
		this.speed = speed;
		this.inaccuracy = inaccuracy;
		this.setUnlocalizedName(name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if(stack.getItem() == MinestuckArsenalItems.houseKey) {
			tooltip.add(1, "4 Gun Damage");
			tooltip.add(2, "25 Cooldown");
		}
		
		if(stack.getItem() == MinestuckArsenalItems.blackStaff) {
			tooltip.add(1, "5 Gun Damage");
			tooltip.add(2, "2 Cooldown");
		}
		
		if(stack.getItem() == MinestuckArsenalItems.goldStaff) {
			tooltip.add(1, "12 Gun Damage");
			tooltip.add(2, "2 Cooldown");
		}
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		
		if(itemstack.getTagCompound() == null) {
			checkTagCompound(itemstack, worldIn.getTotalWorldTime());
		}
		
		if(playerIn.isSneaking()) {
			if(itemstack.getTagCompound().getBoolean("IsDrawn")) {
				sheath(itemstack, worldIn.getTotalWorldTime());
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
			}
			else {
				draw(itemstack, worldIn.getTotalWorldTime());
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
			}
		}
		
		else if(itemstack.getTagCompound().getBoolean("IsDrawn") && !playerIn.isSneaking()) {
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
		
		else {
			return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
		}
		
	}
	
	@Override
	protected double getAttackDamage(ItemStack stack) {
		if(isDrawn(stack)) {
			return this.power;
		}
		else {
			return this.sheathedPower;
		}
	}
	
	@Override
	protected double getAttackSpeed(ItemStack stack)
	{
		if (isDrawn(stack)){
			return this.swingSpeed;
		}
		else{
			return this.sheathedSwingSpeed;
		}
	}	
	
	public boolean isDrawn(ItemStack itemStack)
	{
		NBTTagCompound tagCompound = itemStack.getTagCompound();
		if(itemStack.getTagCompound() == null) {
			tagCompound = new NBTTagCompound();
			itemStack.setTagCompound(tagCompound);
		}
		
		if(!tagCompound.hasKey("IsDrawn"))
		{
			tagCompound.setBoolean("IsDrawn", true);
		}
		
		return itemStack.getTagCompound().getBoolean("IsDrawn");
	}
	
	@Override
    public String getUnlocalizedName(ItemStack stack)
    {
        if (isDrawn(stack))
        {
        	
        	return "item." + prefix + "Drawn";
        	
        }
        
        else{
        	
        	return "item." + prefix +  "Sheathed";
        	
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
		
		if(!tagCompound.hasKey("IsDrawn"))
		{
			tagCompound.setBoolean("IsDrawn", true);
		}
		
		return tagCompound;
	}
	
	public void setFireTime(ItemStack stack, long time){
		NBTTagCompound tagCompound = checkTagCompound(stack, time);
		tagCompound.setDouble("LastFired", time);
	}
	
	public void sheath(ItemStack stack, long time){
		NBTTagCompound tagCompound = checkTagCompound(stack, time);
		tagCompound.setBoolean("IsDrawn", false);
	}
	
	public void draw(ItemStack stack, long time){
		NBTTagCompound tagCompound = checkTagCompound(stack, time);
		tagCompound.setBoolean("IsDrawn", true);
	}
	
	protected double getFireDamage(ItemStack stack)
	{
		return projectileDamage;
	}
	
	protected double getFireSpeed(ItemStack stack)
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
