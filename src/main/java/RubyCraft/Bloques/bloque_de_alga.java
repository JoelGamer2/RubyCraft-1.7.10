package RubyCraft.Bloques;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class bloque_de_alga extends Block
{
    private static final String name = "bloque_de_alga" + "";
 
    private IIcon[] icons = new IIcon[6];
    
    public bloque_de_alga(Material material)
    {
        super(material);
     
        this.setStepSound(this.soundTypeGrass);
       
        
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
    
    
}