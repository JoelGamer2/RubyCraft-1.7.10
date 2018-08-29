package HerraCraft.Entidades.Render;

import HerraCraft.Entidades_Principal.Prakxisredstoner;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderPrakxisredstonerTexture extends RenderLiving {

	private static final ResourceLocation Textura = new ResourceLocation(RubyCraft.RubyCraft.modid + ":textures/entity/Herra/Prakxisredstoner/Prakxisredstoner.png");
	
	public RenderPrakxisredstonerTexture(ModelBase mod, float f) {
		super(mod, f);
		
	}

	protected ResourceLocation getEntityTexture(Prakxisredstoner entity){
		return Textura;
		
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((Prakxisredstoner)entity);
	}
	
}