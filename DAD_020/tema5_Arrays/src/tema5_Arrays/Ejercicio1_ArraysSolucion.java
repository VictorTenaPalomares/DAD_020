package tema5_Arrays;

import java.util.Arrays;

public class Ejercicio1_ArraysSolucion {
	public static void main(String args[]){
		double arrayDobles[]=new double[10];
		System.out.print("Elementos del array: [");
		for(int i=0;i<arrayDobles.length;i++){
			arrayDobles[i]=Math.rint(Math.random()*10000)/10000;
			if(i!=arrayDobles.length-1)
				System.out.print(arrayDobles[i]+", ");
			else
				System.out.print(arrayDobles[i]+"]");
		}
		Arrays.sort(arrayDobles);
		System.out.print("\nElementos del array ordenados de menor a mayor: [");
		for(int i=0;i<arrayDobles.length;i++){
			if(i!=arrayDobles.length-1)
				System.out.print(arrayDobles[i]+", ");
			else
				System.out.print(arrayDobles[i]+"]");
		}
		System.out.print("\nElementos del array ordenados de mayor a menor: [");
			for(int i=arrayDobles.length-1;i>=0;i--){
			if(i!=0)
				System.out.print(arrayDobles[i]+", ");
			else
				System.out.print(arrayDobles[i]+"]");
		}
	}

}
