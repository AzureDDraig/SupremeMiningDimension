package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class RedSlimeSpawnBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.RED_SLIME_ALLOWED.get();
	}
}
