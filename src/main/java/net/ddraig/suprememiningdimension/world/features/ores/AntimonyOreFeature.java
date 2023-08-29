
package net.ddraig.suprememiningdimension.world.features.ores;

import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.ddraig.suprememiningdimension.procedures.AntimonyBoolProcedure;

import java.util.Set;

public class AntimonyOreFeature extends OreFeature {
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("supreme_mining_dimension:caverns")),
			ResourceKey.create(Registries.DIMENSION, new ResourceLocation("supreme_mining_dimension:deep_caverns")));

	public AntimonyOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!AntimonyBoolProcedure.execute())
			return false;
		return super.place(context);
	}
}
