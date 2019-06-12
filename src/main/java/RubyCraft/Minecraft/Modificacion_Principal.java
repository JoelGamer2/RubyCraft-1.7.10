package RubyCraft.Minecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class Modificacion_Principal {

	public static void Preinit(){
		
	}
	
	public static void Init(){
	}
	
	public static void PostInit(){
		Blocks.trapped_chest.setCreativeTab(CreativeTabs.tabRedstone);
		
	}
	
}
