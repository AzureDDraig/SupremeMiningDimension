
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.ddraig.suprememiningdimension.fluid.types.HoneyFluidType;
import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

public class SupremeMiningDimensionModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, SupremeMiningDimensionMod.MODID);
	public static final RegistryObject<FluidType> HONEY_TYPE = REGISTRY.register("honey", () -> new HoneyFluidType());
}
