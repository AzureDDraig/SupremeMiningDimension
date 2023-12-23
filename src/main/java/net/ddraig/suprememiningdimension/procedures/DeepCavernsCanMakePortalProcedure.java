package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDDimensionsConfiguration;

public class DeepCavernsCanMakePortalProcedure {
	public static boolean execute() {
		return SMDDimensionsConfiguration.DEEP_CAVERNS.get();
	}
}
