package net.ddraig.suprememiningdimension.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.ddraig.suprememiningdimension.configuration.SMDDimensionsConfiguration;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TrackCoordsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (SMDDimensionsConfiguration.VOID_WORLD.get()) {
			if (!((ResourceKey.create(Registries.DIMENSION, new ResourceLocation("supreme_mining_dimension:defined_void"))) == (entity.level().dimension())
					|| (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("supreme_mining_dimension:underground_dimension"))) == (entity.level().dimension())
					|| (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("supreme_mining_dimension:caverns"))) == (entity.level().dimension())
					|| (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("supreme_mining_dimension:deep_caverns"))) == (entity.level().dimension())
					|| (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("supreme_mining_dimension:ender_caves"))) == (entity.level().dimension()))) {
				entity.getPersistentData().putDouble("trackXCoord", Math.round(entity.getX()));
				entity.getPersistentData().putDouble("trackYCoord", Math.round(entity.getY()));
				entity.getPersistentData().putDouble("trackZCoord", Math.round(entity.getZ()));
			}
		}
	}
}
