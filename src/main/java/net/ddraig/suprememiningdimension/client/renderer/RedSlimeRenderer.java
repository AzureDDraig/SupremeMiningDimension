
package net.ddraig.suprememiningdimension.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import net.ddraig.suprememiningdimension.entity.RedSlimeEntity;

public class RedSlimeRenderer extends MobRenderer<RedSlimeEntity, SlimeModel<RedSlimeEntity>> {
	public RedSlimeRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedSlimeEntity entity) {
		return new ResourceLocation("supreme_mining_dimension:textures/entities/red_slime.png");
	}
}
