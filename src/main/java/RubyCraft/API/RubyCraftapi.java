package RubyCraft.API;


import RubyCraft.Escaleras_Principal;
import RubyCraft.Bases.CancionesBase;
import RubyCraft.Entidades.Granadas.EntidadGranada_de_Ruby;
import RubyCraft.Entidades.Granadas.EntidadGranada_de_Zafiro;
import RubyCraft.Entidades.Granadas.EntidadGranda_de_Uranio;
import RubyCraft.Items.Libro_de_recetas;
import RubyCraft.Registrar.Registros_Importantes.Registros;
import cpw.mods.fml.common.registry.GameRegistry;

public interface RubyCraftapi {
	
	public void RegisterAllThings(Registros register, GameRegistry registry, Escaleras_Principal principal, CancionesBase canciones, EntidadGranada_de_Ruby ruby, EntidadGranada_de_Zafiro zafiro, EntidadGranda_de_Uranio uranio);
	
	public void RegisterCraftinRecipesCustomCraftingTables(Registros register);
	
	public void RegisterCraftingRecipes(GameRegistry registry);
	
	public void RegisterStairs(Escaleras_Principal principal);
	
	public void RegisterSong(CancionesBase canciones);
	
	public void ModificateGrenade(EntidadGranada_de_Ruby ruby, EntidadGranada_de_Zafiro zafiro, EntidadGranda_de_Uranio uranio);
	
	public void ModificateBook(Libro_de_recetas book_recipes);

}
