package HerraCraft;

import RubyCraft.RubyCraft;
import RubyCraft.Eventos.Eventos_especiales;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class Generator_Boss extends Block {
	
	
	public static String NombreJugador = "";
	public static long TiempodelMundo = 0;
	public static double xg = 0;
	public static double yg = 0;
	public static double zg = 0;

	protected Generator_Boss(Material material) {
		super(material);
		
	}

	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		
		NombreJugador = player.getDisplayName();
		xg = x;
		yg = y;
		zg = z;
		
		
		
			
			player.playSound(RubyCraft.modid+ ":records.bossparca", Float.MAX_VALUE, 1.0F);
			TiempodelMundo = world.getWorldTime();
			world.setWorldTime(15000);
		  if(!world.isRemote) {	
		       Entity mob = EntityList.createEntityByName("Parca", world);
               mob.setPosition(x, y + 1, z); 
		       world.spawnEntityInWorld(mob);
		  }
		return true;
			
		
}
	
}
