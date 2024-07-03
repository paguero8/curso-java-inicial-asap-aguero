package ejercicios;

import ar.edu.ort.p1.util.Consola;

/**
* El programa lee por teclado una calificacion numerica entre 0 y 10 y muestra por pantalla 
* su correspondiente calificacion alfabetica.
* 
* La equivalencia entre la calificacion numerica y la alfabetica se muestra en esta tabla:
* 
* 0 <= nota < 5 Insuficiente
* 5 <= nota < 6 Suficiente
* 6 <= nota < 7 Bien
* 7 <= nota < 9 Notable
* 9 <= nota <= 10 Sobresaliente
* 
* La calificacion numerica que se introduce por teclado debe estar comprendida entre 0 y 10 para poder obtener su equivalente calificacion alfabetica. 
* Si la calificacion introducida no es valida se muestra un mensaje indicandolo y el programa finaliza.
* 
* 
@author paguero
*
 */

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int calificacion = Consola.leerEntero("Ingrese su calificación: ");
		
		if (calificacion >= 0 && calificacion <= 10) {
			if (calificacion <5) {
				System.out.println("Insuficiente");
			}
			if (calificacion >= 5 && calificacion <6) {
				System.out.println("Suficiente");
			}
			if (calificacion >= 6 && calificacion <7) {
				System.out.println("Bien");
			}
			if (calificacion >= 7 && calificacion <9) {
				System.out.println("Notable");
			}
			if (calificacion >= 9) {
				System.out.println("Sobresaliente");
			}
		} else {
			System.out.println("Valor invalido");
		}

	}

}
