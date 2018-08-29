package HerraCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class Almacen_de_energia extends Block {

	protected Almacen_de_energia(Material material) {
		super(material);
		
	}
	 public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ)
	    {
	        return true;
	    }
}
