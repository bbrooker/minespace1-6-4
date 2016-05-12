package net.bbrooker.minespace.model.entity.droid;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelD2 extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer Eye;
    ModelRenderer LegLeft;
    ModelRenderer FootLeft;
    ModelRenderer LegRight;
    ModelRenderer FootRight;
    ModelRenderer FootMiddle;
  
  public ModelD2()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(0F, 1F, 0F, 13, 9, 12);
      Head.setRotationPoint(-6F, -1.1F, -3F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, -0.2466181F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 21);
      Body.addBox(0F, 1F, 0F, 13, 12, 12);
      Body.setRotationPoint(-6F, 7F, -5F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, -0.2405238F, 0F, 0F);
      Eye = new ModelRenderer(this, 50, 0);
      Eye.addBox(0F, 0F, 0F, 3, 3, 1);
      Eye.setRotationPoint(-1F, 2F, -4.2F);
      Eye.setTextureSize(64, 32);
      Eye.mirror = true;
      setRotation(Eye, -0.2602503F, 0F, 0F);
      LegLeft = new ModelRenderer(this, 0, 45);
      LegLeft.addBox(0F, 0F, 0F, 2, 7, 4);
      LegLeft.setRotationPoint(7F, 14F, -3F);
      LegLeft.setTextureSize(64, 32);
      LegLeft.mirror = true;
      setRotation(LegLeft, 0F, 0F, 0F);
      FootLeft = new ModelRenderer(this, 0, 56);
      FootLeft.addBox(0F, 0F, 0F, 3, 3, 7);
      FootLeft.setRotationPoint(7F, 21F, -5F);
      FootLeft.setTextureSize(64, 32);
      FootLeft.mirror = true;
      setRotation(FootLeft, 0F, 0F, 0F);
      LegRight = new ModelRenderer(this, 0, 45);
      LegRight.addBox(0F, 0F, 0F, 2, 7, 4);
      LegRight.setRotationPoint(-8F, 14F, -3F);
      LegRight.setTextureSize(64, 32);
      LegRight.mirror = true;
      setRotation(LegRight, 0F, 0F, 0F);
      FootRight = new ModelRenderer(this, -1, 56);
      FootRight.addBox(0F, 0F, 0F, 3, 3, 7);
      FootRight.setRotationPoint(-9F, 21F, -5F);
      FootRight.setTextureSize(64, 32);
      FootRight.mirror = true;
      setRotation(FootRight, 0F, 0F, 0F);
      FootMiddle = new ModelRenderer(this, 0, 68);
      FootMiddle.addBox(0F, 0F, 0F, 3, 4, 6);
      FootMiddle.setRotationPoint(-1F, 20F, -9.333333F);
      FootMiddle.setTextureSize(64, 32);
      FootMiddle.mirror = true;
      setRotation(FootMiddle, 0.0174533F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head.render(f5);
    Body.render(f5);
    Eye.render(f5);
    LegLeft.render(f5);
    FootLeft.render(f5);
    LegRight.render(f5);
    FootRight.render(f5);
    FootMiddle.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
