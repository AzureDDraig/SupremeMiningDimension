package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class SilverBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.SILVER_ENABLED.get();
	}
}
