package net.ddraig.suprememiningdimension.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class SMDOresConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DENSE_ORES_ENABLED;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DENSE_ANDESITE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DENSE_COAL_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DENSE_COPPER_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DENSE_DIAMOND_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DENSE_EMERALD_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DENSE_GOLD_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DENSE_IRON_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DENSE_LAPIS_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DENSE_REDSTONE_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> ALUMINUM_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> ANTIMONY_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> COBALT_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DIAMOND_SAND_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DIAMOND_GRAVEL_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> LEAD_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> NICKEL_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> PALLADIUM_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> PLATINUM_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> QUARTZ_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> SILVER_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> SPHALERITE_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> SULPHUR_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> TIN_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> TITANIUM_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> TUNGSTEN_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> URANIUM_ORE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> ZINC_ORE;
	static {
		BUILDER.push("Dense Ores");
		DENSE_ORES_ENABLED = BUILDER.define("dense_ores_enabled", true);
		DENSE_ANDESITE = BUILDER.define("dense_andesite", true);
		DENSE_COAL_ORE = BUILDER.define("dense_coal_ore", true);
		DENSE_COPPER_ORE = BUILDER.define("dense_copper_ore", true);
		DENSE_DIAMOND_ORE = BUILDER.define("dense_diamond_ore", true);
		DENSE_EMERALD_ORE = BUILDER.define("dense_emerald_ore", true);
		DENSE_GOLD_ORE = BUILDER.define("dense_gold_ore", true);
		DENSE_IRON_ORE = BUILDER.define("dense_iron_ore", true);
		DENSE_LAPIS_ORE = BUILDER.define("dense_lapis_ore", true);
		DENSE_REDSTONE_ORE = BUILDER.define("dense_redstone_ore", true);
		BUILDER.pop();
		BUILDER.push("Ores");
		ALUMINUM_ORE = BUILDER.define("aluminum_ore", true);
		ANTIMONY_ORE = BUILDER.define("antimony_ore", true);
		COBALT_ORE = BUILDER.define("cobalt_ore", true);
		DIAMOND_SAND_ORE = BUILDER.define("diamond_sand_ore", true);
		DIAMOND_GRAVEL_ORE = BUILDER.define("diamond_gravel_ore", true);
		LEAD_ORE = BUILDER.define("lead_ore", true);
		NICKEL_ORE = BUILDER.define("nickel_ore", true);
		PALLADIUM_ORE = BUILDER.define("palladium_ore", true);
		PLATINUM_ORE = BUILDER.define("platinum_ore", true);
		QUARTZ_ORE = BUILDER.define("quartz_ore", true);
		SILVER_ORE = BUILDER.define("silver_ore", true);
		SPHALERITE_ORE = BUILDER.define("sphalerite_ore", true);
		SULPHUR_ORE = BUILDER.define("sulphur_ore", true);
		TIN_ORE = BUILDER.define("tin_ore", true);
		TITANIUM_ORE = BUILDER.define("titanium_ore", true);
		TUNGSTEN_ORE = BUILDER.define("tungsten_ore", true);
		URANIUM_ORE = BUILDER.define("uranium_ore", true);
		ZINC_ORE = BUILDER.define("zinc_ore", true);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
