package RubyCraft.Entidades.Mobs.ModelRender;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class shulkerRenderModel extends ModelBase
{
  //fields
    ModelRenderer Caja;
    ModelRenderer Bicho;
  
  public shulkerRenderModel()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Caja = new ModelRenderer(this, 0, 0);
      Caja.addBox(0F, 0F, 0F, 16, 16, 16);
      Caja.setRotationPoint(-8F, 8F, -8F);
      Caja.setTextureSize(64, 32);
      Caja.mirror = true;
      setRotation(Caja, 0F, 0F, 0F);
      
      Bicho = new ModelRenderer(this, 0, 0);
      Bicho.addBox(0F, 0F, 0F, 3, 3, 3);
      Bicho.setRotationPoint(-1F, 16F, -4F);
      Bicho.setTextureSize(64, 32);
      Bicho.mirror = true;
      setRotation(Bicho, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Caja.render(f5);
    Bicho.render(f5);
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
