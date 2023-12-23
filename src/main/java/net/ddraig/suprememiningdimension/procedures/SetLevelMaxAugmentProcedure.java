package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.item.ItemStack;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModItems;

public class SetLevelMaxAugmentProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(0 != itemstack.getOrCreateTag().getDouble("levelMax"))) {
			if (SupremeMiningDimensionModItems.FLAME_RESISTANCE_AUGMENT_ITEM.get() == itemstack.getItem() || SupremeMiningDimensionModItems.CONDUCTIVE_STRIKE.get() == itemstack.getItem()) {
				itemstack.getOrCreateTag().putDouble("levelMax", 3);
			} else if (SupremeMiningDimensionModItems.WATER_BREATHING_AUGMENT.get() == itemstack.getItem()) {
				itemstack.getOrCreateTag().putDouble("levelMax", 5);
			} else {
				itemstack.getOrCreateTag().putDouble("levelMax", 3);
			}
		}
	}
}
