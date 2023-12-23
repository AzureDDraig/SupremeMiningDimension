package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDMobsConfiguration;

public class ChickshroomboolProcedure {
	public static boolean execute() {
		return SMDMobsConfiguration.CHICKSHROOM_ENABLED.get();
	}
}
