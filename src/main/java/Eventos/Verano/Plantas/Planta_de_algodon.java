package Eventos.Verano.Plantas;

import java.util.Random;

import Eventos.Verano.Principal.Clase_Principal_Evento_Verano;
import RubyCraft.RubyCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class Planta_de_algodon extends BlockCrops {

	@SideOnly(Side.CLIENT)
	private IIcon[] iconarray;

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconregister) {

		this.iconarray = new IIcon[4];

		for (int i = 0; i < this.iconarray.length; i++) {
			this.iconarray[i] = iconregister
					.registerIcon(RubyCraft.modid + ":Eventos/Verano/" + this.getUnlocalizedName().substring(5) + (i + 1));
		}

	}

	@Override
	public IIcon getIcon(int side, int metadata) {
		if (metadata < 7) {
			if (metadata == 6) {
				metadata = 5;
			}
			return this.iconarray[metadata >> 1];
		}
		return this.iconarray[3];
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {

		return 1;
	}

	protected Item func_149865_P() {
		return Clase_Principal_Evento_Verano.Algodon;
	}

	@Override
	protected Item func_149866_i() {

		return Clase_Principal_Evento_Verano.Semilla_Algodon;
	}
	
	public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 1;
    } 

}
