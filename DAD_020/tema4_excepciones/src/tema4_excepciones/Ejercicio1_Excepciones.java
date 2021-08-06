package tema4_excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1_Excepciones {

	public static void main(String[] args) {
		System.out.println("Hola, introduce dos números enteros");

		int inicio;
		int fin;

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader bReader = new BufferedReader(input);

		try {
			System.out.println("Introduce el primer número");
			inicio = Integer.parseInt(bReader.readLine());

			System.out.println("Introduce el segundo número");
			fin = Integer.parseInt(bReader.readLine());

			for (int i = inicio; i > fin; i--) {
				
				if (inicio < fin) {
					System.out.println("El primer número es más pequeño que el segundo");
					break;
					}

				System.out.print(10 / i+ " ");
			}

		} catch (IOException eIO) {
			System.out.println("Entrada genera excepción: ");
			eIO.getMessage();
			eIO.printStackTrace();

		} catch (ArithmeticException eAri) {
			System.out.println("Se ha intentado dividir por 0!");
			eAri.getMessage();
			eAri.printStackTrace();

		} catch (NumberFormatException eNumb) {
			System.out.println("Se ha introducido texto en vez de números");
			eNumb.getMessage();
			eNumb.printStackTrace();

		} finally {
			try {
				
				System.out.println("Estoy en el bloque finally \n FIN DEL PROGRAMA");
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
