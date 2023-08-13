package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class TungstenOreBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.TUNGSTEN_ENABLED.get();
	}
}
