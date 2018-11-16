package RubyCraft.xJuanathan.Bloques;

import java.util.Random;

import RubyCraft.xJuanathan.Principal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Barro_Congelado_Adn extends Block {

	public Barro_Congelado_Adn(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	}
	
	//Dropeo al romper el Bloque
	
			@Override
			public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) 
			{
				// TODO Auto-generated method stub
				return Principal.vial_de_sangre_del_pantano;
			}

}
