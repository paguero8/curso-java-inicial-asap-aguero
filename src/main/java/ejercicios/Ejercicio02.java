package ejercicios;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que pide por teclado la fecha de nacimiento de una persona (día,
 * mes, año) y calcula su numero de la suerte.
 * El numero de la suerte se calcula sumando el dia, mes y anio de la fecha de nacimiento y 
 * a continuacion sumando las cifras obtenidas en la suma. 
 * 
 * @author paguero
 *
 */

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double fecha = Consola.leerDouble("Ingrese su fecha de nacimiento en formato AAAAMMDD: ");
		double suma = 0;
		
		if (fecha != 0) {
			double anio = (fecha / 10000) % 100000000;
			double mes = (fecha / 100) % 100;
			double dia = fecha % 100;
			
			suma = (int) dia + (int) mes + (int) anio;
		}
		
		int numero_suerte = (int) (suma / 1000) + (int) ((suma / 100) % 10) + (int) ((suma / 10) % 100) + (int) (suma % 10);

		System.out.println("Tu número de la suerte es: " + numero_suerte);
	}

}
