package com.natura.minestuckarsenal.captchalouge;

import com.mraof.minestuck.inventory.captchalouge.CaptchaDeckHandler;
import com.mraof.minestuck.inventory.captchalouge.Modus;
import com.natura.minestuckarsenal.item.MinestuckArsenalItems;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ModusHandler {
	public ModusHandler(Modus modus) {
	}
	
	public static void registerModus() {
		CaptchaDeckHandler.registerModusType(new ResourceLocation("wallet_modus"), WalletModus.class, new ItemStack(MinestuckArsenalItems.walletModus));
		CaptchaDeckHandler.registerModusType(new ResourceLocation("money_modus"), MoneyModus.class, new ItemStack(MinestuckArsenalItems.moneyModus));
		CaptchaDeckHandler.registerModusType(new ResourceLocation("array_modus"), ArrayModus.class, new ItemStack(MinestuckArsenalItems.arrayModus));
	}
}
