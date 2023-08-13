package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class WitheringFireballWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean alreadyflying = false;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.DRAGON_BREATH, x, y, z, 10, 1.5, 1.5, 1.5, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.DRIPPING_LAVA, x, y, z, 10, 1.5, 1.5, 1.5, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.WHITE_ASH, x, y, z, 10, 1.5, 1.5, 1.5, 1);
	}
}
