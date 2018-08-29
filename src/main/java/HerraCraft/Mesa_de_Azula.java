package HerraCraft;


import RubyCraft.RubyCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Mesa_de_Azula extends Block {

	public static Block blockID;
	@SideOnly(Side.CLIENT)
	private IIcon MesaAzulaArriba;
	
	public Mesa_de_Azula() {
		super(Material.wood);
		this.setHardness(3.5F).setResistance(0.5F).setCreativeTab(herracraft.Herra);
		this.setStepSound(this.soundTypeWood);
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon (int side, int metadata){
		 return side == 1 ? this.MesaAzulaArriba : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister){
		this.MesaAzulaArriba = iconRegister.registerIcon(RubyCraft.modid+ ":" + "Herra/MesaAzulaArriba");
		this.blockIcon = iconRegister.registerIcon(RubyCraft.modid + ":" + "Herra/MesaAzulaLados");
		
	}
	 
		public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int q, float a, float b, float c){
		if (!player.isSneaking()){
			player.openGui(RubyCraft.instance, herracraft.guiIDMesadeAzula, world, x, y, z);
		}
		return true;
	}
	
}