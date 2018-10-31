package RubyCraft.Bloques;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class troncoverde extends Block
{
    private static final String name = "troncoverde" + "";
 
    private IIcon[] icons = new IIcon[6];
 
    public troncoverde(Material material)
    {
        super(material);
        this.setStepSound(this.soundTypeWood);
     
    }
 
    @Override
    public void registerBlockIcons(IIconRegister reg)
    {
        for (int i = 0; i < 6; i++)
        {
            icons[i] = reg.registerIcon(RubyCraft.modid + ":" + name + "_" + (i + 1));
        }
    }
 
    @Override
    public IIcon getIcon(int side, int meta)
    {
        return icons[side];
    }
}