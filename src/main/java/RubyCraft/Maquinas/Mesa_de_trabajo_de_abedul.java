package RubyCraft.Maquinas;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Mesa_de_trabajo_de_abedul extends Block{
	
	private static final String name = "Mesa_de_trabajo_de_abedul" + "";
	 
    private IIcon[] icons = new IIcon[6];

    public Mesa_de_trabajo_de_abedul(Material material){
        super(material);
      
        this.setStepSound(this.soundTypeWood);
       
    }
    
    @Override
    public void registerBlockIcons(IIconRegister reg) {
   
        for (int i = 0; i < 6; i++) {
       
            icons[i] = reg.registerIcon(RubyCraft.modid + ":" + name + "_" + (i + 1));
        }
    }
 
    @Override
    public IIcon getIcon(int side, int meta)
    {
        return icons[side];
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int aa, float a, float b, float c){
    
        if(!player.isSneaking()){
        	 player.openGui(RubyCraft.instance, RubyCraft.guiIDMesadetrabajodeabedul, world, x, y, z);
        }
            return true;
        }
    
}