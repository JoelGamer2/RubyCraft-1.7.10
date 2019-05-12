package Eventos.Verano.Entidades.Render.Modelo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Elemental_Tierra_soldado_Modelo extends ModelBase
{
  //fields
    ModelRenderer Cola1;
    ModelRenderer Cola2;
    ModelRenderer Cola3;
    ModelRenderer Cola4;
    ModelRenderer Cola5;
    ModelRenderer Cuerpo1;
    ModelRenderer Cuerpo2;
    ModelRenderer Cuerpo3;
    ModelRenderer Cuerpo4;
    ModelRenderer Cuerpo5;
    ModelRenderer Cuerpo6;
    ModelRenderer Cuerpo7;
    ModelRenderer Cuerpo8;
    ModelRenderer Cuerpo9;
    ModelRenderer Cuerpo10;
    ModelRenderer Cuerpo11;
    ModelRenderer Cuerpo12;
    ModelRenderer Cuerpo13;
    ModelRenderer Cuerpo14;
    ModelRenderer BrazoD1;
    ModelRenderer BrazoD2;
    ModelRenderer BrazoD3;
    ModelRenderer BrazoD4;
    ModelRenderer BrazoI1;
    ModelRenderer BrazoI2;
    ModelRenderer BrazoI3;
    ModelRenderer BrazoI4;
  
  public Elemental_Tierra_soldado_Modelo()
  {
    textureWidth = 512;
    textureHeight = 512;
    
    Cola1 = new ModelRenderer(this, 0, 0);
    Cola1.addBox(0F, 0F, 0F, 2, 1, 2);
    Cola1.setRotationPoint(4F, 8F, 10F);
    Cola1.setTextureSize(512, 512);
    Cola1.mirror = true;
    setRotation(Cola1, 0.8726646F, 0F, 0F);
    Cola2 = new ModelRenderer(this, 11, 0);
    Cola2.addBox(0F, 0F, 0F, 4, 1, 4);
    Cola2.setRotationPoint(3F, 6F, 7F);
    Cola2.setTextureSize(512, 512);
    Cola2.mirror = true;
    setRotation(Cola2, 0.4363323F, 0F, 0F);
    Cola3 = new ModelRenderer(this, 30, 0);
    Cola3.addBox(0F, 0F, 0F, 6, 1, 6);
    Cola3.setRotationPoint(2F, 4F, 4F);
    Cola3.setTextureSize(512, 512);
    Cola3.mirror = true;
    setRotation(Cola3, 0.2094395F, 0F, 0F);
    Cola4 = new ModelRenderer(this, 57, 0);
    Cola4.addBox(0F, 0F, 0F, 8, 1, 8);
    Cola4.setRotationPoint(1F, 2F, 1F);
    Cola4.setTextureSize(512, 512);
    Cola4.mirror = true;
    setRotation(Cola4, 0.1047198F, 0F, 0F);
    Cola5 = new ModelRenderer(this, 93, 0);
    Cola5.addBox(0F, 0F, 0F, 10, 1, 10);
    Cola5.setRotationPoint(-5F, 8F, -5F);
    Cola5.setTextureSize(512, 512);
    Cola5.mirror = true;
    setRotation(Cola5, 0.0349066F, 0F, 0F);
    
    
    Cuerpo1 = new ModelRenderer(this, 0, 20);
    Cuerpo1.addBox(0F, 0F, 0F, 12, 16, 12);
    Cuerpo1.setRotationPoint(-6F, -9F, -6F);
    Cuerpo1.setTextureSize(512, 512);
    Cuerpo1.mirror = true;
    setRotation(Cuerpo1, 0F, 0F, 0F);
    
    Cuerpo2 = new ModelRenderer(this, 53, 20);
    Cuerpo2.addBox(0F, 0F, 0F, 1, 13, 8);
    Cuerpo2.setRotationPoint(-1F, 1F, 2F);
    Cuerpo2.setTextureSize(512, 512);
    Cuerpo2.mirror = true;
    setRotation(Cuerpo2, 0F, 0F, 0F);
    Cuerpo3 = new ModelRenderer(this, 75, 20);
    Cuerpo3.addBox(0F, 0F, 0F, 1, 13, 8);
    Cuerpo3.setRotationPoint(12F, 1F, 2F);
    Cuerpo3.setTextureSize(512, 512);
    Cuerpo3.mirror = true;
    setRotation(Cuerpo3, 0F, 0F, 0F);
    
    Cuerpo4 = new ModelRenderer(this, 97, 20);
    Cuerpo4.addBox(0F, 0F, 0F, 1, 8, 6);
    Cuerpo4.setRotationPoint(-2F, 2F, 3F);
    Cuerpo4.setTextureSize(512, 512);
    Cuerpo4.mirror = true;
    setRotation(Cuerpo4, 0F, 0F, 0F);
    Cuerpo5 = new ModelRenderer(this, 115, 20);
    Cuerpo5.addBox(0F, 0F, 0F, 1, 8, 6);
    Cuerpo5.setRotationPoint(13F, 2F, 3F);
    Cuerpo5.setTextureSize(512, 512);
    Cuerpo5.mirror = true;
    setRotation(Cuerpo5, 0F, 0F, 0F);
    
    Cuerpo6 = new ModelRenderer(this, 131, 20);
    Cuerpo6.addBox(0F, 0F, 0F, 1, 4, 4);
    Cuerpo6.setRotationPoint(-3F, 3F, 4F);
    Cuerpo6.setTextureSize(512, 512);
    Cuerpo6.mirror = true;
    setRotation(Cuerpo6, 0F, 0F, 0F);
    Cuerpo7 = new ModelRenderer(this, 144, 20);
    Cuerpo7.addBox(0F, 0F, 0F, 1, 4, 4);
    Cuerpo7.setRotationPoint(14F, 3F, 4F);
    Cuerpo7.setTextureSize(512, 512);
    Cuerpo7.mirror = true;
    setRotation(Cuerpo7, 0F, 0F, 0F);
    
    Cuerpo8 = new ModelRenderer(this, 157, 20);
    Cuerpo8.addBox(0F, 0F, 0F, 8, 14, 1);
    Cuerpo8.setRotationPoint(2F, 1F, 12F);
    Cuerpo8.setTextureSize(512, 512);
    Cuerpo8.mirror = true;
    setRotation(Cuerpo8, 0F, 0F, 0F);
    Cuerpo9 = new ModelRenderer(this, 180, 20);
    Cuerpo9.addBox(0F, 0F, 0F, 4, 9, 1);
    Cuerpo9.setRotationPoint(4F, 2F, 13F);
    Cuerpo9.setTextureSize(512, 512);
    Cuerpo9.mirror = true;
    setRotation(Cuerpo9, 0F, 0F, 0F);
    Cuerpo10 = new ModelRenderer(this, 193, 20);
    Cuerpo10.addBox(0F, 0F, 0F, 2, 4, 1);
    Cuerpo10.setRotationPoint(5F, 4F, 14F);
    Cuerpo10.setTextureSize(512, 512);
    Cuerpo10.mirror = true;
    setRotation(Cuerpo10, 0F, 0F, 0F);
    
    Cuerpo11 = new ModelRenderer(this, 203, 20);
    Cuerpo11.addBox(0F, 0F, 0F, 8, 12, 1);
    Cuerpo11.setRotationPoint(2F, 2F, -1F);
    Cuerpo11.setTextureSize(512, 512);
    Cuerpo11.mirror = true;
    setRotation(Cuerpo11, 0F, 0F, 0F);
    Cuerpo12 = new ModelRenderer(this, 225, 20);
    Cuerpo12.addBox(0F, 0F, 0F, 6, 7, 1);
    Cuerpo12.setRotationPoint(3F, 6F, -2F);
    Cuerpo12.setTextureSize(512, 512);
    Cuerpo12.mirror = true;
    setRotation(Cuerpo12, 0F, 0F, 0F);
    Cuerpo13 = new ModelRenderer(this, 242, 20);
    Cuerpo13.addBox(0F, 0F, 0F, 4, 3, 1);
    Cuerpo13.setRotationPoint(4F, 8F, -3F);
    Cuerpo13.setTextureSize(512, 512);
    Cuerpo13.mirror = true;
    setRotation(Cuerpo13, 0F, 0F, 0F);
    
    Cuerpo14 = new ModelRenderer(this, 254, 20);
    Cuerpo14.addBox(0F, 0F, 0F, 10, 1, 10);
    Cuerpo14.setRotationPoint(1F, -1F, 1F);
    Cuerpo14.setTextureSize(512, 512);
    Cuerpo14.mirror = true;
    setRotation(Cuerpo14, 0F, 0F, 0F);
    
    
    BrazoD1 = new ModelRenderer(this, 0, 60);
    BrazoD1.addBox(0F, -3F, -2F, 4, 6, 4);
    BrazoD1.setRotationPoint(-13F, -4F, 0F);
    BrazoD1.setTextureSize(512, 512);
    BrazoD1.mirror = true;
    setRotation(BrazoD1, 0F, 0F, 0F);
    BrazoD2 = new ModelRenderer(this, 19, 60);
    BrazoD2.addBox(0F, 0F, 0F, 2, 6, 2);
    BrazoD2.setRotationPoint(1F, 2F, -1F);
    BrazoD2.setTextureSize(512, 512);
    BrazoD2.mirror = true;
    setRotation(BrazoD2, -0.3490659F, -0.1745329F, 0F);
    BrazoD3 = new ModelRenderer(this, 29, 60);
    BrazoD3.addBox(0F, 0F, 0F, 3, 3, 3);
    BrazoD3.setRotationPoint(1F, 6.2F, -3.2F);
    BrazoD3.setTextureSize(512, 512);
    BrazoD3.mirror = true;
    setRotation(BrazoD3, -0.7853982F, -0.2617994F, 0F);
    BrazoD4 = new ModelRenderer(this, 44, 60);
    BrazoD4.addBox(0F, 0F, 0F, 2, 2, 9);
    BrazoD4.setRotationPoint(3.2F, 8.2F, -2.7F);
    BrazoD4.setTextureSize(512, 512);
    BrazoD4.mirror = true;
    setRotation(BrazoD4, -0.2443461F, 2.70526F, 0F);
    
    BrazoI1 = new ModelRenderer(this, 0, 80);
    BrazoI1.addBox(0F, -3F, -2F, 4, 6, 4);
    BrazoI1.setRotationPoint(9F, -4F, 0F);
    BrazoI1.setTextureSize(512, 512);
    BrazoI1.mirror = true;
    setRotation(BrazoI1, 0F, 0F, 0F);
    BrazoI2 = new ModelRenderer(this, 18, 80);
    BrazoI2.addBox(0F, 0F, 0F, 2, 6, 2);
    BrazoI2.setRotationPoint(1F, 2F, -1F);
    BrazoI2.setTextureSize(512, 512);
    BrazoI2.mirror = true;
    setRotation(BrazoI2, -0.3490659F, 0.1745329F, 0F);
    BrazoI3 = new ModelRenderer(this, 29, 80);
    BrazoI3.addBox(0F, 0F, 0F, 3, 3, 3);
    BrazoI3.setRotationPoint(0F, 6.2F, -2.7F);
    BrazoI3.setTextureSize(512, 512);
    BrazoI3.mirror = true;
    setRotation(BrazoI3, -0.7853982F, 0.2617994F, 0F);
    BrazoI4 = new ModelRenderer(this, 44, 80);
    BrazoI4.addBox(0F, 0F, 0F, 2, 2, 8);
    BrazoI4.setRotationPoint(2.5F, 8.2F, -4.2F);
    BrazoI4.setTextureSize(512, 512);
    BrazoI4.mirror = true;
    setRotation(BrazoI4, -0.2443461F, -2.70526F, 0F);
}

public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
{
  super.render(entity, f, f1, f2, f3, f4, f5);
  setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  Cola5.render(f5);
  Cola5.addChild(Cola1);
  Cola5.addChild(Cola2);
  Cola5.addChild(Cola3);
  Cola5.addChild(Cola4);
  Cuerpo1.render(f5);
  Cuerpo1.addChild(Cuerpo2);
  Cuerpo1.addChild(Cuerpo3);
  Cuerpo1.addChild(Cuerpo4);
  Cuerpo1.addChild(Cuerpo5);
  Cuerpo1.addChild(Cuerpo6);
  Cuerpo1.addChild(Cuerpo7);
  Cuerpo1.addChild(Cuerpo8);
  Cuerpo1.addChild(Cuerpo9);
  Cuerpo1.addChild(Cuerpo10);
  Cuerpo1.addChild(Cuerpo11);
  Cuerpo1.addChild(Cuerpo12);
  Cuerpo1.addChild(Cuerpo13);
  Cuerpo1.addChild(Cuerpo14);
  BrazoD1.render(f5);
  BrazoD1.addChild(BrazoD2);
  BrazoD1.addChild(BrazoD3);
  BrazoD1.addChild(BrazoD4);
  BrazoI1.render(f5);
  BrazoI1.addChild(BrazoI2);
  BrazoI1.addChild(BrazoI3);
  BrazoI1.addChild(BrazoI4);
}
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
	  this.Cuerpo1.rotateAngleX = f4 / (180F / (float)Math.PI);
	  this.BrazoD1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
	  this.BrazoI1.rotateAngleX = -MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
	  this.BrazoD1.rotateAngleZ = 0.0F;
	  this.BrazoI1.rotateAngleZ = 0.0F;
	  /*this.PiernaDerecha.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	  this.PiernaIzquierda.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	  this.PiernaDerecha.rotateAngleY = 0.0F;
	  this.PiernaIzquierda.rotateAngleY = 0.0F;*/
	  
      super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
