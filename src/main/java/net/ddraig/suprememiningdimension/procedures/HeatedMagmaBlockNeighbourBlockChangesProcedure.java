package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class HeatedMagmaBlockNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (false || false || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() instanceof SimpleWaterloggedBlock) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() instanceof SimpleWaterloggedBlock) {
				{
					BlockPos _pos = BlockPos.containing(x, y + 1, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
				}
			} else if (false || false) {
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			}
		}
	}
}
