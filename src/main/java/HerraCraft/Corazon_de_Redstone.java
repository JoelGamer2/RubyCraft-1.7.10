package HerraCraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCompressedPowered;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class Corazon_de_Redstone extends BlockCompressedPowered {

	protected Corazon_de_Redstone(MapColor material) {
		super(material);
		
	}

	@Override
	public boolean canProvidePower() {
	
		return true;
	}
	

    public int isProvidingWeakPower(IBlockAccess acess, int x, int y, int z, int a)
    {
        return 20;
    }
}
