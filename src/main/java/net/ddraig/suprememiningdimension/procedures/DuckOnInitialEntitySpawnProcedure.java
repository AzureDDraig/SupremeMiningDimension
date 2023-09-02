package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.entity.Entity;

public class DuckOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("eggtimer", 0);
	}
}
