package HerraCraft.Entidades.Render;

import HerraCraft.Entidades_Principal.Herobrine;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderHerobrineTexture extends RenderLiving {

	private static final ResourceLocation Textura = new ResourceLocation(RubyCraft.RubyCraft.modid + ":textures/entity/Herra/Herobrine/Herobrine.png");
	
	public RenderHerobrineTexture(ModelBase mod, float f) {
		super(mod, f);
		
	}

	protected ResourceLocation getEntityTexture(Herobrine entity){
		return Textura;
		
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((Herobrine)entity);
	}
	
}