package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class ChickshroomboolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.CHICKSHROOM_ALLOWED.get();
	}
}
