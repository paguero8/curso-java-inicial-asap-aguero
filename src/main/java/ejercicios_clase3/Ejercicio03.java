package ejercicios_clase3;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que pide 5 numeros enteros, los almacena en un array, 
 * e indica por pantalla si dicho array es capicua.
 * 
 * @author paguero
 */

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros = new int[5];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Consola.leerEntero("Ingrese el número "+(i+1)+":");
		}
		
		boolean capicua = true;
		int i = 0;
		int j = numeros.length - 1;

		while (i < numeros.length) {
			if (numeros[i] != numeros[j]) {
				capicua = false;
		    }
		    i++;
		    j--;
		}

		if (capicua == true) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}
		
		
	}
}
