package RubyCraft.Escaleras;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class Escalera_de_Mesa_de_Trabajo_de_Zafiro extends BlockStairs{

	
	public Escalera_de_Mesa_de_Trabajo_de_Zafiro(Block par2Block, int par3) {
		super(par2Block, par3);	
		
        this.setLightOpacity(-999999);
        
		}
	
    public boolean isOpaqueCube(){
        return false;
    }

    public boolean renderAsNormalBlock(){
        return false;
    }	
    public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int q, float a, float b, float c){
		if (!player.isSneaking()){
			player.openGui(RubyCraft.instance, RubyCraft.guiIdMesaEscaleraZafiro, world, x, y, z);
			return true;
		}else{
			return false;
		}
    }
}