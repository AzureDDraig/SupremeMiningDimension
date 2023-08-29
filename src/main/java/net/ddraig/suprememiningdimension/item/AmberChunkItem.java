
package net.ddraig.suprememiningdimension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class AmberChunkItem extends Item {
	public AmberChunkItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(-2).saturationMod(5f).alwaysEat().build()));
	}
}
