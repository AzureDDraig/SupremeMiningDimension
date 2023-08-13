
package net.ddraig.suprememiningdimension.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.BlockStateMatchTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.ddraig.suprememiningdimension.procedures.DiamondGravelGenBoolProcedure;
import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModBlocks;

import java.util.Set;
import java.util.List;

public class DiamondGravelFeature extends OreFeature {
	public static DiamondGravelFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new DiamondGravelFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("supreme_mining_dimension:diamond_gravel", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(Blocks.GRAVEL.defaultBlockState()), SupremeMiningDimensionModBlocks.DIAMOND_GRAVEL.get().defaultBlockState())), 20));
		PLACED_FEATURE = PlacementUtils.register("supreme_mining_dimension:diamond_gravel", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(5), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(32), VerticalAnchor.absolute(96)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD, ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("supreme_mining_dimension:false_overworld_dimension")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("supreme_mining_dimension:underground_dimension")), ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("supreme_mining_dimension:caverns")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("supreme_mining_dimension:deep_caverns")), ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("supreme_mining_dimension:strange_forests")),
			Level.NETHER);

	public DiamondGravelFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!DiamondGravelGenBoolProcedure.execute())
			return false;
		return super.place(context);
	}
}