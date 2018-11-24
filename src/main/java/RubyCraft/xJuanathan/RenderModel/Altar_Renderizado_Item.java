package RubyCraft.xJuanathan.RenderModel;

import org.lwjgl.opengl.GL11;

import RubyCraft.xJuanathan.TileEntity.TileEntityAltar;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;

public class Altar_Renderizado_Item implements IItemRenderer{

	private TileEntity tile;
	private TileEntitySpecialRenderer render;
	
	public Altar_Renderizado_Item(TileEntity tile, TileEntitySpecialRenderer render) {
		super();
		this.tile = tile;
		this.render = render;
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		GL11.glPushMatrix();
		if(tile instanceof TileEntityAltar){
		}
		TileEntityRendererDispatcher.instance.renderTileEntityAt(tile, 0, 0, 0, 0);
		GL11.glPopMatrix();
	}

	
	
}