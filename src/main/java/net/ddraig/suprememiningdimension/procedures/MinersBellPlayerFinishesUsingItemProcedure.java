package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModEntities;
import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

public class MinersBellPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		SupremeMiningDimensionMod.queueServerWork(100, () -> {
			for (int index0 = 0; index0 < 6; index0++) {
				SupremeMiningDimensionMod.queueServerWork(3, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.LIGHTNING_BOLT.spawn(_level, BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), -10, 10), y + 1, z + Mth.nextDouble(RandomSource.create(), -10, 10)), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
			}
			SupremeMiningDimensionMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = SupremeMiningDimensionModEntities.PROSPECTOR_BROTHER.get().spawn(_level, BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), -10, 10), y + 1, z + Mth.nextDouble(RandomSource.create(), -10, 10)),
							MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			});
			SupremeMiningDimensionMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = SupremeMiningDimensionModEntities.QUARRIER_BROTHER.get().spawn(_level, BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), -10, 10), y + 1, z + Mth.nextDouble(RandomSource.create(), -10, 10)),
							MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			});
			SupremeMiningDimensionMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = SupremeMiningDimensionModEntities.TUNNELER_BROTHER.get().spawn(_level, BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), -10, 10), y + 1, z + Mth.nextDouble(RandomSource.create(), -10, 10)),
							MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			});
		});
	}
}
