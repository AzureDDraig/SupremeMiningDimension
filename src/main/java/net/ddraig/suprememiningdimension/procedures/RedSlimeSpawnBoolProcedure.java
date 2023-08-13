package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class RedSlimeSpawnBoolProcedure {
	public static boolean execute(double y) {
		return BiomesConfiguration.RED_SLIME_ALLOWED.get() && 60 > y;
	}
}
