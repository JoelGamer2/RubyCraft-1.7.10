package RubyCraft.Bloques;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Cristal_Verde_Lima extends Block {

	public Cristal_Verde_Lima(Material Material) {
		super(Material);
		
		this.setStepSound(this.soundTypeGlass);	
   }
   public boolean isOpaqueCube(){
	   return false;
   }
   public boolean isRenderAsNormal(){
	   return false;
   }
   public boolean canSilkHarvest(){
	   return true;
   }
   @Override
   public int quantityDropped(Random rand) {
	   return 0;
    }
}
