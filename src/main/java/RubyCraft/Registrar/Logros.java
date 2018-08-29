package RubyCraft.Registrar;

import RubyCraft.RubyCraft;
import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class Logros {

    public static Achievement MinaRuby;
    public static Achievement HazBloqueDeRuby;
    public static Achievement CrafteaMesadeRuby;    
    public static Achievement CrafteaPicoRuby;
    public static Achievement CrafteaEspadaRuby;    
    public static Achievement CubretedeRubys;
   
    public static Achievement MinaZafiro;
    public static Achievement HazBloqueDeZafiro;
    public static Achievement CrafteaMesadeZafiro;
    public static Achievement CrafteaPicoZafiro;
    public static Achievement CrafteaEspadaZafiro;
    public static Achievement CubretedeZafiros;
    
    public static Achievement RevolucionMob;
    
    public static Achievement ConsigueUranio;
    
    public static Achievement CrafteaMesadeConjuraciones;
    public static Achievement Encantador_Magico;
    
    public static Achievement Amigos_Para_Siempre;
    public static Achievement Siendo_Troleado;
       
     public static Achievement Es_Navidad;
	
	public static void Iniciar(){
		
		MinaRuby = new Achievement("achievement.MinaRuby", "MinaRuby", 0, 0, RubyCraft.Mena_de_Ruby, (Achievement)null).registerStat().initIndependentStat();
	    HazBloqueDeRuby = new Achievement("achievement.HazBloqueDeRuby", "HazBloqueDeRuby", 2, 1, RubyCraft.Bloquederuby, MinaRuby).registerStat();
		CrafteaMesadeRuby = new Achievement("achievement.CrafteaMesadeRuby", "CrafteaMesadeRuby", 3, 2, RubyCraft.MesadeTrabajodeRuby,HazBloqueDeRuby).registerStat().setSpecial(); 
	    CrafteaPicoRuby = new Achievement("achievement.CrafteaPicoRuby", "CrafteaPicoRuby", 4, 3, RubyCraft.Picoderuby, CrafteaMesadeRuby).registerStat();
		CrafteaEspadaRuby = new Achievement("achievement.CrafteaEspadaRuby", "CrafteaEspadaRuby", 2, 3, RubyCraft.Espadaderuby, CrafteaMesadeRuby).registerStat();
		CubretedeRubys = new Achievement("achievement.CubretedeRubys", "CubretedeRubys", 3, 5, RubyCraft.PetodeRuby, CrafteaMesadeRuby).registerStat();
		
	    MinaZafiro = new Achievement("achievement.MinaZafiro", "MinaZafiro", 6 ,4,RubyCraft.Mena_de_Zafiro,(Achievement)null).registerStat().initIndependentStat();
		HazBloqueDeZafiro = new Achievement("achievement.HazBloqueDeZafiro", "HazBloqueDeZafiro", 7, 6, RubyCraft.BloquedeZafiro, MinaZafiro).registerStat();
		CrafteaMesadeZafiro = new Achievement("achievement.CrafteaMesadeZafiro", "CrafteaMesadeZafiro", 8, 7,RubyCraft.MesadeTrabajodeZafiro,HazBloqueDeZafiro).registerStat().setSpecial();
		CrafteaPicoZafiro = new Achievement("achievement.CrafteaPicoZafiro", "CrafteaPicoZafiro", 7, 8, RubyCraft.Picodezafiro, CrafteaMesadeZafiro).registerStat();
		CrafteaEspadaZafiro = new Achievement("achievement.CrafteaEspadaZafiro", "CrafteaEspadaZafiro", 9, 8, RubyCraft.Espadadezafiro, CrafteaMesadeZafiro).registerStat();
		CubretedeZafiros = new Achievement("achievement.Cubremedezafiros", "Cubremedezafiros", 8, 9, RubyCraft.PetodeZafiro, CrafteaMesadeZafiro).registerStat();
		
		RevolucionMob = new Achievement("achievement.RevolucionMob", "RevolucionMob", 10, 0, RubyCraft.ruby, (Achievement)null).initIndependentStat().registerStat().setSpecial();
		
		ConsigueUranio = new Achievement("achievement.ConsigueUranio", "ConsigueUranio", 11, 5, RubyCraft.uranio, (Achievement)null).initIndependentStat().registerStat();	    
		
		CrafteaMesadeConjuraciones = new Achievement("achievement.CrafteaMesadeConjuraciones", "CrafteaMesadeConjuraciones", 8, 11, RubyCraft.Mesa_De_Conjuraciones,CrafteaMesadeZafiro).registerStat().setSpecial();
		Encantador_Magico = new Achievement("achievement.Encantador_Magico", "Encantador_Magico", 6, 11, Items.enchanted_book, CrafteaMesadeConjuraciones).registerStat().setSpecial();
		
		Amigos_Para_Siempre = new Achievement("achievement.Amigos_Para_Siempre", "Amigos_Para_Siempre", 12, 6, RubyCraft.Totem_de_la_no_muerte, (Achievement)null).initIndependentStat().registerStat().setSpecial();	
		Siendo_Troleado = new Achievement("achievement.Siendo_Troleado", "Siendo_Troleado", 13, 7, RubyCraft.Bloque_de_Diamante_Trol, Amigos_Para_Siempre).registerStat();
		
		Es_Navidad = new Achievement("achievement.Es_Navidad", "Es_Navidad", 15, 7,Items.snowball, (Achievement)null).initIndependentStat().registerStat().setSpecial();
		
		 AchievementPage.registerAchievementPage(new AchievementPage("RubyCraft", new Achievement[]{
				 MinaRuby, 
				 HazBloqueDeRuby, 
				 CrafteaMesadeRuby, 
				 CrafteaPicoRuby, 
				 CrafteaEspadaRuby, 
				 CubretedeRubys,
				 
				 MinaZafiro,
				 HazBloqueDeZafiro,
				 CrafteaMesadeZafiro,
				 CrafteaPicoZafiro,
				 CrafteaEspadaZafiro,
				 CubretedeZafiros,
				 
				 CrafteaMesadeConjuraciones,
				 Encantador_Magico,
				 
				 RevolucionMob, 
				 
				 ConsigueUranio, 
				 
				 Amigos_Para_Siempre, 
				 Siendo_Troleado, 
				 
				 Es_Navidad,
				 
				 
		 
		 
		 
		 
		 
		 }));
		
        
	}
	
}
