package tema8_GestionFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1_LeerFichero {
	public static void main(String[] args) {

		System.out.println("Por favor, introduce la ruta del fichero: ");

		Scanner entrada = new Scanner(System.in);

        //String rutaFichero="C:\\cursojava\\tema8_GestionFicheros\\pruebaFicheros.txt";
		String rutaFichero = entrada.nextLine();
		String ficheroDestino = "C:\\cursojava\\tema8_GestionFicheros\\resultados.txt";

		try {

			FileReader fr = new FileReader(rutaFichero); // flujo
			BufferedReader br = new BufferedReader(fr); // buffer

			FileWriter fw = new FileWriter(ficheroDestino);
			BufferedWriter bw = new BufferedWriter(fw);

			String linea;
			int contadorLeidas = 0;
			int contadorEscritas = 0;
			
			while ((linea = br.readLine()) != null) { // el método readline para cuando obtiene null

				if (linea.startsWith("+") || linea.startsWith("-")) {
					contadorEscritas++;
					bw.write(linea + "\n");
				} else {
					contadorLeidas++;
					System.out.println(linea);
				}
				
			}
			
			System.out.println("Número de líneas leidas en " + rutaFichero + " => " + contadorLeidas);
			System.out.println("Número de líneas leidas en C:\\cursojava\\tema8_GestionFicheros\\pruebaFicheros.txt =>"
					+ contadorEscritas);
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("La ruta que has introducido no se encuentra disponible");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Has introducido algún caracter inesperado por el programa");
			e.printStackTrace();
		} finally {
			entrada.close();
			System.out.println("Fin del programa desde el finally");
		}

	}
}
