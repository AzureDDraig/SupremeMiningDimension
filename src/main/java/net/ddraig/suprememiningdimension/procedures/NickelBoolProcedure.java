package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class NickelBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.NICKEL_ENABLED.get();
	}
}
