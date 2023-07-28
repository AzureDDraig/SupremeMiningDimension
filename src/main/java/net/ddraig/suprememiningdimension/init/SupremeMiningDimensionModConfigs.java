package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;
import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

@Mod.EventBusSubscriber(modid = SupremeMiningDimensionMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SupremeMiningDimensionModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, BiomesConfiguration.SPEC, "Supreme_Mining_Dimensions.toml");
		});
	}
}
