package HerraCraft;


import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import scala.tools.nsc.doc.base.Tooltip;

public class Altar_de_Alejandro extends Block {

	protected Altar_de_Alejandro(Material material) {
		super(material);
		
		
		
	}

	public static Block blockID;
	@SideOnly(Side.CLIENT)
	private IIcon Alejandroarriba;
	

	@SideOnly(Side.CLIENT)
	public IIcon getIcon (int side, int metadata){
		 return side == 1 ? this.Alejandroarriba : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister){
		this.Alejandroarriba = iconRegister.registerIcon(RubyCraft.RubyCraft.modid + ":" + "Herra/Alejandroarriba");
		this.blockIcon = iconRegister.registerIcon(RubyCraft.RubyCraft.modid + ":" + "Herra/Alejandrolados");
		
		
	}
	
}
	 