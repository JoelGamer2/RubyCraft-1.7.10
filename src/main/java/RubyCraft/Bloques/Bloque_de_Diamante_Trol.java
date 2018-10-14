package RubyCraft.Bloques;

import java.util.Random;

import RubyCraft.RubyCraft;
import RubyCraft.Registrar.Logros;
import net.minecraft.block.BlockCompressedPowered;
import net.minecraft.block.material.MapColor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Bloque_de_Diamante_Trol extends BlockCompressedPowered {

	/**Cosas Modificables por Addons
	   Addons Can Modify**/
	public static int Coordenaday = 256;
	public static int Coordenadax = 0;
	public static int Coordenadaz = 0;
	public static DamageSource MensajedeMuerte = RubyCraft.Troleo;
	public static int Experiencia = 10;
	public static float Dano = 20.0F;
	public static float Dano_Inocentes = 40.0F;
	
	/**Cosas no modificables por Addons
	   Addons can not Modify**/
	private final float  DanoTrol = 40.0F;
	private final float DanoNavidad = 0.5F;
	
	public Bloque_de_Diamante_Trol(MapColor material) {
		super(material);
		
		this.setStepSound(this.soundTypeMetal);
		
	}
	public boolean onBlockActivated (World world, int x ,int y , int z, EntityPlayer player, int q, float a, float b ,float c){
		
		if(!player.isSneaking()){
				if(RubyCraft.Navidad == false){
					
				player.setPosition(x + Coordenadax, y + Coordenaday , z + Coordenadaz);
				player.addExperienceLevel(Experiencia);	
				if(world.isRemote) {
				player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + player.getDisplayName() + EnumChatFormatting.RED + " Vas" + EnumChatFormatting.BLUE + " a Morir " +  EnumChatFormatting.GREEN + " xD "));
				}
				player.addStat(Logros.Siendo_Troleado, 1);
				
				}
				
				if(RubyCraft.VersionTrol == false && RubyCraft.Navidad == false && RubyCraft.Dia_de_Los_Inocentes == false){
					world.setBlock(x, y, z, Blocks.flowing_lava);
				}else if(RubyCraft.Navidad == false && RubyCraft.VersionTrol == true && RubyCraft.Dia_de_Los_Inocentes == true ){
					
					world.setBlock(x, y, z, RubyCraft.Bloque_de_Diamante_Trol);
					world.setBlock(x, y + 1, z, RubyCraft.Bloque_de_Diamante_Trol);
					world.setBlock(x, y + 2, z, RubyCraft.Bloque_de_Diamante_Trol);	
					world.setBlock(x, y + 3, z, RubyCraft.Bloque_de_Diamante_Trol);
					world.setBlock(x, y + 4, z, RubyCraft.Bloque_de_Diamante_Trol);
					world.setBlock(x, y + 5, z, RubyCraft.Bloque_de_Diamante_Trol);	
					world.setBlock(x, y + 6, z, RubyCraft.Bloque_de_Diamante_Trol);
					world.setBlock(x, y + 7, z, RubyCraft.Bloque_de_Diamante_Trol);
					world.setBlock(x, y + 8, z, RubyCraft.Bloque_de_Diamante_Trol);	
					world.setBlock(x, y + 9, z, RubyCraft.Bloque_de_Diamante_Trol);
					world.setBlock(x, y + 10, z, RubyCraft.Bloque_de_Diamante_Trol);
					world.setBlock(x, y + 11, z, RubyCraft.Bloque_de_Diamante_Trol);	
					world.setBlock(x, y + 12, z, RubyCraft.Bloque_de_Diamante_Trol);
					world.setBlock(x, y + 13, z, RubyCraft.Bloque_de_Diamante_Trol);
					world.setBlock(x, y + 14, z, RubyCraft.Bloque_de_Diamante_Trol);	
					world.setBlock(x, y + 15, z, RubyCraft.Bloque_de_Diamante_Trol);
					world.setBlock(x, y + 16, z, RubyCraft.Bloque_de_Diamante_Trol);
					world.setBlock(x, y + 17, z, RubyCraft.Bloque_de_Diamante_Trol);	
					world.setBlock(x, y + 18, z, RubyCraft.Bloque_de_Diamante_Trol);
					world.setBlock(x, y + 19, z, RubyCraft.Bloque_de_Diamante_Trol);
					world.setBlock(x, y + 20, z, RubyCraft.Bloque_de_Diamante_Trol);	
					world.setBlock(x, y + 21, z, RubyCraft.Bloque_de_Diamante_Trol);
					world.setBlock(x, y + 22, z, RubyCraft.Bloque_de_Diamante_Trol);
					world.setBlock(x, y + 23, z, RubyCraft.Bloque_de_Diamante_Trol);	
					world.setBlock(x, y + 24, z, Blocks.flowing_water);
					
				}else if(RubyCraft.VersionTrol && !RubyCraft.Navidad && !RubyCraft.Dia_de_Los_Inocentes) {
					
					world.setBlock(x, y + 1, z, RubyCraft.Bloque_de_Diamante_Trol);
					world.setBlock(x + 1, y, z, Blocks.flowing_lava);
					world.setBlock(x - 1, y, z, Blocks.flowing_lava);
					world.setBlock(x, y, z + 1, Blocks.flowing_lava);
					world.setBlock(x, y, z - 1, Blocks.flowing_lava);
					if(world.isRemote) {
					player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + player.getDisplayName() + EnumChatFormatting.RED + " Version Trol activa lo siento"));				
					}
				   }else if(RubyCraft.Navidad == true && world.isRemote){
					RubyCraft.Bloque_de_Diamante_Trol.setHarvestLevel("pickaxe", 5);
					RubyCraft.Bloque_de_Diamante_Trol.setHardness(100.0F);
				    player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GREEN + player.getDisplayName() + EnumChatFormatting.BLUE + " Feliz Navidad" + EnumChatFormatting.GOLD + " : - )" + EnumChatFormatting.RED + " En Navidad no se Trolea"));	
				}	
		}else{
			//Desbugueo			
			world.setBlock(x, y, z, Blocks.air);
			world.setBlock(x, y, z, RubyCraft.Bloque_de_Diamante_Trol);		
		}
		return true;
     }
	  
	    public void updateTick(World world, int x, int y, int z, Random rand){
	    
	        
	    }
	    

	    /**
	     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
	     * cleared to be reused)
	     */
	    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
	    {
	        float f = 0.0625F;
	        return AxisAlignedBB.getBoundingBox((double)((float)x + f), (double)y, (double)((float)z + f), (double)((float)(x + 1) - f), (double)((float)(y + 1) - f), (double)((float)(z + 1) - f));
	    }
	    /**
	     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
	     */
	    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
	
	    	if(RubyCraft.VersionTrol == true && RubyCraft.Navidad == false && RubyCraft.Dia_de_Los_Inocentes == false){
	    	
	    		entity.attackEntityFrom(MensajedeMuerte, DanoTrol);
	    		
	    	}else if(RubyCraft.VersionTrol == false && RubyCraft.Navidad == false && RubyCraft.Dia_de_Los_Inocentes == false){
	    		
	    		entity.attackEntityFrom(MensajedeMuerte, Dano); //Dano = Daño no puedo escribir la ñ
	    
	    	}else if(RubyCraft.Dia_de_Los_Inocentes == true && RubyCraft.Navidad == false){
	    		
	    		entity.attackEntityFrom(MensajedeMuerte, Dano_Inocentes);
	    		
	    	}else if(RubyCraft.Navidad == true){
	    		
	    		entity.attackEntityFrom(MensajedeMuerte, DanoNavidad);
	    		
	    	}
	    }    
	    public boolean canProvidePower()
	    {
	        return true;
	    }

	    public int isProvidingWeakPower(IBlockAccess acess, int x, int y, int z, int a)
	    {
	        return 15;
	    }
	    
	    @Override
		public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
		    return true;
		}
	   
}