package HerraCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Bloque_de_Enderpearl extends Block {


	
	protected Bloque_de_Enderpearl(Material material) {
		super(material);
		
	}
		
		public boolean onBlockActivated(World world, int x ,int y , int z, EntityPlayer player, int q, float a, float b ,float c){
			if(!player.isSneaking()){
				
				if(player.inventory.hasItemStack(new ItemStack(Blocks.obsidian,1)) && player.inventory.hasItem(Items.flint_and_steel)){
					
					player.travelToDimension(-1);
					
				}
				
			}
			return true;
		}
	}

