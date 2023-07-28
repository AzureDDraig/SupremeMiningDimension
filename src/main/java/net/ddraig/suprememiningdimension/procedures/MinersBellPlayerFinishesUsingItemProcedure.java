package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModEntities;
import net.ddraig.suprememiningdimension.entity.TunnelerBrotherEntity;
import net.ddraig.suprememiningdimension.entity.QuarrierBrotherEntity;
import net.ddraig.suprememiningdimension.entity.ProspectorBrotherEntity;
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
			for (int index0 = 0; index0 < (int) (6); index0++) {
				SupremeMiningDimensionMod.queueServerWork(3, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), -10, 10)), (y + 1), (z + Mth.nextDouble(RandomSource.create(), -10, 10)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
			SupremeMiningDimensionMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ProspectorBrotherEntity(SupremeMiningDimensionModEntities.PROSPECTOR_BROTHER.get(), _level);
					entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), -10, 10)), (y + 1), (z + Mth.nextDouble(RandomSource.create(), -10, 10)), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			});
			SupremeMiningDimensionMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new QuarrierBrotherEntity(SupremeMiningDimensionModEntities.QUARRIER_BROTHER.get(), _level);
					entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), -10, 10)), (y + 1), (z + Mth.nextDouble(RandomSource.create(), -10, 10)), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			});
			SupremeMiningDimensionMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new TunnelerBrotherEntity(SupremeMiningDimensionModEntities.TUNNELER_BROTHER.get(), _level);
					entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), -10, 10)), (y + 1), (z + Mth.nextDouble(RandomSource.create(), -10, 10)), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			});
		});
	}
}
