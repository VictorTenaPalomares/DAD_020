package tema5_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2_FactorialSolucion {
	public static void main(String args[]){
		//Se declara double la variable factorial para considerar factoriales de enteros grandes (hasta 170 incluido)
		//Por encima de 170 el resultado es infinity ya que se sale del rando de double. Habría que emplear otra variable.
		double factorial=1;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Escribe un numero entero positivo: ");
		try{
			int num=Integer.parseInt(br.readLine());
			if(num<0){
				System.out.println("Debe ser mayor que cero");
				return;
			}
			int array[]=new int[num];
			for(int i=0;i<num;i++)
				array[i]=i+1;
			System.out.print("Elementos del array: [");
			for(int i=0;i<array.length;i++){
				factorial*=array[i];
				if(i!=array.length-1)
					System.out.print(array[i]+",");
				else
					System.out.print(array[i]);
			}
			System.out.print("]\n");
			System.out.println("El factorial de "+num+" es "+factorial);
		}catch(NumberFormatException nfe){
			System.out.println("Formato de numero incorrecto");	
		}catch(IOException e){
			System.out.println("Error---"+e.toString());
		}
	}

}
