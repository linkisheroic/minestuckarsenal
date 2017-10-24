package com.natura.minestuckarsenal;

import java.util.Random;

import com.mraof.minestuck.entity.item.EntityGrist;
import com.mraof.minestuck.entity.underling.EntityBasilisk;
import com.mraof.minestuck.entity.underling.EntityGiclops;
import com.mraof.minestuck.entity.underling.EntityLich;
import com.mraof.minestuck.entity.underling.EntityOgre;
import com.mraof.minestuck.entity.underling.EntityUnderling;
import com.mraof.minestuck.util.GristAmount;
import com.mraof.minestuck.util.GristSet;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GristDropEventHandler {

	public GristDropEventHandler()
	{
		
	}
	
	@SubscribeEvent
	public void onEntityKilled(LivingDeathEvent e) {
		if(e.getSource().getTrueSource() != null && e.getSource().getTrueSource() instanceof EntityPlayer) {
			
			EntityPlayer killer = (EntityPlayer) e.getSource().getTrueSource();
			if(e.getEntity() != null && e.getEntity() instanceof EntityUnderling) {
				EntityUnderling killed = (EntityUnderling)e.getEntity();
				Random rand = new Random();
				double randX = killed.posX + rand.nextDouble() * killed.width - killed.width / 2;
				double randZ = killed.posZ + rand.nextDouble() * killed.width - killed.width / 2;

				if(killed instanceof EntityOgre) {
					killed = (EntityOgre)killed;
					GristSet grist = killed.getGristSpoils();
					grist.scaleGrist(10);
					
					for(GristAmount gristType : grist.getArray())
						killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristType));
				}
				else if(killed instanceof EntityBasilisk) {
					killed = (EntityBasilisk)killed;
					GristSet grist = killed.getGristSpoils();
					grist.scaleGrist(20);
					
					for(GristAmount gristType : grist.getArray())
						killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristType));
				}
				else if(killed instanceof EntityLich) {
					killed = (EntityLich)killed;
					GristSet grist = killed.getGristSpoils();
					grist.scaleGrist(50);
					
					for(GristAmount gristType : grist.getArray())
						killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristType));
				}
				else if(killed instanceof EntityGiclops) {
					killed = (EntityGiclops)killed;
					GristSet grist = killed.getGristSpoils();
					grist.scaleGrist(100);
					
					for(GristAmount gristType : grist.getArray())
						killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristType));
				}
			}
		}
	}
}
