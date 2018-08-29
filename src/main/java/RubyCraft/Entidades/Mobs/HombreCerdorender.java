package RubyCraft.Entidades.Mobs;

import RubyCraft.RubyCraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class HombreCerdorender extends RenderLiving {

	private static final ResourceLocation Textura = new ResourceLocation(RubyCraft.modid + ":textures/entity/Hombrecerdo.png");
	
	public HombreCerdorender(ModelBase mod, float f) {
		super(mod, f);
		
	}

	protected ResourceLocation getEntityTexture(HombreCerdo entity){
		return Textura;
		
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((HombreCerdo)entity);
	}
	
}
