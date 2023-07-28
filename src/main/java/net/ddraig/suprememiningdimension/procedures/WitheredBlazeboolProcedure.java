package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class WitheredBlazeboolProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return BiomesConfiguration.BLAZING_WITHER_SKELE_ALLOWED.get() && world.isEmptyBlock(new BlockPos(x, y, z))
				&& ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("supreme_mining_dimension:nether_island")))
						|| (world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.NETHER))
				&& (Blocks.NETHER_BRICKS == (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() || Blocks.POLISHED_BLACKSTONE_BRICKS == (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()
						|| Blocks.NETHERRACK == (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock());
	}
}
