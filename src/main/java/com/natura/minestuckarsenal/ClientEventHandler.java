package com.natura.minestuckarsenal;

import java.util.Optional;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import com.natura.minestuckarsenal.item.ItemLaserWeapon;
import com.natura.minestuckarsenal.item.ItemNeedleWeapon;
import com.natura.minestuckarsenal.item.MinestuckArsenalItems;

import net.java.games.input.Mouse;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientEventHandler {
	
	public static final ResourceLocation LASER_LOC = new ResourceLocation(MinestuckArsenal.MODID, "textures/effects/laserbeam.png");
	public static final ResourceLocation LASER_NEEDLEWANDS = new ResourceLocation(MinestuckArsenal.MODID, "textures/effects/laser_wands.png");
	public static final ResourceLocation LASER_THORNS = new ResourceLocation(MinestuckArsenal.MODID, "textures/effects/laser_thorns.png");
	public static final ResourceLocation LASER_QUILLS = new ResourceLocation(MinestuckArsenal.MODID, "textures/effects/laser_echidna.png");

	
	
	public ClientEventHandler() {
		
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void renderBeam(RenderWorldLastEvent event) { // for this player
		if(Minecraft.getMinecraft().player != null) 
				doRenderBeam(Minecraft.getMinecraft().player);
				doRenderBeamNeedlewands(Minecraft.getMinecraft().player);
				doRenderBeamThorns(Minecraft.getMinecraft().player);
				doRenderBeamQuills(Minecraft.getMinecraft().player);
				
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void renderBeam(RenderPlayerEvent.Pre event) { // for other players
		if (!event.getEntityPlayer().equals(Minecraft.getMinecraft().player)) { // exclude this player
			doRenderBeam(event.getEntityPlayer());
		}
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void renderBeam(RenderLivingEvent.Pre<?> event) { // for other entities
		if (!(event.getEntity() instanceof EntityPlayer)) { // exclude players
			doRenderBeam(event.getEntity());
		}
	}
	
	@SideOnly(Side.CLIENT)
	public static void doRenderBeam(EntityLivingBase shooter) {
		if(shooter != null && shooter instanceof EntityPlayer) {
		EntityPlayer player = (EntityPlayer) shooter;
		Item itemHeld = player.getHeldItemMainhand().getItem();
		GameSettings gs = Minecraft.getMinecraft().gameSettings;
		
		if(itemHeld == MinestuckArsenalItems.ahabsCrosshairs && gs.keyBindUseItem.isKeyDown()) {
			GlStateManager.depthMask(false);
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(GL11.GL_ONE, GL11.GL_ONE);
			
			GlStateManager.pushMatrix();
			
			
			float partialTicks = Minecraft.getMinecraft().getRenderPartialTicks();
			double doubleX = player.lastTickPosX + (player.posX - player.lastTickPosX) * partialTicks;
			double doubleY = player.lastTickPosY + (player.posY - player.lastTickPosY) * partialTicks;
			double doubleZ = player.lastTickPosZ + (player.posZ - player.lastTickPosZ) * partialTicks;
			
			Vec3d vec = new Vec3d(doubleX, doubleY+player.getEyeHeight(), doubleZ);
			
			
			Vec3d vec0 = shooter.getPositionVector().addVector(0, shooter.getEyeHeight()-0.2, 0);
			Vec3d vec1 = vec0;
			
			
			
				vec1 = Optional.ofNullable(ItemLaserWeapon.raytraceEntityPlayerLook(player, ItemLaserWeapon.range))
				.map(rtr -> rtr.hitVec)
				.orElse(vec1);
			
			GlStateManager.translate(-doubleX, -doubleY, -doubleZ);
			
			Tessellator tessellator = Tessellator.getInstance();
			BufferBuilder buffer = tessellator.getBuffer();
			
			Minecraft.getMinecraft().renderEngine.bindTexture(LASER_LOC);
			
			buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX_LMAP_COLOR);
			
			drawBeam(vec0, vec1, vec, 0.13f);
			
			tessellator.draw();
			
			GlStateManager.popMatrix();
			
			GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		}
		}
	}
	
	@SideOnly(Side.CLIENT)
	public static void doRenderBeamNeedlewands(EntityLivingBase shooter) {
		if(shooter != null && shooter instanceof EntityPlayer) {
		EntityPlayer player = (EntityPlayer) shooter;
		Item itemHeld = player.getHeldItemMainhand().getItem();
		GameSettings gs = Minecraft.getMinecraft().gameSettings;
		
		if(itemHeld == MinestuckArsenalItems.needleWands && gs.keyBindUseItem.isKeyDown()) {
			GlStateManager.depthMask(false);
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(GL11.GL_ONE, GL11.GL_ONE);
			
			GlStateManager.pushMatrix();
			
			
			float partialTicks = Minecraft.getMinecraft().getRenderPartialTicks();
			double doubleX = player.lastTickPosX + (player.posX - player.lastTickPosX) * partialTicks;
			double doubleY = player.lastTickPosY + (player.posY - player.lastTickPosY) * partialTicks;
			double doubleZ = player.lastTickPosZ + (player.posZ - player.lastTickPosZ) * partialTicks;
			
			Vec3d vec = new Vec3d(doubleX, doubleY+player.getEyeHeight(), doubleZ);
			Vec3d vec0 = shooter.getPositionVector().addVector(0, shooter.getEyeHeight()-0.2, 0);
			Vec3d vec1 = vec0;
			
			
			
				vec1 = Optional.ofNullable(ItemNeedleWeapon.raytraceEntityPlayerLook(player, ItemNeedleWeapon.range))
				.map(rtr -> rtr.hitVec)
				.orElse(vec1);
			
			GlStateManager.translate(-doubleX, -doubleY, -doubleZ);
			
			Tessellator tessellator = Tessellator.getInstance();
			BufferBuilder buffer = tessellator.getBuffer();
			
			Minecraft.getMinecraft().renderEngine.bindTexture(LASER_NEEDLEWANDS);
			
			buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX_LMAP_COLOR);
			
			drawBeam(vec0, vec1, vec, 0.13f);
			
			tessellator.draw();
			
			GlStateManager.popMatrix();
			
			GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		}
		}
	}
	
	@SideOnly(Side.CLIENT)
	public static void doRenderBeamThorns(EntityLivingBase shooter) {
		if(shooter != null && shooter instanceof EntityPlayer) {
		EntityPlayer player = (EntityPlayer) shooter;
		Item itemHeld = player.getHeldItemMainhand().getItem();
		GameSettings gs = Minecraft.getMinecraft().gameSettings;
		
		if(itemHeld == MinestuckArsenalItems.thornsOfOglogoth && gs.keyBindUseItem.isKeyDown()) {
			GlStateManager.depthMask(false);
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(GL11.GL_ONE, GL11.GL_ONE);
			
			GlStateManager.pushMatrix();
			
			
			float partialTicks = Minecraft.getMinecraft().getRenderPartialTicks();
			double doubleX = player.lastTickPosX + (player.posX - player.lastTickPosX) * partialTicks;
			double doubleY = player.lastTickPosY + (player.posY - player.lastTickPosY) * partialTicks;
			double doubleZ = player.lastTickPosZ + (player.posZ - player.lastTickPosZ) * partialTicks;
			
			Vec3d vec = new Vec3d(doubleX, doubleY+player.getEyeHeight(), doubleZ);
			Vec3d vec0 = shooter.getPositionVector().addVector(0, shooter.getEyeHeight()-0.2, 0);
			Vec3d vec1 = vec0;
			
			
			
				vec1 = Optional.ofNullable(ItemNeedleWeapon.raytraceEntityPlayerLook(player, ItemNeedleWeapon.range))
				.map(rtr -> rtr.hitVec)
				.orElse(vec1);
			
			GlStateManager.translate(-doubleX, -doubleY, -doubleZ);
			
			Tessellator tessellator = Tessellator.getInstance();
			BufferBuilder buffer = tessellator.getBuffer();
			
			Minecraft.getMinecraft().renderEngine.bindTexture(LASER_THORNS);
			
			buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX_LMAP_COLOR);
			
			drawBeam(vec0, vec1, vec, 0.13f);
			
			tessellator.draw();
			
			GlStateManager.popMatrix();
			
			GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		}
		}
	}
	
	@SideOnly(Side.CLIENT)
	public static void doRenderBeamQuills(EntityLivingBase shooter) {
		if(shooter != null && shooter instanceof EntityPlayer) {
		EntityPlayer player = (EntityPlayer) shooter;
		Item itemHeld = player.getHeldItemMainhand().getItem();
		GameSettings gs = Minecraft.getMinecraft().gameSettings;
		
		if(itemHeld == MinestuckArsenalItems.quillsOfEchidna && gs.keyBindUseItem.isKeyDown()) {
			GlStateManager.depthMask(false);
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(GL11.GL_ONE, GL11.GL_ONE);
			
			GlStateManager.pushMatrix();
			
			
			float partialTicks = Minecraft.getMinecraft().getRenderPartialTicks();
			double doubleX = player.lastTickPosX + (player.posX - player.lastTickPosX) * partialTicks;
			double doubleY = player.lastTickPosY + (player.posY - player.lastTickPosY) * partialTicks;
			double doubleZ = player.lastTickPosZ + (player.posZ - player.lastTickPosZ) * partialTicks;
			
			Vec3d vec = new Vec3d(doubleX, doubleY+player.getEyeHeight(), doubleZ);
			Vec3d vec0 = shooter.getPositionVector().addVector(0, shooter.getEyeHeight()-0.2, 0);
			Vec3d vec1 = vec0;
			
			
			
				vec1 = Optional.ofNullable(ItemNeedleWeapon.raytraceEntityPlayerLook(player, ItemNeedleWeapon.range))
				.map(rtr -> rtr.hitVec)
				.orElse(vec1);
			
			GlStateManager.translate(-doubleX, -doubleY, -doubleZ);
			
			Tessellator tessellator = Tessellator.getInstance();
			BufferBuilder buffer = tessellator.getBuffer();
			
			Minecraft.getMinecraft().renderEngine.bindTexture(LASER_QUILLS);
			
			buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX_LMAP_COLOR);
			
			drawBeam(vec0, vec1, vec, 0.13f);
			
			tessellator.draw();
			
			GlStateManager.popMatrix();
			
			GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		}
		}
	}
	
	@SideOnly(Side.CLIENT)
	public static void drawBeam(Vec3d S, Vec3d E, Vec3d P, float width) {
		Vec3d PS = S.subtract(P);
		Vec3d SE = E.subtract(S);
	
		Vec3d normal = PS.crossProduct(SE).normalize();
	
		Vec3d half = normal.scale(width);
		Vec3d p1 = S.add(half);
		Vec3d p2 = S.subtract(half);
		Vec3d p3 = E.add(half);
		Vec3d p4 = E.subtract(half);
	
		drawQuad(Tessellator.getInstance(), p1, p3, p4, p2);
	}

	@SideOnly(Side.CLIENT)
	private static void drawQuad(Tessellator tessellator, Vec3d p1, Vec3d p2, Vec3d p3, Vec3d p4) {
		int brightness = 240;
		int b1 = brightness >> 16 & 65535;
		int b2 = brightness & 65535;
	
		BufferBuilder buffer = tessellator.getBuffer();
		buffer.pos(p1.x, p1.y, p1.z).tex(0.0D, 0.0D).lightmap(b1, b2).color(255, 255, 255, 128)
			.endVertex();
		buffer.pos(p2.x, p2.y, p2.z).tex(1.0D, 0.0D).lightmap(b1, b2).color(255, 255, 255, 128)
			.endVertex();
		buffer.pos(p3.x, p3.y, p3.z).tex(1.0D, 1.0D).lightmap(b1, b2).color(255, 255, 255, 128)
			.endVertex();
		buffer.pos(p4.x, p4.y, p4.z).tex(0.0D, 1.0D).lightmap(b1, b2).color(255, 255, 255, 128)
			.endVertex();
	}
	
}
