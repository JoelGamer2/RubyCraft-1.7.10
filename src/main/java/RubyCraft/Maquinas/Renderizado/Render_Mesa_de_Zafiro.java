package RubyCraft.Maquinas.Renderizado;

import org.lwjgl.opengl.GL11;

import RubyCraft.RubyCraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class Render_Mesa_de_Zafiro extends  TileEntitySpecialRenderer {

	private Mesa_De_Zafiro_Render_Model model;
	
	private ResourceLocation textura = new ResourceLocation(RubyCraft.modid + ":textures/blocks/TileEntitys/Mesas/Mesa_De_Zafiro.png");
	private ResourceLocation texturaNavidad = new ResourceLocation(RubyCraft.modid + ":textures/blocks/TileEntitys/Mesas/Mesa_De_Zafiro_Navidad.png");
	private ResourceLocation texturaHallowen = new ResourceLocation(RubyCraft.modid + ":textures/blocks/TileEntitys/Mesas/Mesa_De_Zafiro_Hallowen.png");

	 public Render_Mesa_de_Zafiro() {
		 model = new Mesa_De_Zafiro_Render_Model();
		 	
		    
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float scale) {
			
		GL11.glPushMatrix();
		GL11.glTranslated(x + 0.5, y + 1.5, z + 0.5);
		GL11.glRotated(180, 0, 0, 1);
		if(!RubyCraft.Navidad && !RubyCraft.HalloWen){
			this.bindTexture(textura);
			}else if(RubyCraft.Navidad && !RubyCraft.HalloWen){
				this.bindTexture(texturaNavidad);
			}else if(RubyCraft.HalloWen && !RubyCraft.Navidad) {
				this.bindTexture(texturaHallowen);
			}
		this.model.render((Entity)null, 0, -0.1f, 0, 0, 0, 0.0625f);
		GL11.glPopMatrix();
		
	}

}
