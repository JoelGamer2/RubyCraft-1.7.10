 package RubyCraft.Maquinas.Renderizado;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Mesa_De_Ruby_Render_Model extends ModelBase
{
	
    ModelRenderer Tabla;
    ModelRenderer Pata_1;
    ModelRenderer Pata_2;
    ModelRenderer Pata_3;
    ModelRenderer Pata_4;
  
  public Mesa_De_Ruby_Render_Model()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Tabla = new ModelRenderer(this, 0, 0);
      Tabla.addBox(0F, 0F, 0F, 16, 1, 16);
      Tabla.setRotationPoint(-8F, 9F, -8F);
      Tabla.setTextureSize(128, 64);
      Tabla.mirror = true;
	  
      setRotation(Tabla, 0F, 0F, 0F);
      Pata_1 = new ModelRenderer(this, 0, 17);
      Pata_1.addBox(0F, 0F, 0F, 2, 14, 2);
      Pata_1.setRotationPoint(-7F, 10F, 5F);
      Pata_1.setTextureSize(128, 64);
      Pata_1.mirror = true;
	  
      setRotation(Pata_1, 0F, 0F, 0F);
      Pata_2 = new ModelRenderer(this, 0, 17);
      Pata_2.addBox(0F, 0F, 0F, 2, 14, 2);
      Pata_2.setRotationPoint(-7F, 10F, -7F);
      Pata_2.setTextureSize(128, 64);
      Pata_2.mirror = true;
	  
      setRotation(Pata_2, 0F, 0F, 0F);
      Pata_3 = new ModelRenderer(this, 0, 17);
      Pata_3.addBox(0F, 0F, 0F, 2, 14, 2);
      Pata_3.setRotationPoint(5F, 10F, -7F);
      Pata_3.setTextureSize(128, 64);
      Pata_3.mirror = true;
	  
      setRotation(Pata_3, 0F, 0F, 0F);
      Pata_4 = new ModelRenderer(this, 0, 17);
      Pata_4.addBox(0F, 0F, 0F, 2, 14, 2);
      Pata_4.setRotationPoint(5F, 10F, 5F);
      Pata_4.setTextureSize(128, 64);
      Pata_4.mirror = true;
      setRotation(Pata_4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(entity, f, f1, f2, f3, f4, f5);
    Tabla.render(f5);
    Pata_1.render(f5);
    Pata_2.render(f5);
    Pata_3.render(f5);
    Pata_4.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}