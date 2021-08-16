package tema9_EstructurasDeDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio4_BuscarFicheros {
	public static void main(String[] args) throws IOException{
        /*
         * Muestra por consola los ficheros.
         * Cada uno de ellos son elementos de un List llamado 'resultados' que
         * se obtiene después de invocar al método obtenerFicehrosBuscados(...) 
         * pasándole el directorio donde se busca y la extensión de los ficheros
         * buscados.
         * Si el usuario no introduce dos parámetros durante la ejecución
         * se informará de ello y se explicará cómo debe ejecutarse.
         */
		
		System.out.println("Hola, vamos a mostrar los ficheros que ocupan un determinado directorio");
		System.out.println("");
		System.out.println("Por favor, introduce una ruta de directorio local correcta...");

		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(is);
		
		String ruta=bf.readLine();
		//String ruta="C:\\cursojava\\DAD_020\\tema9_EstructurasDeDatos\\bin\\tema9_EstructurasDeDatos";
		
		System.out.println("Perfecto. Ahora introduce la extensión que tienen los ficheros que quieres mostrar");
		String extension=bf.readLine();
		
		//System.out.println(ruta+extension);
		
		System.out.println("Los ficheros "+extension+" que hay en el directorio introducidio son: "); 
		
		List resultados=obtenerFicherosBuscados(ruta, extension);
		
		//Ordenar alfabéticamente 
		Collections.sort(resultados);
		
		for (Object fichero : resultados) {
			System.out.println(fichero);
		}
    }
 
    private static boolean comprobarExtension(File f,String ext){
        /*
         * Asegura que el objeto File del primer argumento (representará
         * a un fichero) tiene la extensión especificada en el segundo.
         */
    	
    	// Es lo mismo que decir: devuelve true si el nombre exacto del fichero acaba con la extensión...
    	return f.getName().endsWith(ext);
 
    }
    
    private static List obtenerFicherosBuscados(String dir,String ext){
        /*
         * Devuelve una Lista que contiene todos los ficheros de la extensión
         * buscada en el directorio especificado. Hace uso del método 
         * comprobarExtension(...).
         */
    	
    	//1. Creamos objeto File con la ruta recibida:
		File directorio=new File(dir);
		
		 	
    	
    	//2. Creamos la lista en la que se van a almacenar los resultados
    	List <File>  listaFicheros=new ArrayList<>();
    	
    	//3. Comprobamos que la cadena que se ha pasado como ruta sea correcta a través del método adecuado
    	if (!directorio.isDirectory()) {
			return Collections.emptyList(); // si no lo es devolvemos una lista vacía
			}
    	
    	//4. Creamos un array de Files para almacenar los ficheros buscados
    			File[] ficherosBuscados=directorio.listFiles(); // el método list files devuelve un array de files
    	   	
    	
    	//5. Recorremos el array con todos los ficheros y nos quedamos solo con los que tienen la extensión introducida
    			for (File file : ficherosBuscados) {
					if(comprobarExtension(file, ext)) {
						listaFicheros.add(file);
					}
				}
    			return listaFicheros;
		
    	
    	
    	
    	
    	
    	
    }
}
