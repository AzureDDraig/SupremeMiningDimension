package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class WitheringFireballProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Blocks.AIR == (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()) {
			world.setBlock(new BlockPos(x, y + 1, z), Blocks.SOUL_FIRE.defaultBlockState(), 3);
			if (BiomesConfiguration.WITHERINGFIREBALLEXPLOSION.get()) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, (float) 1.5, Explosion.BlockInteraction.BREAK);
			}
		}
	}
}
