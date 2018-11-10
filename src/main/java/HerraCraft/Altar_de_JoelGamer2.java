package HerraCraft;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class Altar_de_JoelGamer2 extends Block {

	protected Altar_de_JoelGamer2(Material material) {
		super(material);
		
		
		
	}

	public static Block blockID;
	@SideOnly(Side.CLIENT)
	private IIcon Joelarriba;
	

	@SideOnly(Side.CLIENT)
	public IIcon getIcon (int side, int metadata){
		 return side == 1 ? this.Joelarriba : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister){
		this.Joelarriba = iconRegister.registerIcon(RubyCraft.RubyCraft.modid + ":" + "Herra/Joelarriba");
		this.blockIcon = iconRegister.registerIcon(RubyCraft.RubyCraft.modid + ":" + "Herra/Joellados");
		
		
	}
}