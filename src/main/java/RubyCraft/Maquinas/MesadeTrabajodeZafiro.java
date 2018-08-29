package RubyCraft.Maquinas;


import RubyCraft.RubyCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class MesadeTrabajodeZafiro extends Block {

	public static Block blockID;
	@SideOnly(Side.CLIENT)
	private IIcon MesadeTrabajodeZafiroArriba;
	
	public MesadeTrabajodeZafiro() {
		super(Material.wood);
		this.setHardness(3.5F).setResistance(0.5F).setCreativeTab(RubyCraft.Rubycrafttab);
		this.setStepSound(this.soundTypeWood);
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon (int side, int metadata){
		return side == 1 ? this.MesadeTrabajodeZafiroArriba : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister){
		if(RubyCraft.Navidad == false){
		this.MesadeTrabajodeZafiroArriba = iconRegister.registerIcon(RubyCraft.modid + ":" + "MesadeTrabajodeZafiro_arriba");
		this.blockIcon = iconRegister.registerIcon(RubyCraft.modid + ":" + "MesadeTrabajodeZafiro");
		}else if(RubyCraft.Navidad == true){
			this.MesadeTrabajodeZafiroArriba = iconRegister.registerIcon(RubyCraft.modid + ":" + "Navidad/MesadeTrabajodeZafiro_arriba");
			this.blockIcon = iconRegister.registerIcon(RubyCraft.modid + ":" + "Navidad/MesadeTrabajodeZafiro");
		}
	}
	
	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int q, float a, float b, float c){
		if (!player.isSneaking()){
			player.openGui(RubyCraft.instance, RubyCraft.guiIDMesadeTrabajodeZafiro, world, x, y, z);
		}
			return true;
	}
	
}
