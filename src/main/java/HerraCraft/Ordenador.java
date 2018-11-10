package HerraCraft;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class Ordenador extends Block {

	protected Ordenador(Material material) {
		super(material);
		
		this.setStepSound(this.soundTypeAnvil);
		
	}

	public static Block blockID;
	@SideOnly(Side.CLIENT)
	private IIcon Ordenadorarriba;
	

	@SideOnly(Side.CLIENT)
	public IIcon getIcon (int side, int metadata){
		 return side == 1 ? this.Ordenadorarriba : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister){
		this.Ordenadorarriba = iconRegister.registerIcon(RubyCraft.RubyCraft.modid + ":" + "Herra/Ordenadorarriba");
		this.blockIcon = iconRegister.registerIcon(RubyCraft.RubyCraft.modid + ":" + "Herra/Ordenadorlados");
		
		
	}
}
