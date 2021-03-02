package RubyCraft.Bloques;

import java.util.Random;

import RubyCraft.Control_de_Version;
import RubyCraft.RubyCraft;
import RubyCraft.Actualizaciones.Buscar_Actualizaciones;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.event.ClickEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class Bloque_de_Actualizaciones extends Block{

	/**Addons Can Modify
	   Addons puede modificar **/
	public static String UltimaVersion = "";
	public static boolean Mensaje2a = true;
	public static boolean Mensaje3a = true;
	public static String Mensaje1 = "";
	public static String Mensaje2 = "";
	public static String Mensaje3 = "";
	public static String changeLog = "";
	/**Addons can not Modify
	   Addons no pueden Modificar
	 **/
	public static int actualizacion = 0;
	
	public Bloque_de_Actualizaciones(Material material) {
		super(material);
		
		setTickRandomly(true);
		
	}
	
	
	
	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int q, float a, float b, float c){
		if (world.isRemote && !player.isSneaking()){
			
			if(!RubyCraft.version.equals(UltimaVersion) && !Control_de_Version.Version_de_desarrolador){
				try {
				Buscar_Actualizaciones.MirarActualizaciones(false);
				}catch (Exception e) {
					// TODO: handle exception
				}
				actualizacion = 15;
				Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Minecraft.getMinecraft().thePlayer.getDisplayName() + " Hay Una Nueva Version Disponible: " + EnumChatFormatting.RED + UltimaVersion));
				Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Mensaje1));
				if(Mensaje2a == true){
				Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Mensaje2));
				}if(Mensaje3a == true){
				Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Mensaje3));
				
				}
				IChatComponent url = new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + "Click para ver el ChangeLog");
				url.getChatStyle().setChatClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, changeLog));
				Minecraft.getMinecraft().thePlayer.addChatMessage(url);
			}else if(Control_de_Version.Version_de_desarrolador) {
				
				Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Minecraft.getMinecraft().thePlayer.getDisplayName() + " Cuidado esta es la DeveloperBuild " + EnumChatFormatting.GOLD + "puede ocurrir muchos bugs Version: " + EnumChatFormatting.RED + RubyCraft.version + EnumChatFormatting.RED + " INDEV"));
			
			  }else if(RubyCraft.version.equals(UltimaVersion) && !Control_de_Version.Version_de_desarrolador){
				
				Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Minecraft.getMinecraft().thePlayer.getDisplayName() + " Estas en la Version:" + EnumChatFormatting.GREEN + RubyCraft.version + EnumChatFormatting.GOLD + " La Ultima " + EnumChatFormatting.GOLD + "Version es la:" + EnumChatFormatting.RED + UltimaVersion));
				try {
					Buscar_Actualizaciones.MirarActualizaciones(false);
					}catch (Exception e) {
						// TODO: handle exception
					}
			}
			
			
		}
		return true;
	
	}
	
	
	 /**
     * How many world ticks before ticking
     */
    public int tickRate(World p_149738_1_)
    {
        return 4;
    }

	
	  /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World world, int x, int y, int z, Random rand)
    {
        if (!world.isRemote)
        {
        hasComparatorInputOverride();
        }
    }
	
   
	  /**
     * If this returns true, then comparators facing away from this block will use the value from
     * getComparatorInputOverride instead of the actual redstone signal strength.
     */
    public boolean hasComparatorInputOverride()
    {
        return true;
    }

    /**
     * If hasComparatorInputOverride returns true, the return value from this is used instead of the redstone signal
     * strength when this block inputs to a comparator.
     */
    public int getComparatorInputOverride(World world, int x, int y, int z, int p_149736_5_)
    {
    	return actualizacion;
    }
	
}
