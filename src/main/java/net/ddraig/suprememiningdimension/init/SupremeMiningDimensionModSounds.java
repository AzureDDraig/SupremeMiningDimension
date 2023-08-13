
package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

public class SupremeMiningDimensionModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SupremeMiningDimensionMod.MODID);
	public static final RegistryObject<SoundEvent> ENTITY_VILLAGER_WORK_MUSIC_DEALER = REGISTRY.register("entity.villager.work_music_dealer",
			() -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "entity.villager.work_music_dealer")));
}
