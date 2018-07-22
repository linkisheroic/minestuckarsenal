package com.natura.minestuckarsenal;

import com.natura.minestuckarsenal.item.ItemDreamArmor;
import com.natura.minestuckarsenal.item.MinestuckArsenalItems;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class ItemAttackEventHandler {

	public ItemAttackEventHandler() {
		
	}
	
	/*@SubscribeEvent
	public void onPlayerTick(PlayerTickEvent e) {
		if(e.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof ItemDreamArmor && e.player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof ItemDreamArmor && e.player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof ItemDreamArmor)
		{
			e.player.capabilities.allowFlying = true;
		
		}
		
		else if(!e.player.capabilities.isCreativeMode) {
			e.player.capabilities.allowFlying = false;
			e.player.capabilities.isFlying = false;
		}
	}*/
	
	@SubscribeEvent
	public void onMobHit(LivingAttackEvent e) {
		/*
		if(e.getEntity() != null && e.getSource().getTrueSource() instanceof EntityPlayer) {
			if(e.getEntity() instanceof EntityLiving) {
				EntityLiving attacked = (EntityLiving)e.getEntityLiving();
				EntityPlayer player = (EntityPlayer)e.getSource().getTrueSource();
				Random rand = new Random();
				int freezeChance = rand.nextInt(3);
				
				if(player.getHeldItemMainhand() != null) {
					
					ItemStack heldStack = player.getHeldItemMainhand();
					Item theItem = heldStack.getItem();
					
					if(theItem == MinestuckItems.dice) {
						attacked.attackEntityFrom(DamageSource.GENERIC, rand.nextInt(6));
					}
					
					if(theItem == MinestuckItems.caledfwlch && heldStack.getItemDamage() == 0) {
						player.inventory.addItemStackToInventory(new ItemStack(MinestuckArsenalItems.brokenCaledfwlch));
					}
					
					if(theItem == MinestuckItems.royalDeringer && heldStack.getItemDamage() == 0) {
						player.inventory.addItemStackToInventory(new ItemStack(MinestuckArsenalItems.brokenRoyalDeringer));
					}
					
					if(theItem == MinestuckItems.scarletRibbitar && heldStack.getItemDamage() == 0) {
						player.inventory.addItemStackToInventory(new ItemStack(MinestuckArsenalItems.brokenScarletRibbitar));
					}
					
					if(theItem == MinestuckItems.katana && heldStack.getItemDamage() == 0) {
						player.inventory.addItemStackToInventory(new ItemStack(MinestuckArsenalItems.brokenNinjaSword));
					}
				}
								
			}
		}
		*/
	}
	
	@SubscribeEvent
	public void onBlockHarvest(BlockEvent.HarvestDropsEvent e) {
		if(e.getHarvester() != null) {
			if(e.getHarvester().getHeldItemMainhand().getItem() == MinestuckArsenalItems.mineNGrist) {
				e.setCanceled(true);
			}
		}
	}
}
