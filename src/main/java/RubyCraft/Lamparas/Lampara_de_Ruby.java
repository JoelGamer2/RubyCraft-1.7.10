package RubyCraft.Lamparas;

import java.util.Random;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Lampara_de_Ruby extends Block {
	
private final boolean isOn;
	public Lampara_de_Ruby(boolean isOn) {
		super(Material.redstoneLight);
		
		this.setStepSound(this.soundTypeGlass);
		this.setHardness(0.3F);
		
      this.isOn = isOn;
		
      if(isOn){
    	  this.setLightLevel(1.0F);
      }
	}

	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(RubyCraft.modid + ":" + (this.isOn ? "Lampara_de_Ruby_Encendida" : "Lampara_de_Ruby_Apagada"));
	}
	
	public void onBlockAdded(World world, int x,int y, int z){
		if(!world.isRemote){
			if(this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)){
				world.scheduleBlockUpdate(x, y, z, this, 4);
				
				}
    		else if (!this.isOn && world .isBlockIndirectlyGettingPowered(x, y, z)){
    			world.setBlock(x, y, z, RubyCraft.Lampara_de_Ruby_Encendida, 0, 2);
    			
    		}
    			
		}
	}
	public void onNeighborBlockChange(World world, int x ,int y, int z,Block block){
		if(!world.isRemote){
			if(this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)){
				world.scheduleBlockUpdate(x, y, z, this, 4);
				}
    		else if (!this.isOn && world .isBlockIndirectlyGettingPowered(x, y, z)){
    			world.setBlock(x, y, z, RubyCraft.Lampara_de_Ruby_Encendida, 0, 2);
    		}
    			
		}
	}
	public void updateTick(World world,int x, int y, int z,Random random){
		if(!world.isRemote && this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)){
			world.setBlock(x, y, z, RubyCraft.Lampara_de_Ruby_Apagada, 0 ,2);
		}
	}
	
	public Item getItemDropped(int i, Random random, int j){
		return Item.getItemFromBlock(RubyCraft.Lampara_de_Ruby_Apagada);
	}
	protected ItemStack createStackedBlock(int i){
		return new ItemStack(RubyCraft.Lampara_de_Ruby_Apagada);
	}
	 
}