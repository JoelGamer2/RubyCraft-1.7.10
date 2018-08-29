package RubyCraft.Gui;

import org.lwjgl.opengl.GL11;

import RubyCraft.RubyCraft;
import RubyCraft.Gui.container.gui_Container_Mesa_de_trabajo_jungla;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class gui_mesadetrabajodejungla extends GuiContainer {

	
	  private static final ResourceLocation craftingTableGuiTextures = new ResourceLocation(RubyCraft.modid + ":" + "textures/gui/trabajo.png");
    private static final String __OBFID = "CL_00000750";

    public gui_mesadetrabajodejungla(InventoryPlayer p_i1084_1_, World p_i1084_2_, int p_i1084_3_, int p_i1084_4_, int p_i1084_5_)
    {
        super(new gui_Container_Mesa_de_trabajo_jungla(p_i1084_1_, p_i1084_2_, p_i1084_3_, p_i1084_4_, p_i1084_5_));
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_)
    {
        this.fontRendererObj.drawString(StatCollector.translateToLocal("container.crafting"), 28, 6, 4210752);
        this.fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(craftingTableGuiTextures);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
    }

}
