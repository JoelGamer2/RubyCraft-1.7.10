package RubyCraft.Escaleras;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class Escalera_de_Zafiro extends BlockStairs{

	
	public Escalera_de_Zafiro(Block par2Block, int par3) {
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