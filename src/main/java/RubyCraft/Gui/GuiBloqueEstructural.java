package RubyCraft.Gui;

import org.lwjgl.opengl.GL11;

import RubyCraft.RubyCraft;
import RubyCraft.Gui.container.ContainerBloqueEstructural;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class GuiBloqueEstructural extends GuiContainer {

	private ResourceLocation texture = new ResourceLocation(RubyCraft.modid + ":" + "textures/gui/BloqueEstructural.png");
	
	public GuiBloqueEstructural(InventoryPlayer invPlayer, World world, int x, int y, int z) {
		super(new ContainerBloqueEstructural(invPlayer, world, x, y, z));
		
		this.xSize = 176;
		this.ySize = 188;
		
	}

	
	public void onGuiClosed() {
		super.onGuiClosed();
	}
	
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		
		this.fontRendererObj.drawString(StatCollector.translateToLocal("gui.En_Desarrollo.name"), 55, 70, 0xFC0303);
		this.fontRendererObj.drawString(StatCollector.translateToLocal("gui.Objetivo:Que_Funcione_como_la"), 7, 10 ,0xFC0303);
		this.fontRendererObj.drawString(StatCollector.translateToLocal("1.10"), 153, 20, 0xFC0303);
	
		
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {

		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
	}

}
