package RubyCraft.Entidades.Mobs;

import RubyCraft.RubyCraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderInvocadorMob extends RenderLiving {

	private static final ResourceLocation Textura = new ResourceLocation(RubyCraft.modid + ":textures/entity/Mansion/Invocador.png");
	
	public RenderInvocadorMob(ModelBase mod, float f) {
		super(mod, f);
		
	}

	protected ResourceLocation getEntityTexture(Invocador entity){
		return Textura;
		
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((Invocador)entity);
	}
	
}
