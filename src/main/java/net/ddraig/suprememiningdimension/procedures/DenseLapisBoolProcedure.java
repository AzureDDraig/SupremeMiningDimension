package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class DenseLapisBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.DENSE_LAPIS_ORE.get() && SMDOresConfiguration.DENSE_ORES_ENABLED.get();
	}
}
