package RubyCraft.Gui;

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
		
		return null;
	}


	
	}