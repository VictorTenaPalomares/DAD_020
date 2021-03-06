package tema3_clase_String;

import java.io.IOException;
import java.util.Scanner;

/*Verificar si una cadena de texto almacenada en el String nif, es un NIF correcto o no.

Si lo es, se mostrará por consola su parte numérica.
Si no lo es se mostrará el mensaje "NIF no valido".*/

public class EjercicioString4 {

	public static void main(String[] args) throws IOException {

		EjercicioString4 ej4 = new EjercicioString4();

		System.out.println("Introduce DNI:");

		Scanner entrada = new Scanner(System.in);

		String nif = entrada.nextLine();
		entrada.close();

		// LLamada al método mostrar mensaje. Se pasa por parámetro el nif
		// y la validación efectuada en el método comprobar
		ej4.mostrarMensaje(nif, ej4.comprobar(nif));

	}

	public boolean comprobar(String nif) {
		int contador = 0;
		// Vaildaciones requeridas
		if (nif.length() == 9) { // longitud válida
			if (Character.isLetter(nif.charAt(8))) { // última letra
				do {
					if (Character.isDigit((Character)nif.charAt(contador))) {
						contador++;
					}
					return true;
				} while (contador < 8);

			}
		}

		return false;

	}

	public void mostrarMensaje(String nif, boolean nifValido) {

		if (nifValido) {
			System.out.println("La parte numérica del nif es: " + nif.substring(0, 8) + "\n El nif es válido");
			System.out.println("Fin del programa");
		} else {
			System.out.println("El nif no es válido");
		}

	}

}
