package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class CobaltOreGenBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.COBALT_ORE.get();
	}
}
