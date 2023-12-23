package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModBlocks;
import net.ddraig.suprememiningdimension.configuration.SMDStructuresConfigConfiguration;

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
					Entity entityToSpawn = EntityType.SLIME.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			} else if (2 == entity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.ZOMBIE.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			} else if (3 == entity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.ENDERMAN.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			} else if (4 == entity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.CAVE_SPIDER.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			} else if (5 == entity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.ILLUSIONER.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			} else if (6 == entity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.PHANTOM.spawn(_level, BlockPos.containing(x, y + 10, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			} else if (7 == entity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.STRAY.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			} else if (8 == entity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.LIGHTNING_BOLT.spawn(_level, BlockPos.containing(x, y + 10, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			} else if (9 == entity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.CREEPER.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			} else if (10 == entity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.HUSK.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
		}
		if (SMDStructuresConfigConfiguration.SHADE_SOIL_SPREAD.get()) {
			sx = -1;
			found = false;
			for (int index0 = 0; index0 < 3; index0++) {
				sy = -1;
				for (int index1 = 0; index1 < 3; index1++) {
					sz = -1;
					for (int index2 = 0; index2 < 3; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == spreadto.getBlock()) {
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
				world.setBlock(BlockPos.containing(sx, sy, sz), SupremeMiningDimensionModBlocks.SHADE_GRASS.get().defaultBlockState(), 3);
			} else {
				spreadto = Blocks.GRASS_BLOCK.defaultBlockState();
			}
			if (Math.random() < 0.1) {
				sx = -1;
				found = false;
				for (int index3 = 0; index3 < 3; index3++) {
					sy = -1;
					for (int index4 = 0; index4 < 3; index4++) {
						sz = -1;
						for (int index5 = 0; index5 < 3; index5++) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == spreadto.getBlock()) {
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
					world.setBlock(BlockPos.containing(sx, sy, sz), SupremeMiningDimensionModBlocks.SHADE_GRASS.get().defaultBlockState(), 3);
				} else {
					spreadto = Blocks.GRASS_BLOCK.defaultBlockState();
				}
			}
		}
	}
}
