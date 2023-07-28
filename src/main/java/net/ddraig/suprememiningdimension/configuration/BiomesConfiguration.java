package net.ddraig.suprememiningdimension.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class BiomesConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> FALSE_OVERWORLD;
	public static final ForgeConfigSpec.ConfigValue<Boolean> UNDERGROUND;
	public static final ForgeConfigSpec.ConfigValue<Boolean> CAVERNS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DEEP_CAVERNS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> ENDER_CAVES;
	public static final ForgeConfigSpec.ConfigValue<Boolean> NETHER_ISLANDS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> STRANGE_FORESTS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> BIG_AS_SPRUCE_TREE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> SHROOMPOISONER;
	public static final ForgeConfigSpec.ConfigValue<Boolean> SHROOMHEALER;
	public static final ForgeConfigSpec.ConfigValue<Boolean> FALSE_OW_NICE_PLACE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> CAVERNS_NICE_PLACE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DEEP_CAVERNS_NICE_PLACE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> UNDERGROUND_NICE_PLACE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> SPAWN_RANDOM_MONSTER;
	public static final ForgeConfigSpec.ConfigValue<Boolean> RED_SLIME_ALLOWED;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DUCK_ALLOWED;
	public static final ForgeConfigSpec.ConfigValue<Boolean> CHICKSHROOM_ALLOWED;
	public static final ForgeConfigSpec.ConfigValue<Boolean> BLAZING_WITHER_SKELE_ALLOWED;
	public static final ForgeConfigSpec.ConfigValue<Double> PERCENTFAULTY;
	public static final ForgeConfigSpec.ConfigValue<Double> TIME_EXPLOSION_SECONDS;
	public static final ForgeConfigSpec.ConfigValue<Double> PROSPECTOREXPLOSIVEPOWER;
	public static final ForgeConfigSpec.ConfigValue<Double> HOLDSTILLEXPLODEDELAYTICKS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> IS_PROSPECTOR_IMMORTAL_WITH_BROTHERS;
	static {
		BUILDER.push("Dimension_Enabler");
		FALSE_OVERWORLD = BUILDER.define("false_overworld", true);
		UNDERGROUND = BUILDER.define("underground", true);
		CAVERNS = BUILDER.define("caverns", true);
		DEEP_CAVERNS = BUILDER.define("deep_caverns", true);
		ENDER_CAVES = BUILDER.define("ender_caves", true);
		NETHER_ISLANDS = BUILDER.define("nether_islands", true);
		STRANGE_FORESTS = BUILDER.define("strange_forests", true);
		BUILDER.pop();
		BUILDER.push("Structures");
		BIG_AS_SPRUCE_TREE = BUILDER.define("big_as_spruce_tree", true);
		SHROOMPOISONER = BUILDER.comment("Controls whether the toxicshroom poisons you on touch").define("shroompoisoner", true);
		SHROOMHEALER = BUILDER.comment("Controls if the angelshroom can heal players").define("shroomhealer", true);
		BUILDER.pop();
		BUILDER.push("Being Nice with Portals Placement");
		FALSE_OW_NICE_PLACE = BUILDER.comment("This will make sure that on the first visit to the false overworld players will have their portal spawn above the surface").define("false_ow_nice_place", true);
		CAVERNS_NICE_PLACE = BUILDER.define("caverns_nice_place", true);
		DEEP_CAVERNS_NICE_PLACE = BUILDER.define("deep_caverns_nice_place", true);
		UNDERGROUND_NICE_PLACE = BUILDER.define("underground_nice_place", true);
		BUILDER.pop();
		BUILDER.push("Mob Handling");
		SPAWN_RANDOM_MONSTER = BUILDER.define("spawn_random_monster", false);
		RED_SLIME_ALLOWED = BUILDER.define("red_slime_allowed", true);
		DUCK_ALLOWED = BUILDER.define("duck_allowed", true);
		CHICKSHROOM_ALLOWED = BUILDER.define("chickshroom_allowed", true);
		BLAZING_WITHER_SKELE_ALLOWED = BUILDER.define("blazing_wither_skele_allowed", true);
		BUILDER.pop();
		BUILDER.push("Miner Brother Modifications");
		BUILDER.comment("THESE CONTROL THE ABILITIES OF THE MINER BROTHERS, BE CAUTIOUS AS IT IS VERY EASY TO UNBALANCE IT");
		PERCENTFAULTY = BUILDER.comment("DEFAULT: 0.33").define("percentfaulty", (double) 0.33);
		TIME_EXPLOSION_SECONDS = BUILDER.comment("DEFAULT: 2").define("time_explosion_seconds", (double) 2);
		PROSPECTOREXPLOSIVEPOWER = BUILDER.comment("DEFAULT: 2.2").define("prospectorexplosivepower", (double) 2.2);
		HOLDSTILLEXPLODEDELAYTICKS = BUILDER.comment("DEFAULT: 21 || delay before the jumping explosion").define("holdstillexplodedelayticks", (double) 21);
		IS_PROSPECTOR_IMMORTAL_WITH_BROTHERS = BUILDER.define("is_prospector_immortal_with_brothers", true);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
