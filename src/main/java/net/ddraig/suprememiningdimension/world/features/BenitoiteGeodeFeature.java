
package net.ddraig.suprememiningdimension.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.GeodeFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import java.util.Set;

public class BenitoiteGeodeFeature extends GeodeFeature {
	private final Set<ResourceKey<Level>> generateDimensions = Set.of(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("supreme_mining_dimension:deep_caverns")));

	public BenitoiteGeodeFeature() {
		super(GeodeConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<GeodeConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generateDimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
