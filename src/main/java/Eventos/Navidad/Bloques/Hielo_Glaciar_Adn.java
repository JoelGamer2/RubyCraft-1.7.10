package Eventos.Navidad.Bloques;

import java.util.Random;

import RubyCraft.RubyCraft;
import RubyCraft.Bases.Hielo;
import RubyCraft.xJuanathan.Principal;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Hielo_Glaciar_Adn extends Hielo {

	public Hielo_Glaciar_Adn(Material ice) {
		super(ice);
		// TODO Auto-generated constructor stub
	}
	
	//Dropeo al romper el Bloque
	
		@Override
		public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) 
		{
			if (RubyCraft.Navidad)
			{
			    return Principal.vial_de_sangre_de_hielo;
			}
			
			else 
			{
				return null;
			}
		}

		
		// Dropeo de item afectado por encantamiento fortuna
				
				@Override
				public int quantityDroppedWithBonus(int fortune, Random rand) 
				{
					int probabilidad;
					
					if (fortune >= 1)
					{
						probabilidad = rand.nextInt(100);
						
						if (probabilidad >= 86 && probabilidad < 98)
						{
							return fortune + 2;
						}
						
						else if (probabilidad >= 98 && probabilidad <= 100)
						{
							return fortune + 3;
						}
						
						else {
						
						return fortune + 1;
						}
					}
					
					else {
						
					return 1;
					}
					
				}
}
