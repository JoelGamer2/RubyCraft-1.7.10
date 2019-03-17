package Eventos.Navidad.RenderModel;

import org.lwjgl.opengl.GL11;

import RubyCraft.RubyCraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class AltarCentral_Renderizado_Textura extends  TileEntitySpecialRenderer {

	private AltarCentralModelo model;
	
	private ResourceLocation textura = new ResourceLocation(RubyCraft.modid + ":textures/blocks/TileEntitys/Altares/altar_central.png");
	
	 public AltarCentral_Renderizado_Textura() {
		 model = new AltarCentralModelo();
		 
		 
			    
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float scale) {
			
		GL11.glPushMatrix();
		GL11.glTranslated(x + 0.5, y + 1.5, z + 0.5);
		GL11.glRotated(180, 0, 0, 1);
		this.bindTexture(textura);
		
		this.model.render((Entity)null, 0, -0.1f, 0, 0, 0, 0.0625f);
		GL11.glPopMatrix();
		
	}
	
}
