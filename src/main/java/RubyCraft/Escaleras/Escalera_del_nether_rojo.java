package RubyCraft.Escaleras;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class Escalera_del_nether_rojo extends BlockStairs{

	
	public Escalera_del_nether_rojo(Block par2Block, int par3) {
		super(par2Block, par3);	
		
        this.setLightOpacity(-999999);
        
		}
	
    public boolean isOpaqueCube(){
        return false;
    }

    public boolean renderAsNormalBlock(){
        return false;
    }	
    
}