package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import net.ddraig.suprememiningdimension.configuration.SMDBossesConfiguration;
import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

public class ExplosiveThrownProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		SupremeMiningDimensionMod.queueServerWork((int) (20 * (double) SMDBossesConfiguration.TIME_EXPLOSION_SECONDS.get()), () -> {
			if ((double) SMDBossesConfiguration.PERCENT_FAULTY.get() > Math.random()) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, (float) (double) SMDBossesConfiguration.PROSPECTOR_EXPLOSIVE_POWER.get(), Level.ExplosionInteraction.TNT);
			}
		});
	}
}
