package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class WeakWitheringFireballProjectileHitsPlayerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.WITHER, 3);
	}
}
