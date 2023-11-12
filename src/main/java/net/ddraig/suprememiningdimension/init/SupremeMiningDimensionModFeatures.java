
package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.ddraig.suprememiningdimension.world.features.ores.ZincOreFeature;
import net.ddraig.suprememiningdimension.world.features.ores.TungstenOreFeature;
import net.ddraig.suprememiningdimension.world.features.ores.TinOreFeature;
import net.ddraig.suprememiningdimension.world.features.ores.SphaleriteOreFeature;
import net.ddraig.suprememiningdimension.world.features.ores.SilverOreFeature;
import net.ddraig.suprememiningdimension.world.features.ores.QuartzOreFeature;
import net.ddraig.suprememiningdimension.world.features.ores.PlatinumOreFeature;
import net.ddraig.suprememiningdimension.world.features.ores.NickelOreFeature;
import net.ddraig.suprememiningdimension.world.features.ores.LeadOreFeature;
import net.ddraig.suprememiningdimension.world.features.ores.HeatedMagmaBlockFeature;
import net.ddraig.suprememiningdimension.world.features.ores.DiamondSandFeature;
import net.ddraig.suprememiningdimension.world.features.ores.DiamondGravelFeature;
import net.ddraig.suprememiningdimension.world.features.ores.DenseRedstoneOreFeature;
import net.ddraig.suprememiningdimension.world.features.ores.DenseLapisOreFeature;
import net.ddraig.suprememiningdimension.world.features.ores.DenseIronOreFeature;
import net.ddraig.suprememiningdimension.world.features.ores.DenseGoldOreFeature;
import net.ddraig.suprememiningdimension.world.features.ores.DenseEmeraldOreFeature;
import net.ddraig.suprememiningdimension.world.features.ores.DenseDiamondOreFeature;
import net.ddraig.suprememiningdimension.world.features.ores.DenseCopperOreFeature;
import net.ddraig.suprememiningdimension.world.features.ores.DenseCoalOreFeature;
import net.ddraig.suprememiningdimension.world.features.ores.DenseAndesiteFeature;
import net.ddraig.suprememiningdimension.world.features.ores.CobaltOreFeature;
import net.ddraig.suprememiningdimension.world.features.ores.AntimonyOreFeature;
import net.ddraig.suprememiningdimension.world.features.ores.AncientMossFeature;
import net.ddraig.suprememiningdimension.world.features.ores.AmberSolidFeature;
import net.ddraig.suprememiningdimension.world.features.ores.AluminumOreFeature;
import net.ddraig.suprememiningdimension.world.features.SphaleriteRocksFeature;
import net.ddraig.suprememiningdimension.world.features.LargeBeeNestFeature;
import net.ddraig.suprememiningdimension.world.features.KelpyOceanHelpFeature;
import net.ddraig.suprememiningdimension.world.features.EnderShipFeature;
import net.ddraig.suprememiningdimension.world.features.EnderCabin2Feature;
import net.ddraig.suprememiningdimension.world.features.EnderCabin1Feature;
import net.ddraig.suprememiningdimension.world.features.BigAsSpruceTreeOnPodzolFeature;
import net.ddraig.suprememiningdimension.world.features.BigAsSpruceTreeFeature;
import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

