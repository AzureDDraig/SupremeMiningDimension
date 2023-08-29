package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class WitheredBlazeboolProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world.isEmptyBlock(BlockPos.containing(x, y, z)) && (world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("supreme_mining_dimension:nether_island")))
				&& (Blocks.NETHER_BRICKS == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() || Blocks.POLISHED_BLACKSTONE_BRICKS == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()
						|| Blocks.NETHERRACK == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock());
	}
}
