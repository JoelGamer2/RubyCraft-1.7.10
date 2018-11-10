package HerraCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class Bloque_de_metal extends Block {

	protected Bloque_de_metal(Material material) {
		super(material);
		
	}

	  public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ)
	    {
	        return true;
	    }
	
}
