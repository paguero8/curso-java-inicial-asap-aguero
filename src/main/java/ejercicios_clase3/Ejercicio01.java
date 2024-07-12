package ejercicios_clase3;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que lee la altura de N personas y calcula:
* La altura media.
* Cuantas personas tienen una altura superior a la media.
* Cuantas tienen una altura inferior a la media.
*  
* El valor de N se pide por teclado y debe ser entero positivo.
* 
* @author paguero
 */

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double suma = 0;
		double altura_media = 0;
		int contador_sup = 0;
		int contador_inf = 0;
		
		int N = Consola.leerEntero("Ingrese el número de personas: ");
		
		double[] altura = new double[N];
		
		for (int i = 0; i < altura.length; i++) {
			altura[i] = Consola.leerDouble("Ingrese la altura de la persona: ");
			suma += altura[i];
		}
		
		altura_media = suma / altura.length;
		
		for (int i = 0; i < altura.length; i++) {
			if (altura[i] >= altura_media) {
				contador_sup += 1;
			} else {
				contador_inf += 1;
			}
		}
		
		System.out.println("La altura media es: "+altura_media);
		System.out.println("Personas con altura superior a la media: "+contador_sup);
		System.out.println("Personas con altura inferior a la media: "+contador_inf);
		
	}

}
