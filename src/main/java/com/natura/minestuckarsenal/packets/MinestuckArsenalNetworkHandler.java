package com.natura.minestuckarsenal.packets;

import java.util.Random;

import com.natura.minestuckarsenal.item.MinestuckArsenalItems;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public class MinestuckArsenalNetworkHandler implements IMessageHandler<KeyPressSpacePacket, IMessage> {
	
		
		public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel("minestuckarsenal");


		@Override
		public IMessage onMessage(KeyPressSpacePacket message, MessageContext ctx) {
			EntityPlayerMP serverPlayer = ctx.getServerHandler().player;
		    
		    boolean test = message.toSend;
		    if(test) {
		    	serverPlayer.getServerWorld().addScheduledTask(() -> {
		    		
		    	});
		    }
			return null;
		}
	
	
}
