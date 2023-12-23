package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDMobsConfiguration;

public class DuckboolProcedure {
	public static boolean execute() {
		return SMDMobsConfiguration.DUCK_ENABLED.get();
	}
}
