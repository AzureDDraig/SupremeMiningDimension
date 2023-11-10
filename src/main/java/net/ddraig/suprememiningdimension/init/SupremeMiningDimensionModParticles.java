
package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.ddraig.suprememiningdimension.client.particle.HoneyDripParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SupremeMiningDimensionModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(SupremeMiningDimensionModParticleTypes.HONEY_DRIP.get(), HoneyDripParticle::provider);
	}
}
