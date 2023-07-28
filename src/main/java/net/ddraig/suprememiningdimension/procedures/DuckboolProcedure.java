package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class DuckboolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.DUCK_ALLOWED.get();
	}
}
