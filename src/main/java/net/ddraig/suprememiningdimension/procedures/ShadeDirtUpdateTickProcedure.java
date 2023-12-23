package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModBlocks;
import net.ddraig.suprememiningdimension.configuration.SMDStructuresConfigConfiguration;

public class ShadeDirtUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get())) {
			world.setBlock(BlockPos.containing(x, y, z), SupremeMiningDimensionModBlocks.SHADE_GRASS.get().defaultBlockState(), 3);
		}
		if (SMDStructuresConfigConfiguration.SHADE_SOIL_SPREAD.get()) {
			if (Math.random() < 0.1) {
				if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.DIRT || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.DIRT
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.DIRT || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.DIRT
						|| (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.DIRT || (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.DIRT
						|| (world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.DIRT || (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.DIRT
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.DIRT || (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.DIRT
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.DIRT || (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.DIRT)) {
					world.setBlock(BlockPos.containing(x, y, z), SupremeMiningDimensionModBlocks.SHADE_DIRT.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
