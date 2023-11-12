package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.core.BlockPos;

public class AncientMossExtOnDispenseAttemptWithResultProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		double xx = 0;
		double zz = 0;
		itemstack.shrink(1);
		xx = x - 1;
		for (int index0 = 0; index0 < 3; index0++) {
			zz = z - 1;
			for (int index1 = 0; index1 < 3; index1++) {
				for (int index2 = 0; index2 < 4; index2++) {
					if (world instanceof Level _level) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
				}
				zz = zz + 1;
			}
			xx = xx + 1;
		}
	}
}
