package tema3_clase_String;

import java.util.Scanner;

/*Hecho por Víctor Tena*/

public class EjercicioString5_Volumenes {

	final double PI = Math.PI;

	public static void main(String[] args) {
		
		EjercicioString5_Volumenes vol= new EjercicioString5_Volumenes();
		
		Scanner entrada= new Scanner(System.in);
		
		double alturaCilindro, radioCilindro, radioEsfera;
		
		System.out.println("Introduce la altura del cilindro");
		alturaCilindro=entrada.nextDouble();
		
		System.out.println("Introduce el radio del cilindro");
		radioCilindro=entrada.nextDouble();
		
		System.out.println("Introduce el radio de la esfera");
		radioEsfera=entrada.nextDouble();
		
		entrada.close();
		
		System.out.println("Volumen cilindro= " + vol.calcularVolumenCilindro(alturaCilindro, radioCilindro));
		System.out.println("Volumen esfera= " + vol.calcularVolumenEsfera(radioEsfera));
		
		System.out.println("FIN DEL PROGRAMA");
		
		

	}

	double calcularVolumenCilindro(double altura, double radio) {

		double formulaCilindro = PI * radio * radio * altura;

		return formulaCilindro;
	}

	double calcularVolumenEsfera(double radio) {

		double formulaEsfera = (4.0 / 3) * PI * radio * radio * radio;

		return formulaEsfera;
	}

}
