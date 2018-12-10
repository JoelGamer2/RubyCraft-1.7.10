package RubyCraft.xJuanathan.AltarNavidad;

import RubyCraft.RubyCraft;
import RubyCraft.xJuanathan.Principal;
import RubyCraft.xJuanathan.TileEntity.TileEntityAltarCentral;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class altar_central extends BlockContainer{

	public static Block blockID;
	@SideOnly(Side.CLIENT)
	private IIcon Particulasaltar;
	
	public altar_central(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon (int side, int metadata){
		 return side == 1 ? this.Particulasaltar : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister){
		this.Particulasaltar = iconRegister.registerIcon(RubyCraft.modid + ":" + "TileEntitys/Altares/Particulasaltar");
		this.blockIcon = iconRegister.registerIcon(RubyCraft.modid + ":" + "TileEntitys/Altares/Particulasaltar");
		
	}
	
	@Override
	public int getRenderType() {	
		return -1;
	}
	
	public boolean isOpaqueCube() {
		return false;
	}
	public boolean isNormalCube() {
		return false;
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int id) {
		return new TileEntityAltarCentral();
	}
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,EntityPlayer player, int aa, float a, float b, float c) {	
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
		
		return true;
	}
	
	private static void Activar(World world, EntityPlayer player, int x, int y, int z) {
		if(RubyCraft.Navidad) {
			player.playSound(RubyCraft.modid + ":Hechizo", 5.0F, 1.0F);
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
		}
	  }else if(!world.isRemote) {
			player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft Eventos" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.RED + "Ningun evento activo"));
	  }
	}
	
	private static void Estructura_erronea(World world, EntityPlayer player, int x, int y, int z) {
		if(!world.isRemote) {
		player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.RED + "Estructura Erronea"));
		}
		
	}
}
