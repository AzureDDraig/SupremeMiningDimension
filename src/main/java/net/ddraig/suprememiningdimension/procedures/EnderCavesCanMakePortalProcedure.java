package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDDimensionsConfiguration;

public class EnderCavesCanMakePortalProcedure {
	public static boolean execute() {
		return SMDDimensionsConfiguration.ENDER_CAVES.get();
	}
}
