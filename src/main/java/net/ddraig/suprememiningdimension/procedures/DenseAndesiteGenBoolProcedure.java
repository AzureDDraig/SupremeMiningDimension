package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class DenseAndesiteGenBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.DENSE_ANDESITE.get() && SMDOresConfiguration.DENSE_ORES_ENABLED.get();
	}
}
