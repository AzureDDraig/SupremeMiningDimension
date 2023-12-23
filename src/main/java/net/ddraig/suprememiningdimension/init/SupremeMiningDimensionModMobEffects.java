
package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.ddraig.suprememiningdimension.potion.ConductiveMobEffect;
import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

public class SupremeMiningDimensionModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SupremeMiningDimensionMod.MODID);
	public static final RegistryObject<MobEffect> CONDUCTIVE = REGISTRY.register("conductive", () -> new ConductiveMobEffect());
}
