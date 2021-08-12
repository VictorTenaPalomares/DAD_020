package tema8_GestionFicheros;

import java.io.FileReader;

public class LecturaFicheroCaracterACaracterSinFiltro {
	public static void main(String[] args) {

		String rutaFichero = "C:\\cursojava\\tema8_GestionFicheros\\escritura.txt";
		
		try {
			long ini=System.currentTimeMillis(); // Devuelve una cantidad de milisegundos desde 1970 hasta el momento actual, en este programa como se va a realozar la diferencia entre 2 instancias de este tipo vamos a conseguir calcular cuanto tiempo ha durado la ejecucion del programa
			
			// Lectura de fichero
			FileReader fr=new FileReader(rutaFichero);
			int siguienteCaracter;
			while ((siguienteCaracter=fr.read())!=-1) {		
												
			}
			fr.close();
			
			System.out.println("Tiempo de ejecución " + (System.currentTimeMillis()-ini)+" ms");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
