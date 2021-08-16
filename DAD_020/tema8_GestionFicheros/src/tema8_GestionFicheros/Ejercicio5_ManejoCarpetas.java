package tema8_GestionFicheros;

import java.io.File;

public class Ejercicio5_ManejoCarpetas {

	public static void main(String[] args) {

		File e5 = new File("C:\\cursojava\\tema8_GestionFicheros\\carpeta1");

		File[] arrayFile = e5.listFiles();

		System.out.println("Número de elementos del array= " + arrayFile.length);

		for (File file : arrayFile) {
			System.out.println(file.toString()+" "+file.delete());
		}
		
		for (File file : arrayFile) {
			System.out.println(file.toString());
		}
	}

}
