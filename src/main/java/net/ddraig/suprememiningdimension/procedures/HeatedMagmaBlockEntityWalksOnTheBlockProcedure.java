package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class HeatedMagmaBlockEntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (!entity.isShiftKeyDown()) {
				entity.setSecondsOnFire(5);
			}
		}
	}
}
