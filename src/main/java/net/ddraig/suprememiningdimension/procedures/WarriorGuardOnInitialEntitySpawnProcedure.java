package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class WarriorGuardOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("keyType", (Mth.nextInt(RandomSource.create(), 1, 21)));
		entity.getPersistentData().putDouble("keyDrop", (Mth.nextInt(RandomSource.create(), 1, 15)));
	}
}
