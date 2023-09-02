package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class ShadeGrassEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xx = 0;
		double zz = 0;
		if (entity instanceof Player) {
			if (Math.random() < 0.05) {
				xx = x + Mth.nextInt(RandomSource.create(), -15, 15);
				zz = z + Mth.nextInt(RandomSource.create(), -15, 15);
				if (world.canSeeSkyFromBelowWater(new BlockPos(xx, y, zz))) {
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(xx, y, zz)));
						entityToSpawn.setVisualOnly(false);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(xx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) xx, (int) zz), zz)));
						entityToSpawn.setVisualOnly(false);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		} else {
			if (Math.random() < 0.05) {
				if (Math.random() < 0.05) {
					if (Math.random() < 0.02) {
						xx = x + Mth.nextInt(RandomSource.create(), -15, 15);
						zz = z + Mth.nextInt(RandomSource.create(), -15, 15);
						if (world.canSeeSkyFromBelowWater(new BlockPos(xx, y, zz))) {
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(xx, y, zz)));
								entityToSpawn.setVisualOnly(false);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(xx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) xx, (int) zz), zz)));
								entityToSpawn.setVisualOnly(false);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			}
		}
	}
}
