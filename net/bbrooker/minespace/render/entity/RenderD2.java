package net.bbrooker.minespace.render.entity;

import net.bbrooker.minespace.MCSpaceInfo;
import net.bbrooker.minespace.model.entity.droid.ModelD2;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderD2 extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation("minespace" + ":" + "textures/models/droid/D2.png");
	
	public RenderD2(ModelD2 modelD2) {
		super(new ModelD2(), 0.75F);
		// TODO Auto-generated constructor stub
	}


	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return texture;
	}

}
