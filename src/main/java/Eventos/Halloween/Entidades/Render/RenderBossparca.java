package Eventos.Halloween.Entidades.Render;

import Eventos.Halloween.Entidades.BossParca;
import RubyCraft.RubyCraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderBossparca extends RenderLiving {

	private static final ResourceLocation Textura = new ResourceLocation(RubyCraft.modid + ":textures/entity/Eventos/BossParca.png");
	
	public RenderBossparca(ModelBase mod, float f) {
		super(mod, f);	
	}

	protected ResourceLocation getEntityTexture(BossParca entity){
		return Textura;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((BossParca)entity);
	}
	
}
