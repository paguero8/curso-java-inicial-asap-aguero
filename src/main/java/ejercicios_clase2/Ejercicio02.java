package ejercicios_clase2;

import ar.edu.ort.p1.util.Consola;

/**
* Comprobar si dos numeros son amigos. Dos numeros enteros positivos A y B 
* son numeros amigos si la suma de los divisores propios de A es igual a B 
* y la suma de los divisores propios de B es igual a A.
* Los divisores propios de un número incluyen la unidad pero no el propio numero.
* 
* Un ejemplo de numeros amigos son los numeros 220 y 284.
* Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.
* La suma de los divisores propios de 220 da como resultado 284
* Los divisores propios de 284 son 1, 2, 4, 71 y 142.
* La suma de los divisores propios de 284 da como resultado 220.
* 
* Por lo tanto 220 y 284 son amigos.

 * @author paguero
 */

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B = 0;
		int sumaA = 0;
		int sumaB = 0;
		do {
			A = Consola.leerEntero("Ingrese un número entero positivo A: ");
			B = Consola.leerEntero("Ingrese un número entero positivo B: ");
			if (A <= 0 || B <= 0) {
				System.out.println("Debe ingresar un número entero positivo");
			}
		} while (A <= 0 || B <= 0);
		
		for (int i = 1; i<=A; i++) {
			if (A % i == 0) {
				int divisor = i;
				if (divisor != A) {
					sumaA = sumaA + divisor;
				}
			}
		}
		
		for (int i = 1; i<=A; i++) {
			if (B % i == 0) {
				int divisor = i;
				if (divisor != B) {
					sumaB = sumaB + divisor;
				}
			}
		}
		
		if (sumaA == B && sumaB == A) {
			System.out.println("¡Números amigos!");
		} else {
			System.out.println("Números no amigos");
		}
	}

}
