package Eventos.Verano.Bloques;

import java.util.Random;

import Eventos.Verano.Principal.Clase_Principal_Evento_Verano;
import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Aguamarina extends Block{

	private static int prob;
	
	public Aguamarina(Material p_i45394_1_) 
	{
		super(p_i45394_1_);
	}
	
	@Override
	public Item getItemDropped(int uno, Random rand, int fortune) 
	{
		if (RubyCraft.Verano)
		{
			prob = rand.nextInt(100);
			
			if (fortune > 0)
			{
				prob = prob + (fortune*fortune);
				
				if (prob > 100)
				{
					prob = 100;
				}
			}
			
			if(prob <= 70)
			{
				return Clase_Principal_Evento_Verano.Aguamarina_Azul;
			}
			
			else if (prob > 70 && prob <= 85)
			{
				return Clase_Principal_Evento_Verano.Aguamarina_Amarilla;
			}
			
			else if (prob > 85 && prob <= 94)
			{
				return Clase_Principal_Evento_Verano.Aguamarina_Verde;
			}
			
			else if (prob > 94 && prob <= 99)
			{
				return Clase_Principal_Evento_Verano.Aguamarina_AzulOscuro;
			}
			
			else
			{
				return Clase_Principal_Evento_Verano.Aguamarina_Transparente;
			}
		}
		
		else 
		{
			return null;
		}
	}
	
	@Override
	public int quantityDroppedWithBonus(int fortune, Random rand) 
	{
		if (fortune >= 1)
		{
			int cantidad;
			
			if (fortune > 0)
			{
				prob = prob + (fortune*fortune);
				
				if (prob > 100)
				{
					prob = 100;
				}
			}
			
			if (prob >= 86 && prob < 98)
			{
				cantidad = rand.nextInt(4);
				
				if (cantidad < 2)
				{
					return 2;
				}
				
				else
				{
					return cantidad;
				}
			}
			
			else if (prob >= 98 && prob <= 100)
			{
				cantidad = rand.nextInt(6);
				
				if (cantidad < 3)
				{
					return 3;
				}
				
				else
				{
					return cantidad;
				}
			}
			
			else 
			{
				cantidad = rand.nextInt(2);
				
				if (cantidad == 0)
				{
					return 1;
				}
				
				else
				{
					return cantidad;
				}
			}
		}
		
		else 
		{
			return 1;
		}
	}
}
