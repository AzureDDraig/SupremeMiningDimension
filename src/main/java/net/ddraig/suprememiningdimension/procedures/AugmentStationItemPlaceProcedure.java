package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class AugmentStationItemPlaceProcedure {
	public static boolean execute(ItemStack itemstack) {
		if (itemstack.is(ItemTags.create(new ResourceLocation("forge:armors"))) || itemstack.is(ItemTags.create(new ResourceLocation("axes"))) || itemstack.is(ItemTags.create(new ResourceLocation("swords")))) {
			return false;
		}
		return true;
	}
}
