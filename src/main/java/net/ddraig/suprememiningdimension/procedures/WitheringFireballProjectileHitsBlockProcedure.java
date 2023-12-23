package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.configuration.SMDBossesConfiguration;

public class WitheringFireballProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Blocks.AIR == (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock()) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.SOUL_FIRE.defaultBlockState(), 3);
			if (SMDBossesConfiguration.WITHERING_FIREBALL_EXPLOSION.get()) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, (float) 1.5, Level.ExplosionInteraction.TNT);
			}
		}
	}
}
