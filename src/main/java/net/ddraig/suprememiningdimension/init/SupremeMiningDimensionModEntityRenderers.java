
package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.ddraig.suprememiningdimension.client.renderer.WitheredBlazeRenderer;
import net.ddraig.suprememiningdimension.client.renderer.TunnelerBrotherRenderer;
import net.ddraig.suprememiningdimension.client.renderer.ShroombieRenderer;
import net.ddraig.suprememiningdimension.client.renderer.ShadowCreeperRenderer;
import net.ddraig.suprememiningdimension.client.renderer.QuarrierBrotherRenderer;
import net.ddraig.suprememiningdimension.client.renderer.ProspectorBrotherRenderer;
import net.ddraig.suprememiningdimension.client.renderer.DuckRenderer;
import net.ddraig.suprememiningdimension.client.renderer.ChickshroomRenderer;
import net.ddraig.suprememiningdimension.client.renderer.BlazingWitherMasterRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SupremeMiningDimensionModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SupremeMiningDimensionModEntities.CHICKSHROOM.get(), ChickshroomRenderer::new);
		event.registerEntityRenderer(SupremeMiningDimensionModEntities.DUCK.get(), DuckRenderer::new);
		event.registerEntityRenderer(SupremeMiningDimensionModEntities.TUNNELER_BROTHER.get(), TunnelerBrotherRenderer::new);
		event.registerEntityRenderer(SupremeMiningDimensionModEntities.QUARRIER_BROTHER.get(), QuarrierBrotherRenderer::new);
		event.registerEntityRenderer(SupremeMiningDimensionModEntities.PROSPECTOR_BROTHER.get(), ProspectorBrotherRenderer::new);
		event.registerEntityRenderer(SupremeMiningDimensionModEntities.WITHERED_BLAZE.get(), WitheredBlazeRenderer::new);
		event.registerEntityRenderer(SupremeMiningDimensionModEntities.WITHERING_FIREBALL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SupremeMiningDimensionModEntities.BLAZING_WITHER_MASTER.get(), BlazingWitherMasterRenderer::new);
		event.registerEntityRenderer(SupremeMiningDimensionModEntities.SHROOMBIE.get(), ShroombieRenderer::new);
		event.registerEntityRenderer(SupremeMiningDimensionModEntities.SHADOW_CREEPER.get(), ShadowCreeperRenderer::new);
		event.registerEntityRenderer(SupremeMiningDimensionModEntities.WEAK_WITHERED_FIREBALL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SupremeMiningDimensionModEntities.EXPLOSIVE_THROWN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SupremeMiningDimensionModEntities.WEAK_WITHERING_FIREBALL.get(), ThrownItemRenderer::new);
	}
}
