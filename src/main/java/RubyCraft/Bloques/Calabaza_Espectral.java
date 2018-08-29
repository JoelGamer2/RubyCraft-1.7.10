package RubyCraft.Bloques;

import RubyCraft.RubyCraft;
import RubyCraft.Entidades.Mobs.AlienMob;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Calabaza_Espectral extends Block {

	   private static final String name = "Calabaza_Espectral" + "";
	
	    private IIcon[] icons = new IIcon[6];

	public Calabaza_Espectral(Material material) {
		super(material);
	}

	public void onBlockAdded(World world, int x, int y, int z){
		
		if(world.getBlock(x, y - 1, z) == RubyCraft.Bloquederuby){
			if(world.getBlock(x, y - 2, z) == RubyCraft.Bloquederuby){
				if(world.getBlock(x, y - 1, z - 1) == RubyCraft.Bloquederuby){
					if(world.getBlock(x, y - 1, z + 1) == RubyCraft.Bloquederuby){
						
						world.setBlock(x, y, z, Blocks.air);
						world.setBlock(x, y - 2, z, Blocks.air);
						world.setBlock(x, y - 1, z, Blocks.air);
						world.setBlock(x, y - 1, z - 1, Blocks.air);
						world.setBlock(x, y - 1, z + 1, Blocks.air);
						
						AlienMob alien = new AlienMob(world);
						alien.setPosition(x, y - 2, z);
						world.spawnEntityInWorld(alien);
						}
		        

					}
				}
			}
             if(world.getBlock(x, y - 1, z) == RubyCraft.Bloquederuby){
            	 if(world.getBlock(x, y - 2, z) == RubyCraft.Bloquederuby){
            		 if(world.getBlock(x - 1, y - 1, z) == RubyCraft.Bloquederuby){
            			 if(world.getBlock(x + 1, y - 1, z) == RubyCraft.Bloquederuby){
            				 world.setBlock(x, y, z, Blocks.air);
            				 world.setBlock(x, y - 2, z, Blocks.air);
            				 world.setBlock(x, y - 1, z, Blocks.air);
            				 world.setBlock(x - 1, y - 1, z, Blocks.air);
            				 world.setBlock(x + 1, y - 1, z, Blocks.air);
            				 
            				 AlienMob alien = new AlienMob(world);
            				 alien.setPosition(x, y - 2, z);
            				 world.spawnEntityInWorld(alien);
            			   }
            			}
         		  }
            }
		}
	
	 @Override
	    public void registerBlockIcons(IIconRegister reg){
	    
	        for (int i = 0; i < 6; i++) {
	        
	            icons[i] = reg.registerIcon(RubyCraft.modid + ":" + name + "_" + (i + 1));
	         
	        }
	    }
	 
	    @Override
	    public IIcon getIcon(int side, int meta)
	    {
	        return icons[side];
	    }
	
	}
