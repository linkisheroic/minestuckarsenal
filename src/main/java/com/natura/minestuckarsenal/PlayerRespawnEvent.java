package com.natura.minestuckarsenal;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PlayerRespawnEvent {
	public PlayerRespawnEvent() {
		
	}
	
	@SubscribeEvent
	public void onPlayerRespawn(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent e) {
		EntityPlayer player = e.player;
		
		if(player.getHealth() < player.getMaxHealth()) {
			player.heal(player.getMaxHealth());
		}
	}
}
