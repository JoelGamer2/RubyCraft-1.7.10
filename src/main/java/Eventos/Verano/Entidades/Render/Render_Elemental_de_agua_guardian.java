package Eventos.Verano.Entidades.Render;

import Eventos.Verano.Entidades.Elemental_de_Agua_Guardian;
import RubyCraft.RubyCraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class Render_Elemental_de_agua_guardian extends RenderLiving {

	private static final ResourceLocation Textura = new ResourceLocation(RubyCraft.modid + ":textures/entity/Eventos/Elementales/Guardianes/Agua.png");
	
	public Render_Elemental_de_agua_guardian(ModelBase mod, float f) {
		super(mod, f);
		
	}

	protected ResourceLocation getEntityTexture(Elemental_de_Agua_Guardian entity){
		return Textura;
		
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((Elemental_de_Agua_Guardian)entity);
	}
	
}
