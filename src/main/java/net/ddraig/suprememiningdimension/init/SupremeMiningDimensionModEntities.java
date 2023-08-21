
package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.ddraig.suprememiningdimension.entity.WitheringFireballEntity;
import net.ddraig.suprememiningdimension.entity.WitheredBlazeEntity;
import net.ddraig.suprememiningdimension.entity.WeakWitheringFireballEntity;
import net.ddraig.suprememiningdimension.entity.WeakWitheredFireballEntity;
import net.ddraig.suprememiningdimension.entity.TunnelerBrotherEntity;
import net.ddraig.suprememiningdimension.entity.ShroombieEntity;
import net.ddraig.suprememiningdimension.entity.ShadowCreeperEntity;
import net.ddraig.suprememiningdimension.entity.QuarrierBrotherEntity;
import net.ddraig.suprememiningdimension.entity.ProspectorBrotherEntity;
import net.ddraig.suprememiningdimension.entity.ExplosiveThrownEntity;
import net.ddraig.suprememiningdimension.entity.DuckEntity;
import net.ddraig.suprememiningdimension.entity.ChickshroomEntity;
import net.ddraig.suprememiningdimension.entity.BlazingWitherMasterEntity;
import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SupremeMiningDimensionModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SupremeMiningDimensionMod.MODID);
	public static final RegistryObject<EntityType<DuckEntity>> DUCK = register("duck",
			EntityType.Builder.<DuckEntity>of(DuckEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DuckEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<ChickshroomEntity>> CHICKSHROOM = register("chickshroom",
			EntityType.Builder.<ChickshroomEntity>of(ChickshroomEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChickshroomEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<TunnelerBrotherEntity>> TUNNELER_BROTHER = register("tunneler_brother", EntityType.Builder.<TunnelerBrotherEntity>of(TunnelerBrotherEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TunnelerBrotherEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<QuarrierBrotherEntity>> QUARRIER_BROTHER = register("quarrier_brother",
			EntityType.Builder.<QuarrierBrotherEntity>of(QuarrierBrotherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(QuarrierBrotherEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ProspectorBrotherEntity>> PROSPECTOR_BROTHER = register("prospector_brother",
			EntityType.Builder.<ProspectorBrotherEntity>of(ProspectorBrotherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ProspectorBrotherEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WitheredBlazeEntity>> WITHERED_BLAZE = register("withered_blaze", EntityType.Builder.<WitheredBlazeEntity>of(WitheredBlazeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WitheredBlazeEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ExplosiveThrownEntity>> EXPLOSIVE_THROWN = register("projectile_explosive_thrown", EntityType.Builder.<ExplosiveThrownEntity>of(ExplosiveThrownEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ExplosiveThrownEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WitheringFireballEntity>> WITHERING_FIREBALL = register("projectile_withering_fireball", EntityType.Builder.<WitheringFireballEntity>of(WitheringFireballEntity::new, MobCategory.MISC)
			.setCustomClientFactory(WitheringFireballEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlazingWitherMasterEntity>> BLAZING_WITHER_MASTER = register("blazing_wither_master", EntityType.Builder.<BlazingWitherMasterEntity>of(BlazingWitherMasterEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlazingWitherMasterEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WeakWitheringFireballEntity>> WEAK_WITHERING_FIREBALL = register("projectile_weak_withering_fireball",
			EntityType.Builder.<WeakWitheringFireballEntity>of(WeakWitheringFireballEntity::new, MobCategory.MISC).setCustomClientFactory(WeakWitheringFireballEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WeakWitheredFireballEntity>> WEAK_WITHERED_FIREBALL = register("projectile_weak_withered_fireball", EntityType.Builder.<WeakWitheredFireballEntity>of(WeakWitheredFireballEntity::new, MobCategory.MISC)
			.setCustomClientFactory(WeakWitheredFireballEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShroombieEntity>> SHROOMBIE = register("shroombie",
			EntityType.Builder.<ShroombieEntity>of(ShroombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShroombieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShadowCreeperEntity>> SHADOW_CREEPER = register("shadow_creeper",
			EntityType.Builder.<ShadowCreeperEntity>of(ShadowCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShadowCreeperEntity::new)

					.sized(0.6f, 1f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DuckEntity.init();
			ChickshroomEntity.init();
			TunnelerBrotherEntity.init();
			QuarrierBrotherEntity.init();
			ProspectorBrotherEntity.init();
			WitheredBlazeEntity.init();
			BlazingWitherMasterEntity.init();
			ShroombieEntity.init();
			ShadowCreeperEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DUCK.get(), DuckEntity.createAttributes().build());
		event.put(CHICKSHROOM.get(), ChickshroomEntity.createAttributes().build());
		event.put(TUNNELER_BROTHER.get(), TunnelerBrotherEntity.createAttributes().build());
		event.put(QUARRIER_BROTHER.get(), QuarrierBrotherEntity.createAttributes().build());
		event.put(PROSPECTOR_BROTHER.get(), ProspectorBrotherEntity.createAttributes().build());
		event.put(WITHERED_BLAZE.get(), WitheredBlazeEntity.createAttributes().build());
		event.put(BLAZING_WITHER_MASTER.get(), BlazingWitherMasterEntity.createAttributes().build());
		event.put(SHROOMBIE.get(), ShroombieEntity.createAttributes().build());
		event.put(SHADOW_CREEPER.get(), ShadowCreeperEntity.createAttributes().build());
	}
}
