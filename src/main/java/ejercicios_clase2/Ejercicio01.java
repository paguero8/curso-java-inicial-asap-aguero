package ejercicios_clase2;

import com.github.sanchezih.util.io.Consola;

/**
* Programa que muestra los N primeros numeros de la serie de Fibonacci. 
* El valor de N se lee por teclado.
* 
* La serie de fibonacci la forman una serie de numeros tales que: 
* El primer termino de la serie es el numero 1. 
* El segundo termino de la serie es el numero 1. 
* Los siguientes terminos de la serie de fibonacci se obtienen de la suma de los 
* dos anteriores: 1, 1, 2, 3, 5, 8, 13…
* 
* @author paguero
* 
 */

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = Consola.leerEntero("Ingrese un número entero: ");
		int primer_numero = 0;
		int segundo_numero = 1;
		int suma = 0;
		
		for (int i = 1; i <= N; i++) {
			suma = primer_numero + segundo_numero;
			primer_numero = segundo_numero;
			segundo_numero = suma;
			System.out.println(suma);
		}
	}

}
