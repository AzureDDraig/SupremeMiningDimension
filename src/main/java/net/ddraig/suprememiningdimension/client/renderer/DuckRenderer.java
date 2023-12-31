
package net.ddraig.suprememiningdimension.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.ddraig.suprememiningdimension.entity.DuckEntity;

public class DuckRenderer extends MobRenderer<DuckEntity, ChickenModel<DuckEntity>> {
	public DuckRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DuckEntity entity) {
		return new ResourceLocation("supreme_mining_dimension:textures/entities/duckie.png");
	}
}
