package tema5_Arrays;

import java.util.Arrays;

public class Ejercicio1_Arrays {
	public static void main(String[] args) {

		// 1. Array de tamaño 10
		double[] array = new double[10];

		// 3. Bucle que rellena el array
		for (int i = 0; i < array.length; i++) {
			
			// 2. Número aleatorio de intervalo [0,1]
			double aleatorio = (Math.random());
			//4. redondeo a la quinta decimal
			double aleatorioRedondeado=(double)Math.round(aleatorio*10000)/10000;
			
			array[i] =(Double) aleatorioRedondeado;
						
		}
		
		System.out.println("El resultado del array es :" + Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Ordenado de menor a mayor : " + Arrays.toString(array));
		System.out.print("Ordenado de mayor a menor : ");
		
		for (int i = array.length-1; i >=0 ; i--) {
			System.out.print(array[i] + " ");
		}
		
		
		
		
		
	}
}
