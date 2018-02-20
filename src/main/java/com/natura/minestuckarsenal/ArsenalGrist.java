package com.natura.minestuckarsenal;

import com.mraof.minestuck.Minestuck;
import com.mraof.minestuck.util.GristHelper;
import com.mraof.minestuck.util.GristType;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;
import static com.mraof.minestuck.util.GristHelper.secondaryGristMap;

public class ArsenalGrist {

	public static final GristType Acid = new GristType("acid", 0.3F, new ResourceLocation("minestuckarsenal", "acid")).setRegistryName("acid");
	public static final GristType Aquamarine = new GristType("aquamarine", 0.5F, new ResourceLocation("minestuckarsenal", "aquamarine")).setRegistryName("aquamarine");
	public static final GristType Blood = new GristType("blood", 0.4F, new ResourceLocation("minestuckarsenal", "blood")).setRegistryName("blood");
	public static final GristType Copper = new GristType("copper", 0.4F, new ResourceLocation("minestuckarsenal", "copper")).setRegistryName("copper");
	public static final GristType Emerald = new GristType("emerald", 0.1F, new ResourceLocation("minestuckarsenal", "emerald")).setRegistryName("emerald");
	public static final GristType Flourite = new GristType("flourite", 0.3F, new ResourceLocation("minestuckarsenal", "flourite")).setRegistryName("flourite");
	public static final GristType Frosting = new GristType("frosting", 0.5F, new ResourceLocation("minestuckarsenal", "frosting")).setRegistryName("frosting");
	public static final GristType Iron = new GristType("iron", 0.2F, new ResourceLocation("minestuckarsenal", "iron")).setRegistryName("iron");
	public static final GristType Jet = new GristType("jet", 0.5F, new ResourceLocation("minestuckarsenal", "jet")).setRegistryName("jet");
	public static final GristType Lead = new GristType("lead", 0.3F, new ResourceLocation("minestuckarsenal", "lead")).setRegistryName("lead");
	public static final GristType Lux = new GristType("lux", 0.1F, new ResourceLocation("minestuckarsenal", "lux")).setRegistryName("lux");
	public static final GristType Malachite = new GristType("malachite", 0.1F, new ResourceLocation("minestuckarsenal", "malachite")).setRegistryName("malachite");
	public static final GristType Mist = new GristType("mist", 0.4F, new ResourceLocation("minestuckarsenal", "mist")).setRegistryName("mist");
	public static final GristType Moonstone = new GristType("moonstone", 0.2F, new ResourceLocation("minestuckarsenal", "moonstone")).setRegistryName("moonstone");
	public static final GristType Neon = new GristType("neon", 0.3F, new ResourceLocation("minestuckarsenal", "neon")).setRegistryName("neon");
	public static final GristType Nitrogen = new GristType("nitrogen", 0.3F, new ResourceLocation("minestuckarsenal", "nitrogen")).setRegistryName("nitrogen");
	public static final GristType Obsidian = new GristType("obsidian", 0.2F, new ResourceLocation("minestuckarsenal", "obsidian")).setRegistryName("obsidian");
	public static final GristType Onyx = new GristType("onyx", 0.1F, new ResourceLocation("minestuckarsenal", "onyx")).setRegistryName("onyx");
	public static final GristType Permafrost = new GristType("permafrost", 0.2F, new ResourceLocation("minestuckarsenal", "permafrost")).setRegistryName("permafrost");
	public static final GristType Redstone = new GristType("redstone", 0.2F, new ResourceLocation("minestuckarsenal", "redstone")).setRegistryName("redstone");
	public static final GristType RockCandy = new GristType("rock_candy", 0.4F, new ResourceLocation("minestuckarsenal", "rock_candy")).setRegistryName("rock_candy");
	public static final GristType RoseQuartz = new GristType("rose_quartz", 0.3F, new ResourceLocation("minestuckarsenal", "rose_quartz")).setRegistryName("rose_quartz");
	public static final GristType Sandstone = new GristType("sandstone", 0.4F, new ResourceLocation("minestuckarsenal", "sandstone")).setRegistryName("sandstone");
	public static final GristType Silicon = new GristType("silicon", 0.3F, new ResourceLocation("minestuckarsenal", "silicon")).setRegistryName("silicon");
	public static final GristType Silk = new GristType("silk", 0.3F, new ResourceLocation("minestuckarsenal", "silk")).setRegistryName("silk");
	public static final GristType Slime = new GristType("slime", 0.4F, new ResourceLocation("minestuckarsenal", "slime")).setRegistryName("slime");
	public static final GristType StarSapphire = new GristType("star_sapphire", 0.1F, new ResourceLocation("minestuckarsenal", "star_sapphire")).setRegistryName("star_sapphire");
	public static final GristType Sunstone = new GristType("sunstone", 0.2F, new ResourceLocation("minestuckarsenal", "sunstone")).setRegistryName("sunstone");
	public static final GristType Titanium = new GristType("titanium", 0.1F, new ResourceLocation("minestuckarsenal", "titanium")).setRegistryName("titanium");
	public static final GristType Topaz = new GristType("topaz", 0.3F, new ResourceLocation("minestuckarsenal", "topaz")).setRegistryName("topaz");
	public static final GristType Wood = new GristType("wood", 0.4F, new ResourceLocation("minestuckarsenal", "wood")).setRegistryName("wood");
	public static final GristType Meta = new GristType("meta", 0.0F, new ResourceLocation("minestuckarsenal", "meta")).setRegistryName("meta");
	public static final GristType Polychromite = new GristType("polychromite", 0.0F, new ResourceLocation("minestuckarsenal", "polychromite")).setRegistryName("polychromite");
	public static final GristType Opal = new GristType("opal", 0.0F, new ResourceLocation("minestuckarsenal", "opal")).setRegistryName("opal");
	public static final GristType Rainbow = new GristType("rainbow", 0.0F, new ResourceLocation("minestuckarsenal", "rainbow")).setRegistryName("rainbow");
	public static final GristType Plasma = new GristType("plasma", 0.0F, new ResourceLocation("minestuckarsenal", "plasma")).setRegistryName("plasma");
	
