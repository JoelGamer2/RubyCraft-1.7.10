package HerraCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class Bloque_De_Estrella_Del_Wither extends Block {

	protected Bloque_De_Estrella_Del_Wither(Material material) {
		super(material);
		
	}
	 public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ)
	    {
	        return true;
	    }
}
