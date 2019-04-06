package Eventos.Verano.Plantas;

import java.util.Random;

import Eventos.Verano.Principal.Clase_Principal_Evento_Verano;
import RubyCraft.RubyCraft;
import RubyCraft.Bases.Flores;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Algodon_Salvaje extends Flores{

	public Algodon_Salvaje(Material material) 
	{
		super(material);
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random rand, int p_149650_3_) 
	{
		if (RubyCraft.Verano)
		{
			return Clase_Principal_Evento_Verano.Semilla_Algodon;
		}
		else 
		{
			return null;
		}
	}
	
	@Override
	public int quantityDropped(Random rand) 
	{
		int probabilidad;
		
		probabilidad = rand.nextInt(100);
		
		System.out.println(probabilidad);
		
		if(probabilidad > 20 && probabilidad <= 75)
		{
			return 1;
		}
		
		else if (probabilidad > 75 && probabilidad <= 90)
		{
			return 2;
		}
		
		else if (probabilidad > 90 && probabilidad <= 99)
		{
			return 3;
		}
		
		else if (probabilidad == 100)
		{
			return 4;
		}
		
		else
		{
			return 0;
		}
	}
}
