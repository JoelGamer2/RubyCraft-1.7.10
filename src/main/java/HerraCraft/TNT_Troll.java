package HerraCraft;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class TNT_Troll extends Block {

	protected TNT_Troll(Material material) {
		super(material);
		
		this.setStepSound(this.soundTypeGrass);
		
	}

	public static Block blockID;
	@SideOnly(Side.CLIENT)
	private IIcon TNTarriba;
	

	@SideOnly(Side.CLIENT)
	public IIcon getIcon (int side, int metadata){
		 return side == 1 ? this.TNTarriba : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister){
		this.TNTarriba = iconRegister.registerIcon(RubyCraft.RubyCraft.modid + ":" + "Herra/TNTarriba");
		this.blockIcon = iconRegister.registerIcon(RubyCraft.RubyCraft.modid + ":" + "Herra/TNTlados");
		
		
	}
}
	 