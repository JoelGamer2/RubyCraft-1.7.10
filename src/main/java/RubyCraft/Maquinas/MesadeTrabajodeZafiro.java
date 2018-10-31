package RubyCraft.Maquinas;


import RubyCraft.RubyCraft;
import RubyCraft.TileEntity.TileEntityMesa_de_Zafiro;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class MesadeTrabajodeZafiro extends BlockContainer {

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
		this.MesadeTrabajodeZafiroArriba = iconRegister.registerIcon(RubyCraft.modid + ":" + "MesadeTrabajodeZafiro");
		this.blockIcon = iconRegister.registerIcon(RubyCraft.modid + ":" + "TileEntitys/Mesas/Particulas_zafiro");
		}
	}
	
	
	@Override
	public int getRenderType() {	
		return -1;
	}
	
	public boolean isOpaqueCube() {
		return false;
	}
	public boolean isNormalCube() {
		return false;
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int id) {
		return new TileEntityMesa_de_Zafiro();
	}
	
	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int q, float a, float b, float c){
		if (!player.isSneaking()){
			player.openGui(RubyCraft.instance, RubyCraft.guiIDMesadeTrabajodeZafiro, world, x, y, z);
		}
			return true;
	}
	
}
