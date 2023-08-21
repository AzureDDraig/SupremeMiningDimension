package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
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
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModBlocks;
import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class ShadeGrassUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState spreadto = Blocks.AIR.defaultBlockState();
		boolean found = false;
		double entity = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		spreadto = SupremeMiningDimensionModBlocks.SHADE_DIRT.get().defaultBlockState();
		entity = Mth.nextInt(RandomSource.create(), 1, 120);
		if (Math.random() < 0.01) {
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
					entityToSpawn.moveTo(x, (y + 10), z, 0, 0);
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
			} else if (10 == entity) {
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
		if (BiomesConfiguration.SHADE_SOIL_SPREAD.get()) {
			sx = -1;
			found = false;
			for (int index0 = 0; index0 < (int) (3); index0++) {
				sy = -1;
				for (int index1 = 0; index1 < (int) (3); index1++) {
					sz = -1;
					for (int index2 = 0; index2 < (int) (3); index2++) {
						if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == spreadto.getBlock()) {
							found = true;
							break;
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if (found == true) {
				world.setBlock(new BlockPos(sx, sy, sz), SupremeMiningDimensionModBlocks.SHADE_GRASS.get().defaultBlockState(), 3);
			} else {
				spreadto = Blocks.GRASS_BLOCK.defaultBlockState();
			}
			if (Math.random() < 0.1) {
				sx = -1;
				found = false;
				for (int index3 = 0; index3 < (int) (3); index3++) {
					sy = -1;
					for (int index4 = 0; index4 < (int) (3); index4++) {
						sz = -1;
						for (int index5 = 0; index5 < (int) (3); index5++) {
							if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == spreadto.getBlock()) {
								found = true;
								break;
							}
							sz = sz + 1;
						}
						sy = sy + 1;
					}
					sx = sx + 1;
				}
				if (found == true) {
					world.setBlock(new BlockPos(sx, sy, sz), SupremeMiningDimensionModBlocks.SHADE_GRASS.get().defaultBlockState(), 3);
				} else {
					spreadto = Blocks.GRASS_BLOCK.defaultBlockState();
				}
			}
		}
	}
}
