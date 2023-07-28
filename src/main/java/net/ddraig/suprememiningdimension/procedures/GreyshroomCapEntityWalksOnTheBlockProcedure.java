package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class GreyshroomCapEntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (BiomesConfiguration.SHROOMHEALER.get()) {
			if (3 <= (entity instanceof Player _plr ? _plr.experienceLevel : 0) && !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.LUCK) : false)) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 10, 3));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 1200, 1));
			}
		}
	}
}
