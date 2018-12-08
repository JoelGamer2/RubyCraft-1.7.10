package RubyCraft.TileEntity;

import RubyCraft.RubyCraft;
import RubyCraft.xJuanathan.TileEntity.TileEntityAltar;
import RubyCraft.xJuanathan.TileEntity.TileEntityAltarCentral;
import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntitys_Principal {

	public static void Registrar(){
		registerTileEntity();
	}

	private static void registerTileEntity() {
		GameRegistry.registerTileEntity(TileEntityCofredeRuby.class, RubyCraft.modid + "CofredeRubyTileEntity");
		GameRegistry.registerTileEntity(TileEntityMesa_de_Ruby.class, RubyCraft.modid + "Mesa de Ruby");
		GameRegistry.registerTileEntity(TileEntityMesa_de_Zafiro.class, RubyCraft.modid + "Mesa de Zafiro");
		GameRegistry.registerTileEntity(TileEntityAltar.class, RubyCraft.modid + "Altar");
		GameRegistry.registerTileEntity(TileEntityAltarCentral.class, RubyCraft.modid + "AltarCentral");
	}
	
}
