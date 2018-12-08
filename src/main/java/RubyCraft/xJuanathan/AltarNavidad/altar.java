package RubyCraft.xJuanathan.AltarNavidad;

import RubyCraft.RubyCraft;
import RubyCraft.xJuanathan.TileEntity.TileEntityAltar;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class altar extends BlockContainer{

	public static Block blockID;
	@SideOnly(Side.CLIENT)
	private IIcon Particulasaltar;
	
	public altar(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	}



	@SideOnly(Side.CLIENT)
	public IIcon getIcon (int side, int metadata){
		 return side == 1 ? this.Particulasaltar : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister){
		this.Particulasaltar = iconRegister.registerIcon(RubyCraft.modid + ":" + "TileEntitys/Altares/Particulasaltar");
		this.blockIcon = iconRegister.registerIcon(RubyCraft.modid + ":" + "TileEntitys/Altares/Particulasaltar");
		
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
		return new TileEntityAltar();
	}
	
}
