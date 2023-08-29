
package net.ddraig.suprememiningdimension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SlimeChowItem extends Item {
	public SlimeChowItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
