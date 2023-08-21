package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModBlocks;
import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class ShadeDirtUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(new BlockPos(x, y + 1, z)) && ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get() || (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get())) {
			world.setBlock(new BlockPos(x, y, z), SupremeMiningDimensionModBlocks.SHADE_GRASS.get().defaultBlockState(), 3);
		}
		if (BiomesConfiguration.SHADE_SOIL_SPREAD.get()) {
			if (Math.random() < 0.1) {
				if (world.isEmptyBlock(new BlockPos(x, y + 1, z)) && ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.DIRT || (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.DIRT
						|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DIRT || (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DIRT
						|| (world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.DIRT || (world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.DIRT
						|| (world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.DIRT || (world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == Blocks.DIRT
						|| (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.DIRT || (world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.DIRT
						|| (world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.DIRT || (world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.DIRT)) {
					world.setBlock(new BlockPos(x, y, z), SupremeMiningDimensionModBlocks.SHADE_DIRT.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
