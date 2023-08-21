package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModBlocks;

public class BlightwoodSaplingBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (SupremeMiningDimensionModBlocks.SHADE_DIRT.get() == (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() || SupremeMiningDimensionModBlocks.SHADE_GRASS.get() == (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()) {
			return true;
		}
		return false;
	}
}
