package HerraCraft;

import RubyCraft.RubyCraft;
import RubyCraft.Entidades.Mobs.BossParca;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class Generator_Boss extends Block {
	
	
	public static String NombreJugador = "";
	public static long TiempodelMundo = 0;

	protected Generator_Boss(Material material) {
		super(material);
		
	}

	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		
		if((player.getCurrentEquippedItem() != null &&  player.getCurrentEquippedItem().getItem() == herracraft.Invocador_Celestial)) {
			
  if(RubyCraft.HalloWen) {
		if(!BossParca.Activo) {
			NombreJugador = player.getDisplayName();
			player.playSound(RubyCraft.modid+ ":records.bossparca", Float.MAX_VALUE, 1.0F);
			TiempodelMundo = world.getWorldTime();
			world.setWorldTime(15000);
			eliminarinvocador(player);
		  if(!world.isRemote) {	

		       Entity mob = EntityList.createEntityByName("Parca", world);
               mob.setPosition(x, y + 1, z); 
		       world.spawnEntityInWorld(mob);
		  }
		}else if(!world.isRemote && BossParca.Activo){
			
			
			player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft Eventos" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + "Ya hay un boss activo y esta en la fase:" + BossParca.Fase));
			
		    }
     }else if(RubyCraft.Navidad && !world.isRemote) {
    	 
			player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft Eventos" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + "El Boss se invoca con una estructura con altares"));
			

			
     }else if(!world.isRemote){
    	 
			player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft Eventos" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.RED + "Ningun evento activo"));
     }
}else if(!world.isRemote){
	player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft Eventos" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.RED + "Necesitas un invocador celestial en la " + EnumChatFormatting.RED + "mano"));
	
}
		return true;		
        }
	
	
	public static void eliminarinvocador(EntityPlayer player) {
		
		player.inventory.consumeInventoryItem(herracraft.Invocador_Celestial);
		
	}
	
	
}
