package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModBlocks;
import net.ddraig.suprememiningdimension.configuration.SMDStructuresConfigConfiguration;

public class EndGrassSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState endsoill = Blocks.AIR.defaultBlockState();
		endsoill = SupremeMiningDimensionModBlocks.END_SOIL.get().defaultBlockState();
		if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z))
				&& ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == endsoill.getBlock() || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == endsoill.getBlock()
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == endsoill.getBlock() || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == endsoill.getBlock()
						|| (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == endsoill.getBlock() || (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == endsoill.getBlock()
						|| (world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == endsoill.getBlock() || (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == endsoill.getBlock()
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == endsoill.getBlock() || (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == endsoill.getBlock()
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == endsoill.getBlock() || (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == endsoill.getBlock())) {
			world.setBlock(BlockPos.containing(x, y, z), SupremeMiningDimensionModBlocks.END_GRASS.get().defaultBlockState(), 3);
		}
		if (SMDStructuresConfigConfiguration.END_SOIL_SPREAD.get()) {
			endsoill = Blocks.DIRT.defaultBlockState();
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z))
					&& ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == endsoill.getBlock() || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == endsoill.getBlock()
							|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == endsoill.getBlock() || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == endsoill.getBlock()
							|| (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == endsoill.getBlock() || (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == endsoill.getBlock()
							|| (world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == endsoill.getBlock() || (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == endsoill.getBlock()
							|| (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == endsoill.getBlock() || (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == endsoill.getBlock()
							|| (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == endsoill.getBlock() || (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == endsoill.getBlock())) {
				world.setBlock(BlockPos.containing(x, y, z), SupremeMiningDimensionModBlocks.END_SOIL.get().defaultBlockState(), 3);
			}
		}
	}
}
