package RubyCraft.Gui;

import Eventos.Verano.Libros.ContainerLibro;
import Eventos.Verano.Libros.GuiDocumentoPerdido;
import Eventos.Verano.Libros.GuiLibro;
import Eventos.Verano.Principal.Clase_Principal_Evento_Verano;
import RubyCraft.Escaleras_Principal;
import RubyCraft.RubyCraft;
import RubyCraft.Gui.container.ContainerMesadeTrabajodeRuby;
import RubyCraft.Gui.container.ContainerMesadeTrabajodeZafiro;
import RubyCraft.Gui.container.ContainerTransformador_de_Losas_a_Bloques;
import RubyCraft.Gui.container.Container_Escalera_mesa_de_zafiro;
import RubyCraft.Gui.container.gui_Container_Mesa_de_trabajo_abedul;
import RubyCraft.Gui.container.gui_Container_Mesa_de_trabajo_abeto;
import RubyCraft.Gui.container.gui_Container_Mesa_de_trabajo_acacia;
import RubyCraft.Gui.container.gui_Container_Mesa_de_trabajo_jungla;
import RubyCraft.Gui.container.gui_Container_Mesa_de_trabajo_robleoscuro;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		if(ID == RubyCraft.guiIDMesadeTrabajodeRuby){
			return ID == RubyCraft.guiIDMesadeTrabajodeRuby && world.getBlock(x, y, z) == RubyCraft.MesadeTrabajodeRuby ? new ContainerMesadeTrabajodeRuby(player.inventory, world, x, y, z) : null;
		}
		if(ID == RubyCraft.guiIDMesadeTrabajodeZafiro){
			return ID == RubyCraft.guiIDMesadeTrabajodeZafiro && world.getBlock(x, y, z) == RubyCraft.MesadeTrabajodeZafiro ? new ContainerMesadeTrabajodeZafiro(player.inventory, world, x, y, z) : null;
			}
		if(ID == RubyCraft.guiIDTransformadorLosisl){
			return ID == RubyCraft.guiIDTransformadorLosisl && world.getBlock(x, y, z) == RubyCraft.Transformador_de_Losas_a_Bloques ? new ContainerTransformador_de_Losas_a_Bloques(player.inventory, world, x, y, z) : null;
		}
		if(ID == RubyCraft.guiIdMesaEscaleraZafiro){
			return ID == RubyCraft.guiIdMesaEscaleraZafiro && world.getBlock(x, y, z) == Escaleras_Principal.Escalera_de_Mesa_de_Trabajo_de_Zafiro ? new Container_Escalera_mesa_de_zafiro(player.inventory, world, x, y, z) : null;
			}
		if(ID == RubyCraft.guiIDMesadetrabajodeacacia){
				return ID == RubyCraft.guiIDMesadetrabajodeacacia && world.getBlock(x, y, z) == RubyCraft.Mesa_de_trabajo_de_acacia ? new gui_Container_Mesa_de_trabajo_acacia(player.inventory, world, x, y, z) : null;
				}
		if(ID == RubyCraft.guiIDMesadetrabajodeabedul){
			return ID == RubyCraft.guiIDMesadetrabajodeabedul && world.getBlock(x, y, z) == RubyCraft.Mesa_de_trabajo_de_abedul ? new gui_Container_Mesa_de_trabajo_abedul(player.inventory, world, x, y, z) : null;
			}
		if(ID == RubyCraft.guiIDMesadetrabajoderobleoscuro){
			return ID == RubyCraft.guiIDMesadetrabajoderobleoscuro && world.getBlock(x, y, z) == RubyCraft.Mesa_de_trabajo_de_roble_oscuro ? new gui_Container_Mesa_de_trabajo_robleoscuro(player.inventory, world, x, y, z) : null;
			}
		if(ID == RubyCraft.guiIDMesadetrabajodeabeto){
			return ID == RubyCraft.guiIDMesadetrabajodeabeto && world.getBlock(x, y, z) == RubyCraft.Mesa_de_trabajo_de_abeto ? new gui_Container_Mesa_de_trabajo_abeto(player.inventory, world, x, y, z) : null;
			}
		if(ID == RubyCraft.guiIDMesadetrabajodejungla){
			return ID == RubyCraft.guiIDMesadetrabajodejungla && world.getBlock(x, y, z) == RubyCraft.Mesa_de_trabajo_de_jungla ? new gui_Container_Mesa_de_trabajo_jungla(player.inventory, world, x, y, z) : null;
			}
		
	/**	
		if (ID == RubyCraft.guiId_Libro_de_recetas)
		{
			ItemStack stack = player.getHeldItem();
			if (stack != null)
			{
				if (stack.getItem() == RubyCraft.Libro_de_recetas)
				{
					
					return new ContainerLibro(player.inventory, world, z, z, z);		
				}
			}
			
		}**/
		
		//EVENTO VERANO
		
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
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		if(ID == RubyCraft.guiIDMesadeTrabajodeRuby) {
			return ID == RubyCraft.guiIDMesadeTrabajodeRuby && world.getBlock(x, y, z) == RubyCraft.MesadeTrabajodeRuby ? new GuiMesadeTrabajodeRuby(player.inventory, world, x, y, z) : null;
		}
		if(ID == RubyCraft.guiIDMesadeTrabajodeZafiro) {
			return ID == RubyCraft.guiIDMesadeTrabajodeZafiro && world.getBlock(x, y, z) == RubyCraft.MesadeTrabajodeZafiro ? new GuiMesadeTrabajodeZafiro(player.inventory, world, x, y, z) : null;
		}
		if(ID == RubyCraft.guiIDTransformadorLosisl){
			return ID == RubyCraft.guiIDTransformadorLosisl && world.getBlock(x, y, z) == RubyCraft.Transformador_de_Losas_a_Bloques ? new GuiTransformador_de_Losas_a_Bloques(player.inventory, world, x, y, z) : null;
		}
		if(ID == RubyCraft.guiIdMesaEscaleraZafiro) {
			return ID == RubyCraft.guiIdMesaEscaleraZafiro && world.getBlock(x, y, z) == Escaleras_Principal.Escalera_de_Mesa_de_Trabajo_de_Zafiro ? new gui_escalera_de_mesazafiro(player.inventory, world, x, y, z) : null;
		}
		if(ID == RubyCraft.guiIDMesadetrabajodeacacia) {
			return ID == RubyCraft.guiIDMesadetrabajodeacacia && world.getBlock(x, y, z) == RubyCraft.Mesa_de_trabajo_de_acacia ? new gui_mesadetrabajodeacacia(player.inventory, world, x, y, z) : null;
		}
		if(ID == RubyCraft.guiIDMesadetrabajodeabedul) {
			return ID == RubyCraft.guiIDMesadetrabajodeabedul && world.getBlock(x, y, z) == RubyCraft.Mesa_de_trabajo_de_abedul ? new gui_mesadetrabajodeabedul(player.inventory, world, x, y, z) : null;
		}
		if(ID == RubyCraft.guiIDMesadetrabajoderobleoscuro) {
			return ID == RubyCraft.guiIDMesadetrabajoderobleoscuro && world.getBlock(x, y, z) == RubyCraft.Mesa_de_trabajo_de_roble_oscuro ? new gui_mesadetrabajoderobleoscuro(player.inventory, world, x, y, z) : null;
		}
		if(ID == RubyCraft.guiIDMesadetrabajodeabeto) {
			return ID == RubyCraft.guiIDMesadetrabajodeabeto && world.getBlock(x, y, z) == RubyCraft.Mesa_de_trabajo_de_abeto ? new gui_mesadetrabajodeabeto(player.inventory, world, x, y, z) : null;
		}
		if(ID == RubyCraft.guiIDMesadetrabajodejungla) {
			return ID == RubyCraft.guiIDMesadetrabajodejungla && world.getBlock(x, y, z) == RubyCraft.Mesa_de_trabajo_de_jungla ? new gui_mesadetrabajodejungla(player.inventory, world, x, y, z) : null;
		}
		
		
		if (ID == RubyCraft.guiId_Libro_de_recetas)
		{
			ItemStack stack = player.getHeldItem();
			if (stack != null)
			{
				if (stack.getItem() == RubyCraft.Libro_de_recetas)
				{
					
					return new GuiLibro_recetas(player.inventory, world, z, z, z);		
				}
			}
		}
		
		//EVENTO VERANO
		
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