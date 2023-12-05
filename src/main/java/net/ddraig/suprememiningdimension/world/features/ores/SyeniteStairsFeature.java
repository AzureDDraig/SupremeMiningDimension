
package net.ddraig.suprememiningdimension.world.features.ores;

import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import java.util.Set;

public class SyeniteStairsFeature extends OreFeature {
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("supreme_mining_dimension:false_overworld_dimension")),
			ResourceKey.create(Registries.DIMENSION, new ResourceLocation("supreme_mining_dimension:underground_dimension")), ResourceKey.create(Registries.DIMENSION, new ResourceLocation("supreme_mining_dimension:caverns")),
			ResourceKey.create(Registries.DIMENSION, new ResourceLocation("supreme_mining_dimension:deep_caverns")), ResourceKey.create(Registries.DIMENSION, new ResourceLocation("supreme_mining_dimension:strange_forests")),
			ResourceKey.create(Registries.DIMENSION, new ResourceLocation("supreme_mining_dimension:shifted_sands")));

	public SyeniteStairsFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
