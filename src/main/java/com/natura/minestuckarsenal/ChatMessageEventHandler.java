package com.natura.minestuckarsenal;

import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ChatMessageEventHandler {

	public ChatMessageEventHandler() {
		
	}
	
	public void onSendChatMessage(ClientChatEvent e) {
		String message = e.getMessage();
		
	}
}
