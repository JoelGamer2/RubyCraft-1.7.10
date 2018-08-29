package RubyCraft.Integracion;

import RubyCraft.RubyCraft;
import RubyCraft.Registrar.Registros_Importantes.Registros;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Crafteos_InteGracion {

	public static void CrafteosInteGracionIniciar(){
		
		Crafteos_InteGracion.IntegracionMesadeRuby();
		Crafteos_InteGracion.IntegracionMesadeZafiro();
		Crafteos_InteGracion.IntegracionTransformadordeLosasaBloques();
		Crafteos_InteGracion.CrafteoMesaNormal();
		
		}
		public static void CrafteoMesaNormal(){
			
			
				if(RubyCraft.modChecker.isMigueCraftLoaded){
					
				Block MenadeMigue = GameRegistry.findBlock(RubyCraft.modChecker.MigeCrafmoid, "Mena_de_Migue");
				
				GameRegistry.addRecipe(new ItemStack(RubyCraft.Mena_de_Ruby, 1), new Object[]{" r ","rmr"," r ", 'r', Items.redstone,'m', MenadeMigue});
				GameRegistry.addRecipe(new ItemStack(MenadeMigue, 1), new Object[]{" s ","sms"," s ",'m',RubyCraft.Mena_de_Ruby,'s',Items.wheat_seeds});
				
			}
				
					if(RubyCraft.modChecker.isMigueCraftLoaded){
						
					
				}
				
		  }	
	
	public static void IntegracionMesadeRuby(){
			
		
		
		if(RubyCraft.modChecker.isMigueCraftLoaded){
			
		}
		
		if(RubyCraft.modChecker.isMigueCraftLoaded){
         	
         }
	}
	
	public static void IntegracionMesadeZafiro(){
		
		if(RubyCraft.modChecker.isMigueCraftLoaded){
			
			Item pepita_de_migue = GameRegistry.findItem(RubyCraft.modChecker.MigeCrafmoid, "Pepitas_de_Migue");
			Item Palo_de_Migue = GameRegistry.findItem(RubyCraft.modChecker.MigeCrafmoid, "Palo_de_Migue");
			
			Registros.addRecipeZafiro(new ItemStack(RubyCraft.PPAP_Long_Version, 1), new Object[]{"mppm","pazp","prap","mppm",'m',pepita_de_migue,'p',Palo_de_Migue,'a',RubyCraft.amuleto,'r',RubyCraft.ruby,'z',RubyCraft.zafiro});
			
		}
		
	
		
		if(RubyCraft.modChecker.isMigueCraftLoaded){
				
			
		}
		
	}
	
public static void IntegracionTransformadordeLosasaBloques(){
		
		if(RubyCraft.modChecker.isMigueCraftLoaded){
			
		}
		
			
		
		
		if(RubyCraft.modChecker.isMigueCraftLoaded){
				
			
		}
		
	}
	
}