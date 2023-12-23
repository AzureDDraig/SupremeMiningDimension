package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class ZincBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.ZINC_ORE.get();
	}
}
