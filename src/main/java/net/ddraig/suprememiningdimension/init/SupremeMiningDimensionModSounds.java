
package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

public class SupremeMiningDimensionModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SupremeMiningDimensionMod.MODID);
	public static final RegistryObject<SoundEvent> SMD_RECORD_FLAMEOFHOPE = REGISTRY.register("smd.record.flameofhope", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.flameofhope")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_FLAMEINMYHEAD = REGISTRY.register("smd.record.flameinmyhead", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.flameinmyhead")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_STARTINGAGAIN = REGISTRY.register("smd.record.startingagain", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.startingagain")));
	public static final RegistryObject<SoundEvent> SMD_BIOME_NETHERISLES = REGISTRY.register("smd.biome.netherisles", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.biome.netherisles")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_DRIFTINGUPWARDS = REGISTRY.register("smd.record.driftingupwards", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.driftingupwards")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_JUSTALITTLETIME = REGISTRY.register("smd.record.justalittletime", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.justalittletime")));
	public static final RegistryObject<SoundEvent> SMD_BIOME_ENDERCAVES = REGISTRY.register("smd.biome.endercaves", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.biome.endercaves")));
	public static final RegistryObject<SoundEvent> SMD_ENTITY_VILLAGER_WORK_MUSIC_DEALER = REGISTRY.register("smd.entity.villager.work_music_dealer",
			() -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.entity.villager.work_music_dealer")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_HILLOFSTONE = REGISTRY.register("smd.record.hillofstone", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.hillofstone")));
	public static final RegistryObject<SoundEvent> SMD_BIOME_FROZEN = REGISTRY.register("smd.biome.frozen", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.biome.frozen")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_SUBWOOFERALARM = REGISTRY.register("smd.record.subwooferalarm", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.subwooferalarm")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_DARKLIGHTPITCHED = REGISTRY.register("smd.record.darklightpitched", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.darklightpitched")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_TENTERHOOKS = REGISTRY.register("smd.record.tenterhooks", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.tenterhooks")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_BLIGHTCONSUMES = REGISTRY.register("smd.record.blightconsumes", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.blightconsumes")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_ROTREJECTS = REGISTRY.register("smd.record.rotrejects", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.rotrejects")));
	public static final RegistryObject<SoundEvent> SMD_BIOME_SHADEBLIGHT = REGISTRY.register("smd.biome.shadeblight", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.biome.shadeblight")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_DARKLIGHT = REGISTRY.register("smd.record.darklight", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.darklight")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_FLAMESINMYEYE = REGISTRY.register("smd.record.flamesinmyeye", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.flamesinmyeye")));
	public static final RegistryObject<SoundEvent> SMD_BIOME_MAGMATIC = REGISTRY.register("smd.biome.magmatic", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.biome.magmatic")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_GOINGANYWHERE = REGISTRY.register("smd.record.goinganywhere", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.goinganywhere")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_STANDINGTALL = REGISTRY.register("smd.record.standingtall", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.standingtall")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_ONMYSHOULDERS = REGISTRY.register("smd.record.onmyshoulders", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.onmyshoulders")));
	public static final RegistryObject<SoundEvent> SMD_BIOME_ANCIENT = REGISTRY.register("smd.biome.ancient", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.biome.ancient")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_ADROPOFDAYLIGHT = REGISTRY.register("smd.record.adropofdaylight", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.adropofdaylight")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_HIATUS = REGISTRY.register("smd.record.hiatus", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.hiatus")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_EMERALDMORNINGS = REGISTRY.register("smd.record.emeraldmornings", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.emeraldmornings")));
	public static final RegistryObject<SoundEvent> SMD_BIOME_FALSEOW = REGISTRY.register("smd.biome.falseow", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.biome.falseow")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_11PM = REGISTRY.register("smd.record.11pm", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.11pm")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_FUNGUSTALKING = REGISTRY.register("smd.record.fungustalking", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.fungustalking")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_MUSHROOMATICS = REGISTRY.register("smd.record.mushroomatics", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.mushroomatics")));
	public static final RegistryObject<SoundEvent> SMD_BIOME_MUSHROOMFOREST = REGISTRY.register("smd.biome.mushroomforest", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.biome.mushroomforest")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_LOITERONSTARS = REGISTRY.register("smd.record.loiteronstars", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.loiteronstars")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_CAMEFROMDEEPER = REGISTRY.register("smd.record.camefromdeeper", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.camefromdeeper")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_TUNNELTALKING = REGISTRY.register("smd.record.tunneltalking", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.tunneltalking")));
	public static final RegistryObject<SoundEvent> SMD_BIOME_SCULKCAVERNS = REGISTRY.register("smd.biome.sculkcaverns", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.biome.sculkcaverns")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_BALUSTERSBELOW = REGISTRY.register("smd.record.balustersbelow", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.balustersbelow")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_ELATEDPILLAR = REGISTRY.register("smd.record.elatedpillar", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.elatedpillar")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_DIGITALSMILES = REGISTRY.register("smd.record.digitalsmiles", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.digitalsmiles")));
	public static final RegistryObject<SoundEvent> SMD_BIOME_DRIPSTONECAVERNS = REGISTRY.register("smd.biome.dripstonecaverns", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.biome.dripstonecaverns")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_STRINGSOFFATE = REGISTRY.register("smd.record.stringsoffate", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.stringsoffate")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_WEAREGOINGUNDER = REGISTRY.register("smd.record.wearegoingunder", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.wearegoingunder")));
	public static final RegistryObject<SoundEvent> SMD_BIOME_AMBERCAVERNS = REGISTRY.register("smd.biome.ambercaverns", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.biome.ambercaverns")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_LIGHTINTHESTONE = REGISTRY.register("smd.record.lightinthestone", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.lightinthestone")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_CLOCKSTRIKES13 = REGISTRY.register("smd.record.clockstrikes13", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.clockstrikes13")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_FAEWELCOME = REGISTRY.register("smd.record.faewelcome", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.faewelcome")));
	public static final RegistryObject<SoundEvent> SMD_BIOME_OVERGROWNCAVERNS = REGISTRY.register("smd.biome.overgrowncaverns", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.biome.overgrowncaverns")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_EMPTYWARMTH = REGISTRY.register("smd.record.emptywarmth", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.emptywarmth")));
	public static final RegistryObject<SoundEvent> SMD_BIOME_GLACIAL = REGISTRY.register("smd.biome.glacial", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.biome.glacial")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_AMETHYSTDROPLETS = REGISTRY.register("smd.record.amethystdroplets", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.amethystdroplets")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_LOSTOUTTHERE = REGISTRY.register("smd.record.lostoutthere", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.lostoutthere")));
	public static final RegistryObject<SoundEvent> SMD_BIOME_AMETHYSTCAVERNS = REGISTRY.register("smd.biome.amethystcaverns", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.biome.amethystcaverns")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_ALWAYSBEENHERE = REGISTRY.register("smd.record.alwaysbeenhere", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.alwaysbeenhere")));
	public static final RegistryObject<SoundEvent> SMD_RECORD_TWEETERHELLO = REGISTRY.register("smd.record.tweeterhello", () -> new SoundEvent(new ResourceLocation("supreme_mining_dimension", "smd.record.tweeterhello")));
}
