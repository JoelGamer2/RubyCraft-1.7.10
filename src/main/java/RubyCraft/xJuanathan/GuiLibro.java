package RubyCraft.xJuanathan;

import org.lwjgl.opengl.GL11;

import RubyCraft.RubyCraft;
import RubyCraft.Bases.texturabotones;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class GuiLibro extends GuiContainer{
	

    public static int X = 256;
	public static  int Y = 256;
	private static boolean activo = false;
	public static int paginas = 0;
	public GuiButton atras;
	public GuiButton siguiente;
	public static ResourceLocation Textura = new ResourceLocation(RubyCraft.modid + ":textures/gui/GUI_Evento_Verano/Libro_Abierto.png");
	public static ResourceLocation Textura2 = new ResourceLocation(RubyCraft.modid + ":textures/gui/GUI_Evento_Verano/Libro_Abierto.png");


	
	public GuiLibro(InventoryPlayer inv, World world, int x, int y, int z)
    {
        super(new ContainerLibro(inv, world, x, y, z));
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
		
		if(paginas==0) 
		{
	        this.mc.getTextureManager().bindTexture(Textura);
		}
		
		else if(paginas>=1)
		{
			this.mc.getTextureManager().bindTexture(Textura2);
		}
		
	    int k = (this.width/2)-((X/2)+3);
	    int l = (this.height/2) - (Y/2);
	    
	    this.drawTexturedModalRect(k, l, 0, 0, X, Y);

	    String paginase = Integer.toString(paginas);
	       
		this.fontRendererObj.drawString(StatCollector.translateToLocal(paginase), (this.width/2) + 128, (this.height/2) + 28,  0x000000);
	}


	@Override
	public void initGui() 
	{
		super.initGui();
		
		int centroX = this.width/2;
		int centroY = this.height/2;
		
		this.buttonList.add(this.siguiente = new texturabotones(0, centroX + 30, centroY + 80, StatCollector.translateToLocal("boton.siguiente.name"), "e.png", 60, 20)); //Parametros de los botones (id, x, y, width, height, text)
		this.buttonList.add(this.atras = new texturabotones(1, centroX - 60, centroY + 80, StatCollector.translateToLocal("boton.atras.name"),"e.png", 40, 20));
	}
	
	
	
	@Override
	protected void actionPerformed(GuiButton boton) 
	{
		if(boton.enabled)
		{
			if(boton.id == 0) 
			{
				paginas ++;
	        }
		
			if(boton.id == 1) 
			{
				if(!(paginas == 0)) 
				{
					paginas --;
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
