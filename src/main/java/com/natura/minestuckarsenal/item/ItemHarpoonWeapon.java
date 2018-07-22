package com.natura.minestuckarsenal.item;

import java.util.List;

import com.mraof.minestuck.item.MinestuckItems;
import com.mraof.minestuck.util.MinestuckPlayerData;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemHarpoonWeapon extends Item {
	protected float projectileDamage;
	protected double fireRate;
	
	
	public ItemHarpoonWeapon(int maxUses, float damageVsEntity, double fireRate, String name)
	{
		super();
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.COMBAT);	//Needed to place recipes in the combat/tools tab
		this.setMaxDamage(maxUses);
		this.projectileDamage = damageVsEntity;
		this.fireRate = fireRate;
		this.setUnlocalizedName(name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if(stack.getItem() == MinestuckArsenalItems.harpoonGun) {
			tooltip.add(1, "9 Gun Damage");
			tooltip.add(2, "20 Cooldown");
		}
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		
		if(itemstack.getTagCompound() == null) {
			checkTagCompound(itemstack);
		}
		
		if(itemstack.getTagCompound().getDouble("LastFired") + fireRate <= worldIn.getTotalWorldTime() && itemstack.getTagCompound().getBoolean("IsLoaded")) {
			if (!playerIn.capabilities.isCreativeMode)
			{
				itemstack.damageItem(1, playerIn);
			}
		
			if (!worldIn.isRemote)
			{
				
				double modifier = MinestuckPlayerData.getData((EntityPlayer) playerIn).echeladder.getUnderlingDamageModifier();
				projectileDamage = (float) (projectileDamage * modifier);
				
				ItemArrow itemArrow = new ItemArrow();
				EntityArrow entityHarpoon = itemArrow.createArrow(worldIn, new ItemStack(Items.ARROW), playerIn);
				entityHarpoon.setDamage(projectileDamage);
				entityHarpoon.setAim(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 6.0F, 1.0F);
				worldIn.spawnEntity(entityHarpoon);
			}

			setFireTime(itemstack);
			setUnloaded(itemstack);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		}
		
		else if(!itemstack.getTagCompound().getBoolean("IsLoaded")) {
			if(playerIn.inventory.hasItemStack(new ItemStack(Items.ARROW))) {
				playerIn.inventory.clearMatchingItems(Items.ARROW, 0, 1, null);
				setLoaded(itemstack);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
			}
			
			else return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		}
		
		else {
			return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
		}
		
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
		if(!tagCompound.hasKey("IsLoaded"))
		{
			tagCompound.setBoolean("IsLoaded", false);
		}
		return tagCompound;
	}
	
	public void setFireTime(ItemStack stack){
		NBTTagCompound tagCompound = checkTagCompound(stack);
		tagCompound.setDouble("LastFired", Minecraft.getMinecraft().world.getTotalWorldTime());
	}
	
	public void setLoaded(ItemStack stack){
		NBTTagCompound tagCompound = checkTagCompound(stack);
		tagCompound.setBoolean("IsLoaded", true);
	}
	
	public void setUnloaded(ItemStack stack){
		NBTTagCompound tagCompound = checkTagCompound(stack);
		tagCompound.setBoolean("IsLoaded", false);
	}
	
	public boolean isLoaded(ItemStack itemStack)
	{
		NBTTagCompound tagCompound = itemStack.getTagCompound();
		if(itemStack.getTagCompound() == null) {
			checkTagCompound(itemStack);
		}
		
		return itemStack.getTagCompound().getBoolean("IsLoaded");
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
	
	protected double getAttackDamage(ItemStack stack)
	{
		return projectileDamage;
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
