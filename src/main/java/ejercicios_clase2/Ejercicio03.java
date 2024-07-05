package ejercicios_clase2;

import ar.edu.ort.p1.util.Consola;

/**
 * El programa leera por teclado un numero entero positivo y calculara la suma
 * de sus cifras. Por ejemplo, si se ingresa el numero 3601 el programa debera
 * mostrar: "La suma de sus cifras es: 10".
 */

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int suma = 0;
		do {
			num = Consola.leerEntero("Ingrese un número entero positivo: ");
			if (num <= 0) {
				System.out.println("Debe ingresar un número entero positivo");
			}
		} while (num <= 0);

		while (num > 0) {
			int cifra = num % 10;
			suma = suma + cifra;
			num = num / 10;
		}
		
		System.out.println("La suma de sus cifras es: " + suma);
	}

}
