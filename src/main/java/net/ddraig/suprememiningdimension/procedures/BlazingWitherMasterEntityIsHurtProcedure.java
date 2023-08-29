package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;
import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

public class BlazingWitherMasterEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean healdamage = false;
		double xx = 0;
		double yy = 0;
		double zz = 0;
		if (0.4 >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / (double) BiomesConfiguration.MAX_HEALTH.get()) {
			if (BiomesConfiguration.GLOW_WHEN_ABOUT_TO_HEAL.get()) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) ((double) BiomesConfiguration.HEAL_DELAY_SECONDS.get() * 20), 1, (false), (false)));
			}
			SupremeMiningDimensionMod.queueServerWork((int) ((double) BiomesConfiguration.HEAL_DELAY_SECONDS.get() * 20), () -> {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) (double) BiomesConfiguration.MAX_HEALTH.get());
			});
			if (entity instanceof Mob _entity)
				_entity.getNavigation().moveTo(x, y, z, 1);
		}
		if (Math.random() < 0.7) {
			entity.getPersistentData().putDouble("counter1", (entity.getPersistentData().getDouble("counter1") + 1));
			if (entity.getPersistentData().getDouble("counter1") % (double) BiomesConfiguration.NUMBER_HITS_HEAVY_ATTACKS.get() == 0) {
				xx = entity.getX();
				yy = entity.getY();
				zz = entity.getZ();
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos((int)xx, (int)yy, (int)zz)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (BiomesConfiguration.FIREBALL_SIZE_INCREASE.get()) {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getFireball(Level level, Entity shooter, double ax, double ay, double az) {
									AbstractHurtingProjectile entityToSpawn = new LargeFireball(EntityType.FIREBALL, level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.xPower = ax;
									entityToSpawn.yPower = ay;
									entityToSpawn.zPower = az;
									return entityToSpawn;
								}
							}.getFireball(projectileLevel, entity, (entity.getLookAngle().x / 10), (entity.getLookAngle().y / 10), (entity.getLookAngle().z / 10));
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 0.1, 5);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
				} else {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getFireball(Level level, Entity shooter, double ax, double ay, double az) {
									AbstractHurtingProjectile entityToSpawn = new SmallFireball(EntityType.SMALL_FIREBALL, level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.xPower = ax;
									entityToSpawn.yPower = ay;
									entityToSpawn.zPower = az;
									return entityToSpawn;
								}
							}.getFireball(projectileLevel, entity, (entity.getLookAngle().x / 10), (entity.getLookAngle().y / 10), (entity.getLookAngle().z / 10));
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 0.4, 2);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
				}
			}
		}
	}
}
