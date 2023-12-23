package net.ddraig.suprememiningdimension.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class SMDDimensionsConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> FALSE_OW;
	public static final ForgeConfigSpec.ConfigValue<Boolean> UNDERGROUND;
	public static final ForgeConfigSpec.ConfigValue<Boolean> CAVERNS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DEEP_CAVERNS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> STRANGE_FORESTS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> ENDER_CAVES;
	public static final ForgeConfigSpec.ConfigValue<Boolean> NETHER_ISLES;
	public static final ForgeConfigSpec.ConfigValue<Boolean> SHIFTED_SANDS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> VOID_WORLD;
	public static final ForgeConfigSpec.ConfigValue<Boolean> NICE_FALSE_OW;
	public static final ForgeConfigSpec.ConfigValue<Boolean> NICE_UNDERGROUND;
	public static final ForgeConfigSpec.ConfigValue<Boolean> NICE_CAVERNS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> NICE_DEEP_CAVERNS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> NICE_STRANGE_FORESTS;
	public static final ForgeConfigSpec.ConfigValue<Double> FALSE_OW_MIN;
	public static final ForgeConfigSpec.ConfigValue<Double> FALSE_OW_MAX;
	public static final ForgeConfigSpec.ConfigValue<Boolean> FALSE_OW_AWAY;
	static {
		BUILDER.push("Portals");
		FALSE_OW = BUILDER.define("false_ow", true);
		UNDERGROUND = BUILDER.define("underground", true);
		CAVERNS = BUILDER.define("caverns", true);
		DEEP_CAVERNS = BUILDER.define("deep_caverns", true);
		STRANGE_FORESTS = BUILDER.define("strange_forests", true);
		ENDER_CAVES = BUILDER.define("ender_caves", true);
		NETHER_ISLES = BUILDER.define("nether_isles", true);
		SHIFTED_SANDS = BUILDER.define("shifted_sands", true);
		VOID_WORLD = BUILDER.define("void_world", true);
		BUILDER.pop();
		BUILDER.push("Nice Portal Placement");
		NICE_FALSE_OW = BUILDER.define("nice_false_ow", true);
		NICE_UNDERGROUND = BUILDER.define("nice_underground", true);
		NICE_CAVERNS = BUILDER.define("nice_caverns", true);
		NICE_DEEP_CAVERNS = BUILDER.define("nice_deep_caverns", true);
		NICE_STRANGE_FORESTS = BUILDER.define("nice_strange_forests", true);
		BUILDER.pop();
		BUILDER.push("False OW Away From Portal");
		FALSE_OW_MIN = BUILDER.comment("DEFAULT: 100").define("false_ow_min", (double) 100);
		FALSE_OW_MAX = BUILDER.comment("DEFAULT: 150").define("false_ow_max", (double) 150);
		FALSE_OW_AWAY = BUILDER.comment("DEFAULT: FALSE").define("false_ow_away", false);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
