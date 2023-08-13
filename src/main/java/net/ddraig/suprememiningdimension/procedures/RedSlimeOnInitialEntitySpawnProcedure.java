package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class RedSlimeOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("maxHeartsSaved", (Mth.nextInt(RandomSource.create(), 1, 4)));
		entity.getPersistentData().putDouble("Size", (Mth.nextInt(RandomSource.create(), 1, 4)));
	}
}
