package RubyCraft.Entidades.Mobs.ModelRender;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class RenderModelYetiLich extends ModelBase
{
  //fields
    ModelRenderer PieDerecho;
    ModelRenderer PieIzquierdo;
    ModelRenderer PiernaDerecha;
    ModelRenderer PiernaIzquierda;
    ModelRenderer CuerpoInferior;
    ModelRenderer CuerpoMedio;
    ModelRenderer CuerpoSuperior;
    ModelRenderer BrazoDerecho;
    ModelRenderer BrazoIzquierdo;
    ModelRenderer Cabeza;
  
  public RenderModelYetiLich()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      PieDerecho = new ModelRenderer(this, 0, 236);
      PieDerecho.addBox(0F, 0F, 0F, 8, 4, 16);
      PieDerecho.setRotationPoint(-16F, 20F, -8F);
      PieDerecho.setTextureSize(256, 256);
      PieDerecho.mirror = true;
      setRotation(PieDerecho, 0F, 0F, 0F);
      PieIzquierdo = new ModelRenderer(this, 50, 236);
      PieIzquierdo.addBox(0F, 0F, 0F, 8, 4, 16);
      PieIzquierdo.setRotationPoint(8F, 20F, -8F);
      PieIzquierdo.setTextureSize(256, 256);
      PieIzquierdo.mirror = true;
      setRotation(PieIzquierdo, 0F, 0F, 0F);
      PiernaDerecha = new ModelRenderer(this, 0, 200);
      PiernaDerecha.addBox(0F, 0F, 0F, 8, 26, 8);
      PiernaDerecha.setRotationPoint(-16F, -6F, 0F);
      PiernaDerecha.setTextureSize(256, 256);
      PiernaDerecha.mirror = true;
      setRotation(PiernaDerecha, 0F, 0F, 0F);
      PiernaIzquierda = new ModelRenderer(this, 34, 200);
      PiernaIzquierda.addBox(0F, 0F, 0F, 8, 26, 8);
      PiernaIzquierda.setRotationPoint(8F, -6F, 0F);
      PiernaIzquierda.setTextureSize(256, 256);
      PiernaIzquierda.mirror = true;
      setRotation(PiernaIzquierda, 0F, 0F, 0F);
      CuerpoInferior = new ModelRenderer(this, 166, 215);
      CuerpoInferior.addBox(0F, 0F, 0F, 22, 18, 22);
      CuerpoInferior.setRotationPoint(-12F, -14F, -8F);
      CuerpoInferior.setTextureSize(256, 256);
      CuerpoInferior.mirror = true;
      setRotation(CuerpoInferior, 0F, 0F, 0F);
      CuerpoMedio = new ModelRenderer(this, 151, 173);
      CuerpoMedio.addBox(0F, 0F, 0F, 30, 10, 22);
      CuerpoMedio.setRotationPoint(-16F, -24F, -8F);
      CuerpoMedio.setTextureSize(256, 256);
      CuerpoMedio.mirror = true;
      setRotation(CuerpoMedio, 0F, 0F, 0F);
      CuerpoSuperior = new ModelRenderer(this, 135, 119);
      CuerpoSuperior.addBox(0F, 0F, 0F, 38, 14, 22);
      CuerpoSuperior.setRotationPoint(-20F, -38F, -8F);
      CuerpoSuperior.setTextureSize(256, 256);
      CuerpoSuperior.mirror = true;
      setRotation(CuerpoSuperior, 0F, 0F, 0F);
      BrazoDerecho = new ModelRenderer(this, 0, 150);
      BrazoDerecho.addBox(0F, 0F, 0F, 8, 38, 8);
      BrazoDerecho.setRotationPoint(-28F, -34F, 0F);
      BrazoDerecho.setTextureSize(256, 256);
      BrazoDerecho.mirror = true;
      setRotation(BrazoDerecho, 0F, 0F, 0F);
      BrazoIzquierdo = new ModelRenderer(this, 34, 150);
      BrazoIzquierdo.addBox(0F, 0F, 0F, 8, 38, 8);
      BrazoIzquierdo.setRotationPoint(18F, -34F, 0F);
      BrazoIzquierdo.setTextureSize(256, 256);
      BrazoIzquierdo.mirror = true;
      setRotation(BrazoIzquierdo, 0F, 0F, 0F);
      Cabeza = new ModelRenderer(this, 0, 0);
      Cabeza.addBox(0F, 0F, 0F, 20, 20, 20);
      Cabeza.setRotationPoint(-11F, -58F, -16F);
      Cabeza.setTextureSize(256, 256);
      Cabeza.mirror = true;
      setRotation(Cabeza, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    PieDerecho.render(f5);
    PieIzquierdo.render(f5);
    PiernaDerecha.render(f5);
    PiernaIzquierda.render(f5);
    CuerpoInferior.render(f5);
    CuerpoMedio.render(f5);
    CuerpoSuperior.render(f5);
    BrazoDerecho.render(f5);
    BrazoIzquierdo.render(f5);
    Cabeza.render(f5);
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
    
this.Cabeza.rotateAngleX = f4 / (180F / (float)Math.PI);
this.BrazoDerecho.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
this.BrazoIzquierdo.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
this.BrazoDerecho.rotateAngleZ = 0.0F;
this.BrazoIzquierdo.rotateAngleZ = 0.0F;
this.PiernaDerecha.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
this.PiernaIzquierda.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
this.PiernaDerecha.rotateAngleY = 0.0F;
this.PiernaIzquierda.rotateAngleY = 0.0F;
//   this.PieDerecho.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
//   this.PieIzquierdo.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
//   this.PieDerecho.rotateAngleY = 0.0F;
//   this.PieDerecho.rotateAngleY = 0.0F;
  super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
