package RubyCraft.Gui;

import org.lwjgl.opengl.GL11;

import RubyCraft.RubyCraft;
import RubyCraft.Gui.container.Container_Escalera_mesa_de_zafiro;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class gui_escalera_de_mesazafiro extends GuiContainer {

	private ResourceLocation texture = new ResourceLocation(RubyCraft.modid + ":" + "textures/gui/Mesa_deTrabajo_de_Zafiro.png");
	
	public gui_escalera_de_mesazafiro(InventoryPlayer invPlayer, World world, int x, int y, int z) {
		super(new Container_Escalera_mesa_de_zafiro(invPlayer, world, x, y, z));
		
		this.xSize = 176;
		this.ySize = 188;
		
	}

	
	public void onGuiClosed() {
		super.onGuiClosed();
	}
	
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		
		this.fontRendererObj.drawString(StatCollector.translateToLocal("gui.EscaleradeZafiro.name"), 81, 80,  0x00219D);
		this.fontRendererObj.drawString(StatCollector.translateToLocal("gui.Fabricacion.name"), 15 , 5,  0x178E8E);
		this.fontRendererObj.drawString(StatCollector.translateToLocal("gui.Inventario.name"),5 , 91,    0x404040);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {

		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
	}

}
