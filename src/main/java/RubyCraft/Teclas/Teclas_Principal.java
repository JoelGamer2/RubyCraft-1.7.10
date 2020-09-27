package RubyCraft.Teclas;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class Teclas_Principal {

	public static KeyBinding Ver_updates = new KeyBinding("Tecla.Ver_updates.name", Keyboard.KEY_F10, "CategoriaTecla.RubyCraft.name");
	
	public static void Iniciar(){
		
		Teclas_Principal.Registrar();
	}
	
	public static void Registrar(){
		RegistrarTecla(Ver_updates);
	}
	
	public static void RegistrarTecla(KeyBinding tecla){
		ClientRegistry.registerKeyBinding(tecla);
	}
	
}
