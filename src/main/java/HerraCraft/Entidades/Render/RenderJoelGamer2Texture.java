package HerraCraft.Entidades.Render;

import HerraCraft.Entidades_Principal.JoelGamer2;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderJoelGamer2Texture extends RenderLiving {

	private static final ResourceLocation Textura = new ResourceLocation(RubyCraft.RubyCraft.modid + ":textures/entity/Herra/JoelGamer2/JoelGamer2.png");
	
	public RenderJoelGamer2Texture(ModelBase mod, float f) {
		super(mod, f);
		
	}

	protected ResourceLocation getEntityTexture(JoelGamer2 entity){
		return Textura;
		
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((JoelGamer2)entity);
	}
	
}