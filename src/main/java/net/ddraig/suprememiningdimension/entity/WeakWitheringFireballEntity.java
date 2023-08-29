
package net.ddraig.suprememiningdimension.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.ddraig.suprememiningdimension.procedures.WitheringFireballProjectileHitsBlockProcedure;
import net.ddraig.suprememiningdimension.procedures.WeakWitheringFireballWhileProjectileFlyingTickProcedure;
import net.ddraig.suprememiningdimension.procedures.WeakWitheringFireballProjectileHitsPlayerProcedure;
import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModItems;
import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class WeakWitheringFireballEntity extends AbstractArrow implements ItemSupplier {
	public WeakWitheringFireballEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(SupremeMiningDimensionModEntities.WEAK_WITHERING_FIREBALL.get(), world);
	}

	public WeakWitheringFireballEntity(EntityType<? extends WeakWitheringFireballEntity> type, Level world) {
		super(type, world);
	}

	public WeakWitheringFireballEntity(EntityType<? extends WeakWitheringFireballEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public WeakWitheringFireballEntity(EntityType<? extends WeakWitheringFireballEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(SupremeMiningDimensionModItems.WITHERED_FIREBALL.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		WeakWitheringFireballProjectileHitsPlayerProcedure.execute(this.level(), entity);
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		WitheringFireballProjectileHitsBlockProcedure.execute(this.level(), blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ());
	}

	@Override
	public void tick() {
		super.tick();
		WeakWitheringFireballWhileProjectileFlyingTickProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
		if (this.inGround)
			this.discard();
	}

	public static WeakWitheringFireballEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		WeakWitheringFireballEntity entityarrow = new WeakWitheringFireballEntity(SupremeMiningDimensionModEntities.WEAK_WITHERING_FIREBALL.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		entityarrow.setSecondsOnFire(100);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static WeakWitheringFireballEntity shoot(LivingEntity entity, LivingEntity target) {
		WeakWitheringFireballEntity entityarrow = new WeakWitheringFireballEntity(SupremeMiningDimensionModEntities.WEAK_WITHERING_FIREBALL.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(4.5);
		entityarrow.setKnockback(2);
		entityarrow.setCritArrow(true);
		entityarrow.setSecondsOnFire(100);
		entity.level().addFreshEntity(entityarrow);
		entity.level().playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
