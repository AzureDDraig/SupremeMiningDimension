
package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.ddraig.suprememiningdimension.enchantment.FlameResistanceAugmentEnchantment;
import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

public class SupremeMiningDimensionModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, SupremeMiningDimensionMod.MODID);
	public static final RegistryObject<Enchantment> FLAME_RESISTANCE_AUGMENT = REGISTRY.register("flame_resistance_augment", () -> new FlameResistanceAugmentEnchantment());
}
