package com.natura.minestuckarsenal;

import static com.mraof.minestuck.item.MinestuckItems.sbahjPoster;
import static com.natura.minestuckarsenal.block.MinestuckArsenalBlocks.gristGatherer;
import static com.natura.minestuckarsenal.block.MinestuckArsenalBlocks.kringlefucker;
import static com.natura.minestuckarsenal.block.MinestuckArsenalBlocks.powerHub;
import static com.natura.minestuckarsenal.block.MinestuckArsenalBlocks.uniqueObject;
import static com.natura.minestuckarsenal.item.MinestuckArsenalItems.*;

import com.mraof.minestuck.alchemy.CombinationRegistry;
import static com.mraof.minestuck.alchemy.CombinationRegistry.Mode.*;
import com.mraof.minestuck.alchemy.GristRegistry;
import com.mraof.minestuck.alchemy.GristSet;
import com.mraof.minestuck.alchemy.GristType;
import com.mraof.minestuck.block.MinestuckBlocks;
import com.mraof.minestuck.item.MinestuckItems;
import com.natura.minestuckarsenal.block.MinestuckArsenalBlocks;
import com.natura.minestuckarsenal.item.MinestuckArsenalItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class AlchemyRecipes {

	public static void registerMinestuckRecipes() {
		
		GameRegistry.addSmelting(MinestuckArsenalItems.cakeMix, new ItemStack(Items.CAKE), 0.7f);

		//Grist Registries
		
		//Minestuck Items
		GristRegistry.addGristConversion(new ItemStack(MinestuckItems.royalDeringer), false, new GristSet(new GristType[] {GristType.Build, GristType.Gold, GristType.Diamond}, new int[] {6000, 1000, 1300}));
		GristRegistry.addGristConversion(new ItemStack(MinestuckItems.scarletRibbitar), false, new GristSet(new GristType[] {GristType.Build, GristType.Ruby, GristType.Quartz}, new int[] {100000, 40000, 20000}));
		GristRegistry.addGristConversion(new ItemStack(MinestuckItems.zillyhooHammer), false, new GristSet(GristType.Zillium, 1000000000));
		GristRegistry.addGristConversion(new ItemStack(MinestuckItems.telescopicSassacrusher), false, new GristSet(new GristType[] {GristType.Shale, GristType.Tar, GristType.Mercury}, new int[] {250, 10, 50}));
		
		//Minestuck Arsenal Items
		GristRegistry.addGristConversion(new ItemStack(paperSword), false, new GristSet(new GristType[] {GristType.Build, GristType.Tar}, new int[] {12, 8}));	
		GristRegistry.addGristConversion(new ItemStack(caledfwlch), false, new GristSet(new GristType[] {GristType.Build, GristType.Gold, ArsenalGrist.Titanium, ArsenalGrist.Meta}, new int[] {140000, 80000, 20000, 1}));
		GristRegistry.addGristConversion(new ItemStack(chainsawKatana), false, new GristSet(new GristType[] {GristType.Build, GristType.Amber, GristType.Tar, GristType.Rust}, new int[] {40000, 2000, 6000, 1000}));
		GristRegistry.addGristConversion(new ItemStack(cutlass), false, new GristSet(new GristType[] {GristType.Build, GristType.Cobalt, GristType.Rust}, new int[] {26, 17, 45}));
		GristRegistry.addGristConversion(new ItemStack(candySword), false, new GristSet(new GristType[] {GristType.Chalk, ArsenalGrist.Frosting, ArsenalGrist.RockCandy}, new int[] {400, 1000, 1000}));
		
		GristRegistry.addGristConversion(new ItemStack(brokenCaledfwlch), new GristSet(new GristType[] {GristType.Build, GristType.Gold, ArsenalGrist.Titanium}, new int[] {140000, 80000, 20000}));
		GristRegistry.addGristConversion(new ItemStack(brokenRoyalDeringer), new GristSet(new GristType[] {GristType.Build, GristType.Gold, GristType.Diamond}, new int[] {3000, 500, 650}));
		GristRegistry.addGristConversion(new ItemStack(brokenNinjaSword), new GristSet(new GristType[] {GristType.Chalk, GristType.Quartz, GristType.Rust}, new int[] {6, 5, 3}));
		GristRegistry.addGristConversion(new ItemStack(brokenScarletRibbitar), new GristSet(new GristType[] {GristType.Build, GristType.Ruby, GristType.Quartz}, new int[] {50000, 200000, 10000}));
		
		GristRegistry.addGristConversion(new ItemStack(wrinklefucker), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale, GristType.Tar}, new int[] {55, 44, 66}));
		GristRegistry.addGristConversion(new ItemStack(barberBasher), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale, GristType.Chalk}, new int[] {360, 800, 600}));
		GristRegistry.addGristConversion(new ItemStack(fearNoAnvil), false, new GristSet(new GristType[] {GristType.Build, GristType.Garnet, GristType.Diamond, GristType.Gold, GristType.Quartz}, new int[] {5000, 5000, 5000, 5000, 1}));
		GristRegistry.addGristConversion(new ItemStack(mwrthwl), false, new GristSet(new GristType[] {GristType.Build, GristType.Gold, ArsenalGrist.Titanium, ArsenalGrist.Meta}, new int[] {140000, 80000, 20000, 1}));
		
		GristRegistry.addGristConversion(new ItemStack(thornySubject), false, new GristSet(new GristType[] {GristType.Build, GristType.Amethyst, GristType.Ruby}, new int[] {3500, 200, 1}));
		GristRegistry.addGristConversion(new ItemStack(babysFirstThresher), false, new GristSet(new GristType[] {GristType.Rust, GristType.Garnet, GristType.Caulk}, new int[] {34, 21, 15}));
		GristRegistry.addGristConversion(new ItemStack(hemeoreaper), false, new GristSet(new GristType[] {GristType.Build, GristType.Rust, GristType.Garnet, GristType.Iodine}, new int[] {250, 85, 75, 24}));
		GristRegistry.addGristConversion(new ItemStack(prospitReaper), false, new GristSet(new GristType[] {GristType.Build, GristType.Amber, GristType.Diamond}, new int[] {18, 22, 1}));
		GristRegistry.addGristConversion(new ItemStack(derseReaper), false, new GristSet(new GristType[] {GristType.Build, GristType.Tar, GristType.Diamond}, new int[] {18, 22, 1}));
		GristRegistry.addGristConversion(new ItemStack(owTheEdge), false, new GristSet(GristType.Artifact, -25));
		
		GristRegistry.addGristConversion(new ItemStack(knittingNeedles), false, new GristSet(GristType.Build, 8));
		GristRegistry.addGristConversion(new ItemStack(needleWands), false, new GristSet(new GristType[] {GristType.Diamond, GristType.Chalk, GristType.Garnet, GristType.Gold}, new int[] {1000, 2000, 3000, 500}));
		GristRegistry.addGristConversion(new ItemStack(thornsOfOglogoth), false, new GristSet(new GristType[] {GristType.Iodine, GristType.Chalk, GristType.Amethyst, GristType.Gold, GristType.Tar}, new int[] {6000, 5000, 4000, 3000, 666}));
		GristRegistry.addGristConversion(new ItemStack(quillsOfEchidna), false, new GristSet(new GristType[] {GristType.Build, GristType.Chalk, GristType.Amethyst, GristType.Gold, GristType.Diamond, ArsenalGrist.Lux, ArsenalGrist.StarSapphire, ArsenalGrist.Rainbow, ArsenalGrist.Polychromite}, new int[] {3500000, 3000000, 250000, 100000, 12, 50000, 800, 10000, 10000}));
		
		GristRegistry.addGristConversion(new ItemStack(joustingLance), false, new GristSet(GristType.Build, 15));
		GristRegistry.addGristConversion(new ItemStack(fiduspawnLance), false, new GristSet(new GristType[] {GristType.Build, GristType.Tar, GristType.Shale}, new int[] {30, 22, 16}));
		GristRegistry.addGristConversion(new ItemStack(cigaretteHolderLance), false, new GristSet(new GristType[] {GristType.Shale, GristType.Tar, GristType.Diamond}, new int[] {44, 65, 1}));
		GristRegistry.addGristConversion(new ItemStack(rocketPopLance), false, new GristSet(new GristType[] {GristType.Ruby, GristType.Cobalt, GristType.Chalk}, new int[] {34, 25, 27}));
		
		GristRegistry.addGristConversion(new ItemStack(lipstickChainsaw), false, new GristSet(new GristType[] {GristType.Build, GristType.Marble, GristType.Shale}, new int[] {24, 18, 32}));
		GristRegistry.addGristConversion(new ItemStack(ragripper), false, new GristSet(new GristType[] {GristType.Build, GristType.Amber, GristType.Chalk, GristType.Garnet, GristType.Diamond}, new int[] {10000, 6000, 4500, 8000, 1}));
		GristRegistry.addGristConversion(new ItemStack(daintyDisembowler), false, new GristSet(new GristType[] {GristType.Amethyst, ArsenalGrist.Frosting, ArsenalGrist.Blood, GristType.Diamond}, new int[] {28, 60, 12, 1}));
		GristRegistry.addGristConversion(new ItemStack(uraniumChainsaw), false, new GristSet(new GristType[] {GristType.Build, GristType.Uranium}, new int[] {150, 50}));
		
		GristRegistry.addGristConversion(new ItemStack(leatherWhip), false, new GristSet(GristType.Build, 12));
		
		GristRegistry.addGristConversion(new ItemStack(candyAxe), false, new GristSet(new GristType[] {GristType.Build, ArsenalGrist.Frosting, ArsenalGrist.RockCandy, GristType.Chalk}, new int[] {150, 50, 35, 10}));
		GristRegistry.addGristConversion(new ItemStack(shadowAxe), false, new GristSet(new GristType[] {GristType.Build, ArsenalGrist.Jet}, new int[] {250, 14}));
		GristRegistry.addGristConversion(new ItemStack(massDeduction), false, new GristSet(new GristType[] {GristType.Build, GristType.Caulk, GristType.Mercury, ArsenalGrist.Copper, ArsenalGrist.Lead, ArsenalGrist.StarSapphire}, new int[] {750, 840, 12, 60, 8, 1}));
		GristRegistry.addGristConversion(new ItemStack(aks), false, new GristSet(GristType.Build, 0));
		
		GristRegistry.addGristConversion(new ItemStack(nepetaClaws), false, new GristSet(new GristType[] {GristType.Build, GristType.Iodine, GristType.Chalk, GristType.Amber}, new int[] {10000, 333, 333, 333}));
		GristRegistry.addGristConversion(new ItemStack(blueClaws), false, new GristSet(new GristType[] {GristType.Build, GristType.Diamond}, new int[] {500000, 1}));
		
		GristRegistry.addGristConversion(new ItemStack(woodenTrident), false, new GristSet(GristType.Build, 12));
		GristRegistry.addGristConversion(new ItemStack(silverTrident), false, new GristSet(new GristType[] {GristType.Build, GristType.Rust}, new int[] {45, 12}));
		GristRegistry.addGristConversion(new ItemStack(goldTrident), false, new GristSet(new GristType[] {GristType.Build, GristType.Amber, GristType.Gold, GristType.Diamond}, new int[] {1000, 550, 600, 1}));
		GristRegistry.addGristConversion(new ItemStack(poseidonsEntente), false, new GristSet(new GristType[] {GristType.Gold, GristType.Diamond}, new int[] {50000, 1}));
		
		GristRegistry.addGristConversion(new ItemStack(blindmansDirections), false, new GristSet(new GristType[] {GristType.Build, GristType.Caulk, GristType.Rust, GristType.Ruby}, new int[] {10000, 1000, 2500, 1}));
		GristRegistry.addGristConversion(new ItemStack(blackStaff), false, new GristSet(new GristType[] {GristType.Build, GristType.Tar, GristType.Ruby}, new int[] {32, 21, 1}));
		GristRegistry.addGristConversion(new ItemStack(goldStaff), false, new GristSet(new GristType[] {GristType.Gold, GristType.Ruby, GristType.Diamond}, new int[] {120, 1, 1}));
		GristRegistry.addGristConversion(new ItemStack(pogoCane), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale}, new int[] {10, 16}));
		GristRegistry.addGristConversion(new ItemStack(bladedCane), false, new GristSet(new GristType[] {GristType.Build, GristType.Rust}, new int[] {120, 45}));
		GristRegistry.addGristConversion(new ItemStack(regicane), false, new GristSet(new GristType[] {GristType.Amethyst, GristType.Tar,GristType.Gold}, new int[] {27, 62, 38}));
		GristRegistry.addGristConversion(new ItemStack(blazingGlory), false, new GristSet(new GristType[] {GristType.Build, GristType.Amber, GristType.Caulk, GristType.Ruby}, new int[] {5000, 3500, 3500, 1}));
		GristRegistry.addGristConversion(new ItemStack(radioactiveStaff), false, new GristSet(new GristType[] {ArsenalGrist.Iron, ArsenalGrist.Acid, GristType.Uranium}, new int[] {350, 400, 200}));
		
		GristRegistry.addGristConversion(new ItemStack(scythe), false, new GristSet(GristType.Build, 12));
		GristRegistry.addGristConversion(new ItemStack(eightballScythe), false, new GristSet(GristType.Cobalt, 8888));
		
		GristRegistry.addGristConversion(new ItemStack(houseKey), false, new GristSet(new GristType[] {GristType.Rust, GristType.Build}, new int[] {12, 16}));
		GristRegistry.addGristConversion(new ItemStack(keyblade), false, new GristSet(new GristType[] {GristType.Rust, GristType.Amber, GristType.Diamond}, new int[] {45, 25, 1}));
		GristRegistry.addGristConversion(new ItemStack(trueBlue), false, new GristSet(new GristType[] {GristType.Cobalt, GristType.Build, ArsenalGrist.Aquamarine}, new int[] {8888, 8000, 1}));
		GristRegistry.addGristConversion(new ItemStack(candyKey), false, new GristSet(new GristType[] {GristType.Chalk, ArsenalGrist.Frosting, ArsenalGrist.RockCandy}, new int[] {40, 10, 10}));
		GristRegistry.addGristConversion(new ItemStack(chronolatch), false, new GristSet(new GristType[] {GristType.Garnet, GristType.Amber, ArsenalGrist.Sunstone, ArsenalGrist.Emerald, GristType.Quartz}, new int[] {4500, 1400, 500, 10, 1}));
		GristRegistry.addGristConversion(new ItemStack(yaldabaothsKeyton), false, new GristSet(new GristType[] {GristType.Rust, GristType.Ruby, ArsenalGrist.Blood, ArsenalGrist.Neon, GristType.Diamond}, new int[] {40000, 10000, 60000, 500, 1}));
		GristRegistry.addGristConversion(new ItemStack(allweddol), false, new GristSet(new GristType[] {GristType.Build, GristType.Gold, ArsenalGrist.Titanium, ArsenalGrist.Meta}, new int[] {140000, 80000, 20000, 1}));
		
		GristRegistry.addGristConversion(new ItemStack(twirlingBaton), false, new GristSet(GristType.Build, 6));
		GristRegistry.addGristConversion(new ItemStack(conductorsBaton), false, new GristSet(GristType.Build, 8));
		GristRegistry.addGristConversion(new ItemStack(nightstick), false, new GristSet(new GristType[] {GristType.Build, GristType.Diamond, ArsenalGrist.Jet}, new int[] {24, 1, 14}) );
		GristRegistry.addGristConversion(new ItemStack(uraniumBaton), false, new GristSet(GristType.Uranium, 56));
		GristRegistry.addGristConversion(new ItemStack(windwaker), false, new GristSet(new GristType[] {GristType.Gold, GristType.Shale, ArsenalGrist.Aquamarine, ArsenalGrist.Sandstone}, new int[] {1200, 4000, 1, 1500}));
		GristRegistry.addGristConversion(new ItemStack(celestialFulcrum), false, new GristSet(new GristType[] {GristType.Mercury, ArsenalGrist.Flourite, ArsenalGrist.Sunstone, ArsenalGrist.Moonstone}, new int[] {20000, 4500, 500, 500}));
		
		GristRegistry.addGristConversion(new ItemStack(keyAxe), false, new GristSet(new GristType[] {GristType.Build, GristType.Rust, ArsenalGrist.Iron}, new int[] {24, 12, 8}));
		GristRegistry.addGristConversion(new ItemStack(stoneColdKeyAxe), false, new GristSet(new GristType[] {GristType.Caulk, ArsenalGrist.Jet, ArsenalGrist.Obsidian, GristType.Tar, ArsenalGrist.Titanium, ArsenalGrist.Permafrost}, new int[] {5000, 40000, 10000, 30000, 2000, 8000}));
		
		GristRegistry.addGristConversion(new ItemStack(mineNGrist), false, new GristSet(new GristType[] {ArsenalGrist.Blood, ArsenalGrist.Frosting, ArsenalGrist.Iron, GristType.Chalk}, new int[] {5000, 6500, 4000, 2500, 1}));
		
		GristRegistry.addGristConversion(new ItemStack(magicEightBall), false, new GristSet(GristType.Cobalt, 8));
		GristRegistry.addGristConversion(new ItemStack(crystalBall), false, new GristSet(GristType.Amethyst, 22));
		GristRegistry.addGristConversion(new ItemStack(magicCueball), false, new GristSet(new GristType[] {GristType.Build, GristType.Chalk, GristType.Uranium, GristType.Diamond, ArsenalGrist.Meta}, new int[] {4000, 1300, 6000, 1200, 1}));
		GristRegistry.addGristConversion(new ItemStack(clothesIron), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale, GristType.Rust}, new int[] {1, 1, 1}));
		GristRegistry.addGristConversion(new ItemStack(fridgeMagnet), false, new GristSet(GristType.Build, 1));
		GristRegistry.addGristConversion(new ItemStack(wizardStatue), false, new GristSet(new GristType[] {GristType.Build, GristType.Diamond}, new int[] {8, 1}));
		GristRegistry.addGristConversion(new ItemStack(flarpManual), false, new GristSet(new GristType[] {GristType.Build, GristType.Diamond}, new int[] {10, 1}));
		GristRegistry.addGristConversion(new ItemStack(athManual), false, new GristSet(GristType.Build, 8));
		GristRegistry.addGristConversion(new ItemStack(sassacreText), false, new GristSet(GristType.Build, 10));
		GristRegistry.addGristConversion(new ItemStack(trollRomance), false, new GristSet(new GristType[] {GristType.Build, GristType.Chalk, GristType.Iodine, GristType.Sulfur}, new int[] {10, 1, 1, 1}));
		GristRegistry.addGristConversion(new ItemStack(hostPlush), false, new GristSet(GristType.Build, 5));
		GristRegistry.addGristConversion(new ItemStack(barbasol), false, new GristSet(GristType.Build, 1));
		GristRegistry.addGristConversion(new ItemStack(inkSquidProQuo), false, new GristSet(GristType.Tar, 50));
		GristRegistry.addGristConversion(new ItemStack(blueEctoSlime), false, new GristSet(GristType.Build, 1));
		GristRegistry.addGristConversion(new ItemStack(cakeMix), false, new GristSet(new GristType[] {GristType.Build, ArsenalGrist.RockCandy, ArsenalGrist.Frosting, ArsenalGrist.Blood}, new int[] {8, 6, 6, 6}));
		
		GristRegistry.addGristConversion(new ItemStack(scottyDog), false, new GristSet(new GristType[] {GristType.Tar, GristType.Shale}, new int[] {1, 1}));
		GristRegistry.addGristConversion(new ItemStack(licoriceGummyBear), false, new GristSet(new GristType[] {GristType.Tar, GristType.Shale}, new int[] {1, 1}));
		GristRegistry.addGristConversion(new ItemStack(licoriceFish), false, new GristSet(new GristType[] {GristType.Tar, GristType.Shale}, new int[] {1, 1}));
		GristRegistry.addGristConversion(new ItemStack(cottonCandy), false, new GristSet(GristType.Chalk, 6));
		GristRegistry.addGristConversion(new ItemStack(cuttlefish), false, new GristSet(GristType.Gold, 6));
		GristRegistry.addGristConversion(new ItemStack(soporSlime), false, new GristSet(new GristType[] {GristType.Uranium}, new int[] {420}));
		GristRegistry.addGristConversion(new ItemStack(phlegmGushers), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale, GristType.Mercury}, new int[] {24, 30, 18}));
		GristRegistry.addGristConversion(new ItemStack(sorrowGushers), false, new GristSet(GristType.Tar, 1000));
		GristRegistry.addGristConversion(new ItemStack(ectoCookie), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale, GristType.Mercury}, new int[] {22, 27, 19}));
		GristRegistry.addGristConversion(new ItemStack(ectoLoaf), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale, GristType.Mercury}, new int[] {22, 28, 17}));
		GristRegistry.addGristConversion(new ItemStack(ectoSteak), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale, GristType.Mercury}, new int[] {22, 28, 16}));
		GristRegistry.addGristConversion(new ItemStack(faygoEcto), false, new GristSet(new GristType[] {GristType.Build, GristType.Cobalt, GristType.Chalk}, new int[] {250, 400, 25}));
		GristRegistry.addGristConversion(new ItemStack(seahorseIdol), false, new GristSet(new GristType[] {GristType.Build, ArsenalGrist.StarSapphire}, new int[] {14, 1}));
		
		GristRegistry.addGristConversion(new ItemStack(appleJuice), false, new GristSet(GristType.Build, 14));
		
		GristRegistry.addGristConversion(new ItemStack(sbahjifier), false, new GristSet(GristType.Artifact, -1000));
		
		GristRegistry.addGristConversion(new ItemStack(horseFootballPlayer), false, new GristSet(GristType.Mercury, 425));
		
		GristRegistry.addGristConversion(new ItemStack(barbasolBomb), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale}, new int[] {1, 1}));
		
		GristRegistry.addGristConversion(new ItemStack(trollHeadband), false, new GristSet(new GristType[] {GristType.Build, GristType.Chalk, GristType.Sulfur, GristType.Iodine}, new int[] {25, 12, 19, 20}));
		GristRegistry.addGristConversion(new ItemStack(dirkShades), false, new GristSet(new GristType[] {GristType.Diamond, GristType.Tar}, new int[] {34, 46}));
		GristRegistry.addGristConversion(new ItemStack(daveGlasses), false, new GristSet(GristType.Build, 6));
		GristRegistry.addGristConversion(new ItemStack(johnGlasses), false, new GristSet(GristType.Build, 6));
		GristRegistry.addGristConversion(new ItemStack(jadeGlasses), false, new GristSet(GristType.Build, 6));
		GristRegistry.addGristConversion(new ItemStack(soothSpecs), false, new GristSet(new GristType[] {GristType.Build, GristType.Diamond, GristType.Amethyst}, new int[] {2000, 20000, 200000}));
		
		GristRegistry.addGristConversion(new ItemStack(rocketShoes), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale, GristType.Rust, GristType.Uranium}, new int[] {25, 23, 18, 1}));
		
		GristRegistry.addGristConversion(new ItemStack(slimeShoes), false, new GristSet(new GristType[] {GristType.Caulk, GristType.Amber}, new int[] {15, 24}));
		
		GristRegistry.addGristConversion(new ItemStack(ironLassGlasses), false, new GristSet(new GristType[] {GristType.Build, GristType.Diamond, GristType.Amethyst, GristType.Ruby}, new int[] {2000, 20000, 200,000, 3000000}));
		
		GristRegistry.addGristConversion(new ItemStack(ironLassChestplate), false, new GristSet(new GristType[] {GristType.Build, GristType.Ruby, GristType.Amber, GristType.Uranium}, new int[] {30000, 6000, 3000, 300}));
		GristRegistry.addGristConversion(new ItemStack(ironLassSkirt), false, new GristSet(new GristType[] {GristType.Build, GristType.Ruby, GristType.Amber, GristType.Uranium}, new int[] {30000, 6000, 3000, 300}));
		GristRegistry.addGristConversion(new ItemStack(ironLassShoes), false, new GristSet(new GristType[] {GristType.Build, GristType.Ruby, GristType.Amber, GristType.Uranium}, new int[] {30000, 6000, 3000, 300}));

		GristRegistry.addGristConversion(new ItemStack(suitJacket), false, new GristSet(GristType.Build, 8));
		GristRegistry.addGristConversion(new ItemStack(suitPants), false, new GristSet(GristType.Build, 8));
		GristRegistry.addGristConversion(new ItemStack(suitShoes), false, new GristSet(GristType.Build, 8));
		
		GristRegistry.addGristConversion(new ItemStack(slimeSuitJacket), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale}, new int[] {1, 3}));
		GristRegistry.addGristConversion(new ItemStack(slimeSuitPants), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale}, new int[] {1, 3}));
		GristRegistry.addGristConversion(new ItemStack(slimeSuitShoes), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale}, new int[] {1, 3}));
		
		GristRegistry.addGristConversion(new ItemStack(wiseguySlimesuitJacket), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale, GristType.Tar}, new int[] {1, 5, 10}));
		GristRegistry.addGristConversion(new ItemStack(wiseguySlimesuitPants), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale, GristType.Tar}, new int[] {1, 5, 10}));
		GristRegistry.addGristConversion(new ItemStack(wiseguySlimesuitShoes), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale, GristType.Tar}, new int[] {1, 5, 10}));
		
		GristRegistry.addGristConversion(new ItemStack(beretta), false, new GristSet(GristType.Build, 14));
		GristRegistry.addGristConversion(new ItemStack(goldBeretta), false, new GristSet(new GristType[] {GristType.Build, GristType.Gold, ArsenalGrist.Emerald}, new int[] {4000, 550, 1}));
		GristRegistry.addGristConversion(new ItemStack(gunblade), false, new GristSet(new GristType[] {GristType.Build, GristType.Amethyst, ArsenalGrist.Blood}, new int[] {1200, 200, 12}));
		GristRegistry.addGristConversion(new ItemStack(gunOfSouls), false, new GristSet(new GristType[] {GristType.Sulfur, ArsenalGrist.Acid, ArsenalGrist.Slime, ArsenalGrist.Blood, ArsenalGrist.Rainbow}, new int[] {25000, 15000, 8000, 500, 1}));
		
		GristRegistry.addGristConversion(new ItemStack(blackStaff), false, new GristSet(new GristType[] {GristType.Build, ArsenalGrist.Obsidian, ArsenalGrist.Blood}, new int[] {18, 4, 12}));
		GristRegistry.addGristConversion(new ItemStack(goldStaff), false, new GristSet(new GristType[] {GristType.Build, GristType.Gold, ArsenalGrist.Blood, ArsenalGrist.Frosting}, new int[] {1200, 450, 300, 20}));
		
		GristRegistry.addGristConversion(new ItemStack(huntingRifle), false, new GristSet(GristType.Build, 12));
		GristRegistry.addGristConversion(new ItemStack(harpoonGun), false, new GristSet(new GristType[] {GristType.Build, GristType.Rust, ArsenalGrist.Sandstone}, new int[] {55, 14, 12}));
		GristRegistry.addGristConversion(new ItemStack(girlsBestFriend), false, new GristSet(GristType.Diamond, 5500));
		GristRegistry.addGristConversion(new ItemStack(greenSunStreetSweeper), false, new GristSet(new GristType[] {GristType.Build, GristType.Uranium, ArsenalGrist.Opal}, new int[] {1000000, 1000, 1}));
		
		GristRegistry.addGristConversion(new ItemStack(ahabsCrosshairs), false, new GristSet(new GristType[] {GristType.Build, ArsenalGrist.StarSapphire}, new int[] {16777215, 1}));
		
		GristRegistry.addGristConversion(new ItemStack(powerHub), false, new GristSet(new GristType[] {GristType.Build, GristType.Uranium, ArsenalGrist.Iron, ArsenalGrist.Silicon}, new int[] {5000, 400, 10, 1}));
		GristRegistry.addGristConversion(new ItemStack(gristGatherer), false, new GristSet(new GristType[] {GristType.Build, GristType.Uranium, GristType.Mercury, ArsenalGrist.Titanium}, new int[] {8000, 1200, 2, 1}));
		
		GristRegistry.addGristConversion(new ItemStack(uniqueObject), false, new GristSet(new GristType[] {GristType.Amber, GristType.Amethyst, GristType.Artifact, GristType.Build, GristType.Caulk, GristType.Chalk, GristType.Cobalt, GristType.Diamond, GristType.Garnet, GristType.Gold, GristType.Iodine, GristType.Marble, GristType.Mercury, GristType.Quartz, GristType.Ruby, GristType.Rust, GristType.Shale, GristType.Sulfur, GristType.Tar, GristType.Uranium, GristType.Zillium, ArsenalGrist.Acid, ArsenalGrist.Aquamarine, ArsenalGrist.Blood, ArsenalGrist.Copper, ArsenalGrist.Emerald, ArsenalGrist.Flourite, ArsenalGrist.Frosting, ArsenalGrist.Iron, ArsenalGrist.Jet, ArsenalGrist.Lead, ArsenalGrist.Lux, ArsenalGrist.Malachite, ArsenalGrist.Meta, ArsenalGrist.Mist, ArsenalGrist.Moonstone, ArsenalGrist.Neon, ArsenalGrist.Nitrogen, ArsenalGrist.Obsidian, ArsenalGrist.Onyx, ArsenalGrist.Opal, ArsenalGrist.Permafrost, ArsenalGrist.Plasma, ArsenalGrist.Polychromite, ArsenalGrist.Rainbow, ArsenalGrist.Redstone, ArsenalGrist.RockCandy, ArsenalGrist.RoseQuartz, ArsenalGrist.Sandstone, ArsenalGrist.Silicon, ArsenalGrist.Silk, ArsenalGrist.Slime, ArsenalGrist.StarSapphire, ArsenalGrist.Sunstone, ArsenalGrist.Titanium, ArsenalGrist.Topaz, ArsenalGrist.Wood}, new int[] {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}));
		GristRegistry.addGristConversion(new ItemStack(kringlefucker), false, new GristSet(GristType.Artifact, -10000));
		
		GristRegistry.addGristConversion(new ItemStack(walletModus), false, new GristSet(new GristType[] {GristType.Build, GristType.Iodine, GristType.Shale}, new int[] {4000, 1300, 4130}));
		GristRegistry.addGristConversion(new ItemStack(moneyModus), false, new GristSet(new GristType[] {GristType.Build, GristType.Diamond}, new int[] {1000, 1}));
		GristRegistry.addGristConversion(new ItemStack(arrayModus), false, new GristSet(GristType.Build, 5000));
		
		//Alchemy Recipes MODE_OR
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.clawHammer), new ItemStack(magicCueball), MODE_OR, new ItemStack(mwrthwl));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.katana), new ItemStack(Items.PAPER), MODE_OR, new ItemStack(paperSword));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.blacksmithHammer), new ItemStack(Items.CLOCK), MODE_OR, new ItemStack(fearNoAnvil));
		CombinationRegistry.addCombination(new ItemStack(brokenRoyalDeringer), new ItemStack(magicCueball), MODE_OR, new ItemStack(caledfwlch));
		CombinationRegistry.addCombination(new ItemStack(hemeoreaper), new ItemStack(MinestuckItems.sbahjPoster), MODE_OR, new ItemStack(owTheEdge));
		//CombinationRegistry.addCombination(new ItemStack(MinestuckItems.homesSmellYaLater), new ItemStack(MinestuckItems.minestuckBucket, 1, 1), MODE_OR, new ItemStack(hemeoreaper));
		CombinationRegistry.addCombination(new ItemStack(knittingNeedles), new ItemStack(wizardStatue), MODE_OR, new ItemStack(needleWands));
		CombinationRegistry.addCombination(new ItemStack(Items.DYE, 1, 0), new ItemStack(paperSword), MODE_OR, new ItemStack(inkSquidProQuo));
		CombinationRegistry.addCombination(new ItemStack(Items.FISH), new ItemStack(inkSquidProQuo), MODE_OR, new ItemStack(licoriceFish));
		CombinationRegistry.addCombination(new ItemStack(brokenCaledfwlch), new ItemStack(fearNoAnvil), MODE_OR, new ItemStack(MinestuckItems.royalDeringer));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.pogoHammer), new ItemStack(clothesIron), MODE_OR, new ItemStack(wrinklefucker));
		CombinationRegistry.addCombination(new ItemStack(Items.BOOK), new ItemStack(crystalBall), MODE_OR, new ItemStack(MinestuckItems.grimoire));
		CombinationRegistry.addCombination(new ItemStack(Items.IRON_BOOTS), new ItemStack(Items.FIREWORKS), MODE_OR, new ItemStack(rocketShoes));
		CombinationRegistry.addCombination(new ItemStack(lipstickChainsaw), new ItemStack(trollHeadband), MODE_OR, new ItemStack(ragripper));
		CombinationRegistry.addCombination(new ItemStack(Items.LEATHER), new ItemStack(MinestuckItems.modusCard, 1, 5), MODE_OR, new ItemStack(walletModus));
		CombinationRegistry.addCombination(new ItemStack(Blocks.SAPLING), new ItemStack(MinestuckItems.sbahjPoster), MODE_OR, new ItemStack(kringlefucker));
		CombinationRegistry.addCombination(new ItemStack(woodenTrident), new ItemStack(Items.IRON_INGOT), MODE_OR, new ItemStack(silverTrident));
		CombinationRegistry.addCombination(new ItemStack(silverTrident), new ItemStack(Items.GOLD_INGOT), MODE_OR, new ItemStack(goldTrident));
		CombinationRegistry.addCombination(new ItemStack(Items.IRON_SWORD), new ItemStack(Items.FISHING_ROD), MODE_OR, new ItemStack(cutlass));
		CombinationRegistry.addCombination(new ItemStack(suitJacket), new ItemStack(Items.SLIME_BALL), MODE_OR, new ItemStack(slimeSuitJacket));
		CombinationRegistry.addCombination(new ItemStack(suitPants), new ItemStack(Items.SLIME_BALL), MODE_OR, new ItemStack(slimeSuitPants));
		CombinationRegistry.addCombination(new ItemStack(suitShoes), new ItemStack(Items.SLIME_BALL), MODE_OR, new ItemStack(slimeSuitShoes));
		CombinationRegistry.addCombination(new ItemStack(slimeSuitJacket), new ItemStack(wiseguyBook), MODE_OR, new ItemStack(wiseguySlimesuitJacket));
		CombinationRegistry.addCombination(new ItemStack(slimeSuitPants), new ItemStack(wiseguyBook), MODE_OR, new ItemStack(wiseguySlimesuitPants));
		CombinationRegistry.addCombination(new ItemStack(slimeSuitShoes), new ItemStack(wiseguyBook), MODE_OR, new ItemStack(wiseguySlimesuitShoes));
		CombinationRegistry.addCombination(new ItemStack(scalemate, 1, 1), new ItemStack(MinestuckItems.cane), MODE_OR, new ItemStack(MinestuckItems.dragonCane));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.ironCane), new ItemStack(MinestuckItems.rawUranium), MODE_OR, new ItemStack(radioactiveStaff));
		CombinationRegistry.addCombination(new ItemStack(keyblade), new ItemStack(magicEightBall), MODE_OR, new ItemStack(trueBlue));
		CombinationRegistry.addCombination(new ItemStack(lipstickChainsaw), new ItemStack(Blocks.RED_FLOWER), MODE_OR, new ItemStack(daintyDisembowler));
		CombinationRegistry.addCombination(new ItemStack(lipstickChainsaw), new ItemStack(Blocks.YELLOW_FLOWER), MODE_OR, new ItemStack(daintyDisembowler));
		CombinationRegistry.addCombination(new ItemStack(houseKey), new ItemStack(Items.CLOCK), MODE_OR, new ItemStack(chronolatch));
		CombinationRegistry.addCombination(new ItemStack(keyblade), new ItemStack(Items.SUGAR), MODE_OR, new ItemStack(candyKey));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.sledgeHammer), new ItemStack(sassacreText), MODE_OR, new ItemStack(MinestuckItems.telescopicSassacrusher));
		CombinationRegistry.addCombination(new ItemStack(Items.SADDLE), new ItemStack(Items.PAINTING), MODE_OR, new ItemStack(horseFootballPlayer));
		CombinationRegistry.addCombination(new ItemStack(Items.IRON_AXE), new ItemStack(Items.SHEARS), MODE_OR, new ItemStack(massDeduction));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.crewPoster), new ItemStack(Items.IRON_AXE), MODE_OR, new ItemStack(shadowAxe));
		CombinationRegistry.addCombination(new ItemStack(keyAxe), new ItemStack(Blocks.PACKED_ICE), MODE_OR, new ItemStack(stoneColdKeyAxe));
		CombinationRegistry.addCombination(new ItemStack(twirlingBaton), new ItemStack(MinestuckItems.crewPoster), MODE_OR, new ItemStack(nightstick));
		CombinationRegistry.addCombination(new ItemStack(conductorsBaton), new ItemStack(Items.BOAT), MODE_OR, new ItemStack(windwaker));
		CombinationRegistry.addCombination(new ItemStack(yaldabaothsKeyton), new ItemStack(magicCueball), MODE_OR, new ItemStack(allweddol));
		CombinationRegistry.addCombination(new ItemStack(beretta), new ItemStack(Items.GOLD_INGOT), MODE_OR, new ItemStack(goldBeretta));
		CombinationRegistry.addCombination(new ItemStack(blackStaff), new ItemStack(Items.GOLD_INGOT), MODE_OR, new ItemStack(goldStaff));
		CombinationRegistry.addCombination(new ItemStack(gunblade), new ItemStack(blueEctoSlime), MODE_OR, new ItemStack(gunOfSouls));
		CombinationRegistry.addCombination(new ItemStack(huntingRifle), new ItemStack(Items.ARROW), MODE_OR, new ItemStack(harpoonGun));
		CombinationRegistry.addCombination(new ItemStack(harpoonGun), new ItemStack(seahorseIdol), MODE_OR, new ItemStack(ahabsCrosshairs));
		CombinationRegistry.addCombination(new ItemStack(Blocks.HOPPER), new ItemStack(MinestuckItems.energyCore), MODE_OR, new ItemStack(gristGatherer));
		
		//Alchemy Recipes MODE_AND
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.candy, 1, 4), new ItemStack(blueEctoSlime), MODE_AND, new ItemStack(phlegmGushers));
		CombinationRegistry.addCombination(new ItemStack(inkSquidProQuo), new ItemStack(phlegmGushers), MODE_AND, new ItemStack(sorrowGushers));
		CombinationRegistry.addCombination(new ItemStack(needleWands), new ItemStack(MinestuckItems.grimoire), MODE_AND, new ItemStack(thornsOfOglogoth));
		CombinationRegistry.addCombination(new ItemStack(Items.LEAD), new ItemStack(Items.STRING),MODE_AND, new ItemStack(MinestuckArsenalItems.leatherWhip));
		CombinationRegistry.addCombination(new ItemStack(hostPlush), new ItemStack(joustingLance), MODE_AND, new ItemStack(fiduspawnLance));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.candy, 1, 4), new ItemStack(barbasol), MODE_AND, new ItemStack(barbasolBomb));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.threshDvd), new ItemStack(MinestuckItems.candy, 1, 0), MODE_AND, new ItemStack(trollHeadband));
		CombinationRegistry.addCombination(new ItemStack(blueEctoSlime), new ItemStack(Items.COOKIE), MODE_AND, new ItemStack(ectoCookie));
		CombinationRegistry.addCombination(new ItemStack(blueEctoSlime), new ItemStack(Items.BREAD), MODE_AND, new ItemStack(ectoLoaf));
		CombinationRegistry.addCombination(new ItemStack(blueEctoSlime), new ItemStack(Items.COOKED_BEEF), MODE_AND, new ItemStack(ectoSteak));
		CombinationRegistry.addCombination(new ItemStack(Items.SLIME_BALL), new ItemStack(Items.CAKE), MODE_AND, new ItemStack(soporSlime));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.candy, 1, 0), new ItemStack(Items.BOOK), MODE_AND, new ItemStack(trollRomance));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.dice), new ItemStack(Items.BOOK), MODE_AND, new ItemStack(flarpManual));
		CombinationRegistry.addCombination(new ItemStack(MinestuckBlocks.blockComputerOff), new ItemStack(Items.BOOK), MODE_AND, new ItemStack(athManual));
		CombinationRegistry.addCombination(new ItemStack(Items.GLASS_BOTTLE), new ItemStack(Items.APPLE), MODE_AND, new ItemStack(appleJuice));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.cane), new ItemStack(Items.COMPASS), MODE_AND, new ItemStack(blindmansDirections));
		CombinationRegistry.addCombination(new ItemStack(lipstickChainsaw), new ItemStack(MinestuckItems.katana), MODE_AND, new ItemStack(chainsawKatana));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.cane), new ItemStack(Items.SLIME_BALL), MODE_AND, new ItemStack(pogoCane));
		CombinationRegistry.addCombination(new ItemStack(Items.SLIME_BALL), new ItemStack(Items.LEATHER_BOOTS), MODE_AND, new ItemStack(slimeShoes));
		CombinationRegistry.addCombination(new ItemStack(goldTrident), new ItemStack(cuttlefish), MODE_AND, new ItemStack(poseidonsEntente));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.catClaws), new ItemStack(trollRomance), MODE_AND, new ItemStack(nepetaClaws));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.catClaws), new ItemStack(Items.DIAMOND), MODE_AND, new ItemStack(blueClaws));
		CombinationRegistry.addCombination(new ItemStack(crystalBall), new ItemStack(jadeGlasses), MODE_AND, new ItemStack(soothSpecs));
		CombinationRegistry.addCombination(new ItemStack(daveGlasses), new ItemStack(MinestuckItems.katana), MODE_AND, new ItemStack(dirkShades));
		CombinationRegistry.addCombination(new ItemStack(Items.WOODEN_AXE), new ItemStack(sbahjPoster), MODE_AND, new ItemStack(aks));
		CombinationRegistry.addCombination(new ItemStack(Items.STONE_AXE), new ItemStack(sbahjPoster), MODE_AND, new ItemStack(aks));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.modusCard, 1, 0), new ItemStack(Blocks.HOPPER), MODE_AND, new ItemStack(arrayModus));
		CombinationRegistry.addCombination(new ItemStack(barbasol), new ItemStack(MinestuckItems.sledgeHammer), MODE_AND, new ItemStack(barberBasher));
		CombinationRegistry.addCombination(new ItemStack(Items.IRON_SWORD), new ItemStack(MinestuckItems.cane), MODE_AND, new ItemStack(bladedCane));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.beverage, 1, 9), new ItemStack(blueEctoSlime), MODE_AND, new ItemStack(faygoEcto));
		//CombinationRegistry.addCombination(new ItemStack(MinestuckItems.cane), new ItemStack(chessboard), MODE_AND, new ItemStack(regicane));
		CombinationRegistry.addCombination(new ItemStack(magicEightBall), new ItemStack(MinestuckItems.sickle), MODE_AND, new ItemStack(eightballScythe));
		CombinationRegistry.addCombination(new ItemStack(Items.BLAZE_ROD), new ItemStack(MinestuckItems.cane), MODE_AND, new ItemStack(blazingGlory));
		CombinationRegistry.addCombination(new ItemStack(Blocks.DOUBLE_PLANT, 1, 4), new ItemStack(MinestuckItems.sickle), MODE_AND, new ItemStack(thornySubject));
		CombinationRegistry.addCombination(new ItemStack(MinestuckBlocks.crockerMachine), new ItemStack(Items.IRON_PICKAXE), MODE_AND, new ItemStack(mineNGrist));
		CombinationRegistry.addCombination(new ItemStack(houseKey), new ItemStack(Items.IRON_SWORD), MODE_AND, new ItemStack(keyblade));
		CombinationRegistry.addCombination(new ItemStack(keyblade), new ItemStack(celestialFulcrum), MODE_AND, new ItemStack(yaldabaothsKeyton));
		CombinationRegistry.addCombination(new ItemStack(lipstickChainsaw), new ItemStack(MinestuckItems.rawUranium), MODE_AND, new ItemStack(uraniumChainsaw));
		CombinationRegistry.addCombination(new ItemStack(keyblade), new ItemStack(fearNoAnvil), MODE_AND, new ItemStack(chronolatch));
		CombinationRegistry.addCombination(new ItemStack(Items.IRON_SWORD), new ItemStack(MinestuckItems.candy, 1, 0), MODE_AND, new ItemStack(candySword));
		CombinationRegistry.addCombination(new ItemStack(Items.IRON_AXE), new ItemStack(MinestuckItems.candy, 1, 0), MODE_AND, new ItemStack(candyAxe));
		CombinationRegistry.addCombination(new ItemStack(keyblade), new ItemStack(Items.IRON_AXE), MODE_AND, new ItemStack(keyAxe));
		CombinationRegistry.addCombination(new ItemStack(conductorsBaton), new ItemStack(MinestuckItems.rawUranium), MODE_AND, new ItemStack(uraniumBaton));
		CombinationRegistry.addCombination(new ItemStack(windwaker), new ItemStack(crystalBall), MODE_AND, new ItemStack(celestialFulcrum));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.crewPoster), new ItemStack(huntingRifle), MODE_AND, new ItemStack(girlsBestFriend));
		CombinationRegistry.addCombination(new ItemStack(girlsBestFriend), new ItemStack(MinestuckItems.energyCore), MODE_AND, new ItemStack(greenSunStreetSweeper));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.cane), new ItemStack(huntingRifle), MODE_AND, new ItemStack(blackStaff));
		CombinationRegistry.addCombination(new ItemStack(beretta), new ItemStack(Items.IRON_SWORD), MODE_AND, new ItemStack(gunblade));
		CombinationRegistry.addCombination(new ItemStack(wizardStatue), new ItemStack(Items.FISH), MODE_AND, new ItemStack(seahorseIdol));
		CombinationRegistry.addCombination(new ItemStack(MinestuckBlocks.uraniumCooker), new ItemStack(MinestuckBlocks.blockComputerOff), MODE_AND, new ItemStack(powerHub));
	}
	
	public static void registerVanillaRecipes() 
	{
	
		GristRegistry.addGristConversion(Blocks.OBSIDIAN, new GristSet(ArsenalGrist.Obsidian, 1));
		GristRegistry.addGristConversion(Blocks.ICE, new GristSet(new GristType[] {ArsenalGrist.Permafrost, ArsenalGrist.Mist}, new int[] {1, 1}));
		GristRegistry.addGristConversion(Blocks.PACKED_ICE, new GristSet(new GristType[] {GristType.Build, ArsenalGrist.Permafrost, ArsenalGrist.Mist}, new int[] {8, 2, 2}));
		GristRegistry.addGristConversion(Blocks.IRON_ORE, new GristSet(new GristType[] {GristType.Build, ArsenalGrist.Iron}, new int[] {2, 15}));
		GristRegistry.addGristConversion(Blocks.EMERALD_ORE, new GristSet(new GristType[] {GristType.Build, ArsenalGrist.Emerald}, new int[] {2, 12}));
		GristRegistry.addGristConversion(Blocks.IRON_BLOCK, new GristSet(ArsenalGrist.Iron, 135));
		GristRegistry.addGristConversion(Blocks.EMERALD_BLOCK, new GristSet(ArsenalGrist.Emerald, 108));
		GristRegistry.addGristConversion(new ItemStack(Items.CAKE), new GristSet(new GristType[] {GristType.Iodine, ArsenalGrist.Frosting, ArsenalGrist.RockCandy, GristType.Chalk}, new int[] {12, 14, 8, 4}));
		
		GristRegistry.addGristConversion(new ItemStack(Items.SUGAR), new GristSet(new GristType[] {GristType.Iodine, ArsenalGrist.Frosting, ArsenalGrist.RockCandy}, new int[] {1, 1, 1}));
		GristRegistry.addGristConversion(new ItemStack(Items.SLIME_BALL), new GristSet(ArsenalGrist.Slime, 1));
		GristRegistry.addGristConversion(new ItemStack(Items.MAGMA_CREAM), new GristSet(new GristType[] {ArsenalGrist.Slime, GristType.Amber, GristType.Ruby}, new int[] {4, 2, 1}));
		GristRegistry.addGristConversion(new ItemStack(Items.REDSTONE), new GristSet(ArsenalGrist.Redstone, 2));
		GristRegistry.addGristConversion(new ItemStack(Items.IRON_INGOT), new GristSet(ArsenalGrist.Iron, 15));
		GristRegistry.addGristConversion(new ItemStack(Items.IRON_NUGGET), new GristSet(ArsenalGrist.Iron, 2));
		GristRegistry.addGristConversion(new ItemStack(Items.EMERALD), new GristSet(ArsenalGrist.Emerald, 12));
		GristRegistry.addGristConversion(new ItemStack(Items.PAPER), new GristSet(ArsenalGrist.Wood, 2));
		
		//Ore Dictionary
		OreDictionary.registerOre("plankWood", MinestuckBlocks.glowingPlanks);
		OreDictionary.registerOre("logWood", MinestuckBlocks.glowingLog);
		OreDictionary.registerOre("logWood", new ItemStack(MinestuckBlocks.log, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("dirt", new ItemStack(MinestuckBlocks.coloredDirt, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("slimeball", MinestuckArsenalItems.blueEctoSlime);
		OreDictionary.registerOre("ingotUranium", MinestuckItems.rawUranium);
		
		
	}
	public static void registerModRecipes() 
	{
		
		GristRegistry.addGristConversion("ingotCopper", new GristSet(ArsenalGrist.Copper, 15));
		GristRegistry.addGristConversion("oreCopper", new GristSet(new GristType[] {GristType.Build, ArsenalGrist.Copper}, new int[] {2, 15}));
		GristRegistry.addGristConversion("ingotLead", new GristSet(ArsenalGrist.Lead, 15));
		GristRegistry.addGristConversion("oreLead", new GristSet(new GristType[] {GristType.Build, ArsenalGrist.Lead}, new int[] {2, 15}));
		GristRegistry.addGristConversion("gemTopaz", new GristSet(ArsenalGrist.Topaz, 10));
		GristRegistry.addGristConversion("itemSilicon", new GristSet(ArsenalGrist.Silicon, 2));
		GristRegistry.addGristConversion("ingotOsmium", new GristSet(new GristType[] {ArsenalGrist.Iron, ArsenalGrist.Redstone}, new int[] {8, 7}));
		GristRegistry.addGristConversion("dustOsmium", new GristSet(new GristType[] {ArsenalGrist.Iron, ArsenalGrist.Redstone}, new int[] {8, 7}));
		GristRegistry.addGristConversion("ingotBronze", new GristSet(new GristType[] {ArsenalGrist.Copper, ArsenalGrist.Iron, GristType.Caulk}, new int[] {15, 8, 14}));
		GristRegistry.addGristConversion("ingotSteel", new GristSet(new GristType[] {ArsenalGrist.Iron, GristType.Shale}, new int[] {13, 6}));
		GristRegistry.addGristConversion("ingotRefinedObsidian", new GristSet(new GristType[] {ArsenalGrist.Obsidian, GristType.Diamond}, new int[] {15, 15}));
		GristRegistry.addGristConversion("alloyAdvanced", new GristSet(new GristType[] {ArsenalGrist.Iron, ArsenalGrist.Redstone}, new int[] {14, 12}));
		GristRegistry.addGristConversion("alloyElite", new GristSet(new GristType[] {ArsenalGrist.Iron, ArsenalGrist.Redstone, GristType.Diamond}, new int[] {14, 12, 15}));
		GristRegistry.addGristConversion("alloyUltimate", new GristSet(new GristType[] {ArsenalGrist.Iron, ArsenalGrist.Redstone, GristType.Diamond, ArsenalGrist.Obsidian}, new int[] {14, 12, 30, 15}));
		GristRegistry.addGristConversion("circuitBasic", new GristSet(new GristType[] {ArsenalGrist.Iron, ArsenalGrist.Redstone}, new int[] {15, 30}));
		GristRegistry.addGristConversion("circuitAdvanced", new GristSet(new GristType[] {ArsenalGrist.Iron, ArsenalGrist.Redstone}, new int[] {30, 45}));
		GristRegistry.addGristConversion("circuitElite", new GristSet(new GristType[] {ArsenalGrist.Iron, ArsenalGrist.Redstone, GristType.Diamond}, new int[] {30, 45, 30}));
		GristRegistry.addGristConversion("circuitUltimate", new GristSet(new GristType[] {ArsenalGrist.Iron, ArsenalGrist.Redstone, GristType.Diamond, ArsenalGrist.Obsidian}, new int[] {30, 45, 46, 30}));
		GristRegistry.addGristConversion("itemCompressedCarbon", new GristSet(new GristType[] {ArsenalGrist.Jet, GristType.Shale}, new int[] {13, 14}));
		GristRegistry.addGristConversion("itemCompressedRedstone", new GristSet(ArsenalGrist.Redstone, 25));
		GristRegistry.addGristConversion("itemCompressedDiamond", new GristSet(GristType.Diamond, 27));
		GristRegistry.addGristConversion("itemCompressedObsidian", new GristSet(ArsenalGrist.Obsidian, 26));
		GristRegistry.addGristConversion("dustRefinedObsidian", new GristSet(new GristType[] {ArsenalGrist.Obsidian, GristType.Diamond}, new int[] {15, 15}));
		GristRegistry.addGristConversion("dustDraconium", new GristSet(new GristType[] {ArsenalGrist.Titanium, GristType.Uranium, ArsenalGrist.Blood}, new int[] {15, 15, 3}));
		GristRegistry.addGristConversion("ingotDraconium", new GristSet(new GristType[] {ArsenalGrist.Titanium, GristType.Uranium, ArsenalGrist.Blood}, new int[] {15, 15, 3}));
		GristRegistry.addGristConversion("blockDraconium", new GristSet(new GristType[] {ArsenalGrist.Titanium, GristType.Uranium, ArsenalGrist.Blood}, new int[] {135, 135, 27}));
		GristRegistry.addGristConversion("ingotDraconiumAwakened", new GristSet(new GristType[] {ArsenalGrist.Blood, GristType.Uranium, ArsenalGrist.Onyx, ArsenalGrist.Titanium}, new int[] {550, 500, 40, 20}));
		GristRegistry.addGristConversion("blockDraconiumAwakened", new GristSet(new GristType[] {ArsenalGrist.Blood, GristType.Uranium, ArsenalGrist.Onyx, ArsenalGrist.Titanium, GristType.Zillium}, new int[] {5000, 4500, 350, 150, 1}));
		GristRegistry.addGristConversion("essenceInferium", new GristSet(GristType.Build, 15));
		GristRegistry.addGristConversion("eseencePrudentium", new GristSet(GristType.Build, 60));
		GristRegistry.addGristConversion("essenceIntermedium", new GristSet(GristType.Build, 240));
		GristRegistry.addGristConversion("essenceSuperium", new GristSet(GristType.Build, 960));
		GristRegistry.addGristConversion("essenceSupremium", new GristSet(GristType.Build, 3840));
		GristRegistry.addGristConversion("essenceInsanium", new GristSet(GristType.Build, 15360));
		GristRegistry.addGristConversion("blockInferiumEssence", new GristSet(GristType.Build, 135));
		GristRegistry.addGristConversion("blockPrudentiumEssence", new GristSet(GristType.Build, 540));
		GristRegistry.addGristConversion("blockIntermediumEssence", new GristSet(GristType.Build, 2160));
		GristRegistry.addGristConversion("blockSuperiumEssence", new GristSet(GristType.Build, 8640));
		GristRegistry.addGristConversion("blockSupremiumEssence", new GristSet(GristType.Build, 34560));
		GristRegistry.addGristConversion("blockInsaniumEssence", new GristSet(GristType.Build, 183240));
		GristRegistry.addGristConversion("ingotManasteel", new GristSet(new GristType[] {GristType.Build, ArsenalGrist.Iron}, new int[] {10, 15}));
		GristRegistry.addGristConversion("manaDiamond", new GristSet(new GristType[] {GristType.Build, GristType.Diamond}, new int[] {10, 18}));
		GristRegistry.addGristConversion("manaPearl", new GristSet(new GristType[] {GristType.Build, GristType.Diamond, GristType.Mercury, GristType.Uranium}, new int[] {10, 5, 8, 13}));
		GristRegistry.addGristConversion("ingotTerrasteel", new GristSet(new GristType[] {GristType.Build, GristType.Diamond, GristType.Mercury, GristType.Uranium, ArsenalGrist.Iron}, new int[] {100, 23, 8, 13, 15}));
		GristRegistry.addGristConversion("ingotElvenElementium", new GristSet(new GristType[] {GristType.Build, ArsenalGrist.Iron}, new int[] {100, 15}));
		GristRegistry.addGristConversion("eternalLifeEssence", new GristSet(new GristType[] {GristType.Build, ArsenalGrist.Wood, ArsenalGrist.Meta}, new int[] {1000, 400, 2}));
		GristRegistry.addGristConversion("elvenPixieDust", new GristSet(new GristType[] {GristType.Build, GristType.Diamond, GristType.Mercury, GristType.Uranium}, new int[] {100, 5, 8, 13}));
		GristRegistry.addGristConversion("elvenDragonstone", new GristSet(new GristType[] {GristType.Build, GristType.Diamond}, new int[] {100, 18}));
		GristRegistry.addGristConversion("livingrock", new GristSet(GristType.Build, 2));
		GristRegistry.addGristConversion("livingwood", new GristSet(GristType.Build, 2));
		GristRegistry.addGristConversion("stoneBasalt", new GristSet(GristType.Build, 2));
		GristRegistry.addGristConversion("stoneMarble", new GristSet(GristType.Build, 2));
		
		
		
		//Rosette Compat
		Item moonstone = Item.REGISTRY.getObject(new ResourceLocation("rosette", "moonstone"));
		if(moonstone != null)
		{
			GristRegistry.addGristConversion(new ItemStack(moonstone), new GristSet(ArsenalGrist.Moonstone, 12));
		}
		
		Item hematite = Item.REGISTRY.getObject(new ResourceLocation("rosette", "hematite"));
		if(hematite != null)
		{
			GristRegistry.addGristConversion(new ItemStack(hematite), new GristSet(ArsenalGrist.Blood, 12));
		}
		
		Item roseQuartz = Item.REGISTRY.getObject(new ResourceLocation("rosette", "rose_quartz"));
		if(roseQuartz != null)
		{
			GristRegistry.addGristConversion(new ItemStack(roseQuartz), new GristSet(new GristType[] {GristType.Build, ArsenalGrist.Lux}, new int[] {4, 2}));
		}
		
		Item malachite = Item.REGISTRY.getObject(new ResourceLocation("rosette", "malachite"));
		if(malachite != null)
		{
			GristRegistry.addGristConversion(new ItemStack(malachite), new GristSet(ArsenalGrist.Malachite, 8));
		}
		
		
		
		
		//Tinker's Construct Compat
		Item searedBrick = Item.REGISTRY.getObject(new ResourceLocation("tconstruct", "seared_brick"));
		if(searedBrick != null)
		{
			GristRegistry.addGristConversion(new ItemStack(searedBrick), new GristSet(GristType.Build, 1));
		}
		
		
	}
}
