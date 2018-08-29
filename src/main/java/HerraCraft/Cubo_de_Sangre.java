package HerraCraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class Cubo_de_Sangre extends Block {

	protected Cubo_de_Sangre(Material material) {
		super(material);
		
		this.renderAsNormalBlock();
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