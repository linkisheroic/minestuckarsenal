package com.natura.minestuckarsenal.item;

import org.lwjgl.input.Keyboard;

import com.mraof.minestuck.editmode.ClientEditHandler;
import com.mraof.minestuck.editmode.ServerEditHandler;
import com.mraof.minestuck.item.MinestuckItems;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.InventoryEnderChest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scala.swing.event.Key;

public class ItemVoidRing extends Item implements IBauble {
	
	public ItemVoidRing()
	{
		super();
		this.maxStackSize = 1;
		this.setUnlocalizedName("ringOfVoid");
		this.setRegistryName("ring_of_void");
		
	}
	
	@Override
	public boolean isEnchantable(ItemStack stack) {
		// TODO Auto-generated method stub
		return true;
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
	public BaubleType getBaubleType(ItemStack itemstack) {
		// TODO Auto-generated method stub
		return BaubleType.RING;
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 2));
		
		if(!player.world.isRemote) {
			if(player.isSneaking() && !player.isAirBorne && ServerEditHandler.getData((EntityPlayer) player) == null){
			
				EntityPlayer playerE = (EntityPlayer)player;
				InventoryEnderChest inventoryenderchest = playerE.getInventoryEnderChest();
			
				if (inventoryenderchest != null)
					playerE.displayGUIChest(inventoryenderchest);
				}
		}
	}
}
