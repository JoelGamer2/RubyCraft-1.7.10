package RubyCraft.Escaleras;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class Escalera_de_Obsidiana extends BlockStairs{


    public Escalera_de_Obsidiana(Block obsidian, int par3) {
    	super(obsidian, par3);	
		 this.setLightOpacity(-999999);
	}

	public boolean isOpaqueCube(){
        return false;
    }

    public boolean renderAsNormalBlock(){
        return false;
    }	
}