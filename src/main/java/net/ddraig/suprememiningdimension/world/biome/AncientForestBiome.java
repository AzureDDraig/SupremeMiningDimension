
package net.ddraig.suprememiningdimension.world.biome;

import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaPineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

import net.ddraig.suprememiningdimension.world.features.treedecorators.AncientForestTrunkDecorator;
import net.ddraig.suprememiningdimension.world.features.treedecorators.AncientForestLeaveDecorator;
import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModEntities;

import java.util.List;

import com.google.common.collect.ImmutableList;

public class AncientForestBiome {
	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-16751053).waterColor(-16751002).waterFogColor(-13382401).skyColor(-16751053).foliageColorOverride(-16751053).grassColorOverride(-16751104)
				.ambientLoopSound(new SoundEvent(new ResourceLocation("supreme_mining_dimension:smd.biome.ancient"))).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("supreme_mining_dimension:tree_ancient_forest",
						FeatureUtils.register("supreme_mining_dimension:tree_ancient_forest", Feature.TREE,
								new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.DARK_OAK_LOG.defaultBlockState()), new GiantTrunkPlacer(15, 2, 14), BlockStateProvider.simple(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
										new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(3, 4)), new TwoLayersFeatureSize(1, 1, 2))
										.decorators(ImmutableList.of(AncientForestLeaveDecorator.INSTANCE, AncientForestTrunkDecorator.INSTANCE)).build()),
						List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome())));
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addSwampVegetation(biomeGenerationSettings);
		BiomeDefaultFeatures.addDesertExtraDecoration(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultExtraVegetation(biomeGenerationSettings);
		BiomeDefaultFeatures.addMossyStoneBlock(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(SupremeMiningDimensionModEntities.DUCK.get(), 30, 3, 4));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.PHANTOM, 88, 2, 3));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.RAVAGER, 5, 1, 1));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 80, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 12, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.HUSK, 85, 1, 3));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 75, 2, 3));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.ALLAY, 20, 4, 4));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CAVE_SPIDER, 70, 3, 3));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FROG, 15, 2, 5));
		mobSpawnInfo.addSpawn(MobCategory.AXOLOTLS, new MobSpawnSettings.SpawnerData(EntityType.AXOLOTL, 8, 1, 3));
		mobSpawnInfo.addSpawn(MobCategory.WATER_AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.SALMON, 1, 1, 4));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).temperature(0.5f).downfall(0.5f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
