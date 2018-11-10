package RubyCraft.Escaleras;

import java.util.Random;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class Escalera_de_Magma extends BlockStairs{

	
	public Escalera_de_Magma(Block par2Block, int par3) {
		super(par2Block, par3);	
		
		  this.setLightOpacity(-999999);
        
		}
	
    public boolean isOpaqueCube(){
        return false;
    }

    public boolean renderAsNormalBlock(){
        return false;
    }	
    
    public void updateTick(World world, int x, int y, int z, Random rand)
    {
        if (world.isAirBlock(x, y + 1, z))
        {
            int l;

            for (l = 1; world.getBlock(x, y - l, z) == this; ++l)
            {
                
            }

            if (l < 3)
            {
                int i1 = world.getBlockMetadata(x, y, z);

                if (i1 == 15)
                {
                   
                }
                else
                {
                    world.setBlockMetadataWithNotify(x, y, z, i1 + 1, 4);
                }
            }
        }
    }

    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
    {
    	
        entity.attackEntityFrom(RubyCraft.Magma, 1.0F);
    }
    
    
}