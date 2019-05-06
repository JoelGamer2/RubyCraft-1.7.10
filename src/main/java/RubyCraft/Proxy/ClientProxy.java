package RubyCraft.Proxy;

import Eventos.Halloween.Entidades.BossParca;
import Eventos.Halloween.Entidades.Render.RenderBossparca;
import Eventos.Navidad.Entidades.Lich;
import Eventos.Navidad.Entidades.YetiLich;
import Eventos.Navidad.Entidades.YetiLichEstatua;
import Eventos.Navidad.Entidades.Render.RenderLich;
import Eventos.Navidad.Entidades.Render.RenderYetiLich;
import Eventos.Navidad.Entidades.Render.RenderYetiLichestatua;
import Eventos.Navidad.Entidades.Render.Modelo.RenderModelYetiLich;
import Eventos.Navidad.RenderModel.AltarCentral_Item;
import Eventos.Navidad.RenderModel.AltarCentral_Renderizado_Textura;
import Eventos.Navidad.RenderModel.Altar_Renderizado_Item;
import Eventos.Navidad.RenderModel.Altar_Renderizado_Textura;
import Eventos.Navidad.TileEntity.TileEntityAltar;
import Eventos.Navidad.TileEntity.TileEntityAltarCentral;
import Eventos.Verano.Entidades.Elemental_de_Agua_Guardian;
import Eventos.Verano.Entidades.Elemental_de_Agua_Soldado;
import Eventos.Verano.Entidades.Elemental_de_Tierra_Guardian;
import Eventos.Verano.Entidades.Elemental_de_Tierra_Soldado;
import Eventos.Verano.Entidades.Render.Render_Elemental_de_Tierra_guardian;
import Eventos.Verano.Entidades.Render.Render_Elemental_de_Tierra_soldado;
import Eventos.Verano.Entidades.Render.Render_Elemental_de_agua_guardian;
import Eventos.Verano.Entidades.Render.Render_Elemental_de_agua_soldado;
import Eventos.Verano.Entidades.Render.Modelo.Elemental_de_Tierra_guardian_Modelo;
import Eventos.Verano.Entidades.Render.Modelo.Elemental_de_agua_guardian_Modelo;
import Eventos.Verano.Entidades.Render.Modelo.Elemental_de_agua_soldado_Modelo;
import RubyCraft.RubyCraft;
import RubyCraft.Encantamientos.Encantamiento_MineCraft_Objetos;
import RubyCraft.Entidades.Granadas.EntidadGranada_de_Ruby;
import RubyCraft.Entidades.Granadas.EntidadGranada_de_Zafiro;
import RubyCraft.Entidades.Granadas.EntidadGranda_de_Uranio;
import RubyCraft.Entidades.Mobs.AlejandroMob;
import RubyCraft.Entidades.Mobs.AlienMob;
import RubyCraft.Entidades.Mobs.HombreCerdo;
import RubyCraft.Entidades.Mobs.HombreCerdorender;
import RubyCraft.Entidades.Mobs.Invocador;
import RubyCraft.Entidades.Mobs.Iratxe;
import RubyCraft.Entidades.Mobs.Jose;
import RubyCraft.Entidades.Mobs.Patxis;
import RubyCraft.Entidades.Mobs.RenderAlejandroMob;
import RubyCraft.Entidades.Mobs.RenderAlienMob;
import RubyCraft.Entidades.Mobs.RenderInvocadorMob;
import RubyCraft.Entidades.Mobs.RenderIratxeMob;
import RubyCraft.Entidades.Mobs.RenderJoseMob;
import RubyCraft.Entidades.Mobs.RenderPatxisMob;
import RubyCraft.Entidades.Mobs.RenderShulkerMob;
import RubyCraft.Entidades.Mobs.Shulker;
import RubyCraft.Entidades.Mobs.ModelRender.AlejandroRenderModel;
import RubyCraft.Entidades.Mobs.ModelRender.AlienRenderModel;
import RubyCraft.Entidades.Mobs.ModelRender.IratxeRenderModel;
import RubyCraft.Entidades.Mobs.ModelRender.JoseRenderModel;
import RubyCraft.Entidades.Mobs.ModelRender.PatxisRenderModel;
import RubyCraft.Entidades.Mobs.ModelRender.shulkerRenderModel;
import RubyCraft.Integracion.Mods_Encantamientos;
import RubyCraft.Maquinas.Renderizado.Render_Mesa_de_Ruby;
import RubyCraft.Maquinas.Renderizado.Render_Mesa_de_Zafiro;
import RubyCraft.TileEntity.TileEntityCofredeRuby;
import RubyCraft.TileEntity.TileEntityMesa_de_Ruby;
import RubyCraft.TileEntity.TileEntityMesa_de_Zafiro;
import RubyCraft.TileEntity.Render.CofredeRubyRender;
import RubyCraft.TileEntity.Render.ItemRenderCofredeRuby;
import RubyCraft.TileEntity.Render.Mesa_de_Ruby_Item_Renderer;
import RubyCraft.TileEntity.Render.Mesa_de_Zafiro_Item_Renderer;
import RubyCraft.xJuanathan.Principal;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelVillager;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends ServerProxy {
	
	public void registerRenderThings(){
		//Entidades que no se Mueven
		RenderingRegistry.registerEntityRenderingHandler(EntidadGranada_de_Ruby.class, new RenderSnowball(RubyCraft.Granada_de_Ruby));
		RenderingRegistry.registerEntityRenderingHandler(EntidadGranada_de_Zafiro.class, new RenderSnowball(RubyCraft.Granada_de_Zafiro));
		RenderingRegistry.registerEntityRenderingHandler(EntidadGranda_de_Uranio.class, new RenderSnowball(RubyCraft.Granada_de_Uranio));
		//Entidades Normales
		RenderingRegistry.registerEntityRenderingHandler(AlienMob.class, new RenderAlienMob(new AlienRenderModel(), 0));		
		RenderingRegistry.registerEntityRenderingHandler(AlejandroMob.class, new RenderAlejandroMob(new AlejandroRenderModel(), 0));
		RenderingRegistry.registerEntityRenderingHandler(Shulker.class, new RenderShulkerMob(new shulkerRenderModel(), 0));
		RenderingRegistry.registerEntityRenderingHandler(Iratxe.class, new RenderIratxeMob(new IratxeRenderModel(), 0));
		RenderingRegistry.registerEntityRenderingHandler(Invocador.class, new RenderInvocadorMob(new ModelVillager(0, 0, 0, 0), 0));
		RenderingRegistry.registerEntityRenderingHandler(HombreCerdo.class, new HombreCerdorender(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(Jose.class, new RenderJoseMob(new JoseRenderModel(), 0));
		RenderingRegistry.registerEntityRenderingHandler(Patxis.class, new RenderPatxisMob(new PatxisRenderModel(), 0));
	    RenderingRegistry.registerEntityRenderingHandler(BossParca.class, new RenderBossparca(new ModelBiped(), 0));
	    RenderingRegistry.registerEntityRenderingHandler(YetiLich.class, new RenderYetiLich(new RenderModelYetiLich(), 0));
	    RenderingRegistry.registerEntityRenderingHandler(YetiLichEstatua.class, new RenderYetiLichestatua(new RenderModelYetiLich(), 0));
	    RenderingRegistry.registerEntityRenderingHandler(Lich.class, new RenderLich(new ModelBiped(), 0));
        RenderingRegistry.registerEntityRenderingHandler(Elemental_de_Agua_Guardian.class, new Render_Elemental_de_agua_guardian(new Elemental_de_agua_guardian_Modelo(), 0));
        RenderingRegistry.registerEntityRenderingHandler(Elemental_de_Agua_Soldado.class, new Render_Elemental_de_agua_soldado(new Elemental_de_agua_soldado_Modelo(), 0));
        RenderingRegistry.registerEntityRenderingHandler(Elemental_de_Tierra_Guardian.class, new Render_Elemental_de_Tierra_guardian(new Elemental_de_Tierra_guardian_Modelo(), 0));
        RenderingRegistry.registerEntityRenderingHandler(Elemental_de_Tierra_Soldado.class, new Render_Elemental_de_Tierra_soldado(new Elemental_de_Tierra_guardian_Modelo(), 0));
        //TileEntity Render
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCofredeRuby.class, new CofredeRubyRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RubyCraft.Cofre_de_Ruby), new ItemRenderCofredeRuby());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMesa_de_Ruby.class, new Render_Mesa_de_Ruby());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RubyCraft.MesadeTrabajodeRuby), new Mesa_de_Ruby_Item_Renderer(new TileEntityMesa_de_Ruby(), new Render_Mesa_de_Ruby()));
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMesa_de_Zafiro.class, new Render_Mesa_de_Zafiro());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RubyCraft.MesadeTrabajodeZafiro), new Mesa_de_Zafiro_Item_Renderer(new TileEntityMesa_de_Zafiro(), new Render_Mesa_de_Zafiro()));
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltar.class, new Altar_Renderizado_Textura());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Principal.altar), new Altar_Renderizado_Item(new TileEntityAltar(), new Altar_Renderizado_Textura()));
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltarCentral.class, new AltarCentral_Renderizado_Textura());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Principal.altar_central), new AltarCentral_Item(new TileEntityAltarCentral(), new AltarCentral_Renderizado_Textura()));
		
        //Variado
		FMLCommonHandler.instance().bus().register(new Encantamiento_MineCraft_Objetos(Minecraft.getMinecraft()));
		FMLCommonHandler.instance().bus().register(new Mods_Encantamientos(Minecraft.getMinecraft()));
			
		
		
		
	}

}
