
package net.ddraig.suprememiningdimension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.ddraig.suprememiningdimension.procedures.WitheringRodLivingEntityIsHitWithItemProcedure;
import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModTabs;

public class WitheringRodItem extends Item {
	public WitheringRodItem() {
		super(new Item.Properties().tab(SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		WitheringRodLivingEntityIsHitWithItemProcedure.execute(entity);
		return retval;
	}
}
