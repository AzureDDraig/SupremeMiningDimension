package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;
import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

public class ProspectorBrotherEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (0 == entity.getDeltaMovement().z() || 0 == entity.getDeltaMovement().x()) {
			SupremeMiningDimensionMod.queueServerWork((int) (double) BiomesConfiguration.HOLDSTILLEXPLODEDELAYTICKS.get(), () -> {
				if (0 == entity.getDeltaMovement().z() || 0 == entity.getDeltaMovement().x()) {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 1, Level.ExplosionInteraction.MOB);
					entity.setDeltaMovement(new Vec3(Math.random(), 1, Math.random()));
				}
			});
		}
	}
}
