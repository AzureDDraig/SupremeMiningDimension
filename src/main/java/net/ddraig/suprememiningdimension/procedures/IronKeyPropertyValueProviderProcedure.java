package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.item.ItemStack;

public class IronKeyPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("key_type");
	}
}
