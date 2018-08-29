package HerraCraft.Entidades.Render;

import HerraCraft.Entidades_Principal.Tank;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderTankTexture extends RenderLiving {

	private static final ResourceLocation Textura = new ResourceLocation(RubyCraft.RubyCraft.modid + ":textures/entity/Herra/Tank/Tank.png");
	
	public RenderTankTexture(ModelBase mod, float f) {
		super(mod, f);
		
	}

	protected ResourceLocation getEntityTexture(Tank entity){
		return Textura;
		
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((Tank)entity);
	}
	
}
