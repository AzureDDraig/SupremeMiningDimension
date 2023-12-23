package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDMobsConfiguration;

public class RedSlimeSpawnBoolProcedure {
	public static boolean execute(double y) {
		return SMDMobsConfiguration.RED_SLIME_ENABLED.get() && 60 > y;
	}
}
