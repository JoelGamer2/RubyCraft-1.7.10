package RubyCraft.Bases;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class Bloque_con_faro extends Block {

	protected Bloque_con_faro(Material material) {
		super(material);
	}

	@Override
	public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
	    return true;
	}
	
}
