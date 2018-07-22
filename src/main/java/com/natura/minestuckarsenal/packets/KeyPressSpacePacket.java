package com.natura.minestuckarsenal.packets;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class KeyPressSpacePacket implements IMessage {

	public KeyPressSpacePacket(){}

	  public boolean toSend;
	  public KeyPressSpacePacket(boolean toSend) {
	    this.toSend = toSend;
	  }

	  @Override public void toBytes(ByteBuf buf) {
	    // Writes the int into the buf
	    buf.writeBoolean(toSend);
	  }

	  @Override public void fromBytes(ByteBuf buf) {
	    // Reads the int back from the buf. Note that if you have multiple values, you must read in the same order you wrote.
	    toSend = buf.readBoolean();
	  }
	
}
