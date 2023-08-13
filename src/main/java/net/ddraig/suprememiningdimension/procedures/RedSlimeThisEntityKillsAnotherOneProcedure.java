package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.entity.Entity;

public class RedSlimeThisEntityKillsAnotherOneProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("maxHeartsSaved", (entity.getPersistentData().getDouble("maxHeartsSaved") + 4));
	}
}
