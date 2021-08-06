package tema4_excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2_Excepciones {
	public static void main(String[] args) throws IOException {

		double total = 0;
		double totalPositivos = 0;
		double totalNegativos = 0;
		double numeroIntroducido = 0;
		boolean control = false;

		System.out.println("Hola, ¿Cuántos números deseas sumar?");

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader bReader = new BufferedReader(input);
		do {
			try {
				total = Double.parseDouble(bReader.readLine());

				for (int i = (int) total; i > 0; i--) {

					System.out.println(" \n Faltan " + i + " números");

					numeroIntroducido = Double.parseDouble(bReader.readLine());

					if (numeroIntroducido < 0) {
						totalNegativos += numeroIntroducido;
					}

					if (numeroIntroducido > 0) {
						totalPositivos += numeroIntroducido;
					}
				}

				System.out.println("La suma de toodos los positivos es = " + totalPositivos);
				System.out.println("La suma de toodos los negativos es = " + totalNegativos);
				
			} catch (NumberFormatException e) {
				control = true;
				System.out.println("Se ha introducido texto en vez de números , inténtalo de nuevo");
				e.getMessage();

			}
		} while (control);

	}
}
