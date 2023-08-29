
package net.ddraig.suprememiningdimension.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.ddraig.suprememiningdimension.entity.TunnelerBrotherEntity;

public class TunnelerBrotherRenderer extends HumanoidMobRenderer<TunnelerBrotherEntity, HumanoidModel<TunnelerBrotherEntity>> {
	public TunnelerBrotherRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(TunnelerBrotherEntity entity) {
		return new ResourceLocation("supreme_mining_dimension:textures/entities/tunnelerbrother.png");
	}
}
