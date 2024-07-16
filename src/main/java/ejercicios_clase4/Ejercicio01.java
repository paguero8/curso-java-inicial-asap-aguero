package ejercicios_clase4;

import com.github.sanchezih.util.io.Consola;

/**
 * Ejercicio01
 * Programa que pide el ingreso de un numero e indica si es un numero primo o no.
 * 
 * @author paguero
 */

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = Consola.leerEntero("Ingrese el número entero: ");
		System.out.println(esPrimo(numero));
	}
	
	/**
	 * Recibe como parametro un entero y calcula sus divisores
	 * hasta antes de llegar al número ingresado.
	 * Si tiene más de un divisor, retorna falso, sino retorna verdadero.
	 * 
	 * @param numero
	 */
	
	static boolean esPrimo(int numero) {
		int divisores = 0;
		
		for (int i = 1; i<numero; i++) {
			if (numero % i == 0) {
				divisores += 1;
			}
		}
		
		if (divisores > 1) {
			return false;
		}
		
		return true;
	}

}
