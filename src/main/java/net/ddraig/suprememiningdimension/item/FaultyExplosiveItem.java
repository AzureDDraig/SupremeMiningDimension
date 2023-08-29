
package net.ddraig.suprememiningdimension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FaultyExplosiveItem extends Item {
	public FaultyExplosiveItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
