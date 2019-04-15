package com.natura.minestuckarsenal.event;

import java.util.List;
import java.util.Random;

import com.mraof.minestuck.alchemy.AlchemyRecipes;
import com.mraof.minestuck.alchemy.GristAmount;
import com.mraof.minestuck.alchemy.GristHelper;
import com.mraof.minestuck.alchemy.GristSet;
import com.mraof.minestuck.alchemy.GristType;
import com.mraof.minestuck.entity.item.EntityGrist;
import com.mraof.minestuck.entity.item.EntityVitalityGel;
import com.mraof.minestuck.entity.underling.EntityBasilisk;
import com.mraof.minestuck.entity.underling.EntityGiclops;
import com.mraof.minestuck.entity.underling.EntityImp;
import com.mraof.minestuck.entity.underling.EntityLich;
import com.mraof.minestuck.entity.underling.EntityOgre;
import com.mraof.minestuck.entity.underling.EntityUnderling;
import com.mraof.minestuck.entity.underling.EntityUnderlingPart;
import com.mraof.minestuck.event.ConnectionClosedEvent;
import com.mraof.minestuck.event.ConnectionCreatedEvent;
import com.mraof.minestuck.event.ConnectionCreatedEvent.ConnectionType;
import com.mraof.minestuck.tracker.MinestuckPlayerTracker;
import com.mraof.minestuck.world.storage.loot.MinestuckLoot;
import com.natura.minestuckarsenal.ArsenalGrist;
import com.natura.minestuckarsenal.MinestuckArsenalConfig;
import com.natura.minestuckarsenal.client.SoundEvents;
import com.natura.minestuckarsenal.item.MinestuckArsenalItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootEntryTable;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class ServerEventHandler {
	
	public ServerEventHandler() {
		LootTableList.register(new ResourceLocation("minestuckarsenal", "inject/medium_addon"));
	}
	
	//Gives grist bonus based on position in the chain.
	@SubscribeEvent
	public void onConnectionCreated(ConnectionCreatedEvent e) {
		if(MinestuckArsenalConfig.connectionGrist && !e.getConnection().enteredGame() && e.getConnectionType() == ConnectionType.REGULAR && !e.getConnection().isMain()) {
			int grist = (int) (2 * (Math.pow(10, (e.getSession().getPlayerList().size()))));
			
			if(grist >= 2000000000) {
				grist = 2000000000;
			}
			
			grist = grist - 20;
			
			GristHelper.increase(e.getConnection().getClientIdentifier(), new GristSet(GristType.Build, grist));
			MinestuckPlayerTracker.updateGristCache(e.getConnection().getClientIdentifier());
		}
	}
	
	//Removes grist bonus if chain is broken before entering.
	@SubscribeEvent
	public void onConnectionEnded(ConnectionClosedEvent e) {
		if(MinestuckArsenalConfig.connectionGrist && !e.getConnection().enteredGame() && e.getConnectionType() == ConnectionType.REGULAR && !e.getConnection().isMain()) {
			int grist = 2 * (10^(e.getSession().getPlayerList().size()));
			
			if(grist >= 2000000000) {
				grist = 2000000000;
			}
			
			grist = grist - 20;
			
			if(GristHelper.getGrist(e.getConnection().getClientIdentifier(), GristType.Build) >= grist) {
				GristHelper.decrease(e.getConnection().getClientIdentifier(), new GristSet(GristType.Build, grist));
			}
			
			else GristHelper.setGrist(e.getConnection().getClientIdentifier(), GristType.Build, 0);
				MinestuckPlayerTracker.updateGristCache(e.getConnection().getClientIdentifier());
			}
	}
	
	//Plays sounds when picking up grist or vitality gel.
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
	
	//Heals player to their max health on respawn.
	@SubscribeEvent
	public void onPlayerRespawn(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent e) {
		EntityPlayer player = e.player;
		
		if(player.getHealth() < player.getMaxHealth()) {
			player.heal(player.getMaxHealth());
		}
	}
	
	//Injects loot tables to the main mod.
	@SubscribeEvent
	public void onLootTableLoad(LootTableLoadEvent event) {
		if (event.getName().equals(MinestuckLoot.BASIC_MEDIUM_CHEST)) {
			LootEntry entry = new LootEntryTable(new ResourceLocation("minestuckarsenal", "inject/medium_addon"), 1, 1, new LootCondition[0], "medium_addon"); // weight doesn't matter since it's the only entry in the pool. Other params set as you wish.

			
			LootPool pool = new LootPool(new LootEntry[] {entry}, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0, 2), "medium_addon"); // Other params set as you wish.

			
			event.getTable().addPool(pool);

	    }
		
		else if(event.getName().equals(LootTableList.GAMEPLAY_FISHING_FISH)) {
			
			LootEntry fishingEntry = new LootEntryTable(new ResourceLocation("minestuckarsenal", "inject/fishing_addon"), 1, 1, new LootCondition[0], "fishing_addon"); // weight doesn't matter since it's the only entry in the pool. Other params set as you wish.
			
			LootPool poolFish = new LootPool(new LootEntry[] {fishingEntry}, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0, 2), "fishing_addon"); // Other params set as you wish.

			event.getTable().addPool(poolFish);
		}
	}
	
	//Handles scaling grist drops from underlings.
	@SubscribeEvent
	public void onEntityKilled(LivingDeathEvent e) {
		
		if(!e.getEntity().world.isRemote) {
			
			if(e.getSource().getTrueSource() != null && e.getSource().getTrueSource() instanceof EntityPlayer) {
			
				EntityPlayer killer = (EntityPlayer) e.getSource().getTrueSource();
			
				if(e.getEntity() instanceof EntityUnderlingPart) return;
			
				if(e.getEntity() != null && e.getEntity() instanceof EntityUnderling) {
				
					EntityUnderling killed = (EntityUnderling)e.getEntity();
				
					if(killed.getGristSpoils() == null) return;
				
					Random rand = new Random();
					double randX = killed.posX + rand.nextDouble() * killed.width - killed.width / 2;
					double randZ = killed.posZ + rand.nextDouble() * killed.width - killed.width / 2;
				
					if(killer.getHeldItemMainhand().getItem() == MinestuckArsenalItems.jujuSucker) {
						GristSet zillyGrist = new GristSet(GristType.Zillium, rand.nextInt(500));

						if(killed instanceof EntityImp) {
							killed = (EntityImp)killed;
						
							for(GristAmount gristType : zillyGrist.getArray())
								killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristType));
						}
					
						else if(killed instanceof EntityOgre) {
							killed = (EntityOgre)killed;
							zillyGrist.scaleGrist(20);
						
							for(GristAmount gristType : zillyGrist.getArray())
								killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristType));
						}
					
						else if(killed instanceof EntityBasilisk) {
							killed = (EntityBasilisk)killed;
							zillyGrist.scaleGrist(40);
						
							for(GristAmount gristType : zillyGrist.getArray())
								killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristType));
						}
					
						else if(killed instanceof EntityLich) {
							killed = (EntityLich)killed;
							zillyGrist.scaleGrist(60);
						
							for(GristAmount gristType : zillyGrist.getArray())
								killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristType));
						}
					
						else if(killed instanceof EntityGiclops) {
							killed = (EntityGiclops)killed;
							zillyGrist.scaleGrist(120);
						
							for(GristAmount gristType : zillyGrist.getArray())
								killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristType));
						}
					}
				
				else {
					
					GristType[] rareGrist = new GristType[] {GristType.Zillium, ArsenalGrist.Meta, ArsenalGrist.Opal, ArsenalGrist.Rainbow, ArsenalGrist.Plasma, ArsenalGrist.Polychromite};
					Random randomD = new Random();
					int determine = randomD.nextInt(6);
					int dropChance = randomD.nextInt(1000);
					
					GristSet rareGristDrop = new GristSet(rareGrist[determine], 1);
					
					if(killed instanceof EntityImp) {
						killed = (EntityImp)killed;
						GristSet grist = killed.getGristSpoils();
						
						if(grist == null) return;
						
						grist.scaleGrist(MinestuckArsenalConfig.impMulti);
						
						for(GristAmount gristType : grist.getArray())
							killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristType));
						
						if(dropChance <= 5) {
							for(GristAmount gristTypeZ : rareGristDrop.getArray())
								killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristTypeZ));
						}
					}
					
					if(killed instanceof EntityOgre) {
						killed = (EntityOgre)killed;
						GristSet grist = killed.getGristSpoils();
						
						if(grist == null) return;
						
						grist.scaleGrist(MinestuckArsenalConfig.ogreMulti);
					
						for(GristAmount gristType : grist.getArray())
							killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristType));
						
						if(dropChance <= 10) {
							for(GristAmount gristTypeZ : rareGristDrop.getArray())
								killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristTypeZ));
						}
					}
					
					else if(killed instanceof EntityBasilisk) {
						killed = (EntityBasilisk)killed;
						GristSet grist = killed.getGristSpoils();
						
						if(grist == null) return;
						
						grist.scaleGrist(MinestuckArsenalConfig.basiliskMulti);
					
						for(GristAmount gristType : grist.getArray())
							killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristType));
						
						if(dropChance <= 15) {
							for(GristAmount gristTypeZ : rareGristDrop.getArray())
								killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristTypeZ));
						}
					}
					
					else if(killed instanceof EntityLich) {
						killed = (EntityLich)killed;
						GristSet grist = killed.getGristSpoils();
						
						if(grist == null) return;
						
						grist.scaleGrist(MinestuckArsenalConfig.lichMulti);
					
						for(GristAmount gristType : grist.getArray())
							killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristType));
						
						if(dropChance <= 20) {
							for(GristAmount gristTypeZ : rareGristDrop.getArray())
								killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristTypeZ));
						}
					}	
				
					else if(killed instanceof EntityGiclops) {
						killed = (EntityGiclops)killed;
						GristSet grist = killed.getGristSpoils();
						
						if(grist == null) return;
						
						grist.scaleGrist(MinestuckArsenalConfig.giclopsMulti);
					
						for(GristAmount gristType : grist.getArray())
							killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristType));
						
						if(dropChance <= 50) {
							for(GristAmount gristTypeZ : rareGristDrop.getArray())
								killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristTypeZ));
						}
					}	
				}
			}
		}
		
		else {
			if(e.getEntity() != null && e.getEntity() instanceof EntityUnderling && !(e.getEntity() instanceof EntityUnderlingPart)) {
				
				EntityUnderling killed = (EntityUnderling)e.getEntity();
				Random rand = new Random();
				double randX = killed.posX + rand.nextDouble() * killed.width - killed.width / 2;
				double randZ = killed.posZ + rand.nextDouble() * killed.width - killed.width / 2;
			
				GristType[] rareGrist = new GristType[] {GristType.Zillium, ArsenalGrist.Meta, ArsenalGrist.Opal, ArsenalGrist.Rainbow, ArsenalGrist.Plasma, ArsenalGrist.Polychromite};
				Random randomD = new Random();
				int determine = randomD.nextInt(6);
				int dropChance = randomD.nextInt(1000);
			
				GristSet rareGristDrop = new GristSet(rareGrist[determine], 1);
			
				if(killed instanceof EntityImp) {
					killed = (EntityImp)killed;
					GristSet grist = killed.getGristSpoils();
				
					if(grist == null) return;
				
					grist.scaleGrist(MinestuckArsenalConfig.impMulti);
				
					for(GristAmount gristType : grist.getArray())
						killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristType));
				
					if(dropChance <= 5) {
						for(GristAmount gristTypeZ : rareGristDrop.getArray())
							killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristTypeZ));
					}
				}
			
				if(killed instanceof EntityOgre) {
					killed = (EntityOgre)killed;
					GristSet grist = killed.getGristSpoils();
				
					if(grist == null) return;
				
					grist.scaleGrist(MinestuckArsenalConfig.ogreMulti);
			
					for(GristAmount gristType : grist.getArray())
						killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristType));
				
					if(dropChance <= 10) {
						for(GristAmount gristTypeZ : rareGristDrop.getArray())
							killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristTypeZ));
					}
				}
			
				else if(killed instanceof EntityBasilisk) {
					killed = (EntityBasilisk)killed;
					GristSet grist = killed.getGristSpoils();
				
					if(grist == null) return;
				
					grist.scaleGrist(MinestuckArsenalConfig.basiliskMulti);
			
					for(GristAmount gristType : grist.getArray())
						killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristType));
				
					if(dropChance <= 15) {
						for(GristAmount gristTypeZ : rareGristDrop.getArray())
							killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristTypeZ));
					}
				}
			
				else if(killed instanceof EntityLich) {
					killed = (EntityLich)killed;
					GristSet grist = killed.getGristSpoils();
				
					if(grist == null) return;
				
					grist.scaleGrist(MinestuckArsenalConfig.lichMulti);
			
					for(GristAmount gristType : grist.getArray())
						killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristType));
				
					if(dropChance <= 20) {
						for(GristAmount gristTypeZ : rareGristDrop.getArray())
							killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristTypeZ));
					}
				}	
		
				else if(killed instanceof EntityGiclops) {
					killed = (EntityGiclops)killed;
					GristSet grist = killed.getGristSpoils();
				
					if(grist == null) return;
				
					grist.scaleGrist(MinestuckArsenalConfig.giclopsMulti);
			
					for(GristAmount gristType : grist.getArray())
						killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristType));
				
					if(dropChance <= 50) {
						for(GristAmount gristTypeZ : rareGristDrop.getArray())
							killed.world.spawnEntity(new EntityGrist(killed.world, randX, killed.posY, randZ, gristTypeZ));
					}
				}
			}
		}
		}		
	}
	
	//SHOULD cancel the block drop for mine n' grist.
	/*@SubscribeEvent
	public void onBlockHarvest(BlockEvent.HarvestDropsEvent e) {
		if(e.getHarvester() != null) {
			if(e.getHarvester().getHeldItemMainhand().getItem() == MinestuckArsenalItems.mineNGrist) {
				e.setCanceled(true);
			}
		}
	}*/
	
	//Unfinished broken sword code.
	/*@SubscribeEvent
	public void onMobHit(LivingAttackEvent e) {
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
