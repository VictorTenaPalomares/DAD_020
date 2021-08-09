package tema5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2_Factorial {
	public static void main(String[] args) {
		int factorial=1;
		Scanner entrada = new Scanner(System.in);
		

		System.out.println("Por favor, introduce el número para cálculo de factorial");
		int numero = entrada.nextInt();

		while (numero > 170) {
			System.out.println("Número demasiado grande, intentalo de nuevo!!!");
			numero = entrada.nextInt();
		}

		int[] arrayFactorial = new int[numero];
		
		for (int i =0 ; i < arrayFactorial.length; i++) {			
			arrayFactorial[i]=i+1;			
			
		}
		for (int i = 0; i < arrayFactorial.length; i++) {
			factorial*=(long)arrayFactorial[i];			
		}
		
		System.out.println("El factorial de "+ numero +" introducido es : " + factorial);
		

	}

}
