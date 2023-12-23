package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.ddraig.suprememiningdimension.configuration.SMDStructuresConfigConfiguration;

public class PurpleshroomCapEntityCollidesInTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (SMDStructuresConfigConfiguration.SHROOM_POISONER.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 60, 1, false, false));
		}
	}
}