@Mod.EventBusSubscriber
public class SupremeMiningDimensionModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SupremeMiningDimensionMod.MODID);
	public static final RegistryObject<Feature<?>> DENSE_DIAMOND_ORE = REGISTRY.register("dense_diamond_ore", DenseDiamondOreFeature::new);
	public static final RegistryObject<Feature<?>> DENSE_IRON_ORE = REGISTRY.register("dense_iron_ore", DenseIronOreFeature::new);
	public static final RegistryObject<Feature<?>> DENSE_REDSTONE_ORE = REGISTRY.register("dense_redstone_ore", DenseRedstoneOreFeature::new);
	public static final RegistryObject<Feature<?>> DENSE_COPPER_ORE = REGISTRY.register("dense_copper_ore", DenseCopperOreFeature::new);
	public static final RegistryObject<Feature<?>> DENSE_COAL_ORE = REGISTRY.register("dense_coal_ore", DenseCoalOreFeature::new);
	public static final RegistryObject<Feature<?>> QUARTZ_ORE = REGISTRY.register("quartz_ore", QuartzOreFeature::new);
	public static final RegistryObject<Feature<?>> DENSE_LAPIS_ORE = REGISTRY.register("dense_lapis_ore", DenseLapisOreFeature::new);
	public static final RegistryObject<Feature<?>> DENSE_GOLD_ORE = REGISTRY.register("dense_gold_ore", DenseGoldOreFeature::new);
	public static final RegistryObject<Feature<?>> DENSE_EMERALD_ORE = REGISTRY.register("dense_emerald_ore", DenseEmeraldOreFeature::new);
	public static final RegistryObject<Feature<?>> SILVER_ORE = REGISTRY.register("silver_ore", SilverOreFeature::new);
	public static final RegistryObject<Feature<?>> TIN_ORE = REGISTRY.register("tin_ore", TinOreFeature::new);
	public static final RegistryObject<Feature<?>> TUNGSTEN_ORE = REGISTRY.register("tungsten_ore", TungstenOreFeature::new);
	public static final RegistryObject<Feature<?>> LEAD_ORE = REGISTRY.register("lead_ore", LeadOreFeature::new);
	public static final RegistryObject<Feature<?>> DENSE_ANDESITE = REGISTRY.register("dense_andesite", DenseAndesiteFeature::new);
	public static final RegistryObject<Feature<?>> NICKEL_ORE = REGISTRY.register("nickel_ore", NickelOreFeature::new);
	public static final RegistryObject<Feature<?>> PLATINUM_ORE = REGISTRY.register("platinum_ore", PlatinumOreFeature::new);
	public static final RegistryObject<Feature<?>> ALUMINUM_ORE = REGISTRY.register("aluminum_ore", AluminumOreFeature::new);
	public static final RegistryObject<Feature<?>> ZINC_ORE = REGISTRY.register("zinc_ore", ZincOreFeature::new);
	public static final RegistryObject<Feature<?>> AMBER_SOLID = REGISTRY.register("amber_solid", AmberSolidFeature::new);
	public static final RegistryObject<Feature<?>> KELPY_OCEAN_HELP = REGISTRY.register("kelpy_ocean_help", KelpyOceanHelpFeature::new);
	public static final RegistryObject<Feature<?>> ENDER_SHIP = REGISTRY.register("ender_ship", EnderShipFeature::new);
	public static final RegistryObject<Feature<?>> ENDER_CABIN_1 = REGISTRY.register("ender_cabin_1", EnderCabin1Feature::new);
	public static final RegistryObject<Feature<?>> ENDER_CABIN_2 = REGISTRY.register("ender_cabin_2", EnderCabin2Feature::new);
	public static final RegistryObject<Feature<?>> LARGE_BEE_NEST = REGISTRY.register("large_bee_nest", LargeBeeNestFeature::new);
	public static final RegistryObject<Feature<?>> BIG_AS_SPRUCE_TREE = REGISTRY.register("big_as_spruce_tree", BigAsSpruceTreeFeature::new);
	public static final RegistryObject<Feature<?>> BIG_AS_SPRUCE_TREE_ON_PODZOL = REGISTRY.register("big_as_spruce_tree_on_podzol", BigAsSpruceTreeOnPodzolFeature::new);
	public static final RegistryObject<Feature<?>> ANTIMONY_ORE = REGISTRY.register("antimony_ore", AntimonyOreFeature::new);
	public static final RegistryObject<Feature<?>> COBALT_ORE = REGISTRY.register("cobalt_ore", CobaltOreFeature::new);
	public static final RegistryObject<Feature<?>> SPHALERITE_ORE = REGISTRY.register("sphalerite_ore", SphaleriteOreFeature::new);
	public static final RegistryObject<Feature<?>> SPHALERITE_ROCKS = REGISTRY.register("sphalerite_rocks", SphaleriteRocksFeature::new);
	public static final RegistryObject<Feature<?>> DIAMOND_SAND = REGISTRY.register("diamond_sand", DiamondSandFeature::new);
	public static final RegistryObject<Feature<?>> DIAMOND_GRAVEL = REGISTRY.register("diamond_gravel", DiamondGravelFeature::new);
	public static final RegistryObject<Feature<?>> ANCIENT_MOSS = REGISTRY.register("ancient_moss", AncientMossFeature::new);
	public static final RegistryObject<Feature<?>> HEATED_MAGMA_BLOCK = REGISTRY.register("heated_magma_block", HeatedMagmaBlockFeature::new);
}
