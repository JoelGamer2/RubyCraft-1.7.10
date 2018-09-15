package RubyCraft.Proxy;

import HerraCraft.Entidades.Render.HerobrineRenderModel;
import HerraCraft.Entidades.Render.JoelGamer2Render;
import HerraCraft.Entidades.Render.MiguelperezRender;
import HerraCraft.Entidades.Render.RenderDoctorNokTexture;
import HerraCraft.Entidades.Render.RenderHerobrineTexture;
import HerraCraft.Entidades.Render.RenderInvisiteibolTexture;
import HerraCraft.Entidades.Render.RenderJoelGamer2Texture;
import HerraCraft.Entidades.Render.RenderMiguelperezTexture;
import HerraCraft.Entidades.Render.RenderSlendermanTexture;
import HerraCraft.Entidades.Render.RenderTankTexture;
import HerraCraft.Entidades.Render.RenderWither_StormTexture;
import HerraCraft.Entidades.Render.TankRender;
import HerraCraft.Entidades.Render.Wither_StormRender;
import HerraCraft.Entidades_Principal.DoctorNok;
import HerraCraft.Entidades_Principal.Herobrine;
import HerraCraft.Entidades_Principal.Invisiteibol;
import HerraCraft.Entidades_Principal.JoelGamer2;
import HerraCraft.Entidades_Principal.Miguelperez;
import HerraCraft.Entidades_Principal.Slenderman;
import HerraCraft.Entidades_Principal.Tank;
import HerraCraft.Entidades_Principal.Wither_Storm;
import RubyCraft.RubyCraft;
import RubyCraft.Encantamientos.Encantamiento_MineCraft_Objetos;
import RubyCraft.Entidades.Granadas.EntidadGranada_de_Ruby;
import RubyCraft.Entidades.Granadas.EntidadGranada_de_Zafiro;
import RubyCraft.Entidades.Granadas.EntidadGranda_de_Uranio;
import RubyCraft.Entidades.Mobs.AlejandroMob;
import RubyCraft.Entidades.Mobs.AlienMob;
import RubyCraft.Entidades.Mobs.BossParca;
import RubyCraft.Entidades.Mobs.HombreCerdo;
import RubyCraft.Entidades.Mobs.HombreCerdorender;
import RubyCraft.Entidades.Mobs.Invocador;
import RubyCraft.Entidades.Mobs.Iratxe;
import RubyCraft.Entidades.Mobs.Jose;
import RubyCraft.Entidades.Mobs.Patxis;
import RubyCraft.Entidades.Mobs.RenderAlejandroMob;
import RubyCraft.Entidades.Mobs.RenderAlienMob;
import RubyCraft.Entidades.Mobs.RenderBossparca;
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
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelEnderman;
import net.minecraft.client.model.ModelVillager;
import net.minecraft.client.renderer.entity.Render;
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
		//TileEntity Render
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCofredeRuby.class, new CofredeRubyRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RubyCraft.Cofre_de_Ruby), new ItemRenderCofredeRuby());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMesa_de_Ruby.class, new Render_Mesa_de_Ruby());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RubyCraft.MesadeTrabajodeRuby), new Mesa_de_Ruby_Item_Renderer(new TileEntityMesa_de_Ruby(), new Render_Mesa_de_Ruby()));
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMesa_de_Zafiro.class, new Render_Mesa_de_Zafiro());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RubyCraft.MesadeTrabajodeZafiro), new Mesa_de_Zafiro_Item_Renderer(new TileEntityMesa_de_Zafiro(), new Render_Mesa_de_Zafiro()));
        //Variado
		FMLCommonHandler.instance().bus().register(new Encantamiento_MineCraft_Objetos(Minecraft.getMinecraft()));
		FMLCommonHandler.instance().bus().register(new Mods_Encantamientos(Minecraft.getMinecraft()));
		
		
		
		
		//HerraCraft
		RenderingRegistry.registerEntityRenderingHandler(Tank.class, new RenderTankTexture(new TankRender(), 0));
		RenderingRegistry.registerEntityRenderingHandler(JoelGamer2.class, new RenderJoelGamer2Texture(new JoelGamer2Render(), 0));
		RenderingRegistry.registerEntityRenderingHandler(Invisiteibol.class, new RenderInvisiteibolTexture(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(Miguelperez.class, new RenderMiguelperezTexture(new MiguelperezRender(), 0));
		RenderingRegistry.registerEntityRenderingHandler(Wither_Storm.class, new RenderWither_StormTexture(new Wither_StormRender(), 0));
		RenderingRegistry.registerEntityRenderingHandler(DoctorNok.class, new RenderDoctorNokTexture(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(Herobrine.class, new RenderHerobrineTexture(new HerobrineRenderModel(), 0));
		RenderingRegistry.registerEntityRenderingHandler(Slenderman.class, new RenderSlendermanTexture(new ModelEnderman(), 0));
		
		
	}

}
