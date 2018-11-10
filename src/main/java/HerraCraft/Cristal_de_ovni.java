package HerraCraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Cristal_de_ovni extends Block {

	protected Cristal_de_ovni(Material material) {
		super(material);
		
		this.setStepSound(this.soundTypeGlass);
		
		
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