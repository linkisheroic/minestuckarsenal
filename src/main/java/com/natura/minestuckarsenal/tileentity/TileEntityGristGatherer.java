package com.natura.minestuckarsenal.tileentity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.Nonnull;

import com.mraof.minestuck.entity.item.EntityGrist;
import com.mraof.minestuck.tracker.MinestuckPlayerTracker;
import com.mraof.minestuck.util.GristHelper;
import com.mraof.minestuck.util.GristSet;
import com.mraof.minestuck.util.GristType;
import com.mraof.minestuck.util.IdentifierHandler;
import com.mraof.minestuck.util.IdentifierHandler.PlayerIdentifier;
import com.natura.minestuckarsenal.MinestuckArsenalConfig;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ClassInheritanceMultiMap;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.server.FMLServerHandler;

/* Thanks to Ender IO team for the entity selection code. */

public class TileEntityGristGatherer extends TileEntity implements ITickable {

	int counter = 0;
	private int range = MinestuckArsenalConfig.gristGathererRange;
	private PlayerIdentifier player;
	private int ownerId;
	
	public TileEntityGristGatherer() {
		
	}

	public @Nonnull AxisAlignedBB getBounds() {
	    return new AxisAlignedBB(getPos()).expand(getRange() + (range == 0 ? 1 / 32f : 0), 0, getRange() + (range == 0 ? 1 / 32f : 0)).expand(-(getRange() + (range == 0 ? 1 / 32f : 0)), 0, -(getRange() + (range == 0 ? 1 / 32f : 0)));
	 }

	 public float getRange() {
	    return range;
	 }
	 
	 public PlayerIdentifier setPlayer(PlayerIdentifier player) {
		this.player = player;
		return this.player;
	 }
	 
	 public PlayerIdentifier getPlayer() {
		 return this.player;
	 }
	 
	 @Override
     public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        player.saveToNBT(compound, "ident");
        return compound;
     }
       
     @Override
     public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        if(FMLCommonHandler.instance().getMinecraftServerInstance() != null) {
        	this.player = IdentifierHandler.load(compound, "ident");
        }
     }
	
	@Override
	public void update() {
		if (this.getWorld().isRemote) return;
		if(counter == 20) {
			
			List<EntityGrist> list = selectEntitiesWithinAABB(this.getWorld(), getBounds());
			
			if(list.size() != 0) {
					for(int i = 0; i == list.size() - 1; i++)
					{
						if(player != null && list.get(i) != null) {
							int value = list.get(i).getAmount().getAmount();
							GristType type = list.get(i).getType();
								if(value != 0 && type != null && player != null) {
									GristHelper.increase(player, new GristSet(type, value));
									MinestuckPlayerTracker.updateGristCache(player);
								}
							list.get(i).setDead();
						}
					}
			}
			
			counter = 0;
		}
		
		else {
			counter++;
		}
		
		this.markDirty();
	}
	
	private List<EntityGrist> selectEntitiesWithinAABB(World worldIn, AxisAlignedBB bb) {
	    List<EntityGrist> result = new ArrayList<EntityGrist>();

	    final int minChunkX = MathHelper.floor((bb.minX) / 16.0D);
	    final int maxChunkX = MathHelper.floor((bb.maxX) / 16.0D);
	    final int minChunkZ = MathHelper.floor((bb.minZ) / 16.0D);
	    final int maxChunkZ = MathHelper.floor((bb.maxZ) / 16.0D);
	    final int minChunkY = MathHelper.floor((bb.minY) / 16.0D);
	    final int maxChunkY = MathHelper.floor((bb.maxY) / 16.0D);

	    for (int chunkX = minChunkX; chunkX <= maxChunkX; ++chunkX) {
	      for (int chunkZ = minChunkZ; chunkZ <= maxChunkZ; ++chunkZ) {
	        Chunk chunk = worldIn.getChunkFromChunkCoords(chunkX, chunkZ);
	        final ClassInheritanceMultiMap<Entity>[] entityLists = chunk.getEntityLists();
	        final int minChunkYClamped = MathHelper.clamp(minChunkY, 0, entityLists.length - 1);
	        final int maxChunkYClamped = MathHelper.clamp(maxChunkY, 0, entityLists.length - 1);
	        for (int chunkY = minChunkYClamped; chunkY <= maxChunkYClamped; ++chunkY) {
	          for (Entity entity : entityLists[chunkY]) {
	            if (!entity.isDead && (entity instanceof EntityGrist) && entity.getEntityBoundingBox().intersects(bb)) {
	              result.add((EntityGrist) entity);
	              
	                return result;
	              
	            }
	          }
	        }
	      }
	    }

	    return result;
	  }
	
}
