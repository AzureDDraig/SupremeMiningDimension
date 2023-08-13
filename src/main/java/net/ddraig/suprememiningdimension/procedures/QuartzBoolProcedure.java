package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class QuartzBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.QUARTZ_ENABLED.get();
	}
}
