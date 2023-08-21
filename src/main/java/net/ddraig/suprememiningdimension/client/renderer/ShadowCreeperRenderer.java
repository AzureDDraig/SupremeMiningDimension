
package net.ddraig.suprememiningdimension.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.ddraig.suprememiningdimension.entity.ShadowCreeperEntity;

public class ShadowCreeperRenderer extends MobRenderer<ShadowCreeperEntity, CreeperModel<ShadowCreeperEntity>> {
	public ShadowCreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShadowCreeperEntity entity) {
		return new ResourceLocation("supreme_mining_dimension:textures/entities/shade_creeper.png");
	}
}
