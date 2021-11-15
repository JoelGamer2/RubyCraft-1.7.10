package Eventos;

import java.math.BigDecimal;

import Eventos.Halloween.Entidades.BossParca;
import Eventos.Navidad.Entidades.Lich;
import Eventos.Navidad.Entidades.YetiLich;
import RubyCraft.RubyCraft;
import RubyCraft.Bloques.Bloque_de_Diamante_Trol;
import RubyCraft.Registrar.Logros;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.WorldTickEvent;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.EnumDifficulty;

public class Eventos_especiales {
	
	private boolean Iniciadosesion = false;
	public static boolean musica = false;
	public static String Parcanombre = EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft-Bosses" + EnumChatFormatting.GRAY + "]" + EnumChatFormatting.RED + " ";
	public static String ParcaFase1 = Parcanombre + "La parca llama a su ejercito";
	public static String ParcaFase2 = Parcanombre + "La parca huye de los humanos";
	public static String ParcaFase3 = Parcanombre + "La parca Chupa las almas";
	public static DamageSource Laparcasellevotualma = new DamageSource("Laparcasellevotualma").setMagicDamage().setDamageBypassesArmor();
	public static boolean chupa_almas;
	public static BigDecimal Redondeo_por_troncamiento(double x,int numberofDecimals)
	{
	       if ( x > 0) {
	           return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_FLOOR);
	       } else {
	           return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_CEILING);
	       }
	}
	
	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		//Detecta cuando el jugador muere y pone el mensaje en el chat diciendole las coordenadas
		if(event.player.isDead && event.player.worldObj.isRemote) {
			
			String dimensionid = "";
			
			switch (event.player.dimension) {
            case -1:
            	dimensionid = " Nether";
				break;
			case 0:
				dimensionid = " Overworld";
				break;
			case 1:
				dimensionid = " The End";
				break;
			default:
				dimensionid = Integer.toString(event.player.dimension);
				break;
			}
			
		event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.BLUE + event.player.getDisplayName() + EnumChatFormatting.GOLD + " Has Muerto en:" + EnumChatFormatting.GREEN + " X:" + EnumChatFormatting.RED + Redondeo_por_troncamiento(event.player.posX, 2) + EnumChatFormatting.GREEN + " ,Y:" + EnumChatFormatting.RED + Redondeo_por_troncamiento(event.player.posY-1, 0) + " " + EnumChatFormatting.GREEN + ",Z:" + EnumChatFormatting.RED + Redondeo_por_troncamiento(event.player.posZ, 2)  + " "+EnumChatFormatting.GOLD +"Dimension:" + EnumChatFormatting.BLUE + dimensionid));

			
		}
		if(RubyCraft.cliente) {
			if(event.player instanceof EntityPlayerMP){
				
				EntityPlayerMP player = (EntityPlayerMP) event.player;
				
				if(player.func_147099_x().hasAchievementUnlocked(Logros.Es_Navidad) && player.func_147099_x().hasAchievementUnlocked(Logros.Es_verano) && player.func_147099_x().hasAchievementUnlocked(Logros.Es_Hallowen) && !player.func_147099_x().hasAchievementUnlocked(Logros.Juega_todos_los_eventos)) {
					
					event.player.addStat(Logros.Juega_todos_los_eventos, 1);
					event.player.inventory.addItemStackToInventory(new ItemStack(RubyCraft.Platino, 10));
					event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GREEN + "Por jugar a todos los eventos del juego se te a " + EnumChatFormatting.GREEN + "dado 10 de platino"));
					
				}
				
			}
			}
	//event.player.addChatComponentMessage(new ChatComponentText(YetiLich.Fase + ""));
		
		/**if(Control_de_Version.Version_de_desarrolador && event.player.inventory.hasItemStack(new ItemStack(RubyCraft.bloque_del_crea_caminos, 1))) {
			
			event.player.addChatComponentMessage(new ChatComponentText("" + BossParca.tick + " Fase:" + BossParca.Fase + " Tepes hechos:" + BossParca.Tp_hechos));
			 
		}**/
		
		
		if(event.player.inventory.hasItem(RubyCraft.CreaCaminos)) {
		
		if(!event.player.isSneaking() && event.player.worldObj.isRemote) {
		event.player.worldObj.setBlock((int)event.player.posX, (int)event.player.posY -2, (int)event.player.posZ-1, RubyCraft.bloque_del_crea_caminos);
		event.player.worldObj.setBlock((int)event.player.posX, (int)event.player.posY -2, (int)event.player.posZ+1, RubyCraft.bloque_del_crea_caminos);
		event.player.worldObj.setBlock((int)event.player.posX+1, (int)event.player.posY -2, (int)event.player.posZ, RubyCraft.bloque_del_crea_caminos);
		event.player.worldObj.setBlock((int)event.player.posX-1, (int)event.player.posY -2, (int)event.player.posZ+1, RubyCraft.bloque_del_crea_caminos);
		event.player.addPotionEffect(new PotionEffect(Potion.resistance.id, 100,255));
		event.player.addPotionEffect(new PotionEffect(23, 100, 255));
		}
	}
		
		//Aniversario evento
		if(RubyCraft.Aniversario == true && !Iniciadosesion) {
			Iniciadosesion = true;
			event.player.addChatComponentMessage(new ChatComponentText("Aniversario" + Ver_fecha_calendario_usuario.ano));
		}
		//Navidad evento
		if (RubyCraft.Navidad == true && !Iniciadosesion ) {
			Iniciadosesion = true;
			event.player.addStat(Logros.Es_Navidad, 1);
			Iniciadosesion = true;
		}

		
		if(RubyCraft.Verano && !Iniciadosesion) {
			event.player.addStat(Logros.Es_verano, 1);
			Iniciadosesion = true;
		}
		
		
		//Halloween evento 
		
		if(RubyCraft.HalloWen == true && !Iniciadosesion) {
			Iniciadosesion = true;
			event.player.addStat(Logros.Es_Hallowen, 1);
			
		}
		/**
		if(BossParca.Activo) {
			if (BossParca.Fase == 3 && BossParca.Activo && RubyCraft.HalloWen && !RubyCraft.Navidad) {

				event.player.attackEntityFrom(Laparcasellevotualma, 1.0F);

			}
			if (!RubyCraft.cliente) {

				if (!BossParca.chat1 && BossParca.Fase == 1 && BossParca.Activo && RubyCraft.HalloWen && !RubyCraft.Navidad) {
					BossParca.chat1 = true;
					event.player.addChatComponentMessage(new ChatComponentText(ParcaFase1));

				}

				if (!BossParca.chat2 && BossParca.Fase == 2 && BossParca.Activo && RubyCraft.HalloWen && !RubyCraft.Navidad) {
					BossParca.chat2 = true;
					event.player.addChatComponentMessage(new ChatComponentText(ParcaFase2));

				}

				if (!BossParca.chat3 && BossParca.Fase == 3 && BossParca.Activo && RubyCraft.HalloWen && !RubyCraft.Navidad) {
					BossParca.chat3 = true;
					event.player.addChatComponentMessage(new ChatComponentText(ParcaFase3));

				}

			}

			if (!RubyCraft.cliente && BossParca.Activo && !musica && BossParca.Fase == 1 && RubyCraft.HalloWen && !RubyCraft.Navidad) {

				event.player.playSound(RubyCraft.modid + ":records.bossparca", Float.MAX_VALUE, 1.0F);

				musica = true;
			}
		
	}**/
}
	
	
	
	@SubscribeEvent
	public void onworldtick(WorldTickEvent event) {
	
		
		/**if(event.world.difficultySetting == EnumDifficulty.PEACEFUL && Entityprueba.Activo) {
			Entityprueba.tick=0;
			Entityprueba.Fase=-1;
			Entityprueba.Activo=false;

			
		}
		**/
		
		
		if(event.world.difficultySetting == EnumDifficulty.PEACEFUL && BossParca.Activo && RubyCraft.HalloWen) {
			BossParca.Activo = false;
			Eventos_especiales.musica = false;
		//Generator_Boss.NombreJugador = " ";
			//event.world.setWorldTime(Generator_Boss.TiempodelMundo);
			//Generator_Boss.TiempodelMundo = 0;
			Bloque_de_Diamante_Trol.Dano = 20.0F;
			BossParca.Fase = 0;
		} 
		if(event.world.difficultySetting == EnumDifficulty.PEACEFUL && YetiLich.Activo && RubyCraft.Navidad) {
			YetiLich.reiniciarsiespacifico();
		}
		
		if(event.world.difficultySetting == EnumDifficulty.PEACEFUL && Lich.Activo && RubyCraft.Navidad) {
			Lich.reiniciarsiespacifico();
		}
		
		//Navidad evento
		
		
		//Halloween evento 
		/**
		if(BossParca.Activo) {
		if (RubyCraft.cliente == true && Minecraft.getMinecraft().currentScreen == null) {

			if (!BossParca.chat1 && BossParca.Fase == 1 && BossParca.Activo && RubyCraft.HalloWen && !RubyCraft.Navidad) {
				BossParca.chat1 = true;
				Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(ParcaFase1));

					}

			if (!BossParca.chat2 && BossParca.Fase == 2 && BossParca.Activo && RubyCraft.HalloWen && !RubyCraft.Navidad) {
				BossParca.chat2 = true;
				Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(ParcaFase2));

					}

			if (!BossParca.chat3 && BossParca.Fase == 3 && BossParca.Activo && RubyCraft.HalloWen && !RubyCraft.Navidad) {
				BossParca.chat3 = true;
				Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(ParcaFase3));
				
			}

		if (BossParca.Activo && !musica && !(Generator_Boss.NombreJugador == Minecraft.getMinecraft().thePlayer.getDisplayName()) && RubyCraft.HalloWen && !RubyCraft.Navidad) {

				Minecraft.getMinecraft().thePlayer.playSound(RubyCraft.modid + ":records.bossparca", Float.MAX_VALUE,1.0F);

				musica = true;
			          }
		         }
	  }**/
          
	}
	
	
	
}
