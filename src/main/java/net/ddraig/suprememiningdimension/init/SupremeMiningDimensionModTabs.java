
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ddraig.suprememiningdimension.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SupremeMiningDimensionModTabs {
	public static CreativeModeTab TAB_SUPREME_MINING_DIMENSIONS;

	public static void load() {
		TAB_SUPREME_MINING_DIMENSIONS = new CreativeModeTab("tabsupreme_mining_dimensions") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.IRON_PICKAXE);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
