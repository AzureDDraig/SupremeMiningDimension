
package net.ddraig.suprememiningdimension.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SupremeMiningDimensionModTabs {
	public static CreativeModeTab TAB_SUPREME_MINING_DIMENSIONS;
	public static CreativeModeTab TAB_SMD_STRUCTURES;

	public static void load() {
		TAB_SUPREME_MINING_DIMENSIONS = new CreativeModeTab("tabsupreme_mining_dimensions") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SupremeMiningDimensionModItems.STRANGE_FORESTS.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_SMD_STRUCTURES = new CreativeModeTab("tabsmd_structures") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SupremeMiningDimensionModItems.CAVERN_PORTAL_OUTPOST.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
