package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.configuration.SMDMobsConfiguration;

public class ShroombieboolProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return 10 >= world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) && SMDMobsConfiguration.SHROOMBIE_ENABLED.get();
	}
}
