package net.ddraig.suprememiningdimension.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class SMDBossesConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Double> MAX_HEALTH;
	public static final ForgeConfigSpec.ConfigValue<Double> HEAL_DELAY_SECONDS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> GLOW_WHEN_HEALING;
	public static final ForgeConfigSpec.ConfigValue<Double> HITS_BEFORE_HEAVY_ATTACK;
	public static final ForgeConfigSpec.ConfigValue<Boolean> FIREBALL_SIZE_INCREASE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> WITHERING_FIREBALL_EXPLOSION;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DEATH_EXPLOSION;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DEATH_EXPLOSION_BREAK_BLOCKS;
	public static final ForgeConfigSpec.ConfigValue<Double> DEATH_EXPLOSION_DELAY_SECONDS;
	public static final ForgeConfigSpec.ConfigValue<Double> DEATH_EXPLOSION_POWER;
	public static final ForgeConfigSpec.ConfigValue<Boolean> IS_PROSPECTOR_IMMORTAL_WITH_BROTHERS;
	public static final ForgeConfigSpec.ConfigValue<Double> EXPLODE_DELAY_TICKS_WHEN_STILL;
	public static final ForgeConfigSpec.ConfigValue<Double> PROSPECTOR_EXPLOSIVE_POWER;
	public static final ForgeConfigSpec.ConfigValue<Double> TIME_EXPLOSION_SECONDS;
	public static final ForgeConfigSpec.ConfigValue<Double> PERCENT_FAULTY;
	static {
		BUILDER.push("Blazing Wither Master");
		MAX_HEALTH = BUILDER.comment("DEFAULT: 160").define("max_health", (double) 160);
		HEAL_DELAY_SECONDS = BUILDER.comment("DEFAULT: 10").define("heal_delay_seconds", (double) 10);
		GLOW_WHEN_HEALING = BUILDER.comment("DEFAULT: TRUE").define("glow_when_healing", true);
		HITS_BEFORE_HEAVY_ATTACK = BUILDER.comment("DEFAULT: 10   ||   This is the number of hits the Blazing Wither Master needs to take before they will spam lightning and fireballs for a short moment").define("hits_before_heavy_attack", (double) 10);
		FIREBALL_SIZE_INCREASE = BUILDER.comment("DEFAULT: TRUE").define("fireball_size_increase", true);
		WITHERING_FIREBALL_EXPLOSION = BUILDER.comment("DEFAULT: FALSE").define("withering_fireball_explosion", false);
		DEATH_EXPLOSION = BUILDER.comment("DEFAULT: TRUE").define("death_explosion", true);
		DEATH_EXPLOSION_BREAK_BLOCKS = BUILDER.comment("DEFAULT: FALSE").define("death_explosion_break_blocks", false);
		DEATH_EXPLOSION_DELAY_SECONDS = BUILDER.define("death_explosion_delay_seconds", (double) 3);
		DEATH_EXPLOSION_POWER = BUILDER.define("death_explosion_power", (double) 2.3);
		BUILDER.pop();
		BUILDER.push("Miner Brothers");
		IS_PROSPECTOR_IMMORTAL_WITH_BROTHERS = BUILDER.comment("DEFAULT: TRUE").define("is_prospector_immortal_with_brothers", true);
		EXPLODE_DELAY_TICKS_WHEN_STILL = BUILDER.comment("DEFAULT: 21 || delay before the jumping explosion").define("explode_delay_ticks_when_still", (double) 21);
		PROSPECTOR_EXPLOSIVE_POWER = BUILDER.comment("DEFAULT: 2.2").define("prospector_explosive_power", (double) 2.2);
		TIME_EXPLOSION_SECONDS = BUILDER.define("time_explosion_seconds", (double) 2);
		PERCENT_FAULTY = BUILDER.define("percent_faulty", (double) 0.33);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
