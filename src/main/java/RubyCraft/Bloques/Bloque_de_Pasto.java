package RubyCraft.Bloques;

import java.util.Random;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class Bloque_de_Pasto extends Block
{
    private static final String name = "Bloque_de_Pasto" + "";
 
    private IIcon[] icons = new IIcon[6];
 
    public Bloque_de_Pasto(Material material)
    {
        super(material);
     
        this.setStepSound(this.soundTypeGrass);
        
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
    @Override
    public Item getItemDropped(int p_149650_1_, Random rand, int x)
    {
        return Blocks.dirt.getItemDropped(0, rand, x);
    }
    protected boolean canSilkHarvest(){
		return false;
	}
}