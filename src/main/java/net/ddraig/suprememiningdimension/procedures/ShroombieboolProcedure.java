package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class ShroombieboolProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return 10 >= world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) && BiomesConfiguration.SHROOMBIE_ALLOWED.get();
	}
}
