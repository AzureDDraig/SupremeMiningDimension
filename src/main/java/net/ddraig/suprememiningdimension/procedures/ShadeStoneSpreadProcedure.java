package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModBlocks;
import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class ShadeStoneSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		BlockState stones = Blocks.AIR.defaultBlockState();
		BlockState spreadto = Blocks.AIR.defaultBlockState();
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double entity = 0;
		if (BiomesConfiguration.SHADE_STONE_SPREAD.get()) {
			spreadto = Blocks.STONE.defaultBlockState();
			sx = -1;
			found = false;
			for (int index0 = 0; index0 < (int) (3); index0++) {
				sy = -1;
				for (int index1 = 0; index1 < (int) (3); index1++) {
					sz = -1;
					for (int index2 = 0; index2 < (int) (3); index2++) {
						if ((world.getBlockState(new BlockPos((int)(x + sx), (int)(y + sy), (int)(z + sz)))).getBlock() == spreadto.getBlock())
							found = true;
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if (found == true) {
				world.setBlock(new BlockPos((int)sx, (int)sy, (int)sz), SupremeMiningDimensionModBlocks.SHADE_STONE.get().defaultBlockState(), 3);
			} else {
				spreadto = Blocks.ANDESITE.defaultBlockState();
				if (Math.random() < 0.1) {
					sx = -1;
					found = false;
					for (int index3 = 0; index3 < (int) (3); index3++) {
						sy = -1;
						for (int index4 = 0; index4 < (int) (3); index4++) {
							sz = -1;
							for (int index5 = 0; index5 < (int) (3); index5++) {
								if ((world.getBlockState(new BlockPos((int)(x + sx), (int)(y + sy), (int)(z + sz)))).getBlock() == spreadto.getBlock()) {
									found = true;
								}
								sz = sz + 1;
							}
							sy = sy + 1;
						}
						sx = sx + 1;
					}
					if (found == true) {
						world.setBlock(new BlockPos((int)sx, (int)sy, (int)sz), SupremeMiningDimensionModBlocks.DENSE_ANDESITE.get().defaultBlockState(), 3);
					}
				}
			}
		}
	}

