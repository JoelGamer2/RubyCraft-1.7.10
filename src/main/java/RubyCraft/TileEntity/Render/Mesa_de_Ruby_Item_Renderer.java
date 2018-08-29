package RubyCraft.TileEntity.Render;

import org.lwjgl.opengl.GL11;

import RubyCraft.TileEntity.TileEntityMesa_de_Ruby;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;

public class Mesa_de_Ruby_Item_Renderer implements IItemRenderer{

	private TileEntity tile;
	private TileEntitySpecialRenderer render;
	
	public Mesa_de_Ruby_Item_Renderer(TileEntity tile, TileEntitySpecialRenderer render) {
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
		if(tile instanceof TileEntityMesa_de_Ruby){
		}
		TileEntityRendererDispatcher.instance.renderTileEntityAt(tile, 0, 0, 0, 0);
		GL11.glPopMatrix();
	}

	
	
}