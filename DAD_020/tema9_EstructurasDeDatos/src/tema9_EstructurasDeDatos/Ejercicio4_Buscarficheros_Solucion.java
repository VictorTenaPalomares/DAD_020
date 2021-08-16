package tema9_EstructurasDeDatos;

import java.io.File;
import java.util.Collections;
import java.util.Vector;

public class Ejercicio4_Buscarficheros_Solucion {
	public static void main(String[] args){
		Vector resultados=null;
		if(args.length<2){
			System.out.println("Ejecucion incorrecta. Se ejecuta asi:");
			System.out.println("java BuscaFicheros arg1,arg2");
			System.out.println("donde");
			System.out.println("arg1= ruta del directorio donde se busca (c:\\cursojava, por ejemplo) y");
			System.out.println("arg2= extension del tipo de fichero que se busca (java, por ejemplo)");
			return;
		}
		resultados=obtenerFicherosBuscados(args[0],args[1]);
		if(resultados!=null){

			//Ordenar alfabéticamente los objetos File del Vector resultados y mostrarlos
			Collections.sort(resultados);
			System.out.println("Se han encontrado "+resultados.size()+" ficheros de extension "+args[1]);
			for(int i=0;i<resultados.size();i++)
				System.out.println(resultados.elementAt(i));
		}
		else
			System.out.println("Directorio no encontrado");
	}

	private static boolean comprobarExtension(File f,String ext){
		String nombre=f.getName();
		String extCompleta="."+ext;

		/*
		 * El 2º termino es necesario por lo siguiente: supongamos que se están buscando ficheros de extensión java.
 * Si se tiene un fichero cuyo nombre contiene .java, pero de extension distinta de java, se consideraría válido.
 * Ejemplo: cucu.java.txt no es un fichero de extension java, pero aparecería si se elimina el 2º término
		 */
		boolean b=(nombre.indexOf(extCompleta)!=-1) && (nombre.indexOf(extCompleta)+extCompleta.length()==nombre.length());

		//Mucho más rápido y elegante
		//boolean b=nombre.endsWith(extCompleta);
		return b;
	}
    
	private static Vector obtenerFicherosBuscados(String dir,String ext){
		File directorio=new File(dir);
		File[] ficherosBuscados;
		Vector v=new Vector();

		//Comprobar si la cadena que se pasa como primer parámetro representa un directorio
		if(!directorio.isDirectory())
			return null;
		ficherosBuscados=directorio.listFiles();
		for(int i=0;i<ficherosBuscados.length;i++){
			if(comprobarExtension(ficherosBuscados[i],ext))
				v.add(ficherosBuscados[i].getName());
		}
		return v;
	}

}
