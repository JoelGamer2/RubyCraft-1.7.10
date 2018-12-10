package RubyCraft.xJuanathan.Bloques;

import java.util.Random;

import RubyCraft.RubyCraft;
import RubyCraft.xJuanathan.Principal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Roca_Fosil extends Block {

	public Roca_Fosil(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	}
	
	
	//Dropeo al romper el Bloque
	
	@Override
	public Item getItemDropped(int probabilidad, Random rand, int fortune) 
	{
		if (RubyCraft.Navidad)
		{
			int tope = 95;
		
			if(fortune >= 1)
			{
				probabilidad = rand.nextInt(100);
        	
				if (fortune == 1)
				{
					tope = 95;
				}
				else if (fortune > 1 && fortune <= 10)
				{
					tope = 95 - ((fortune*10) - 10);
				}
        	
        	
				if (probabilidad >=0 && probabilidad < tope)
				{
					return Item.getItemFromBlock(this);
				}
        	
				else
				{
					return Principal.esencia_de_las_montanas;
				}
			}

			else 
			{
				return Item.getItemFromBlock(this);
			}
		}
		
		else
		{
			return null;
		}
	}
}
