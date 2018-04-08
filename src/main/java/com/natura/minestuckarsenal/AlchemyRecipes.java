package com.natura.minestuckarsenal;

import com.mraof.minestuck.block.MinestuckBlocks;
import com.mraof.minestuck.item.MinestuckItems;
import com.mraof.minestuck.util.CombinationRegistry;
import com.mraof.minestuck.util.GristRegistry;
import com.mraof.minestuck.util.GristSet;
import com.mraof.minestuck.util.GristType;
import com.natura.minestuckarsenal.item.MinestuckArsenalItems;
import static com.natura.minestuckarsenal.item.MinestuckArsenalItems.*;
import static com.mraof.minestuck.item.MinestuckItems.chessboard;
import static com.mraof.minestuck.item.MinestuckItems.katana;
import static com.mraof.minestuck.item.MinestuckItems.regisword;
import static com.mraof.minestuck.item.MinestuckItems.sbahjPoster;
import static com.mraof.minestuck.item.MinestuckItems.sord;
import static com.mraof.minestuck.util.CombinationRegistry.MODE_AND;
import static com.mraof.minestuck.util.CombinationRegistry.MODE_OR;
import static com.natura.minestuckarsenal.block.MinestuckArsenalBlocks.*;

import com.ibm.icu.text.Normalizer.Mode;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class AlchemyRecipes {

	public static void registerMinestuckRecipes() {
		//Grist Registries
		
		//Minestuck Items
		GristRegistry.addGristConversion(new ItemStack(MinestuckItems.fearNoAnvil), new GristSet(GristType.Zillium, 50000));
		GristRegistry.addGristConversion(new ItemStack(MinestuckItems.royalDeringer), false, new GristSet(new GristType[] {GristType.Build, GristType.Gold, GristType.Diamond}, new int[] {6000, 1000, 1300}));
		GristRegistry.addGristConversion(new ItemStack(MinestuckItems.scarletRibbitar), false, new GristSet(new GristType[] {GristType.Build, GristType.Ruby, GristType.Quartz}, new int[] {100000, 40000, 20000}));
		GristRegistry.addGristConversion(new ItemStack(MinestuckItems.zillyhooHammer), false, new GristSet(GristType.Zillium, 1000000000));
		GristRegistry.addGristConversion(new ItemStack(MinestuckItems.telescopicSassacrusher), false, new GristSet(new GristType[] {GristType.Shale, GristType.Tar, GristType.Mercury}, new int[] {250, 10, 50}));
		
		//Minestuck Arsenal Items
		GristRegistry.addGristConversion(new ItemStack(paperSword), false, new GristSet(new GristType[] {GristType.Build, GristType.Tar}, new int[] {12, 8}));	
		GristRegistry.addGristConversion(new ItemStack(caledfwlch), false, new GristSet(new GristType[] {GristType.Build, GristType.Gold, GristType.Diamond}, new int[] {14000, 8000, 4000}));
		GristRegistry.addGristConversion(new ItemStack(chainsawKatana), false, new GristSet(new GristType[] {GristType.Build, GristType.Amber, GristType.Tar, GristType.Rust}, new int[] {40000, 2000, 6000, 1000}));
		GristRegistry.addGristConversion(new ItemStack(cutlass), false, new GristSet(new GristType[] {GristType.Build, GristType.Cobalt, GristType.Rust}, new int[] {26, 17, 45}));
		
		GristRegistry.addGristConversion(new ItemStack(brokenCaledfwlch), new GristSet(new GristType[] {GristType.Build, GristType.Gold, GristType.Diamond}, new int[] {7000, 4000, 2000}));
		GristRegistry.addGristConversion(new ItemStack(brokenRoyalDeringer), new GristSet(new GristType[] {GristType.Build, GristType.Gold, GristType.Diamond}, new int[] {3000, 500, 650}));
		GristRegistry.addGristConversion(new ItemStack(brokenNinjaSword), new GristSet(new GristType[] {GristType.Chalk, GristType.Quartz, GristType.Rust}, new int[] {6, 5, 3}));
		GristRegistry.addGristConversion(new ItemStack(brokenScarletRibbitar), new GristSet(new GristType[] {GristType.Build, GristType.Ruby, GristType.Quartz}, new int[] {50000, 200000, 10000}));
		
		GristRegistry.addGristConversion(new ItemStack(wrinklefucker), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale, GristType.Tar}, new int[] {55, 44, 66}));
		GristRegistry.addGristConversion(new ItemStack(barberBasher), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale, GristType.Chalk}, new int[] {360, 800, 600}));
		GristRegistry.addGristConversion(new ItemStack(fearNoAnvil), false, new GristSet(new GristType[] {GristType.Build, GristType.Garnet, GristType.Diamond, GristType.Gold, GristType.Quartz}, new int[] {5000, 5000, 5000, 5000, 1}));
		GristRegistry.addGristConversion(new ItemStack(mwrthwl), false, new GristSet(new GristType[] {GristType.Build, GristType.Chalk, GristType.Uranium, GristType.Diamond}, new int[] {10000, 5000, 6000, 1}));
		
		GristRegistry.addGristConversion(new ItemStack(thornySubject), false, new GristSet(new GristType[] {GristType.Build, GristType.Amethyst, GristType.Ruby}, new int[] {3500, 200, 1}));
		GristRegistry.addGristConversion(new ItemStack(babysFirstThresher), false, new GristSet(new GristType[] {GristType.Rust, GristType.Garnet, GristType.Caulk}, new int[] {34, 21, 15}));
		GristRegistry.addGristConversion(new ItemStack(hemeoreaper), false, new GristSet(new GristType[] {GristType.Build, GristType.Rust, GristType.Garnet, GristType.Iodine}, new int[] {250, 85, 75, 24}));
		GristRegistry.addGristConversion(new ItemStack(prospitReaper), false, new GristSet(new GristType[] {GristType.Build, GristType.Amber, GristType.Diamond}, new int[] {18, 22, 1}));
		GristRegistry.addGristConversion(new ItemStack(derseReaper), false, new GristSet(new GristType[] {GristType.Build, GristType.Tar, GristType.Diamond}, new int[] {18, 22, 1}));
		GristRegistry.addGristConversion(new ItemStack(owTheEdge), false, new GristSet(GristType.Artifact, -25));
		
		GristRegistry.addGristConversion(new ItemStack(knittingNeedles), false, new GristSet(GristType.Build, 8));
		GristRegistry.addGristConversion(new ItemStack(needleWands), false, new GristSet(new GristType[] {GristType.Diamond, GristType.Chalk, GristType.Garnet, GristType.Gold}, new int[] {1000, 2000, 3000, 500}));
		GristRegistry.addGristConversion(new ItemStack(thornsOfOglogoth), false, new GristSet(new GristType[] {GristType.Iodine, GristType.Chalk, GristType.Amethyst, GristType.Gold, GristType.Tar}, new int[] {6000, 5000, 4000, 3000, 666}));
		GristRegistry.addGristConversion(new ItemStack(quillsOfEchidna), false, new GristSet(new GristType[] {GristType.Build, GristType.Chalk, GristType.Amethyst, GristType.Gold, GristType.Diamond}, new int[] {500000, 500000, 500000, 500000, 1}));
		
		GristRegistry.addGristConversion(new ItemStack(joustingLance), false, new GristSet(GristType.Build, 15));
		GristRegistry.addGristConversion(new ItemStack(fiduspawnLance), false, new GristSet(new GristType[] {GristType.Build, GristType.Tar, GristType.Shale}, new int[] {30, 22, 16}));
		GristRegistry.addGristConversion(new ItemStack(cigaretteHolderLance), false, new GristSet(new GristType[] {GristType.Shale, GristType.Tar, GristType.Diamond}, new int[] {44, 65, 1}));
		GristRegistry.addGristConversion(new ItemStack(rocketPopLance), false, new GristSet(new GristType[] {GristType.Ruby, GristType.Cobalt, GristType.Chalk}, new int[] {34, 25, 27}));
		
		GristRegistry.addGristConversion(new ItemStack(lipstickChainsaw), false, new GristSet(new GristType[] {GristType.Build, GristType.Marble, GristType.Shale}, new int[] {24, 18, 32}));
		GristRegistry.addGristConversion(new ItemStack(ragripper), false, new GristSet(new GristType[] {GristType.Build, GristType.Amber, GristType.Chalk, GristType.Garnet, GristType.Diamond}, new int[] {10000, 6000, 4500, 8000, 1}));
		
		GristRegistry.addGristConversion(new ItemStack(leatherWhip), false, new GristSet(GristType.Build, 12));
		
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
		
		GristRegistry.addGristConversion(new ItemStack(eightballScythe), false, new GristSet(GristType.Cobalt, 8888));
		
		GristRegistry.addGristConversion(new ItemStack(houseKey), false, new GristSet(new GristType[] {GristType.Rust, GristType.Build}, new int[] {12, 16}));
		GristRegistry.addGristConversion(new ItemStack(keyblade), false, new GristSet(new GristType[] {GristType.Rust, GristType.Amber, GristType.Diamond}, new int[] {400, 250, 1}));
		GristRegistry.addGristConversion(new ItemStack(trueBlue), false, new GristSet(new GristType[] {GristType.Cobalt, GristType.Build, ArsenalGrist.Aquamarine}, new int[] {8888, 8000, 1}));
		GristRegistry.addGristConversion(new ItemStack(yaldabaothsKeyton), false, new GristSet(new GristType[] {GristType.Rust, GristType.Ruby, ArsenalGrist.Blood, ArsenalGrist.Neon, GristType.Diamond}, new int[] {40000, 10000, 60000, 500, 1}));
		
		GristRegistry.addGristConversion(new ItemStack(mineNGrist), false, new GristSet(new GristType[] {ArsenalGrist.Blood, ArsenalGrist.Frosting, ArsenalGrist.Iron, GristType.Chalk}, new int[] {5000, 6500, 4000, 2500, 1}));
		
		GristRegistry.addGristConversion(new ItemStack(magicEightBall), false, new GristSet(GristType.Cobalt, 8));
		GristRegistry.addGristConversion(new ItemStack(crystalBall), false, new GristSet(GristType.Amethyst, 22));
		GristRegistry.addGristConversion(new ItemStack(magicCueball), false, new GristSet(new GristType[] {GristType.Build, GristType.Chalk, GristType.Uranium, GristType.Diamond}, new int[] {4000, 1300, 6000, 1200}));
		GristRegistry.addGristConversion(new ItemStack(clothesIron), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale, GristType.Rust}, new int[] {1, 1, 1}));
		GristRegistry.addGristConversion(new ItemStack(fridgeMagnet), false, new GristSet(GristType.Build, 1));
		GristRegistry.addGristConversion(new ItemStack(wizardStatue), false, new GristSet(new GristType[] {GristType.Build, GristType.Diamond}, new int[] {8, 1}));
		GristRegistry.addGristConversion(new ItemStack(grimoire), false, new GristSet(new GristType[] {GristType.Build, GristType.Amethyst}, new int[] {20, 15}));
		GristRegistry.addGristConversion(new ItemStack(flarpManual), false, new GristSet(new GristType[] {GristType.Build, GristType.Diamond}, new int[] {10, 1}));
		GristRegistry.addGristConversion(new ItemStack(athManual), false, new GristSet(GristType.Build, 8));
		GristRegistry.addGristConversion(new ItemStack(trollRomance), false, new GristSet(new GristType[] {GristType.Build, GristType.Chalk, GristType.Iodine, GristType.Sulfur}, new int[] {10, 1, 1, 1}));
		GristRegistry.addGristConversion(new ItemStack(hostPlush), false, new GristSet(GristType.Build, 5));
		GristRegistry.addGristConversion(new ItemStack(barbasol), false, new GristSet(GristType.Build, 1));
		GristRegistry.addGristConversion(new ItemStack(inkSquidProQuo), false, new GristSet(GristType.Tar, 50));
		GristRegistry.addGristConversion(new ItemStack(blueEctoSlime), false, new GristSet(GristType.Build, 1));
		
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
		
		GristRegistry.addGristConversion(new ItemStack(appleJuice), false, new GristSet(GristType.Build, 14));
		
		GristRegistry.addGristConversion(new ItemStack(captcharoidCamera), false, new GristSet(new GristType[] {GristType.Build, GristType.Mercury, GristType.Gold, GristType.Marble, GristType.Shale, GristType.Caulk}, new int[] {5000, 500, 500, 500, 500, 500}));
		GristRegistry.addGristConversion(new ItemStack(sbahjifier), false, new GristSet(GristType.Artifact, -1000));
		
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
		
		GristRegistry.addGristConversion(new ItemStack(huntingRifle), false, new GristSet(GristType.Build, 12));
		GristRegistry.addGristConversion(new ItemStack(girlsBestFriend), false, new GristSet(GristType.Diamond, 500500));
		GristRegistry.addGristConversion(new ItemStack(greenSunStreetSweeper), false, new GristSet(new GristType[] {GristType.Build, GristType.Uranium}, new int[] {1000000, 1000}));
		
		GristRegistry.addGristConversion(new ItemStack(ahabsCrosshairs), false, new GristSet(new GristType[] {GristType.Build, GristType.Diamond}, new int[] {16777215, 1}));
		
		//GristRegistry.addGristConversion(new ItemStack(uniqueObject), false, new GristSet(new GristType[] {GristType.Amber, GristType.Amethyst, GristType.Artifact, GristType.Build, GristType.Caulk, GristType.Chalk, GristType.Cobalt, GristType.Diamond, GristType.Garnet, GristType.Gold, GristType.Iodine, GristType.Marble, GristType.Mercury, GristType.Quartz, GristType.Ruby, GristType.Rust, GristType.Shale, GristType.Sulfur, GristType.Tar, GristType.Uranium, GristType.Zillium, ArsenalGrist.Acid, ArsenalGrist.Aquamarine, ArsenalGrist.Blood, ArsenalGrist.Copper, ArsenalGrist.Copper, ArsenalGrist.Emerald, ArsenalGrist.Flourite, ArsenalGrist.Frosting, ArsenalGrist.Iron, ArsenalGrist.Jet, ArsenalGrist.Lead, ArsenalGrist.Lux, ArsenalGrist.Malachite, ArsenalGrist.Meta, ArsenalGrist.Mist, ArsenalGrist.Moonstone, ArsenalGrist.Neon, ArsenalGrist.Nitrogen, ArsenalGrist.Obsidian, ArsenalGrist.Onyx, ArsenalGrist.Opal, ArsenalGrist.Permafrost, ArsenalGrist.Plasma, ArsenalGrist.Polychromite, ArsenalGrist.Rainbow, ArsenalGrist.Redstone, ArsenalGrist.RockCandy, ArsenalGrist.RoseQuartz, ArsenalGrist.Sandstone, ArsenalGrist.Silicon, ArsenalGrist.Silk, ArsenalGrist.Slime, ArsenalGrist.StarSapphire, ArsenalGrist.Sunstone, ArsenalGrist.Titanium, ArsenalGrist.Topaz, ArsenalGrist.Wood}, new int[] {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}));
		GristRegistry.addGristConversion(new ItemStack(kringlefucker), false, new GristSet(GristType.Artifact, -10000));
		
		GristRegistry.addGristConversion(new ItemStack(walletModus), false, new GristSet(new GristType[] {GristType.Build, GristType.Iodine, GristType.Shale}, new int[] {4000, 1300, 4130}));
		GristRegistry.addGristConversion(new ItemStack(moneyModus), false, new GristSet(new GristType[] {GristType.Build, GristType.Diamond}, new int[] {1000, 1}));
		GristRegistry.addGristConversion(new ItemStack(arrayModus), false, new GristSet(GristType.Build, 5000));
		
		//Alchemy Recipes MODE_OR
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.clawHammer), new ItemStack(magicCueball), CombinationRegistry.MODE_OR, new ItemStack(mwrthwl));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.katana), new ItemStack(Items.PAPER), CombinationRegistry.MODE_OR, new ItemStack(paperSword));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.blacksmithHammer), new ItemStack(Items.CLOCK), CombinationRegistry.MODE_OR, new ItemStack(fearNoAnvil));
		CombinationRegistry.addCombination(new ItemStack(brokenRoyalDeringer), new ItemStack(magicCueball), CombinationRegistry.MODE_OR, new ItemStack(caledfwlch));
		CombinationRegistry.addCombination(new ItemStack(hemeoreaper), new ItemStack(MinestuckItems.sbahjPoster), CombinationRegistry.MODE_OR, new ItemStack(owTheEdge));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.homesSmellYaLater), new ItemStack(MinestuckItems.minestuckBucket, 1, 1), CombinationRegistry.MODE_OR, new ItemStack(hemeoreaper));
		CombinationRegistry.addCombination(new ItemStack(knittingNeedles), new ItemStack(wizardStatue), CombinationRegistry.MODE_OR, new ItemStack(needleWands));
		CombinationRegistry.addCombination(new ItemStack(Items.DYE, 1, 0), new ItemStack(paperSword), CombinationRegistry.MODE_OR, new ItemStack(inkSquidProQuo));
		CombinationRegistry.addCombination(new ItemStack(Items.FISH), new ItemStack(inkSquidProQuo), CombinationRegistry.MODE_OR, new ItemStack(licoriceFish));
		CombinationRegistry.addCombination(new ItemStack(MinestuckBlocks.blockComputerOff), new ItemStack(MinestuckItems.captchaCard), CombinationRegistry.MODE_OR, new ItemStack(captcharoidCamera));
		CombinationRegistry.addCombination(new ItemStack(brokenCaledfwlch), new ItemStack(fearNoAnvil), CombinationRegistry.MODE_OR, new ItemStack(MinestuckItems.royalDeringer));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.pogoHammer), new ItemStack(clothesIron), CombinationRegistry.MODE_OR, new ItemStack(wrinklefucker));
		CombinationRegistry.addCombination(new ItemStack(Items.BOOK), new ItemStack(crystalBall), CombinationRegistry.MODE_OR, new ItemStack(grimoire));
		CombinationRegistry.addCombination(new ItemStack(Items.IRON_BOOTS), new ItemStack(Items.FIREWORKS), CombinationRegistry.MODE_OR, new ItemStack(rocketShoes));
		CombinationRegistry.addCombination(new ItemStack(lipstickChainsaw), new ItemStack(trollHeadband), CombinationRegistry.MODE_OR, new ItemStack(ragripper));
		CombinationRegistry.addCombination(new ItemStack(Items.LEATHER), new ItemStack(MinestuckItems.modusCard, 1, 5), CombinationRegistry.MODE_OR, new ItemStack(walletModus));
		CombinationRegistry.addCombination(new ItemStack(Blocks.SAPLING), new ItemStack(MinestuckItems.sbahjPoster), CombinationRegistry.MODE_OR, new ItemStack(kringlefucker));
		CombinationRegistry.addCombination(new ItemStack(woodenTrident), new ItemStack(Items.IRON_INGOT), CombinationRegistry.MODE_OR, new ItemStack(silverTrident));
		CombinationRegistry.addCombination(new ItemStack(silverTrident), new ItemStack(Items.GOLD_INGOT), CombinationRegistry.MODE_OR, new ItemStack(goldTrident));
		CombinationRegistry.addCombination(new ItemStack(captcharoidCamera), new ItemStack(MinestuckItems.sbahjPoster), CombinationRegistry.MODE_OR, new ItemStack(sbahjifier));
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
		
		
		//Alchemy Recipes MODE_AND
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.candy, 1, 4), new ItemStack(blueEctoSlime), CombinationRegistry.MODE_AND, new ItemStack(phlegmGushers));
		CombinationRegistry.addCombination(new ItemStack(inkSquidProQuo), new ItemStack(phlegmGushers), CombinationRegistry.MODE_AND, new ItemStack(sorrowGushers));
		CombinationRegistry.addCombination(new ItemStack(needleWands), new ItemStack(grimoire), CombinationRegistry.MODE_AND, new ItemStack(thornsOfOglogoth));
		CombinationRegistry.addCombination(new ItemStack(Items.LEATHER), new ItemStack(Items.STRING), CombinationRegistry.MODE_AND, new ItemStack(MinestuckArsenalItems.leatherWhip));
		CombinationRegistry.addCombination(new ItemStack(hostPlush), new ItemStack(joustingLance), CombinationRegistry.MODE_AND, new ItemStack(fiduspawnLance));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.candy, 1, 4), new ItemStack(barbasol), CombinationRegistry.MODE_AND, new ItemStack(barbasolBomb));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.threshDvd), new ItemStack(MinestuckItems.candy, 1, 0), CombinationRegistry.MODE_AND, new ItemStack(trollHeadband));
		CombinationRegistry.addCombination(new ItemStack(blueEctoSlime), new ItemStack(Items.COOKIE), CombinationRegistry.MODE_AND, new ItemStack(ectoCookie));
		CombinationRegistry.addCombination(new ItemStack(blueEctoSlime), new ItemStack(Items.BREAD), CombinationRegistry.MODE_AND, new ItemStack(ectoLoaf));
		CombinationRegistry.addCombination(new ItemStack(blueEctoSlime), new ItemStack(Items.COOKED_BEEF), CombinationRegistry.MODE_AND, new ItemStack(ectoSteak));
		CombinationRegistry.addCombination(new ItemStack(Items.SLIME_BALL), new ItemStack(Items.CAKE), CombinationRegistry.MODE_AND, new ItemStack(soporSlime));
		CombinationRegistry.addCombination(new ItemStack(Items.ENDER_EYE), new ItemStack(MinestuckItems.captchaCard), CombinationRegistry.MODE_AND, new ItemStack(captcharoidCamera));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.candy, 1, 0), new ItemStack(Items.BOOK), CombinationRegistry.MODE_AND, new ItemStack(trollRomance));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.dice), new ItemStack(Items.BOOK), CombinationRegistry.MODE_AND, new ItemStack(flarpManual));
		CombinationRegistry.addCombination(new ItemStack(MinestuckBlocks.blockComputerOff), new ItemStack(Items.BOOK), CombinationRegistry.MODE_AND, new ItemStack(athManual));
		CombinationRegistry.addCombination(new ItemStack(Items.GLASS_BOTTLE), new ItemStack(Items.APPLE), CombinationRegistry.MODE_AND, new ItemStack(appleJuice));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.cane), new ItemStack(Items.COMPASS), CombinationRegistry.MODE_AND, new ItemStack(blindmansDirections));
		CombinationRegistry.addCombination(new ItemStack(lipstickChainsaw), new ItemStack(MinestuckItems.katana), CombinationRegistry.MODE_AND, new ItemStack(chainsawKatana));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.cane), new ItemStack(Items.SLIME_BALL), CombinationRegistry.MODE_AND, new ItemStack(pogoCane));
		CombinationRegistry.addCombination(new ItemStack(Items.SLIME_BALL), new ItemStack(Items.LEATHER_BOOTS), CombinationRegistry.MODE_AND, new ItemStack(slimeShoes));
		CombinationRegistry.addCombination(new ItemStack(goldTrident), new ItemStack(cuttlefish), CombinationRegistry.MODE_AND, new ItemStack(poseidonsEntente));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.catClaws), new ItemStack(trollRomance), CombinationRegistry.MODE_AND, new ItemStack(nepetaClaws));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.catClaws), new ItemStack(Items.DIAMOND), CombinationRegistry.MODE_AND, new ItemStack(blueClaws));
		CombinationRegistry.addCombination(new ItemStack(crystalBall), new ItemStack(jadeGlasses), CombinationRegistry.MODE_AND, new ItemStack(soothSpecs));
		CombinationRegistry.addCombination(new ItemStack(daveGlasses), new ItemStack(MinestuckItems.katana), CombinationRegistry.MODE_AND, new ItemStack(dirkShades));
		CombinationRegistry.addCombination(new ItemStack(Items.WOODEN_AXE), new ItemStack(sbahjPoster), MODE_AND, false, true, new ItemStack(aks));
		CombinationRegistry.addCombination(new ItemStack(Items.STONE_AXE), new ItemStack(sbahjPoster), MODE_AND, false, true, new ItemStack(aks));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.modusCard, 1, 0), new ItemStack(Blocks.HOPPER), CombinationRegistry.MODE_AND, new ItemStack(arrayModus));
		CombinationRegistry.addCombination(new ItemStack(barbasol), new ItemStack(MinestuckItems.sledgeHammer), MODE_AND, new ItemStack(barberBasher));
		CombinationRegistry.addCombination(new ItemStack(Items.IRON_SWORD), new ItemStack(MinestuckItems.cane), MODE_AND, new ItemStack(bladedCane));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.beverage, 1, 9), new ItemStack(blueEctoSlime), MODE_AND, new ItemStack(faygoEcto));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.cane), new ItemStack(chessboard), MODE_AND, false, true, new ItemStack(regicane));
		CombinationRegistry.addCombination(new ItemStack(magicEightBall), new ItemStack(MinestuckItems.sickle), MODE_AND, new ItemStack(eightballScythe));
		CombinationRegistry.addCombination(new ItemStack(Items.BLAZE_ROD), new ItemStack(MinestuckItems.cane), MODE_AND, new ItemStack(blazingGlory));
		CombinationRegistry.addCombination(new ItemStack(Blocks.DOUBLE_PLANT, 1, 4), new ItemStack(MinestuckItems.sickle), MODE_AND, new ItemStack(thornySubject));
		CombinationRegistry.addCombination(new ItemStack(MinestuckBlocks.crockerMachine), new ItemStack(Items.IRON_PICKAXE), MODE_AND, new ItemStack(mineNGrist));
		CombinationRegistry.addCombination(new ItemStack(houseKey), new ItemStack(Items.IRON_SWORD), MODE_AND, new ItemStack(keyblade));
		CombinationRegistry.addCombination(new ItemStack(keyblade), new ItemStack(MinestuckItems.unbreakableKatana), MODE_AND, new ItemStack(yaldabaothsKeyton));
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
		GristRegistry.addGristConversion(new ItemStack(Items.REDSTONE), new GristSet(ArsenalGrist.Redstone, 2));
		GristRegistry.addGristConversion(new ItemStack(Items.IRON_INGOT), new GristSet(ArsenalGrist.Iron, 15));
		GristRegistry.addGristConversion(new ItemStack(Items.IRON_NUGGET), new GristSet(ArsenalGrist.Iron, 2));
		GristRegistry.addGristConversion(new ItemStack(Items.EMERALD), new GristSet(ArsenalGrist.Emerald, 12));
		
		//Ore Dictionary
		OreDictionary.registerOre("plankWood", MinestuckBlocks.glowingPlanks);
		OreDictionary.registerOre("logWood", MinestuckBlocks.glowingLog);
		OreDictionary.registerOre("logWood", MinestuckBlocks.log);
		OreDictionary.registerOre("dirt", MinestuckBlocks.coloredDirt);
		OreDictionary.registerOre("slimeball", MinestuckArsenalItems.blueEctoSlime);
		
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
	}
}
