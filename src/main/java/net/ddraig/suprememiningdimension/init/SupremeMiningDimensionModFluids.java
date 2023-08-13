
package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.ddraig.suprememiningdimension.fluid.HoneyFluid;
import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

public class SupremeMiningDimensionModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, SupremeMiningDimensionMod.MODID);
	public static final RegistryObject<FlowingFluid> HONEY = REGISTRY.register("honey", () -> new HoneyFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_HONEY = REGISTRY.register("flowing_honey", () -> new HoneyFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(HONEY.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_HONEY.get(), RenderType.translucent());
		}
	}
}
