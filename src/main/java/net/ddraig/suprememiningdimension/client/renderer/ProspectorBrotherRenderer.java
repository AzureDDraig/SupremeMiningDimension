
package net.ddraig.suprememiningdimension.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.ddraig.suprememiningdimension.entity.ProspectorBrotherEntity;

public class ProspectorBrotherRenderer extends HumanoidMobRenderer<ProspectorBrotherEntity, HumanoidModel<ProspectorBrotherEntity>> {
	public ProspectorBrotherRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(ProspectorBrotherEntity entity) {
		return new ResourceLocation("supreme_mining_dimension:textures/entities/tunnelerbrother.png");
	}
}
