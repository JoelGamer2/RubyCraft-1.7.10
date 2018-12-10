package RubyCraft.xJuanathan.Bloques;

import java.util.Random;

import RubyCraft.RubyCraft;
import RubyCraft.xJuanathan.Principal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Monton_de_fosiles extends Block {

	public Monton_de_fosiles(Material p_i45394_1_) 
	{
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	}
	
	
	//Dropeo al romper el Bloque
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) 
	{
		if (RubyCraft.Navidad)
		{
			return Principal.Fragmento_de_fosil;
		}
		
		else
		{
			return null;
		}
	}
	
	
	@Override
	public int quantityDropped(int meta, int fortune, Random random) 
	{
		// TODO Auto-generated method stub
		return 1+random.nextInt(2);
	}

}
