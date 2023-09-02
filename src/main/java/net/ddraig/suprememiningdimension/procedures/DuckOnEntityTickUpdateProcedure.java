package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModItems;

public class DuckOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (6000 <= entity.getPersistentData().getDouble("eggtimer")) {
			entity.getPersistentData().putDouble("eggtimer", 0);
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(SupremeMiningDimensionModItems.DUCK_EGG.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (6000 > entity.getPersistentData().getDouble("eggtimer")) {
			entity.getPersistentData().putDouble("eggtimer", (1 + entity.getPersistentData().getDouble("eggtimer")));
		}
	}
}
