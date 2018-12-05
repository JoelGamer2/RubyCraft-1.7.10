package RubyCraft.xJuanathan.AltarNavidad;

import RubyCraft.RubyCraft;
import RubyCraft.xJuanathan.Principal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class altar_central extends Block{

	public altar_central(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,EntityPlayer player, int aa, float a, float b, float c) {
		
		if(!world.isRemote) {
			
			
			if(world.getBlock(x, y, z + 2) == Principal.altar) {				
                 if(world.getBlock(x, y, z -2) == Principal.altar) {
                	 if(world.getBlock(x - 2, y, z + 1) == Principal.altar) {
                       if(world.getBlock(x - 2, y, z - 1) == Principal.altar) {
                      	   if(world.getBlock(x + 2, y, z - 1) == Principal.altar) {
                      		   if(world.getBlock(x + 2, y, z + 1) == Principal.altar) {
                      			   Activar(world,player, x, y, z);
                      		   }else {
                      			 Estructura_erronea(world,player,x,y,z);
                      		   }
                      	   }else {
                      		 Estructura_erronea(world,player,x,y,z);
                      	   }
                       }else {
                    	   Estructura_erronea(world,player,x,y,z);
                       }
                	 }else {
                		 Estructura_erronea(world,player,x,y,z);
                	 }
				}else {
					Estructura_erronea(world,player,x,y,z);
				}
				
			}else {
				Estructura_erronea(world,player,x,y,z);
			}
			
		}
		
		return true;
	}
	
	private static void Activar(World world, EntityPlayer player, int x, int y, int z) {
		if(!world.isRemote) {
			world.setBlock(x, y, z, Blocks.air);
			world.setBlock(x, y, z + 2, Blocks.air);
			world.setBlock(x, y, z - 2, Blocks.air);
			world.setBlock(x - 2, y, z + 1, Blocks.air);
			world.setBlock(x - 2, y, z - 1, Blocks.air);
			world.setBlock(x + 2, y, z - 1, Blocks.air);
			world.setBlock(x + 2, y, z + 1, Blocks.air);
			Entity YetiLich = EntityList.createEntityByName("YetiLichR", world);
			YetiLich.setPosition(x, y, z);
			world.spawnEntityInWorld(YetiLich);
			player.playSound(RubyCraft.modid + ":Hechizo", Float.MAX_VALUE, 1.0F);
		}
		
	}
	
	private static void Estructura_erronea(World world, EntityPlayer player, int x, int y, int z) {
		
		player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.RED + "Estructura Erronea"));
		
	}
	
}
