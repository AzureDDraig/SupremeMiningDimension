package net.ddraig.suprememiningdimension.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AdvancedRespirationEffectProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		boolean activated = false;
		double levelhead = 0;
		double levelchest = 0;
		double levellegs = 0;
		double levelfeet = 0;
		ItemStack armortodamage = ItemStack.EMPTY;
		if (entity instanceof Player) {
			if (1 >= entity.getAirSupply()) {
				if (EnchantmentHelper.getItemEnchantmentLevel(SupremeMiningDimensionModEnchantments.ADVANCED_RESPIRATION_AUGMENT.get(),
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)) != 0) {
					levelhead = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getEnchantmentLevel(SupremeMiningDimensionModEnchantments.ADVANCED_RESPIRATION_AUGMENT.get());
					entity.setAirSupply(300);
					armortodamage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY);
					{
						ItemStack _ist = armortodamage;
						if (_ist.hurt((int) (18 - levelhead * 3), RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(SupremeMiningDimensionModEnchantments.ADVANCED_RESPIRATION_AUGMENT.get(),
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)) != 0) {
					levelchest = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getEnchantmentLevel(SupremeMiningDimensionModEnchantments.ADVANCED_RESPIRATION_AUGMENT.get());
					entity.setAirSupply(300);
					armortodamage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY);
					{
						ItemStack _ist = armortodamage;
						if (_ist.hurt((int) (18 - levelchest * 3), RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(SupremeMiningDimensionModEnchantments.ADVANCED_RESPIRATION_AUGMENT.get(),
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)) != 0) {
					levellegs = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(SupremeMiningDimensionModEnchantments.ADVANCED_RESPIRATION_AUGMENT.get());
					entity.setAirSupply(300);
					armortodamage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY);
					{
						ItemStack _ist = armortodamage;
						if (_ist.hurt((int) (18 - levellegs * 3), RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(SupremeMiningDimensionModEnchantments.ADVANCED_RESPIRATION_AUGMENT.get(),
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)) != 0) {
					levelfeet = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getEnchantmentLevel(SupremeMiningDimensionModEnchantments.ADVANCED_RESPIRATION_AUGMENT.get());
					entity.setAirSupply(300);
					armortodamage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY);
					{
						ItemStack _ist = armortodamage;
						if (_ist.hurt((int) (18 - levelfeet * 3), RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
			}
		}
	}
}
