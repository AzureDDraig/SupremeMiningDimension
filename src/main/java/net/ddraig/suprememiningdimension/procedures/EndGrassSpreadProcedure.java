package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModBlocks;
import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class EndGrassSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState endsoill = Blocks.AIR.defaultBlockState();
		endsoill = SupremeMiningDimensionModBlocks.END_SOIL.get().defaultBlockState();
		if (world.isEmptyBlock(new BlockPos(x, y + 1, z)) && ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == endsoill.getBlock() || (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == endsoill.getBlock()
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == endsoill.getBlock() || (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == endsoill.getBlock()
				|| (world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == endsoill.getBlock() || (world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == endsoill.getBlock()
				|| (world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == endsoill.getBlock() || (world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == endsoill.getBlock()
				|| (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == endsoill.getBlock() || (world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == endsoill.getBlock()
				|| (world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == endsoill.getBlock() || (world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == endsoill.getBlock())) {
			world.setBlock(new BlockPos(x, y, z), SupremeMiningDimensionModBlocks.END_GRASS.get().defaultBlockState(), 3);
		}
		if (BiomesConfiguration.END_SOIL_SPREAD.get()) {
			endsoill = Blocks.DIRT.defaultBlockState();
			if (world.isEmptyBlock(new BlockPos(x, y + 1, z)) && ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == endsoill.getBlock() || (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == endsoill.getBlock()
					|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == endsoill.getBlock() || (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == endsoill.getBlock()
					|| (world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == endsoill.getBlock() || (world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == endsoill.getBlock()
					|| (world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == endsoill.getBlock() || (world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == endsoill.getBlock()
					|| (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == endsoill.getBlock() || (world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == endsoill.getBlock()
					|| (world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == endsoill.getBlock() || (world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == endsoill.getBlock())) {
				world.setBlock(new BlockPos(x, y, z), SupremeMiningDimensionModBlocks.END_SOIL.get().defaultBlockState(), 3);
			}
		}
	}
}
