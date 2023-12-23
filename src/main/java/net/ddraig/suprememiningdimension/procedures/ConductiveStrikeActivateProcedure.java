package net.ddraig.suprememiningdimension.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModMobEffects;
import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ConductiveStrikeActivateProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(SupremeMiningDimensionModEnchantments.AUGMENT_CONDUCTIVE_STRIKE.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(SupremeMiningDimensionModMobEffects.CONDUCTIVE.get(), 40,
						(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(SupremeMiningDimensionModEnchantments.AUGMENT_CONDUCTIVE_STRIKE.get()), false, false));
			{
				ItemStack _ist = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				if (_ist.hurt((int) (12 - (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(SupremeMiningDimensionModEnchantments.AUGMENT_CONDUCTIVE_STRIKE.get()) * 3),
						RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(SupremeMiningDimensionModEnchantments.AUGMENT_CONDUCTIVE_STRIKE.get(),
				(sourceentity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)) != 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(SupremeMiningDimensionModMobEffects.CONDUCTIVE.get(), 40,
						(sourceentity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getEnchantmentLevel(SupremeMiningDimensionModEnchantments.AUGMENT_CONDUCTIVE_STRIKE.get()), false, false));
			{
				ItemStack _ist = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				if (_ist.hurt(
						(int) (12
								- (sourceentity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getEnchantmentLevel(SupremeMiningDimensionModEnchantments.AUGMENT_CONDUCTIVE_STRIKE.get()) * 3),
						RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(SupremeMiningDimensionModEnchantments.AUGMENT_CONDUCTIVE_STRIKE.get(),
				(sourceentity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)) != 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(SupremeMiningDimensionModMobEffects.CONDUCTIVE.get(), 40,
						(sourceentity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getEnchantmentLevel(SupremeMiningDimensionModEnchantments.AUGMENT_CONDUCTIVE_STRIKE.get()), false, false));
			{
				ItemStack _ist = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				if (_ist.hurt(
						(int) (12
								- (sourceentity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getEnchantmentLevel(SupremeMiningDimensionModEnchantments.AUGMENT_CONDUCTIVE_STRIKE.get()) * 3),
						RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(SupremeMiningDimensionModEnchantments.AUGMENT_CONDUCTIVE_STRIKE.get(),
				(sourceentity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)) != 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(SupremeMiningDimensionModMobEffects.CONDUCTIVE.get(), 40,
						(sourceentity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(SupremeMiningDimensionModEnchantments.AUGMENT_CONDUCTIVE_STRIKE.get()), false,
						false));
			{
				ItemStack _ist = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				if (_ist.hurt(
						(int) (12
								- (sourceentity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(SupremeMiningDimensionModEnchantments.AUGMENT_CONDUCTIVE_STRIKE.get()) * 3),
						RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(SupremeMiningDimensionModEnchantments.AUGMENT_CONDUCTIVE_STRIKE.get(),
				(sourceentity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)) != 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(SupremeMiningDimensionModMobEffects.CONDUCTIVE.get(), 40,
						(sourceentity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getEnchantmentLevel(SupremeMiningDimensionModEnchantments.AUGMENT_CONDUCTIVE_STRIKE.get()), false, false));
			{
				ItemStack _ist = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				if (_ist.hurt(
						(int) (12
								- (sourceentity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getEnchantmentLevel(SupremeMiningDimensionModEnchantments.AUGMENT_CONDUCTIVE_STRIKE.get()) * 3),
						RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
	}
}
