package HerraCraft;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class Altar_de_Miguelperez extends Block {

	protected Altar_de_Miguelperez(Material material) {
		super(material);
		
		
		
	}

	public static Block blockID;
	@SideOnly(Side.CLIENT)
	private IIcon Miguelarriba;
	

	@SideOnly(Side.CLIENT)
	public IIcon getIcon (int side, int metadata){
		 return side == 1 ? this.Miguelarriba : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister){
		this.Miguelarriba = iconRegister.registerIcon(RubyCraft.RubyCraft.modid + ":" + "Herra/Miguelarriba");
		this.blockIcon = iconRegister.registerIcon(RubyCraft.RubyCraft.modid + ":" + "Herra/Miguellados");
		
		
	}
}