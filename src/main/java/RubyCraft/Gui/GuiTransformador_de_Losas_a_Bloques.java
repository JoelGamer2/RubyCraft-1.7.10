package RubyCraft.Gui;

import org.lwjgl.opengl.GL11;

import RubyCraft.RubyCraft;
import RubyCraft.Gui.container.ContainerTransformador_de_Losas_a_Bloques;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class GuiTransformador_de_Losas_a_Bloques extends GuiContainer {
	
	private ResourceLocation texture = new ResourceLocation(RubyCraft.modid + ":" + "textures/gui/Transformador_de_Losas_a_Bloques.png");
	
	public GuiTransformador_de_Losas_a_Bloques(InventoryPlayer invPlayer, World world, int x, int y, int z) {
		super(new ContainerTransformador_de_Losas_a_Bloques(invPlayer, world, x, y, z));
		
		this.xSize = 176;
		this.ySize = 188;
		
	}

	
	public void onGuiClosed() {
		super.onGuiClosed();
	}
	
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		
		this.fontRendererObj.drawString(StatCollector.translateToLocal("gui.Combustible.name"), 95, 74,  0x000000);
		this.fontRendererObj.drawString(StatCollector.translateToLocal("gui.Convertido.name"), 50 , 9,  0x212CFF);
		this.fontRendererObj.drawString(StatCollector.translateToLocal("gui.Inventario.name"),5 , 96,    0x404040);
		
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {

		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
	}

}
