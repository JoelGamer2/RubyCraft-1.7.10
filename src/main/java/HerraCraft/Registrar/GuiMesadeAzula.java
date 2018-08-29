package HerraCraft.Registrar;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class GuiMesadeAzula extends GuiContainer {

	private ResourceLocation texture = new ResourceLocation(RubyCraft.RubyCraft.modid + ":" + "textures/gui/Herra/Mesa_de_Azula.png");
	 private TileEntityFurnace MesadeRuby_Nombre;
	    private static final String __OBFID = "CL_00000758";
	
	public GuiMesadeAzula(InventoryPlayer invPlayer, World world, int x, int y, int z) {
		super(new ContainerMesadeAzula(invPlayer, world, x, y, z));
		
		this.xSize = 176;
		this.ySize = 188;
	
		

	}

	
	public void onGuiClosed() {
		super.onGuiClosed();
	}
	
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		this.fontRendererObj.drawString(StatCollector.translateToLocal("Mesa de Azula"), 102, 80,  0x00E9FF);
		this.fontRendererObj.drawString(StatCollector.translateToLocal("Fabricacion"), 106 , 9,  0x1CB7FF);
		this.fontRendererObj.drawString(StatCollector.translateToLocal("Inventario"),5 , 96,    0x404040);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {

		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
	}

}
