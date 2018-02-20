package com.natura.minestuckarsenal.object;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;

public class Gun
{
	public String id;
	public General general = new General();
	public Projectile projectile;
	public Sounds sounds;
	public Display display = new Display();
	public Modules modules = new Modules();

	public static class General
	{
		@Optional public boolean auto = false;
		@Optional public int rate = 1;
	}
	
	public static class Projectile implements INBTSerializable<NBTTagCompound>
	{
		//public ItemAmmo.Type type;
		public boolean visible;
		public float damage;
		public float size;
		public double speed;
		public int life;
		@Optional public boolean gravity;
		@Optional public boolean damageReduceOverLife;
		@Optional public boolean damageReduceIfNotZoomed;

		@Override
		public NBTTagCompound serializeNBT() 
		{
			NBTTagCompound tag = new NBTTagCompound();
			//tag.setInteger("type", this.type.ordinal());
			tag.setBoolean("visible", this.visible);
			tag.setFloat("damage", this.damage);
			tag.setFloat("size", this.size);
			tag.setDouble("speed", this.speed);
			tag.setInteger("life", this.life);
			tag.setBoolean("gravity", this.gravity);
			tag.setBoolean("damageReduceOverLife", this.damageReduceOverLife);
			tag.setBoolean("damageReduceIfNotZoomed", this.damageReduceIfNotZoomed);
			return tag;
		}

		@Override
		public void deserializeNBT(NBTTagCompound tag) 
		{
			//this.type = ItemAmmo.Type.values()[tag.getInteger("type")];
			this.visible = tag.getBoolean("visible");
			this.damage = tag.getFloat("damage");
			this.size = tag.getFloat("size");
			this.speed = tag.getDouble("speed");
			this.life = tag.getInteger("life");
			this.gravity = tag.getBoolean("gravity");
			this.damageReduceOverLife = tag.getBoolean("damageReduceOverLife");
			this.damageReduceIfNotZoomed = tag.getBoolean("damageReduceIfNotZoomed");
		}
	}
	
	public static class Sounds
	{
		public String fire;
		public String reload;
		public String cock;
	}

	public static class Display
	{
		@Optional public Flash flash;

		public static class Flash
		{
			@Optional public double xOffset;
			@Optional public double yOffset;
			@Optional public double zOffset;
		}
	}

	public static class Modules
	{
		@Optional public Zoom zoom;
		public Attachments attachments = new Attachments();

		public static class Zoom
		{
			@Optional public float fovModifier;
			@Optional public boolean smooth;
			@Optional public double xOffset;
			@Optional public double yOffset;
			@Optional public double zOffset;
		}

		public static class Attachments
		{
			@Optional public Scope scope;

			public static class Scope
			{
				@Optional public double xOffset;
				@Optional public double yOffset;
				@Optional public double zOffset;
			}
		}
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.FIELD)
	public @interface Optional
	{

	}
}
