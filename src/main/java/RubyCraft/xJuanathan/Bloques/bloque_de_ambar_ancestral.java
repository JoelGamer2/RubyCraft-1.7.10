package RubyCraft.xJuanathan.Bloques;

import java.util.Random;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class bloque_de_ambar_ancestral extends Block{

	public bloque_de_ambar_ancestral(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	}

	
	//Dropeo al romper el Bloque
	
		@Override
		public Item getItemDropped(int probabilidad, Random rand, int fortune) 
		{
			if (RubyCraft.Navidad)
			{
	            	return Item.getItemFromBlock(this);
	        }
			
			return null;
		}
}
