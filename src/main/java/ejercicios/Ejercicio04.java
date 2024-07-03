package ejercicios;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que comprueba si un anio es bisiesto. 
 * Un anio es bisiesto si es divisible por 4 y no lo es por 100 o si es divisible por 400.
 *
 * @author paguero
 *
 */

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double anio = Consola.leerDouble("Ingresa el año: ");
		
		if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
			System.out.println("Año bisiesto");
		} else {
			System.out.println("Año no bisiesto");
		}
		
	}

}
