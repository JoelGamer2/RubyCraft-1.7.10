package HerraCraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class Magma_Acuatico extends Block {

	protected Magma_Acuatico(Material material) {
		super(material);
		this.setTickRandomly(true);
		this.setStepSound(this.soundTypeStone);
		
	}

	  /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World world, int x, int y, int z, Random rand) {
    	super.updateTick(world, x, y, z, rand);
    	if(world.getBlock(x, y + 1, z).getMaterial() == Material.water){
    		tick(world,x,y,z);
    	}
    	
    }
    
    public void tick(World world, int x, int y, int z) {
            world.setBlockToAir(x, y, z);
            
    		world.spawnParticle("flame", x, y, z, 10.0F, 10.0F, 10.0F);
    	}
    	

	public int tickRate(World world){
    
        return 2;
	
       }
}
