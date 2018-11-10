package RubyCraft.Maquinas.Renderizado;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Mesa_De_Zafiro_Render_Model extends ModelBase
{
  //fields
    ModelRenderer Pata1;
    ModelRenderer Pata2;
    ModelRenderer Pata3;
    ModelRenderer Pata4;
    ModelRenderer Tabla;
    ModelRenderer Barra;
    ModelRenderer Barra2;
    ModelRenderer Barra3;
    ModelRenderer Barra4;
  
  public Mesa_De_Zafiro_Render_Model()
  {
    textureWidth = 64;
    textureHeight = 128;
    
      Pata1 = new ModelRenderer(this, 0, 0);
      Pata1.addBox(0F, 0F, 0F, 2, 13, 2);
      Pata1.setRotationPoint(-8F, 11F, 6F);
      Pata1.setTextureSize(64, 128);
      Pata1.mirror = true;
      setRotation(Pata1, 0F, 0F, 0F);
      Pata2 = new ModelRenderer(this, 0, 0);
      Pata2.addBox(0F, 0F, 0F, 2, 13, 2);
      Pata2.setRotationPoint(6F, 11F, -8F);
      Pata2.setTextureSize(64, 128);
      Pata2.mirror = true;
      setRotation(Pata2, 0F, 0F, 0F);
      Pata3 = new ModelRenderer(this, 0, 0);
      Pata3.addBox(0F, 0F, -8F, 2, 13, 2);
      Pata3.setRotationPoint(-8F, 11F, 0F);
      Pata3.setTextureSize(64, 128);
      Pata3.mirror = true;
      setRotation(Pata3, 0F, 0F, 0F);
      Pata4 = new ModelRenderer(this, 0, 0);
      Pata4.addBox(0F, 0F, 0F, 2, 13, 2);
      Pata4.setRotationPoint(6F, 11F, 6F);
      Pata4.setTextureSize(64, 128);
      Pata4.mirror = true;
      setRotation(Pata4, 0F, 0F, 0F);
      Tabla = new ModelRenderer(this, 0, 73);
      Tabla.addBox(0F, 0F, 0F, 16, 2, 16);
      Tabla.setRotationPoint(-8F, 9F, -8F);
      Tabla.setTextureSize(64, 128);
      Tabla.mirror = true;
      setRotation(Tabla, 0F, 0F, 0F);
      Barra = new ModelRenderer(this, 0, 29);
      Barra.addBox(0F, 0F, 0F, 12, 2, 2);
      Barra.setRotationPoint(-6F, 15F, -8F);
      Barra.setTextureSize(64, 128);
      Barra.mirror = true;
      setRotation(Barra, 0F, 0F, 0F);
      Barra2 = new ModelRenderer(this, 0, 29);
      Barra2.addBox(0F, 0F, 0F, 12, 2, 2);
      Barra2.setRotationPoint(-6F, 15F, 6F);
      Barra2.setTextureSize(64, 128);
      Barra2.mirror = true;
      setRotation(Barra2, 0F, 0F, 0F);
      Barra3 = new ModelRenderer(this, 0, 40);
      Barra3.addBox(0F, 0F, 0F, 2, 2, 12);
      Barra3.setRotationPoint(-8F, 15F, -6F);
      Barra3.setTextureSize(64, 128);
      Barra3.mirror = true;
      setRotation(Barra3, 0F, 0F, 0F);
      Barra4 = new ModelRenderer(this, 0, 40);
      Barra4.addBox(0F, 0F, 0F, 2, 2, 12);
      Barra4.setRotationPoint(6F, 15F, -6F);
      Barra4.setTextureSize(64, 128);
      Barra4.mirror = true;
      setRotation(Barra4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Pata1.render(f5);
    Pata2.render(f5);
    Pata3.render(f5);
    Pata4.render(f5);
    Tabla.render(f5);
    Barra.render(f5);
    Barra2.render(f5);
    Barra3.render(f5);
    Barra4.render(f5);
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
