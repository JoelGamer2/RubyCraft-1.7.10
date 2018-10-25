package RubyCraft.Gui;

import org.lwjgl.opengl.GL11;

import RubyCraft.RubyCraft;
import RubyCraft.Gui.container.ContainerMesadeTrabajodeRuby;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class GuiMesadeTrabajodeRuby extends GuiContainer {

	private ResourceLocation texture = new ResourceLocation(RubyCraft.modid + ":" + "textures/gui/Mesa_deTrabajo_de_Ruby.png");
	 private TileEntityFurnace MesadeRuby_Nombre;
	    private static final String __OBFID = "CL_00000758";
	
	public GuiMesadeTrabajodeRuby(InventoryPlayer invPlayer, World world, int x, int y, int z) {
		super(new ContainerMesadeTrabajodeRuby(invPlayer, world, x, y, z));
		
		this.xSize = 176;
		this.ySize = 188;

	}

	
	public void onGuiClosed() {
		super.onGuiClosed();
	}
	
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		if(!RubyCraft.Navidad){
		this.fontRendererObj.drawString(StatCollector.translateToLocal("gui.Mesa_de_Ruby.name"), 102, 80,  0xFF1500);
		}else if(RubyCraft.Navidad){
			this.fontRendererObj.drawString(StatCollector.translateToLocal("gui.Mesa_de_Ruby_Navidad.name"), 98, 80, 0xFF5507);
		}
		this.fontRendererObj.drawString(StatCollector.translateToLocal("gui.Fabricacion.name"), 106 , 9, 0xFF4626);
		this.fontRendererObj.drawString(StatCollector.translateToLocal("gui.Inventario.name"),5 , 96, 0x404040);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {

		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
	}

}
