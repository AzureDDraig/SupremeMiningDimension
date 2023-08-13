
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

import net.ddraig.suprememiningdimension.procedures.DenseCoalBoolProcedure;
import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModBlocks;

import java.util.Set;
import java.util.List;

public class DenseCoalOreFeature extends OreFeature {
	public static DenseCoalOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new DenseCoalOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("supreme_mining_dimension:dense_coal_ore", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(Blocks.ICE.defaultBlockState()), SupremeMiningDimensionModBlocks.DENSE_COAL_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.AMETHYST_BLOCK.defaultBlockState()), SupremeMiningDimensionModBlocks.DENSE_COAL_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.STONE.defaultBlockState()), SupremeMiningDimensionModBlocks.DENSE_COAL_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.GRANITE.defaultBlockState()), SupremeMiningDimensionModBlocks.DENSE_COAL_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DIORITE.defaultBlockState()), SupremeMiningDimensionModBlocks.DENSE_COAL_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.ANDESITE.defaultBlockState()), SupremeMiningDimensionModBlocks.DENSE_COAL_ORE.get().defaultBlockState())), 9));
		PLACED_FEATURE = PlacementUtils.register("supreme_mining_dimension:dense_coal_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(8), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(13), VerticalAnchor.absolute(113)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("supreme_mining_dimension:underground_dimension")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("supreme_mining_dimension:caverns")));

	public DenseCoalOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!DenseCoalBoolProcedure.execute())
			return false;
		return super.place(context);
	}
}