	@SubscribeEvent
	public void registerGrist(RegistryEvent.Register<GristType> event)
	{
		IForgeRegistry<GristType> registry = event.getRegistry();
		
		registry.register(Acid);
		registry.register(Aquamarine);
		registry.register(Blood);
		registry.register(Copper);
		registry.register(Emerald);
		registry.register(Flourite);
		registry.register(Frosting);
		registry.register(Iron);
		registry.register(Jet);
		registry.register(Lead);
		registry.register(Lux);
		registry.register(Malachite);
		registry.register(Mist);
		registry.register(Moonstone);
		registry.register(Neon);
		registry.register(Nitrogen);
		registry.register(Obsidian);
		registry.register(Onyx);
		registry.register(Permafrost);
		registry.register(Redstone);
		registry.register(RockCandy);
		registry.register(RoseQuartz);
		registry.register(Sandstone);
		registry.register(Silicon);
		registry.register(Slime);
		registry.register(Silk);
		registry.register(StarSapphire);
		registry.register(Sunstone);
		registry.register(Titanium);
		registry.register(Topaz);
		registry.register(Wood);
		registry.register(Meta);
		registry.register(Polychromite);
		registry.register(Opal);
		registry.register(Rainbow);
		registry.register(Plasma);
		
		secondaryGristMap.get(GristType.Amber).add(Slime);
		secondaryGristMap.get(GristType.Amethyst).add(Topaz);
		secondaryGristMap.get(GristType.Caulk).add(Silicon);
		secondaryGristMap.get(GristType.Chalk).add(Silk);
		secondaryGristMap.get(GristType.Cobalt).add(StarSapphire);
		secondaryGristMap.get(GristType.Garnet).add(Onyx);
		secondaryGristMap.get(GristType.Iodine).add(Sandstone);
		secondaryGristMap.get(GristType.Marble).add(Wood);
		secondaryGristMap.get(GristType.Mercury).add(Blood);
		secondaryGristMap.get(GristType.Quartz).add(Mist);
		secondaryGristMap.get(GristType.Ruby).add(Emerald);
		secondaryGristMap.get(GristType.Rust).add(Iron);
		secondaryGristMap.get(GristType.Shale).add(Jet);
		secondaryGristMap.get(GristType.Sulfur).add(Acid);
		secondaryGristMap.get(GristType.Tar).add(Copper);
		secondaryGristMap.get(GristType.Uranium).add(Titanium);
		secondaryGristMap.get(GristType.Diamond).add(Neon);
		secondaryGristMap.get(GristType.Gold).add(Malachite);
		
		secondaryGristMap.get(Acid).add(GristType.Uranium);
		secondaryGristMap.get(Acid).add(GristType.Mercury);
		secondaryGristMap.get(Acid).add(Silicon);
		
		secondaryGristMap.get(Aquamarine).add(GristType.Diamond);
		secondaryGristMap.get(Aquamarine).add(GristType.Quartz);
		secondaryGristMap.get(Aquamarine).add(StarSapphire);

		secondaryGristMap.get(Blood).add(GristType.Amber);
		secondaryGristMap.get(Blood).add(GristType.Rust);
		secondaryGristMap.get(Blood).add(Iron);
		
		secondaryGristMap.get(Copper).add(GristType.Gold);
		secondaryGristMap.get(Copper).add(GristType.Cobalt);
		secondaryGristMap.get(Copper).add(Iron);
		
		secondaryGristMap.get(Emerald).add(GristType.Diamond);
		secondaryGristMap.get(Emerald).add(GristType.Ruby);
		secondaryGristMap.get(Emerald).add(Topaz);
		
		secondaryGristMap.get(Flourite).add(GristType.Amethyst);
		secondaryGristMap.get(Flourite).add(GristType.Cobalt);
		secondaryGristMap.get(Flourite).add(Jet);
		
		secondaryGristMap.get(Frosting).add(GristType.Chalk);
		secondaryGristMap.get(Frosting).add(GristType.Iodine);
		secondaryGristMap.get(Frosting).add(RockCandy);
		
		secondaryGristMap.get(Iron).add(GristType.Gold);
		secondaryGristMap.get(Iron).add(GristType.Rust);
		secondaryGristMap.get(Iron).add(Titanium);
		
		secondaryGristMap.get(Jet).add(GristType.Tar);
		secondaryGristMap.get(Jet).add(GristType.Shale);
		secondaryGristMap.get(Jet).add(Obsidian);
		
		secondaryGristMap.get(Lead).add(GristType.Mercury);
		secondaryGristMap.get(Lead).add(GristType.Quartz);
		secondaryGristMap.get(Lead).add(Titanium);
		
		secondaryGristMap.get(Lux).add(GristType.Amber);
		secondaryGristMap.get(Lux).add(GristType.Sulfur);
		secondaryGristMap.get(Lux).add(Mist);
		
		secondaryGristMap.get(Malachite).add(GristType.Marble);
		secondaryGristMap.get(Malachite).add(GristType.Shale);
		secondaryGristMap.get(Malachite).add(Silk);
		
		secondaryGristMap.get(Mist).add(GristType.Caulk);
		secondaryGristMap.get(Mist).add(GristType.Quartz);
		secondaryGristMap.get(Mist).add(StarSapphire);
		
		secondaryGristMap.get(Moonstone).add(GristType.Diamond);
		secondaryGristMap.get(Moonstone).add(Sunstone);
		
		secondaryGristMap.get(Neon).add(GristType.Ruby);
		secondaryGristMap.get(Neon).add(GristType.Uranium);
		secondaryGristMap.get(Neon).add(Lux);
		
		secondaryGristMap.get(Nitrogen).add(GristType.Cobalt);
		secondaryGristMap.get(Nitrogen).add(GristType.Rust);
		secondaryGristMap.get(Nitrogen).add(Mist);
		
		secondaryGristMap.get(Obsidian).add(GristType.Shale);
		secondaryGristMap.get(Obsidian).add(GristType.Tar);
		secondaryGristMap.get(Obsidian).add(Onyx);
		
		secondaryGristMap.get(Onyx).add(GristType.Caulk);
		secondaryGristMap.get(Onyx).add(GristType.Garnet);
		secondaryGristMap.get(Onyx).add(Obsidian);
		
		secondaryGristMap.get(Permafrost).add(GristType.Marble);
		secondaryGristMap.get(Permafrost).add(GristType.Quartz);
		secondaryGristMap.get(Permafrost).add(Mist);
		
		secondaryGristMap.get(Redstone).add(GristType.Gold);
		secondaryGristMap.get(Redstone).add(GristType.Rust);
		secondaryGristMap.get(Redstone).add(Blood);
		
		secondaryGristMap.get(RockCandy).add(GristType.Chalk);
		secondaryGristMap.get(RockCandy).add(GristType.Iodine);
		secondaryGristMap.get(RockCandy).add(Frosting);
		
		secondaryGristMap.get(RoseQuartz).add(GristType.Amethyst);
		secondaryGristMap.get(RoseQuartz).add(Frosting);
		secondaryGristMap.get(RoseQuartz).add(RockCandy);
		
		secondaryGristMap.get(Sandstone).add(GristType.Marble);
		secondaryGristMap.get(Sandstone).add(GristType.Shale);
		secondaryGristMap.get(Sandstone).add(Jet);
		
		secondaryGristMap.get(Silicon).add(GristType.Amber);
		secondaryGristMap.get(Silicon).add(GristType.Caulk);
		secondaryGristMap.get(Silicon).add(Slime);
		
		secondaryGristMap.get(Slime).add(GristType.Amber);
		secondaryGristMap.get(Slime).add(GristType.Mercury);
		secondaryGristMap.get(Slime).add(Silicon);
		
		secondaryGristMap.get(Silk).add(GristType.Marble);
		secondaryGristMap.get(Silk).add(GristType.Chalk);
		secondaryGristMap.get(Silk).add(Wood);
		
		secondaryGristMap.get(StarSapphire).add(GristType.Diamond);
		secondaryGristMap.get(StarSapphire).add(Emerald);
		
		secondaryGristMap.get(Sunstone).add(GristType.Diamond);
		secondaryGristMap.get(Sunstone).add(Moonstone);
		
		secondaryGristMap.get(Titanium).add(GristType.Rust);
		secondaryGristMap.get(Titanium).add(GristType.Uranium);
		secondaryGristMap.get(Titanium).add(Iron);
		
		secondaryGristMap.get(Topaz).add(GristType.Diamond);
		secondaryGristMap.get(Topaz).add(GristType.Ruby);
		secondaryGristMap.get(Topaz).add(Emerald);
		
		secondaryGristMap.get(Wood).add(GristType.Marble);
		secondaryGristMap.get(Wood).add(GristType.Amber);
		secondaryGristMap.get(Wood).add(RoseQuartz);
	}
	
}
