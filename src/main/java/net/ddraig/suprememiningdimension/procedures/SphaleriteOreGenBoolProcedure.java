package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class SphaleriteOreGenBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.SPHALERITE_ENABLED.get();
	}
}
