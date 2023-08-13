package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class AluminumOreGenBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.ALUMINUM_ENABLED.get();
	}
}
