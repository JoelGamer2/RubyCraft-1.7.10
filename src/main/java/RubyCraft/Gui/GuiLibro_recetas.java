package RubyCraft.Gui;

import org.lwjgl.opengl.GL11;

import Eventos.Verano.Libros.ContainerLibro;
import Eventos.Verano.Libros.texturabotones;
import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class GuiLibro_recetas extends GuiContainer{
	

    public static int X = 256;
	public static  int Y = 256;
	private static boolean activo = false;
	public static int paginas = 0;
	public GuiButton atras;
	public GuiButton siguiente;
	public static String Textura_path = RubyCraft.modid + ":textures/gui/Libro_recetas/Receta_";
    public static int pag_max = 19;
    private static String mesa_de_zafiro = "gui.Mesa_de_Zafiro.name";
    private static String mesa_de_ruby = "gui.Mesa_de_Ruby.name";
    private static EnumChatFormatting color_paginas = EnumChatFormatting.BLACK;

	
	public GuiLibro_recetas(InventoryPlayer inv, World world, int x, int y, int z)
    {
        super(new ContainerLibro());
    }
	
	
	public void updateScreen ()
	{
        super.updateScreen();
	}
	
	
	
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float valor, int alto, int ancho) 
	{
		
		int centroX = this.width/2;
		int centroY = this.height/2;
		
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		
		
		
		String path_Textura_final = Textura_path + Integer.toString(paginas) + ".png";  //ESTO LO QUE HACE ES COJE EL STRING DE LA UBICACION DE LA TEXTURA A LA _ LE SUMA EL NUMERO DE LA PAGINA EN CUESTION Y LE AÑADE LA EXTENSION .PNG
		ResourceLocation Textura_resource = new ResourceLocation(path_Textura_final);  //CONVIERTE EL STRING A RESOURCELOCATION
		
	
	        this.mc.getTextureManager().bindTexture(Textura_resource);  //REGISTRA LA IMAGEN PARA QUE PUEDA SER RENDERIZADA
	        
	       int posx =40;
	       int posy=20;
	
	    int k = (this.width/2)-((X/2)+3);
	    int l = (this.height/2) - (Y/2);
	    
	 
	    this.drawTexturedModalRect(k+posx, l+posy, 0, 0, X, Y); //RENDERIZA LA IMAGEN
	 
	
	    String paginase = Integer.toString(paginas); //PASA A STRING LA VARIABLE PAGINAS

		this.fontRendererObj.drawString(color_paginas + StatCollector.translateToLocal(paginase) + "/" + pag_max, (this.width/2) + posx + 73, (this.height/2) + 151,  0x000000); //RENDERIZA EN PANTALLA LA STRING PAGINAS
		
		
		switch (paginas) { //SEGUN EN QUE PAGINA ESTES ACTIVA UNO U OTRO
		case 0:
			render_nombre_receta_dos_paginas(RubyCraft.CascodeZafiro.getUnlocalizedName(), RubyCraft.botasdeZafiro.getUnlocalizedName(),mesa_de_zafiro ,EnumChatFormatting.DARK_BLUE);    
			break;
		case 1:
			render_nombre_receta_dos_paginas(RubyCraft.PantacasdeZafiro.getUnlocalizedName(), RubyCraft.PetodeZafiro.getUnlocalizedName(),mesa_de_zafiro ,EnumChatFormatting.DARK_BLUE);    
			break;
		case 2:
			render_nombre_receta_dos_paginas(RubyCraft.Cofre_de_Ruby.getUnlocalizedName(), RubyCraft.Transformador_de_Losas_a_Bloques.getUnlocalizedName(),mesa_de_zafiro ,EnumChatFormatting.DARK_BLUE);    
			this.fontRendererObj.drawString(EnumChatFormatting.DARK_GRAY +  "Losas", (this.width/2) + 20, (this.height/2)+ -10,  0x000000);
			break;
		case 3:
			render_nombre_receta_dos_paginas(RubyCraft.Moldes_para_cofres.getUnlocalizedName(), RubyCraft.Manzana_de_diamante.getUnlocalizedName(), mesa_de_zafiro, EnumChatFormatting.DARK_BLUE);
			break;
		case 4:
			render_nombre_receta_dos_paginas(RubyCraft.Lampara_de_Zafiro_Apagada.getUnlocalizedName(), RubyCraft.Mesa_De_Conjuraciones.getUnlocalizedName(), mesa_de_zafiro, EnumChatFormatting.DARK_BLUE);
			break;
		case 5:
			render_nombre_receta_dos_paginas(RubyCraft.Espadadezafiro.getUnlocalizedName(), RubyCraft.Paladezafiro.getUnlocalizedName(), mesa_de_ruby, EnumChatFormatting.DARK_RED);
			break;
		case 6:
			render_nombre_receta_dos_paginas(RubyCraft.Picodezafiro.getUnlocalizedName(), RubyCraft.Hachadezafiro.getUnlocalizedName(), mesa_de_ruby, EnumChatFormatting.DARK_RED);
			break;
		case 7:
			render_nombre_receta_dos_paginas(RubyCraft.Azadadezafiro.getUnlocalizedName(), RubyCraft.Mesa_de_Trabajo_de_Zafiro_Basica.getUnlocalizedName(), mesa_de_ruby, EnumChatFormatting.DARK_RED);
			break;
		case 8:
			render_nombre_receta_dos_paginas(RubyCraft.CascodeRuby.getUnlocalizedName(), RubyCraft.PetodeRuby.getUnlocalizedName(), mesa_de_ruby, EnumChatFormatting.DARK_RED);
			break;
		case 9:
			render_nombre_receta_dos_paginas(RubyCraft.PantacasdeRuby.getUnlocalizedName(), RubyCraft.botasdeRuby.getUnlocalizedName(), mesa_de_ruby, EnumChatFormatting.DARK_RED);
			break;
		case 10:
			render_nombre_receta_dos_paginas(RubyCraft.Espadaderuby.getUnlocalizedName(), RubyCraft.Picoderuby.getUnlocalizedName(), mesa_de_ruby, EnumChatFormatting.DARK_RED);
            break;
		case 11:
			render_nombre_receta_dos_paginas(RubyCraft.Paladeruby.getUnlocalizedName(), RubyCraft.Hachaderuby.getUnlocalizedName(), mesa_de_ruby, EnumChatFormatting.DARK_RED);
			break;
		case 12:
			render_nombre_receta_dos_paginas(RubyCraft.Azadaderuby.getUnlocalizedName(), RubyCraft.Bloque_de_Blaze.getUnlocalizedName(), mesa_de_ruby, EnumChatFormatting.DARK_RED);
			break;
		case 13:
			render_nombre_receta_dos_paginas(RubyCraft.Lampara_de_Ruby_Apagada.getUnlocalizedName(), RubyCraft.Cristal_azul_claro.getUnlocalizedName(), mesa_de_ruby, EnumChatFormatting.DARK_RED);
			this.fontRendererObj.drawString(EnumChatFormatting.DARK_PURPLE +  "Bloques", (this.width/2) + 34, (this.height/2)+ 26,  0x000000);
			break;
		case 14:
			render_nombre_receta_dos_paginas(RubyCraft.ruby.getUnlocalizedName(), RubyCraft.Cristal_Verde_Lima.getUnlocalizedName(), mesa_de_ruby, EnumChatFormatting.DARK_RED);
			this.fontRendererObj.drawString(EnumChatFormatting.DARK_PURPLE +  "Bloques", (this.width/2) + 34, (this.height/2)+ 26,  0x000000);
			break;
		case 15:
			render_nombre_receta_dos_paginas(RubyCraft.Pico_de_Platino.getUnlocalizedName(), RubyCraft.Espada_de_Platino.getUnlocalizedName(), mesa_de_zafiro, EnumChatFormatting.DARK_RED);
            break;
		case 16:
			render_nombre_receta_dos_paginas(RubyCraft.Hacha_de_Platino.getUnlocalizedName(), RubyCraft.Pala_de_Platino.getUnlocalizedName(), mesa_de_zafiro, EnumChatFormatting.DARK_RED);
            break;
		case 17:
			render_nombre_receta_dos_paginas(RubyCraft.Tijeras_de_Platino.getUnlocalizedName(), RubyCraft.Azada_de_Platino.getUnlocalizedName(), mesa_de_zafiro, EnumChatFormatting.DARK_RED);
            break;
		case 18:
			render_nombre_receta_dos_paginas(RubyCraft.cascodePlatino.getUnlocalizedName(), RubyCraft.PetodePlatino.getUnlocalizedName(), mesa_de_zafiro, EnumChatFormatting.DARK_RED);
            break;
		case 19:
			render_nombre_receta_dos_paginas(RubyCraft.pantacasdePlatino.getUnlocalizedName(), RubyCraft.botasdePlatino.getUnlocalizedName(), mesa_de_zafiro, EnumChatFormatting.DARK_RED);
            break;
		}

	}

	
	public void render_nombre_receta_dos_paginas(String la1, String la2,String mesa ,EnumChatFormatting color) {
	    int x = -81;  //COORDENADA X DE LAS RECETAS ES COMUN ESTE VALOR
		int y_1 =-100; //COORDENADA Y DE LA RECETA 1
		int y_2=-20;  //COORDENADA Y DE LA RECETA 2
		int x_2 = 4; //COORDENADA X DE DONDE ESTA LA STRING MESA
		int y_3=60; //COORDENADA Y DE DONDE ESTA LA STRING MESA
		if(mesa==mesa_de_zafiro) {
		this.fontRendererObj.drawString(color +  StatCollector.translateToLocal(la1 + ".name"), (this.width/2) + x, (this.height/2)+ y_1,  0x000000);
		this.fontRendererObj.drawString(color + StatCollector.translateToLocal(la2 + ".name"), (this.width/2)  + x, (this.height/2)+ y_2,  0x000000);
		this.fontRendererObj.drawString(color + StatCollector.translateToLocal(mesa), (this.width/2)  + x_2, (this.height/2)+ y_3,  0x000000);
		 color_paginas = EnumChatFormatting.BLUE; //CAMBIA EL COLOR DE LA STRING PAGINAS A BLUE
		}else if(mesa==mesa_de_ruby) {
			this.fontRendererObj.drawString(color +  StatCollector.translateToLocal(la1 + ".name"), (this.width/2) + x-2, (this.height/2)+ y_1,  0x000000);
			this.fontRendererObj.drawString(color + StatCollector.translateToLocal(la2 + ".name"), (this.width/2)  + x-2 , (this.height/2)+ y_2+30,  0x000000);
			this.fontRendererObj.drawString(color + StatCollector.translateToLocal(mesa), (this.width/2)  + x_2+8, (this.height/2)+ y_3+54,  0x000000);
			 color_paginas = EnumChatFormatting.RED; //CAMBIA EL COLOR DE LA STRING PAGINAS A RED
		}
		
	}
	//NO FUNCIONA MUY BIEN RENDERIZA LOS BLOQUES CON UNA CAPA DE COLOR EXTRAÑA REVISAR MAS ADELANTE
	public void render_bloques(int posx, int posy, int anchura, int altura, Block bloque, Item item) {   
		    if(!(bloque==null)) {
		    	this.mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
		    	 IIcon icon = Item.getItemFromBlock(bloque).getIconFromDamage(0);
				    GL11.glEnable(GL11.GL_BLEND);
				    this.drawTexturedModelRectFromIcon(posx, posy, icon, altura, anchura);
				    GL11.glDisable(GL11.GL_BLEND);
		    }
		    if(!(item==null)) {
		    	this.mc.getTextureManager().bindTexture(TextureMap.locationItemsTexture);
		    	 IIcon icon = item.getIconFromDamage(0);
				    GL11.glEnable(GL11.GL_BLEND);
				    this.drawTexturedModelRectFromIcon(posx, posy, icon, altura, anchura);
				    GL11.glDisable(GL11.GL_BLEND);
		    }
		    
		
		
	}
