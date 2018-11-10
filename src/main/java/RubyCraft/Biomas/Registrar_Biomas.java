package RubyCraft.Biomas;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class Registrar_Biomas {

	public static void Registrar(){
		Registrar_Biomas.IniciarBioma();
		RegistrarBioma();
	}
	
	public static BiomeGenBase RubyBioma;
	
	public static void IniciarBioma(){
		
		RubyBioma = new BiomeGenRuby(137).setBiomeName("Ruby").setTemperatureRainfall(1.2F, 0.9F);
		
	}
	
	public static void RegistrarBioma(){
		
	BiomeDictionary.registerBiomeType(RubyBioma, Type.PLAINS);
	BiomeManager.addSpawnBiome(RubyBioma);
	
	}
	
	
}
