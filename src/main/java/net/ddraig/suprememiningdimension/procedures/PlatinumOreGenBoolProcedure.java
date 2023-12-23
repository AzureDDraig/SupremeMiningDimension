package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class PlatinumOreGenBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.PLATINUM_ORE.get();
	}
}