//INICIALIZA LA INTERFAZ
	@Override
	public void initGui() 
	{
		ItemStack itemstack = Minecraft.getMinecraft().thePlayer.inventory.getCurrentItem(); //COJE EL ITEM DE TU MANO Y LO TRANSFORMA A ITEMSTACK
		paginas =itemstack.getTagCompound().getInteger("Paginas"); //COJE LA COMPOUND LLAMADA PAGINAS Y COJE SU VALOR Y LO METE A LA VARIABLE LOCAL LLAMADA PAGINAS
		super.initGui();
		
		int centroX = this.width/2;
		int centroY = this.height/2;
		
		//BOTONES
		this.buttonList.add(this.siguiente = new texturabotones(0, centroX + 45, centroY + 140, StatCollector.translateToLocal("boton.siguiente.name"), "e.png", 60, 20)); //Parametros de los botones (id, x, y, width, height, text)
		this.buttonList.add(this.atras = new texturabotones(1, centroX - 120, centroY + 140, StatCollector.translateToLocal("boton.atras.name"),"e.png", 40, 20));
	}
	
	
	
	@Override
	protected void actionPerformed(GuiButton boton) 
	{
		if(boton.enabled)
		{
			if(boton.id == 0) 
			{
			if(paginas <= pag_max-1) {	
				paginas ++;
				ItemStack itemstack = Minecraft.getMinecraft().thePlayer.inventory.getCurrentItem();
				itemstack.getTagCompound().setInteger("Paginas",paginas);
			 }else {
				 paginas = 0;
				    ItemStack itemstack = Minecraft.getMinecraft().thePlayer.inventory.getCurrentItem();
					itemstack.getTagCompound().setInteger("Paginas",paginas);
			 }
	        }
		
			if(boton.id == 1) 
			{
				if(!(paginas == 0)) 
				{
					paginas --;
					ItemStack itemstack = Minecraft.getMinecraft().thePlayer.inventory.getCurrentItem();
					itemstack.getTagCompound().setInteger("Paginas",paginas);
					
				}else if(paginas==0) {
					paginas = pag_max;
					ItemStack itemstack = Minecraft.getMinecraft().thePlayer.inventory.getCurrentItem();
					itemstack.getTagCompound().setInteger("Paginas",paginas);
				}
			}
		}
		
		super.actionPerformed(boton);
	}
	
	
	@Override
	public void onGuiClosed() 
	{
		activo = false;
		paginas = 0;
		super.onGuiClosed();
	}

}
