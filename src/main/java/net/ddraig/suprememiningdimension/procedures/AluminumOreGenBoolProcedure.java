package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class AluminumOreGenBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.ALUMINUM_ORE.get();
	}
}
