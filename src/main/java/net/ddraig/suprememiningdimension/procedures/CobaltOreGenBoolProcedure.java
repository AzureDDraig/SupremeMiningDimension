package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class CobaltOreGenBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.COBALT_ENABLED.get();
	}
}
