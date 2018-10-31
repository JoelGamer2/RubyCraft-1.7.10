package RubyCraft.Bloques;

import java.util.Random;

import RubyCraft.RubyCraft;
import RubyCraft.Bases.Cementos_Bases;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class Polvo_de_Cemento_Naranja extends BlockFalling{



    public Polvo_de_Cemento_Naranja(Material material){
    
        super(material);
        this.setTickRandomly(true);
        this.setStepSound(this.soundTypeSand);
        this.setHardness(0.5F).setCreativeTab(RubyCraft.Rubycrafttab);
       
    }



    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World world, int x, int y, int z, Random rand) {
    	super.updateTick(world, x, y, z, rand);
    	if(world.getBlock(x, y, z).getMaterial() == Material.water || world.getBlock(x - 1, y, z).getMaterial() == Material.water || world.getBlock(x, y, z - 1).getMaterial() == Material.water || world.getBlock(x - 1, y, z - 1).getMaterial() == Material.water || world.getBlock(x, y - 1, z).getMaterial() == Material.water || world.getBlock(x, y + 1, z).getMaterial() == Material.water || world.getBlock(x + 1,  y , z).getMaterial() == Material.water|| world.getBlock(x + 1,  y , z + 1).getMaterial() == Material.water|| world.getBlock(x,  y , z + 1).getMaterial() == Material.water){
    		tick(world,x,y,z);
    	}
    	
    }
    
    public void tick(World world, int x, int y, int z) {
            world.setBlockToAir(x, y, z);
            
    		world.setBlock(x, y, z, Cementos_Bases.Cemento_Endurecido_Naranja);
    	}
    	

	public int tickRate(World world){
    
        return 2;
    }
}