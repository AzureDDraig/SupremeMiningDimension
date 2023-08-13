package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class BlazingWitherMasterOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth((float) (double) BiomesConfiguration.MAX_HEALTH.get());
	}
}
