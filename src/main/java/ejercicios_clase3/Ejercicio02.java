package ejercicios_clase3;

import com.github.sanchezih.util.io.Consola;

/**
* Programa que pide 10 numeros por teclado, los almacena en un array y que luego muestra el maximo valor, el minimo y las posiciones que ocupan en el array.
* 
* @author paguero
*/

public class Ejercicio02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int max_pos = 0;
		int min_pos = 0;
		
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Consola.leerEntero("Ingrese el número " +(i+1)+ ":");
			if (numeros[i] > max) {
				max = numeros[i];
				max_pos = i;
			}
			if (numeros[i]< min) {
				min = numeros[i];
				min_pos = i;
			}
		}
		
		System.out.println("El número mayor es: "+max+ " con posición "+max_pos);
		System.out.println("El número menor es: "+min+ " con posición "+min_pos);
	}
}
