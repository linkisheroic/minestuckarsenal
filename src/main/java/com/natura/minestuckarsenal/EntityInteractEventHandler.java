package com.natura.minestuckarsenal;

import java.util.List;
import java.util.Random;

import com.mraof.minestuck.entity.item.EntityGrist;
import com.mraof.minestuck.entity.item.EntityVitalityGel;
import com.mraof.minestuck.util.AlchemyRecipeHandler;
import com.natura.minestuckarsenal.client.SoundEvents;
import com.natura.minestuckarsenal.item.MinestuckArsenalItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class EntityInteractEventHandler {

	public EntityInteractEventHandler() {
		
	}
	
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void onEntityRightClick(EntityInteract e) {
		EntityPlayer player = e.getEntityPlayer();
		Entity target = e.getTarget();
		if(player.getHeldItemMainhand() != null) {
			ItemStack heldItem = player.getHeldItemMainhand();
			
			if(heldItem.getItem() == MinestuckArsenalItems.captcharoidCamera) {
				if(e.getTarget() instanceof EntityItemFrame) {
					EntityItemFrame frame = (EntityItemFrame) e.getTarget();
					
					if(e.getEntityPlayer().isSneaking()) {
						if(frame.getDisplayedItem() != null) {
							ItemStack stack = frame.getDisplayedItem();
							player.inventory.addItemStackToInventory(AlchemyRecipeHandler.createCard(stack, true));
						}
						else if (frame.getDisplayedItem() == ItemStack.EMPTY){
							player.inventory.addItemStackToInventory(AlchemyRecipeHandler.createCard(new ItemStack(Items.ITEM_FRAME), true));
						}	
					}
				}
			}
		}
	}
	
	@SubscribeEvent(priority=EventPriority.HIGHEST, receiveCanceled=true)
	public void onPlayerUpdate(PlayerTickEvent e) {
		EntityPlayer player = e.player;
		Random rand = new Random();
		int counter = 0;
        AxisAlignedBB axisalignedbb = player.getEntityBoundingBox();
        axisalignedbb = axisalignedbb.grow(1);
        List<Entity> list = player.world.getEntitiesWithinAABBExcludingEntity(player, axisalignedbb);
        
        for (int i = 0; i < list.size(); ++i)
        {
            Entity entity = list.get(i);

            if (entity instanceof EntityGrist && counter == 0)
            {
            	entity.playSound(SoundEvents.gristEvent, 0.5F, 1F);
            	
                counter++;
            }
            
            if (entity instanceof EntityVitalityGel && counter == 0) {
            	entity.playSound(SoundEvents.gelEvent, 1F, 1F);
                
                counter++;
            }
            
            else if (counter == 200) {
            	counter = 0;
            }
        }
	}
}
