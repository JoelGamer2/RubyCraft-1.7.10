package Eventos.A.Libros;

import Eventos.Verano.Principal.Clase_Principal_Evento_Verano;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class IniciarGui implements IGuiHandler{
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) 
	{
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if (ID == Clase_Principal_Evento_Verano.guiIdLibro)
		{
			ItemStack stack = player.getHeldItem();
			if (stack != null)
			{
				if (stack.getItem() == Clase_Principal_Evento_Verano.Libro_Evento_Verano)
				{
					
					return new ContainerLibro(player.inventory, world, z, z, z);		
				}
			}
			
		}
		
		if (ID == Clase_Principal_Evento_Verano.guiIdDocumento)
		{
			ItemStack stack = player.getHeldItem();
			if (stack != null)
			{
				if (stack.getItem() == Clase_Principal_Evento_Verano.Documento_Perdido)
				{
					
					return new ContainerLibro(player.inventory, world, z, z, z);		
				}
			}
			
		}
		
		return null;
	}
 

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) 
	{
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if (ID == Clase_Principal_Evento_Verano.guiIdLibro)
		{
			ItemStack stack = player.getHeldItem();
			if (stack != null)
			{
				if (stack.getItem() == Clase_Principal_Evento_Verano.Libro_Evento_Verano)
				{
					
					return new GuiLibro(player.inventory, world, z, z, z);		
				}
			}
		}
		
		if (ID == Clase_Principal_Evento_Verano.guiIdDocumento)
		{
			ItemStack stack = player.getHeldItem();
			if (stack != null)
			{
				if (stack.getItem() == Clase_Principal_Evento_Verano.Documento_Perdido)
				{
					
					return new GuiDocumentoPerdido(player.inventory, world, z, z, z);		
				}
			}
			
		}
		
		return null;
		}

}
