
package net.ddraig.suprememiningdimension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModTabs;

public class CavernPortalOutpostItem extends Item {
	public CavernPortalOutpostItem() {
		super(new Item.Properties().tab(SupremeMiningDimensionModTabs.TAB_SMD_STRUCTURES).stacksTo(64).rarity(Rarity.COMMON));
	}
}
