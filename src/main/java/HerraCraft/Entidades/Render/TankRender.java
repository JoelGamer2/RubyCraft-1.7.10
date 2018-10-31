package HerraCraft.Entidades.Render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class TankRender extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer RightArm;
    ModelRenderer LeftArm;
    ModelRenderer RightLeg;
    ModelRenderer LeftLeg;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
  
  public TankRender()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(-4F, -10F, -4F, 8, 8, 8);
      Head.setRotationPoint(0F, 0F, 0F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      
      setRotation(Head, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 32, 16);
      Body.addBox(-4F, 0F, -2F, 8, 11, 4);
      Body.setRotationPoint(0F, -2F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      
      setRotation(Body, 0F, 0F, 0F);
      RightArm = new ModelRenderer(this, 56, 0);
      RightArm.addBox(-1F, 10F, -1F, 2, 19, 2);
      RightArm.setRotationPoint(-5F, -12F, 0F);
      RightArm.setTextureSize(64, 32);
      RightArm.mirror = false;
      
      setRotation(RightArm, 0F, 0F, 0F);
      RightArm.mirror = true;
      LeftArm = new ModelRenderer(this, 56, 0);
      LeftArm.addBox(-1F, 10F, -1F, 2, 19, 2);
      LeftArm.setRotationPoint(5F, -12F, 0F);
      LeftArm.setTextureSize(64, 32);
      LeftArm.mirror = true;
      
      setRotation(LeftArm, 0F, 0F, 0F);
      LeftArm.mirror = false;
      RightLeg = new ModelRenderer(this, 56, 0);
      RightLeg.addBox(-1F, -1F, -2F, 2, 15, 2);
      RightLeg.setRotationPoint(-2F, 10F, 0F);
      RightLeg.setTextureSize(64, 32);
      RightLeg.mirror = false;
      
      setRotation(RightLeg, 0F, 0F, 0F);
      RightLeg.mirror = true;
      LeftLeg = new ModelRenderer(this, 56, 0);
      LeftLeg.addBox(-1F, 9F, -1F, 2, 15, 2);
      LeftLeg.setRotationPoint(2F, 0F, -1F);
      LeftLeg.setTextureSize(64, 32);
      LeftLeg.mirror = true;
      
      setRotation(LeftLeg, 0F, 0F, 0F);
      LeftLeg.mirror = false;
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 16, 1, 1);
      Shape1.setRotationPoint(0F, -3F, 2F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(-1F, 7F, 0F, 14, 1, 1);
      Shape2.setRotationPoint(-13F, -10F, 2F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(0F, 6F, 0F, 16, 1, 1);
      Shape3.setRotationPoint(0F, -6F, 2F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 0);
      Shape4.addBox(0F, 6F, 0F, 14, 1, 1);
      Shape4.setRotationPoint(-14F, -6F, 2F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head.render(f5);
    Body.render(f5);
    RightArm.render(f5);
    LeftArm.render(f5);
    RightLeg.render(f5);
    LeftLeg.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
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
	    this.Head.rotateAngleY = f3 / (180F / (float)Math.PI);
	    this.Head.rotateAngleX = f4 / (180F / (float)Math.PI);
	    this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
	    this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
	    this.RightArm.rotateAngleZ = 0.0F;
	    this.LeftArm.rotateAngleZ = 0.0F;
	    this.RightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	    this.LeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	    this.RightLeg.rotateAngleY = 0.0F;
	    this.LeftLeg.rotateAngleY = 0.0F;
  }

}
