package RubyCraft.xJuanathan.Bloques;

import java.util.Random;

import RubyCraft.Bases.Barros;
import RubyCraft.xJuanathan.Principal;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Barro_Congelado extends Barros{

	public Barro_Congelado(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	}
	
	//Dropeo al romper el Bloque
	
	@Override
	public Item getItemDropped(int probabilidad, Random rand, int fortune) 
	{
		int tope = 90;
		
		if (fortune >= 0)
		{
			probabilidad = rand.nextInt(100);
			
			if (fortune == 1)
			{
				tope = 90;
			}
			
			else if (fortune > 1 && fortune <= 10)
			{
				tope = 90 - ((fortune*10) - 15);
			}
			
			if (probabilidad >= 0 && probabilidad < tope)
			{
				return Item.getItemFromBlock(this);
			}
			
			else if (probabilidad >= tope && probabilidad <= 100)
			{
				return Item.getItemFromBlock(Principal.Hielo_Glaciar);
			}
		}
		
		return null;
	}
}
