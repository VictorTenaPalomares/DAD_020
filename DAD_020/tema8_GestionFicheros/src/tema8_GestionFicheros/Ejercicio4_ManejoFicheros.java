package tema8_GestionFicheros;

import java.io.File;

public class Ejercicio4_ManejoFicheros {

	public static void main(String args[]) {
		File f = new File("C:\\\\cursojava\\\\tema8_GestionFicheros\\\\carpeta1"); // objeto que contiene una ruta que
																					// ya existe
		String[] contenido;
		if (f.exists()) { // Si existe guardamos en un array de strings el resultado del método list y lo
							// recorremos para imprimirlo
			contenido = f.list();
			System.out.print("Contenido de carpeta1: [");
			for (int i = 0; i < contenido.length; i++) {
				if (i != contenido.length - 1)
					System.out.print(contenido[i] + ", ");
				else
					System.out.print(contenido[i]);
			}
			System.out.print("]");
			System.out.println();
			File f1 = new File("C:\\cursojava\\tema8_GestionFicheros\\carpeta1\\hola"); // Después guardamos en un
																						// objeto file el directorio que
																						// queremos crear
			boolean carpetaCreada = f1.mkdir(); // se crea
			if (carpetaCreada) { // and so on
				System.out.println("Directorio \"hola\" correctamente creado");
				File f2 = new File("C:\\cursojava\\tema8_GestionFicheros\\carpeta1\\hola\\adios");
				if (f2.mkdir())
					System.out.println("Directorio \"adios\" creado");
				else
					System.out.println("Directorio \"adios\" no creado");
			} else
				System.out.println("Directorio \"hola\" no creado");
		} else
			System.out.println("No se puede encontrar el directorio al que se hace referencia");
	}

}
