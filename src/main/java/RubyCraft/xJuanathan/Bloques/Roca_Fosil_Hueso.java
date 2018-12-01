package RubyCraft.xJuanathan.Bloques;

import java.util.Random;

import RubyCraft.xJuanathan.Principal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Roca_Fosil_Hueso extends Block {

	public Roca_Fosil_Hueso(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	}

	
	//Dropeo al romper el bloque
	
	@Override
	public Item getItemDropped(int probabilidad, Random rand, int fortune) 
	{
		int topehueso = 80;
		int topecalavera = 95;
		
		if (fortune >= 0)
		{
			probabilidad = rand.nextInt(100);
			
			if (fortune == 1)
			{
				topehueso = 75;
				topecalavera = 90;
			}
			
			else if (fortune > 1 && fortune <= 8)
			{
				topehueso = 80 - ((fortune*10) - 8);
				topecalavera = 95 - ((fortune*10) - 10);
			}
			
			if (probabilidad >= 0 && probabilidad < topehueso)
			{
				return Principal.Fragmento_de_fosil;
			}
			
			else if (probabilidad >= topehueso && probabilidad < topecalavera)
			{
				return Principal.hueso_fosilizado;
			}
			
			else if (probabilidad >= topecalavera && probabilidad <= 100)
			{
				return Principal.calavera_gigante;
			}
		}
		
		return null;
	}
}
