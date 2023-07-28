
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.ddraig.suprememiningdimension.world.biome.SurfaceMiningDimensionBiome;
import net.ddraig.suprememiningdimension.world.biome.SpruceShrublandBiome;
import net.ddraig.suprememiningdimension.world.biome.SculkCavernsBiome;
import net.ddraig.suprememiningdimension.world.biome.OvergrownCavernsBiome;
import net.ddraig.suprememiningdimension.world.biome.NetherIslandsBiome;
import net.ddraig.suprememiningdimension.world.biome.MushroomForestBiome;
import net.ddraig.suprememiningdimension.world.biome.MagmaticCavernsBiome;
import net.ddraig.suprememiningdimension.world.biome.GlacialCavernsBiome;
import net.ddraig.suprememiningdimension.world.biome.FrozenCavernsBiome;
import net.ddraig.suprememiningdimension.world.biome.EndCavesBiome;
import net.ddraig.suprememiningdimension.world.biome.DripstoneCavernsBiome;
import net.ddraig.suprememiningdimension.world.biome.AncientForestBiome;
import net.ddraig.suprememiningdimension.world.biome.AmethystCavernsBiome;
import net.ddraig.suprememiningdimension.world.biome.AmberCavernsBiome;
import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

public class SupremeMiningDimensionModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, SupremeMiningDimensionMod.MODID);
	public static final RegistryObject<Biome> SCULK_CAVERNS = REGISTRY.register("sculk_caverns", SculkCavernsBiome::createBiome);
	public static final RegistryObject<Biome> MAGMATIC_CAVERNS = REGISTRY.register("magmatic_caverns", MagmaticCavernsBiome::createBiome);
	public static final RegistryObject<Biome> OVERGROWN_CAVERNS = REGISTRY.register("overgrown_caverns", OvergrownCavernsBiome::createBiome);
	public static final RegistryObject<Biome> FROZEN_CAVERNS = REGISTRY.register("frozen_caverns", FrozenCavernsBiome::createBiome);
	public static final RegistryObject<Biome> AMETHYST_CAVERNS = REGISTRY.register("amethyst_caverns", AmethystCavernsBiome::createBiome);
	public static final RegistryObject<Biome> SURFACE_MINING_DIMENSION = REGISTRY.register("surface_mining_dimension", SurfaceMiningDimensionBiome::createBiome);
	public static final RegistryObject<Biome> DRIPSTONE_CAVERNS = REGISTRY.register("dripstone_caverns", DripstoneCavernsBiome::createBiome);
	public static final RegistryObject<Biome> NETHER_ISLANDS = REGISTRY.register("nether_islands", NetherIslandsBiome::createBiome);
	public static final RegistryObject<Biome> END_CAVES = REGISTRY.register("end_caves", EndCavesBiome::createBiome);
	public static final RegistryObject<Biome> MUSHROOM_FOREST = REGISTRY.register("mushroom_forest", MushroomForestBiome::createBiome);
	public static final RegistryObject<Biome> SPRUCE_SHRUBLAND = REGISTRY.register("spruce_shrubland", SpruceShrublandBiome::createBiome);
	public static final RegistryObject<Biome> ANCIENT_FOREST = REGISTRY.register("ancient_forest", AncientForestBiome::createBiome);
	public static final RegistryObject<Biome> AMBER_CAVERNS = REGISTRY.register("amber_caverns", AmberCavernsBiome::createBiome);
	public static final RegistryObject<Biome> GLACIAL_CAVERNS = REGISTRY.register("glacial_caverns", GlacialCavernsBiome::createBiome);
}
