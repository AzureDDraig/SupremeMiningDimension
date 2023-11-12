package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModBlocks;
import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class ShadeDirtUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(new BlockPos((int)x, (int)(y + 1), (int)z)) && ((world.getBlockState(new BlockPos((int)(x + 1), (int)y, (int)z))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(new BlockPos((int)(x - 1), (int)y, (int)z))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get() || (world.getBlockState(new BlockPos((int)x, (int)y, (int)(z - 1)))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(new BlockPos((int)x, (int)y, (int)(z + 1)))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()

				
				|| (world.getBlockState(new BlockPos((int)(x + 1), (int)(y + 1), (int)z))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(new BlockPos((int)(x - 1), (int)(y + 1), (int)z))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(new BlockPos((int)(x + 1), (int)(y - 1), (int)z))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()

				
				|| (world.getBlockState(new BlockPos((int)(x - 1), (int)(y - 1), (int)z))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(new BlockPos((int)x, (int)(y + 1), (int)(z + 1)))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(new BlockPos((int)x, (int)(y + 1), (int)(z - 1)))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()

				|| (world.getBlockState(new BlockPos((int)x, (int)(y - 1), (int)(z + 1)))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get()
				|| (world.getBlockState(new BlockPos((int)x, (int)(y - 1), (int)(z - 1)))).getBlock() == SupremeMiningDimensionModBlocks.SHADE_GRASS.get())) {
					world.setBlock(new BlockPos((int)x, (int)y, (int)z), SupremeMiningDimensionModBlocks.SHADE_GRASS.get().defaultBlockState(), 3);
				}
		if (BiomesConfiguration.SHADE_SOIL_SPREAD.get()) {
			if (Math.random() < 0.1) {
					if (world.isEmptyBlock(new BlockPos((int)x, (int)(y + 1), (int)z)) && ((world.getBlockState(new BlockPos((int)(x + 1), (int)y, (int)z))).getBlock() == Blocks.DIRT || (world.getBlockState(new BlockPos((int)(x - 1), (int)y, (int)z))).getBlock() == Blocks.DIRT
						|| (world.getBlockState(new BlockPos((int)x, (int)y, (int)(z - 1)))).getBlock() == Blocks.DIRT || (world.getBlockState(new BlockPos((int)x, (int)y, (int)(z + 1)))).getBlock() == Blocks.DIRT

						|| (world.getBlockState(new BlockPos((int)(x + 1), (int)(y + 1), (int)z))).getBlock() == Blocks.DIRT || (world.getBlockState(new BlockPos((int)(x - 1), (int)(y + 1), (int)z))).getBlock() == Blocks.DIRT
						|| (world.getBlockState(new BlockPos((int)(x + 1), (int)(y - 1), (int)z))).getBlock() == Blocks.DIRT || (world.getBlockState(new BlockPos((int)(x - 1), (int)(y - 1), (int)z))).getBlock() == Blocks.DIRT

						|| (world.getBlockState(new BlockPos((int)x, (int)(y + 1), (int)(z + 1)))).getBlock() == Blocks.DIRT || (world.getBlockState(new BlockPos((int)x, (int)(y + 1), (int)(z - 1)))).getBlock() == Blocks.DIRT
						|| (world.getBlockState(new BlockPos((int)x, (int)(y - 1), (int)(z + 1)))).getBlock() == Blocks.DIRT || (world.getBlockState(new BlockPos((int)x, (int)(y - 1), (int)(z - 1)))).getBlock() == Blocks.DIRT)) {
							world.setBlock(new BlockPos((int)x, (int)y, (int)z), SupremeMiningDimensionModBlocks.SHADE_DIRT.get().defaultBlockState(), 3);
					}
				}
			}
		}
	}

