package RubyCraft.xJuanathan.Bloques;

import java.util.Random;

import RubyCraft.xJuanathan.Principal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

public class Barro_Congelado_Ambar extends Block {

	public Barro_Congelado_Ambar(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	}
	
	public int cantidad = 0;
	
	//Dropeo al romper el Bloque
	
			@Override
			
			public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int fortune) 
			{
				if (fortune > 0)
				{
					cantidad = fortune;
					//System.out.println(cantidad);
				}
				
				
				return Principal.ambar;
			}
			
	// Dropeo de item afectado por encantamiento fortuna
			
			@Override
			
			
			public int quantityDroppedWithBonus(int fortune, Random rand) {
				
				if (fortune >= 1)
				{
					System.out.println(fortune);
					return (fortune + 1) + rand.nextInt(fortune*2);
				}
				
				else 
					System.out.println(fortune);
					return 1;
				
			}
			
	// Dropeo de xp afectado por encantamiento fortuna
			
			@Override
			
			public int getExpDrop (IBlockAccess world, int metadata, int fortune)
			{
				if (fortune >= 1)
				{
					return 2 + (fortune*3);
				}
				
				else
					
				return 2;
			}

}
