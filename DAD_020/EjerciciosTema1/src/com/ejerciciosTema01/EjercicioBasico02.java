package com.ejerciciosTema01;

public class EjercicioBasico02 {

	public static void main(String[] args) {

		EjercicioBasico02 ejercicio2=new EjercicioBasico02();
		System.out.println(ejercicio2.calcularCuadradoSuma(3, 2));
		System.out.println(ejercicio2.calcularCuadradoDiferencia(3, 2));
		
		ejercicio2.mostrarConclusion();
		
		
	}
	
	int calcularCuadradoSuma(int a, int b) {
		int suma= a+b;
		return suma*suma;
	}
	
	 int calcularCuadradoDiferencia(int a, int b) {
		int resta = a - b;
		return resta * resta;
	}
	
	 void mostrarConclusion() {
		System.out.println("Has calculado el cuadrado de una suma y el de una diferencia. Eres un buen programador.");
	}

}
