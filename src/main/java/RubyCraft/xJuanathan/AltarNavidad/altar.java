package RubyCraft.xJuanathan.AltarNavidad;

import RubyCraft.xJuanathan.TileEntity.TileEntityAltar;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class altar extends BlockContainer{

	public altar(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
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
