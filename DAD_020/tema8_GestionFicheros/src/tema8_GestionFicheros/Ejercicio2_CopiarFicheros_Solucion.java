package tema8_GestionFicheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2_CopiarFicheros_Solucion {

	public static void main(String args[]) throws IOException{

		//Flujo y filtro para leer datos procedentes del teclado
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Ruta del fichero a copiar: ");
		String origen=br.readLine();
		System.out.print("Ruta del fichero copia del anterior: ");
		String destino=br.readLine();

		//Flujo y filtro de bytes para leer datos del fichero origen
		FileInputStream fis=new FileInputStream(origen);
		BufferedInputStream bis=new BufferedInputStream(fis);

		//Flujo y filtro de bytes para escribir datos en el fichero destino
		FileOutputStream fos=new FileOutputStream(destino);
		BufferedOutputStream bos=new BufferedOutputStream(fos);

		int siguienteByte;
		while((siguienteByte=bis.read())!=-1){
			bos.write(siguienteByte);
			//System.out.print(siguienteByte);
		}
		bis.close();
		bos.flush();
		bos.close();
	}


}
