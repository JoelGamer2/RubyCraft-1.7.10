package RubyCraft.Escaleras;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class Escalera_de_Bloque_Luminiscente extends BlockStairs{

	
	public Escalera_de_Bloque_Luminiscente(Block par2Block, int par3) {
		super(par2Block, par3);	
		
        this.setLightOpacity(0);
        
		}
	
    public boolean isOpaqueCube(){
        return false;
    }

    public boolean renderAsNormalBlock(){
        return false;
    }	
    
}