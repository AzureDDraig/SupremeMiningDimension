
package net.ddraig.suprememiningdimension.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.ddraig.suprememiningdimension.entity.ChickshroomEntity;

public class ChickshroomRenderer extends MobRenderer<ChickshroomEntity, ChickenModel<ChickshroomEntity>> {
	public ChickshroomRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChickshroomEntity entity) {
		return new ResourceLocation("supreme_mining_dimension:textures/entities/chickshroomie.png");
	}
}
