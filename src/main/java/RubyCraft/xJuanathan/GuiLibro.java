package RubyCraft.xJuanathan;

import net.minecraft.client.gui.GuiScreen;import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import RubyCraft.RubyCraft;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
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
