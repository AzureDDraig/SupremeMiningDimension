package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class QuartzBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.QUARTZ_ORE.get();
	}
}
