package tema3_clase_String;

import java.util.Scanner;

public class EjercicioString6_Adivinar_Numero {
	public static void main(String[] args) {

		int numero = (int) (Math.random() * 100);
		System.out.println("-------------------------------------");
		System.out.println("Adivina un número entre el 0 y el 100");
		System.out.println("-------------------------------------");

		Scanner entrada = new Scanner(System.in);
		int numeroUser;
		int contador = 0;

		do {
			System.out.println("Introduce un número o pulsa * para salir");
			numeroUser = entrada.nextInt();
			contador++;
			if (numeroUser < numero)
				System.out.println("El numero buscado es mayor");
			if (numeroUser > numero)
				System.out.println("El número buscado es menor");
		} while (numeroUser != numero);

		entrada.close();

		System.out.println("Enhorabuena, has acertado después de " + contador + " intentos");
	}
}
