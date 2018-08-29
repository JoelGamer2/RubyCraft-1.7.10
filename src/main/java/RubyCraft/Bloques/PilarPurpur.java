package RubyCraft.Bloques;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class PilarPurpur extends Block
{
    private static final String name = "Pilar_Purpur";
 
    private IIcon[] icons = new IIcon[6];
 
    public PilarPurpur(Material material)
    {
        super(material);
     
    }
 
    @Override
    public void registerBlockIcons(IIconRegister reg){
    
        for (int i = 0; i < 6; i++) {
       if(RubyCraft.Navidad == false){   
            icons[i] = reg.registerIcon(RubyCraft.modid + ":" + name + "_" + (i + 1));
          }else if(RubyCraft.Navidad == true){
        	  icons[i] = reg.registerIcon(RubyCraft.modid + ":Navidad/" + name + "_" + (i + 1));
          }
        }
    }
 
    @Override
    public IIcon getIcon(int side, int meta)
    {
        return icons[side];
    }
}