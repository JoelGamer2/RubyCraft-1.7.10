package HerraCraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Bloque_Invisible extends Block {

	protected Bloque_Invisible(Material material) {
		super(material);
		
		
	}
    public boolean isOpaqueCube(){
    	return false;
    }
    public boolean isRenderAsNormal(){
        return false;
    }
    protected boolean canSilkHarvest(){
    	return false;
    }
    public int quantityDropped(Random rand){
    	return 1;
    }
}