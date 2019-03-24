package RubyCraft.xJuanathan;

import org.lwjgl.opengl.GL11;

import RubyCraft.RubyCraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class GuiLibro extends GuiContainer{
	

    public static int ancho;
    public static int alto;
	public static int X = 256;
	public static  int Y = 255;
	private static boolean activo = false;
	public static int paginas = 0;
	public GuiButton atras;
	public GuiButton siguiente;
	public static ResourceLocation Textura = new ResourceLocation(RubyCraft.modid + ":textures/gui/bestiary.png");
	public static ResourceLocation Textura2 = new ResourceLocation(RubyCraft.modid + ":textures/gui/bestiary2.png");


	
	public GuiLibro(InventoryPlayer p_i1084_1_, World p_i1084_2_, int p_i1084_3_, int p_i1084_4_, int p_i1084_5_)
    {
        super(new ContainerLibro(p_i1084_1_, p_i1084_2_, p_i1084_3_, p_i1084_4_, p_i1084_5_));
        
    }
	public void updateScreen ()
	{
        
        super.updateScreen();
        
		
	}
	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
		int centroX = (this.width/2);
		int centroY = this.height / 2;
		
		
		      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		      if(paginas==0) {
	        this.mc.getTextureManager().bindTexture(Textura);
		      }else if(paginas==1){
		    	  this.mc.getTextureManager().bindTexture(Textura2);
		      }
	        int k = /**(this.width - this.xSize) / 2**/ (this.width/2)-(X/2);
	        int l = (this.height - this.ySize) / 2;
	        this.drawTexturedModalRect(k, l, 0, 0, X, Y);

	        if(!activo) {
				
						
	        	this.buttonList.add(this.siguiente = new GuiButton(0, centroX - 30, centroY + 80, "siguiente"));
				this.buttonList.add(this.atras = new GuiButton(1, centroX + 30, centroY + 80, "atras"));
				activo = true;
			}
	       String paginase = Integer.toString(paginas);
			this.fontRendererObj.drawString(StatCollector.translateToLocal(paginase), (this.width/2) + 118, (this.height/2) + 63,  0x37FF00);

	}
	
	@Override
	protected void actionPerformed(GuiButton b) {
		if(b.enabled){
		if(b.id == 0) {
       paginas ++;
	       
	        }
		
		if(b.id == 1) {
			if(!(paginas == 0)) {
			paginas--;
			}
		}
		}
		super.actionPerformed(b);
	}
	    
	@Override
	public void onGuiClosed() {
		activo = false;
		paginas = 0;
		super.onGuiClosed();
	}
	

}
