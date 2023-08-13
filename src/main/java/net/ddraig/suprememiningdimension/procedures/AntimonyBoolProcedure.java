package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class AntimonyBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.ANTIMONY_ENABLED.get();
	}
}
