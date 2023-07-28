package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;
import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

public class ExplosiveThrownProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		SupremeMiningDimensionMod.queueServerWork((int) (20 * (double) BiomesConfiguration.TIME_EXPLOSION_SECONDS.get()), () -> {
			if ((double) BiomesConfiguration.PERCENTFAULTY.get() > Math.random()) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, (float) (double) BiomesConfiguration.PROSPECTOREXPLOSIVEPOWER.get(), Explosion.BlockInteraction.NONE);
			}
		});
	}
}
