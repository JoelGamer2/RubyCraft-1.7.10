package HerraCraft.Entidades.Render;

import HerraCraft.Entidades_Principal.Invisiteibol;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderInvisiteibolTexture extends RenderLiving {

	private static final ResourceLocation Textura = new ResourceLocation(RubyCraft.RubyCraft.modid + ":textures/entity/Herra/Invisiteibol/Invisiteibol.png");
	
	public RenderInvisiteibolTexture(ModelBase mod, float f) {
		super(mod, f);
		
	}

	protected ResourceLocation getEntityTexture(Invisiteibol entity){
		return Textura;
		
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((Invisiteibol)entity);
	}
	
}