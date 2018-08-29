package RubyCraft.Maquinas.Renderizado;

import java.util.Calendar;

import org.lwjgl.opengl.GL11;

import RubyCraft.Control_de_Version;
import RubyCraft.RubyCraft;
import RubyCraft.Maquinas.MesadeTrabajodeRuby;
import RubyCraft.Navidad.Cambiador_de_Texturas;
import RubyCraft.Registrar.Crafteos;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class Render_Mesa_de_Ruby extends  TileEntitySpecialRenderer {

	private Mesa_De_Ruby_Render_Model model;
	
	private ResourceLocation textura = new ResourceLocation(RubyCraft.modid + ":textures/blocks/TileEntitys/Mesa_De_Ruby/Mesa_De_Ruby.png");
	private ResourceLocation texturaNavidad = new ResourceLocation(RubyCraft.modid + ":textures/blocks/TileEntitys/Mesa_De_Ruby/Mesa_De_Ruby_Navidad.png");
	
	 public Render_Mesa_de_Ruby() {
		 model = new Mesa_De_Ruby_Render_Model();
		 
		 /** Testear Calendario **/
		 
		//Testear Navidad
			Calendar calendar = Calendar.getInstance();

		    if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 31 && Control_de_Version.Navidad_Activar == false){
		        RubyCraft.Navidad = true;
		        Crafteos.IniciarCrafteosNavidad();
		        Cambiador_de_Texturas.Texturas();
		        
		      //Testear el Dia de Los Inocentes
	    		if(calendar.get(2) + 1 == 12 && calendar.get(5) == 28){
	    			Crafteos.IniciarCrafteosDiadelosInocentes();
	    			RubyCraft.Dia_de_Los_Inocentes = true;
	    		}
		        
		    }else{
		    	//Testear Hallowen
		    	if(calendar.get(2) + 1 == 10 && calendar.get(5) == 31){
		    		RubyCraft.HalloWen = true;
		    		Crafteos.IniciarCrafteosHallowen();
		    		Cambiador_de_Texturas.Texturas();
		    	}else{
		    			//Testear Dia de Herobrine
		    		  if(calendar.get(2) + 1 == MesadeTrabajodeRuby.Mes && calendar.get(5) == MesadeTrabajodeRuby.Dia){
		    			  Crafteos.IniciarCrafteosDiaHerobrine();
		    			  MesadeTrabajodeRuby.Dia_de_Herobrine = true;
		    			  Cambiador_de_Texturas.Texturas();
		    		  }else if (Control_de_Version.Navidad_Activar == false){
		    			RubyCraft.Navidad = false;
		    			RubyCraft.HalloWen = false;
		    			RubyCraft.Dia_de_Los_Inocentes = false;
		    			MesadeTrabajodeRuby.Dia_de_Herobrine = false;
		    			
		    			Cambiador_de_Texturas.Texturas();
		    		}else if(Control_de_Version.Navidad_Activar == true) {
		    			
		    			Cambiador_de_Texturas.Texturas_Navidad();
		    			RubyCraft.Navidad = true;
		    			
		    		}
		    	}
		    }
		    
		  
		
		    
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float scale) {
			
		GL11.glPushMatrix();
		GL11.glTranslated(x + 0.5, y + 1.5, z + 0.5);
		GL11.glRotated(180, 0, 0, 1);
		if(!RubyCraft.Navidad){
		this.bindTexture(textura);
		}else if(RubyCraft.Navidad){
			this.bindTexture(texturaNavidad);
		}
		this.model.render((Entity)null, 0, -0.1f, 0, 0, 0, 0.0625f);
		GL11.glPopMatrix();
		
	}

}
