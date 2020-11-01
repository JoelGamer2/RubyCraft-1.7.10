package RubyCraft.Bases;

public class Cosas_random_utiles {

	public static double calcular_distancia_entre_2_puntos(double x1, double y1, double z1, double x2, double y2, double z2) {
		//Creamos el vector A--->B restando las componentes de los puntos
		double x_vector = x1-x2;
		double y_vector = y1-y2;
		double z_vector = z1-z2;
		//Hacemos el modulo del vector sumando el cuadrado de las componentes del vector
		return Math.sqrt((Math.pow(x_vector, 2) + (Math.pow(y_vector, 2) + Math.pow(z_vector, 2) )));
		
		
	}
	
}
