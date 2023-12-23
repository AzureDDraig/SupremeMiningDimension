package net.ddraig.suprememiningdimension.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class SMDStructuresConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> BIG_AS_SPRUCE_TREE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> IRON_DUNGEON;
	public static final ForgeConfigSpec.ConfigValue<Boolean> SHROOM_POISONER;
	public static final ForgeConfigSpec.ConfigValue<Boolean> SHROOM_HEALER;
	public static final ForgeConfigSpec.ConfigValue<Boolean> END_SOIL_SPREAD;
	public static final ForgeConfigSpec.ConfigValue<Boolean> SHADE_SOIL_SPREAD;
	public static final ForgeConfigSpec.ConfigValue<Boolean> SHADE_STONE_SPREAD;
	static {
		BUILDER.push("Natural");
		BIG_AS_SPRUCE_TREE = BUILDER.define("big_as_spruce_tree", true);
		BUILDER.pop();
		BUILDER.push("Dungeons");
		IRON_DUNGEON = BUILDER.define("iron_dungeon", true);
		BUILDER.pop();
		BUILDER.push("Blocks");
		SHROOM_POISONER = BUILDER.comment("Controls whether the toxicshroom poisons you on touch").define("shroom_poisoner", true);
		SHROOM_HEALER = BUILDER.comment("Controls if the angelshroom can heal players").define("shroom_healer", true);
		END_SOIL_SPREAD = BUILDER.comment("DEFAULT: TRUE || Controls if end soil can spread to dirt").define("end_soil_spread", true);
		SHADE_SOIL_SPREAD = BUILDER.comment("DEFAULT: TRUE || Controls if shade soil can spread to dirt").define("shade_soil_spread", true);
		SHADE_STONE_SPREAD = BUILDER.comment("DEFAULT: FALSE || Controls if shade stone can spread to stone or deepslate").define("shade_stone_spread", true);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
