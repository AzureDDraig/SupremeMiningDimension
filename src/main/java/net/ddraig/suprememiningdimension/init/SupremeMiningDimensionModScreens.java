
package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.ddraig.suprememiningdimension.client.gui.SifterGUIScreen;
import net.ddraig.suprememiningdimension.client.gui.AugmentStationGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SupremeMiningDimensionModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(SupremeMiningDimensionModMenus.SIFTER_GUI.get(), SifterGUIScreen::new);
			MenuScreens.register(SupremeMiningDimensionModMenus.AUGMENT_STATION_GUI.get(), AugmentStationGUIScreen::new);
		});
	}
}
