package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.Stray;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.entity.monster.Illusioner;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

public class ShadeGrassUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double entity = 0;
		entity = Mth.nextInt(RandomSource.create(), 1, 10);
		if (1 == entity) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new Slime(EntityType.SLIME, _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (2 == entity) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new Zombie(EntityType.ZOMBIE, _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (3 == entity) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new EnderMan(EntityType.ENDERMAN, _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (4 == entity) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new CaveSpider(EntityType.CAVE_SPIDER, _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (5 == entity) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new Illusioner(EntityType.ILLUSIONER, _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (6 == entity) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new Phantom(EntityType.PHANTOM, _level);
				entityToSpawn.moveTo(x, (y + 10), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (7 == entity) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new Stray(EntityType.STRAY, _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (8 == entity) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (9 == entity) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new Creeper(EntityType.CREEPER, _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		} else {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new Husk(EntityType.HUSK, _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
