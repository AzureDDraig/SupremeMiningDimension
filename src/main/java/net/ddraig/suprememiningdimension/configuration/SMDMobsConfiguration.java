package net.ddraig.suprememiningdimension.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class SMDMobsConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DUCK_ENABLED;
	public static final ForgeConfigSpec.ConfigValue<Boolean> CHICKSHROOM_ENABLED;
	public static final ForgeConfigSpec.ConfigValue<Boolean> RED_SLIME_ENABLED;
	public static final ForgeConfigSpec.ConfigValue<Boolean> SHROOMBIE_ENABLED;
	public static final ForgeConfigSpec.ConfigValue<Boolean> CREEPER_SHADE_ENABLED;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DUNGEON_WARRIOR_ENABLED;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DUNGEON_ARCHER_ENABLED;
	public static final ForgeConfigSpec.ConfigValue<Boolean> BLAZING_WITHER_SKELE_ENABLED;
	public static final ForgeConfigSpec.ConfigValue<Boolean> RANDOM_PORTAL_MOB;
	static {
		BUILDER.push("Passives");
		DUCK_ENABLED = BUILDER.define("duck_enabled", true);
		CHICKSHROOM_ENABLED = BUILDER.define("chickshroom_enabled", true);
		RED_SLIME_ENABLED = BUILDER.define("red_slime_enabled", true);
		BUILDER.pop();
		BUILDER.push("Hostiles");
		SHROOMBIE_ENABLED = BUILDER.define("shroombie_enabled", true);
		CREEPER_SHADE_ENABLED = BUILDER.define("creeper_shade_enabled", true);
		DUNGEON_WARRIOR_ENABLED = BUILDER.define("dungeon_warrior_enabled", true);
		DUNGEON_ARCHER_ENABLED = BUILDER.define("dungeon_archer_enabled", true);
		BLAZING_WITHER_SKELE_ENABLED = BUILDER.define("blazing_wither_skele_enabled", true);
		BUILDER.pop();
		BUILDER.push("Portal Mobs");
		RANDOM_PORTAL_MOB = BUILDER.define("random_portal_mob", true);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
