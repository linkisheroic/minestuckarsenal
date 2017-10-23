package com.natura.minestuckarsenal.client;

import com.mraof.minestuck.Minestuck;
import com.natura.minestuckarsenal.MinestuckArsenal;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientEventHandler {

	@SubscribeEvent(priority=EventPriority.HIGHEST)
	public void addCustomTooltip(ItemTooltipEvent event)
	{
		//Add config check
		{
			ItemStack stack = event.getItemStack();
			if(stack.getItem().getRegistryName().getResourceDomain().equals(MinestuckArsenal.class.getAnnotation(Mod.class).modid()))
			{
				String name = stack.getUnlocalizedName() + ".tooltip";
				if(I18n.canTranslate(name))
					event.getToolTip().add(1, I18n.translateToLocal(name));
			}
		}
	}
}
