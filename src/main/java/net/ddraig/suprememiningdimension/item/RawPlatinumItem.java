
package net.ddraig.suprememiningdimension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModTabs;

public class RawPlatinumItem extends Item {
	public RawPlatinumItem() {
		super(new Item.Properties().tab(SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
