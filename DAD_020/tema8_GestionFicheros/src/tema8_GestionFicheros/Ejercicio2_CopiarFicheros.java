package tema8_GestionFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2_CopiarFicheros {

	public static void main(String[] args) {

		// Habilitamos la entrada por consola
		InputStreamReader iS = new InputStreamReader(System.in); // Equivale a instanciar la clase Scanner
		BufferedReader bF = new BufferedReader(iS);

		String siguienteLinea;

		try {
			System.out.println("Introduce la ruta del fichero que quieres copiar:");
			String rutaOrigen = bF.readLine();

			System.out.println("Gracias, ahora introduce la ruta del archivo donde se debe efectuar la copia: ");
			String rutaDestino = bF.readLine();

			FileReader fR = new FileReader(rutaOrigen);
			BufferedReader bR = new BufferedReader(fR);

			FileWriter fW = new FileWriter(rutaDestino);
			BufferedWriter bW = new BufferedWriter(fW);

			while ((siguienteLinea = bR.readLine()) != null) {
				bW.write(siguienteLinea + "\n");
			}
			bR.close();
			bW.flush();
			bW.close();

		} catch (IOException e) {
			System.out.println("Has introducido texto no válido, inténtalo de nuevo");
			e.printStackTrace();
		}

		System.out.println("FIN PROGRAMA");
	}

}
