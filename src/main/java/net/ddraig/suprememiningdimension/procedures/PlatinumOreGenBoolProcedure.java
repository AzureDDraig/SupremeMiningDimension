package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class PlatinumOreGenBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.PLATINUM_ENABLED.get();
	}
}
