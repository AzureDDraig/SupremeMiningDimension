package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class SphaleriteOreGenBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.SPHALERITE_ORE.get();
	}
}
