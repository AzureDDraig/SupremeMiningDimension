
package net.ddraig.suprememiningdimension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.ddraig.suprememiningdimension.procedures.WitheringRodLivingEntityIsHitWithItemProcedure;

public class WitheringRodItem extends Item {
	public WitheringRodItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		WitheringRodLivingEntityIsHitWithItemProcedure.execute(entity);
		return retval;
	}
}
