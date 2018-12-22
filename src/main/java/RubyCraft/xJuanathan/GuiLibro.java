package RubyCraft.xJuanathan;

import RubyCraft.RubyCraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GuiLibro extends GuiScreen{
	
	protected static final int X = 390;
	protected static final int Y = 245;
	
	public GuiButton atras;
	public GuiButton siguiente;
	
	private static ResourceLocation Textura = new ResourceLocation(RubyCraft.modid + ":textures/gui/bestiary.png");
	
	public void updateScreen ()
	{
		super.updateScreen ();
		
		int centroX = (this.width - 390/2);
		int centroY = (this.height - 245/2);
		
		this.buttonList.add(this.siguiente = new GuiButton(0, centroX + 15, centroY + 215, null));
		this.buttonList.add(this.atras = new GuiButton(0, centroX + 357, centroY + 215, null));
	}
}
