package RubyCraft.xJuanathan.Bloques;

import java.util.Random;

import RubyCraft.RubyCraft;
import RubyCraft.Bases.Barros;
import RubyCraft.xJuanathan.Principal;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Barro extends Barros {

	
	public Barro(Material sand) {
		super(sand);
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
                	return Principal.esencia_del_pantano;
            	}
            }

            else 
            {
            	return Item.getItemFromBlock(this);
            }
        }
		
		return null;
	}
}
