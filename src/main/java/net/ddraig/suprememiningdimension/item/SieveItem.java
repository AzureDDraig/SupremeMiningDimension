
package net.ddraig.suprememiningdimension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SieveItem extends Item {
	public SieveItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
