
package HerraCraft.Entidades.Render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class SlendermanRender extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Headwear;
    ModelRenderer Body;
    ModelRenderer RightArm;
    ModelRenderer LeftArm;
    ModelRenderer RightLeg;
    ModelRenderer LeftLeg;
  
  public SlendermanRender()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(-4F, -8F, -4F, 8, 8, 8);
      Head.setRotationPoint(0F, -14F, 0F);
      Head.setTextureSize(64, 32);
      Head.mirror = false;
      
      setRotation(Head, 0F, 0F, 0F);
      Headwear = new ModelRenderer(this, 0, 16);
      Headwear.addBox(-4F, -8F, -4F, 8, 8, 8);
      Headwear.setRotationPoint(0F, -14F, 0F);
      Headwear.setTextureSize(64, 32);
      Headwear.mirror = false;
      
      setRotation(Headwear, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 32, 16);
      Body.addBox(-4F, 0F, -2F, 8, 12, 4);
      Body.setRotationPoint(0F, -14F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = false;
      
      setRotation(Body, 0F, 0F, 0F);
      RightArm = new ModelRenderer(this, 56, 0);
      RightArm.addBox(-1F, -2F, -1F, 2, 30, 2);
      RightArm.setRotationPoint(-5F, -12F, 0F);
      RightArm.setTextureSize(64, 32);
      RightArm.mirror = false;
      
      setRotation(RightArm, 0F, 0F, 0F);
      RightArm.mirror = true;
      
      LeftArm = new ModelRenderer(this, 56, 0);
      LeftArm.addBox(-1F, -2F, -1F, 2, 30, 2);
      LeftArm.setRotationPoint(5F, -12F, 0F);
      LeftArm.setTextureSize(64, 32);
      LeftArm.mirror = false;
      
      setRotation(LeftArm, 0F, 0F, 0F);
      LeftArm.mirror = false;
      
      RightLeg = new ModelRenderer(this, 56, 0);
      RightLeg.addBox(-1F, 0F, -1F, 2, 30, 2);
      RightLeg.setRotationPoint(-2F, -2F, 0F);
      RightLeg.setTextureSize(64, 32);
      RightLeg.mirror = false;
      
      setRotation(RightLeg, 0F, 0F, 0F);
      LeftLeg.mirror = false;
      
      LeftLeg = new ModelRenderer(this, 56, 0);
      LeftLeg.addBox(-1F, 0F, -1F, 2, 30, 2);
      LeftLeg.setRotationPoint(2F, -2F, 0F);
      LeftLeg.setTextureSize(64, 32);
      LeftLeg.mirror = false;
      
      setRotation(LeftLeg, 0F, 0F, 0F);
      LeftLeg.mirror = false;
      LeftLeg = new ModelRenderer(this, 0, 0);
      LeftLeg.addBox(0F, 0F, 0F, 1, 1, 1);
      LeftLeg.setRotationPoint(0F, -19F, 0F);
      LeftLeg.setTextureSize(64, 32);
      LeftLeg.mirror = true;
      
      setRotation(LeftLeg, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head.render(f5);
    Headwear.render(f5);
    Body.render(f5);
    RightArm.render(f5);
    LeftArm.render(f5);
    RightLeg.render(f5);
    LeftLeg.render(f5);
    
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
