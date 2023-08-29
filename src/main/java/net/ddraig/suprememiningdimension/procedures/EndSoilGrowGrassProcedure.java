package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModBlocks;

public class EndSoilGrowGrassProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SupremeMiningDimensionModBlocks.END_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SupremeMiningDimensionModBlocks.END_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SupremeMiningDimensionModBlocks.END_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SupremeMiningDimensionModBlocks.END_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == SupremeMiningDimensionModBlocks.END_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == SupremeMiningDimensionModBlocks.END_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == SupremeMiningDimensionModBlocks.END_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == SupremeMiningDimensionModBlocks.END_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == SupremeMiningDimensionModBlocks.END_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == SupremeMiningDimensionModBlocks.END_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == SupremeMiningDimensionModBlocks.END_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == SupremeMiningDimensionModBlocks.END_GRASS.get()) && 9 > world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z))) {
			world.setBlock(BlockPos.containing(x, y, z), SupremeMiningDimensionModBlocks.END_GRASS.get().defaultBlockState(), 3);
		}
	}
}
