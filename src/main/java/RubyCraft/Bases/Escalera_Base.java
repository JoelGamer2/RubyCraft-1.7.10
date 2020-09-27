package RubyCraft.Bases;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class Escalera_Base extends BlockStairs{


    public Escalera_Base(Block RubyCraft, int par3) {
    	super(RubyCraft, par3);	
		 this.setLightOpacity(-999999);
	}

	public boolean isOpaqueCube(){
        return false;
    }

    public boolean renderAsNormalBlock(){
        return false;
    }	
}