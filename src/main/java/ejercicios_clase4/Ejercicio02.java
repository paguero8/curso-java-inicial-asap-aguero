package ejercicios_clase4;

/**
 * Ejercicio02
 * Programa que genera un array de 8 enteros aleatorios entre 1 y 10, lo ordena utilizando el
 * algoritmo de ordenamiento de burbuja y lo muestra.
 * 
 */

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int CANT_ELEMENTOS = 8;
		int array[] = new int[CANT_ELEMENTOS];

		// Se llena el array con valores aleatorios entre 1 y 100
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10 + 1);
		}

		// Se muestra el array completo
		System.out.println("Array generado: \n");
		mostrarArray(array);
		System.out.println("\n");
		
		//Se ordena el array completo
		ordenarArray(array);
		
		//Se muestra el array ordenado
		System.out.println("Array ordenado: \n");
		mostrarArray(array);
		
	}

	/**
	 * 
	 * @param array
	 */
	static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	static void ordenarArray(int array[]) {
		for(int i=0; i < array.length-1; i++){
            for(int j=0; j < (array.length-1-i); j++){  
                 if(array[j] > array[j+1]){  
                         int aux=array[j];                 
                         array[j]=array[j+1];           
                         array[j+1]=aux;
                  }    
            }
       }
	}
	
}
