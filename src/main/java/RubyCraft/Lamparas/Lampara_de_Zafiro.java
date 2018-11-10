package RubyCraft.Lamparas;

import java.util.Random;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class Lampara_de_Zafiro extends Block {
	
private final boolean isOn;
	public Lampara_de_Zafiro(boolean isOn) {
		super(Material.redstoneLight);
		
		this.setStepSound(this.soundTypeGlass);
		this.setHardness(0.3F);
		
      this.isOn = isOn;
		
      if(isOn){
    	  this.setLightLevel(1.0F);
      }
	}

	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(RubyCraft.modid + ":" + (this.isOn ? "Lampara_de_Zafiro_Encendida" : "Lampara_de_Zafiro_Apagada"));
	}
	
	public void onBlockAdded(World world, int x,int y, int z){
		if(!world.isRemote){
			if(this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)){
				world.scheduleBlockUpdate(x, y, z, this, 4);
				}
    		else if (!this.isOn && world .isBlockIndirectlyGettingPowered(x, y, z)){
    			world.setBlock(x, y, z, RubyCraft.Lampara_de_Zafiro_Encendida, 0, 2);
    		}
    			
		}
	}
	public void onNeighborBlockChange(World world, int x ,int y, int z,Block block){
		if(!world.isRemote){
			if(this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)){
				world.scheduleBlockUpdate(x, y, z, this, 4);
				}
    		else if (!this.isOn && world .isBlockIndirectlyGettingPowered(x, y, z)){
    			world.setBlock(x, y, z, RubyCraft.Lampara_de_Zafiro_Encendida, 0, 2);
    		}
    			
		}
	}
	public void updateTick(World world,int x, int y, int z,Random random){
		if(!world.isRemote && this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)){
			world.setBlock(x, y, z, RubyCraft.Lampara_de_Zafiro_Apagada, 0 ,2);
		}
	}
	
	public Item getItemDropped(int i, Random random, int j){
		return Item.getItemFromBlock(RubyCraft.Lampara_de_Zafiro_Apagada);
	}
	protected ItemStack createStackedBlock(int i){
		return new ItemStack(RubyCraft.Lampara_de_Zafiro_Apagada);
	}
	
	 public int isProvidingWeakPower(IBlockAccess p_149709_1_, int p_149709_2_, int p_149709_3_, int p_149709_4_, int p_149709_5_)
	    {
	        return (p_149709_1_.getBlockMetadata(p_149709_2_, p_149709_3_, p_149709_4_) & 8) > 0 ? 15 : 0;
	    }
	 
}