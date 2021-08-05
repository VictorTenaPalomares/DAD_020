package com.ejerciciosTema01;

public class D{
	public static void main(String args[]){
		CuadradoSuma cs=new CuadradoSuma();
		int resultado1=cs.calcularCuadradoSuma(3,2);
		CuadradoDiferencia cd=new CuadradoDiferencia();
		int resultado2=cd.calcularCuadradoDiferencia(3,2);
		Conclusion c=new Conclusion();
		System.out.println(resultado1);
		System.out.println(resultado2);
		c.mostrarConclusion();
	}
}
 class CuadradoSuma2{
	int calcularCuadradoSuma(int sumando1,int sumando2){
		int suma=(sumando1*sumando1)+(sumando2*sumando2)+(2*sumando1*sumando2);
		return suma;
	}
}
 class CuadradoDiferencia2{
	int calcularCuadradoDiferencia(int sumando1,int sumando2){
		int diferencia=(sumando1*sumando1)+(sumando2*sumando2)-(2*sumando1*sumando2);
		return diferencia;
	}
}
 class Conclusion2{
	void mostrarConclusion(){
		System.out.println("Has calculado el cuadrado de una suma y el de una diferencia. Eres un buen programador.");
	}
}

