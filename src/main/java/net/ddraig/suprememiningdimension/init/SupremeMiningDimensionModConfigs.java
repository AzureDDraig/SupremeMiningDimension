package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.ddraig.suprememiningdimension.configuration.SMDStructuresConfigConfiguration;
import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;
import net.ddraig.suprememiningdimension.configuration.SMDMobsConfiguration;
import net.ddraig.suprememiningdimension.configuration.SMDDimensionsConfiguration;
import net.ddraig.suprememiningdimension.configuration.SMDBossesConfiguration;
import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

@Mod.EventBusSubscriber(modid = SupremeMiningDimensionMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SupremeMiningDimensionModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SMDDimensionsConfiguration.SPEC, "SMD_Dimensions.toml");
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SMDOresConfiguration.SPEC, "SMD_Ores.toml");
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SMDMobsConfiguration.SPEC, "SMD_Mobs.toml");
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SMDStructuresConfigConfiguration.SPEC, "SMD_Structures.toml");
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SMDBossesConfiguration.SPEC, "SMD_Bosses.toml");
		});
	}
}
