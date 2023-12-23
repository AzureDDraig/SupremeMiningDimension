package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class AntimonyBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.ANTIMONY_ORE.get();
	}
}
