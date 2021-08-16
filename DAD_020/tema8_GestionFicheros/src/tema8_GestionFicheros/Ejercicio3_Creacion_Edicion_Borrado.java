package tema8_GestionFicheros;

import java.io.File;
import java.io.IOException;

public class Ejercicio3_Creacion_Edicion_Borrado {

	public static void main(String[] args) throws IOException {

		// Crear objetos que contengan archivos de una ruta específica
		File f1 = new File("C:\\cursojava\\tema8_GestionFicheros\\carpeta1\\carpeta2\\cucu.doc");
		File f2 = new File("C:\\cursojava\\tema8_GestionFicheros\\carpeta1\\carpeta2\\borrame.txt");

		// Comprobar que forman parte del sistema de ficheros local
		System.out.println(f1.exists());
		System.out.println(f2.exists());

		// Mostrar por consola sus tamaños en bytes y sus nombres originales
		System.out.println(f1.getTotalSpace() + " - " + f1.getName());
		System.out.println(f2.getTotalSpace() + " - " + f2.getName());
		
		//Comprobar si es posible la lectura		
		if(f1.canRead()) {
			System.out.println("Es posible la lectura de cucu");
		}
		
		if (f2.canRead()) {
			System.out.println("Es posible la lectura de borrame");
		}
		
		//Mostrar por consola la carpeta que contiene el fichero
		if (f1.getCanonicalFile().toString().startsWith("c")) {
			System.out.println("El directorio empieza por 'c'");
			System.out.println(f1.getCanonicalPath());
		}
		if (f2.getCanonicalFile().toString().startsWith("c")) {
			System.out.println("El directorio empieza por 'c'");
			System.out.println(f2.getCanonicalPath());
		}
		
		//Mostrar la ruta asociada a los ficheros
		System.out.println(f1.getAbsolutePath());
		System.out.println(f2.getAbsolutePath());
		
		//Borrar fichero borrame
		System.out.println("Se ha borrado el fichero borrame??? "+f2.delete());
		
		
		

	}

}
