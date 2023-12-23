package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.ddraig.suprememiningdimension.entity.TunnelerBrotherEntity;
import net.ddraig.suprememiningdimension.entity.QuarrierBrotherEntity;
import net.ddraig.suprememiningdimension.configuration.SMDBossesConfiguration;

public class ProspectorBrotherOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (SMDBossesConfiguration.IS_PROSPECTOR_IMMORTAL_WITH_BROTHERS.get()) {
			if (!world.getEntitiesOfClass(TunnelerBrotherEntity.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(QuarrierBrotherEntity.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 5));
			}
		}
	}
}
