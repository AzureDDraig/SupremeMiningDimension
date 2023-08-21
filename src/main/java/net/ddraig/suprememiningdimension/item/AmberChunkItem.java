
package net.ddraig.suprememiningdimension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModTabs;

public class AmberChunkItem extends Item {
	public AmberChunkItem() {
		super(new Item.Properties().tab(SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(-2).saturationMod(5f).alwaysEat()

				.build()));
	}
}
