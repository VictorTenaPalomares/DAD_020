package tema8_GestionFicheros;

import java.io.File;

public class Ejercicio3_Creacion_Edicion_Borrado_Solucion {

	public static void main(String args[]){
		String rutaFichero1="C:\\carpeta1\\carpeta2\\cucu.doc";
		String rutaFichero2="C:\\carpeta1\\carpeta2\\borrame.txt";
		File f1=new File(rutaFichero1);
		File f2=new File(rutaFichero2);
		if(f1.exists() && f2.exists()){
			System.out.println("Tama"+(char)164+"o del fichero "+f1.getName()+"="+f1.length()+" bytes");
			System.out.println("Tama"+(char)164+"o del fichero "+f2.getName()+"="+f2.length()+" bytes");
			if(f1.canRead())
				System.out.println("Fichero leible");
			else
				System.out.println("Fichero no leible");
			if(f1.canWrite())
				System.out.println("Fichero escribible");
			else
				System.out.println("Fichero no escribible");

			System.out.println("Directorio padre: "+f1.getParent());
			File aux=new File(f1.getParent());
			if(aux.getName().charAt(0)=='c')
				System.out.println("El directorio padre empieza por c");
			System.out.println("Ruta: "+f1.getPath());
			if(f2.delete())
				System.out.println("Fichero \"borrame.txt\" borrado");
			else
				System.out.println("Fichero \"borrame.text\" no borrado");
		}
		else
			System.out.println("Algun fichero no se ha creado");
	}

}
