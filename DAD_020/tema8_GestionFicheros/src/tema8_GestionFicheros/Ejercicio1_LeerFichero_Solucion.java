package tema8_GestionFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1_LeerFichero_Solucion {
public static void main(String args[]) throws IOException{
		
		//Flujo y filtro para leer datos procedentes del teclado
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Ruta del fichero a leer: ");
		String origen=br.readLine();
		
		//Flujo y filtro para leer datos del fichero
		FileReader fr1=new FileReader(origen);
		BufferedReader br1=new BufferedReader(fr1);

		String destino="c:\\resultados.txt";

		//Flujo y filtro para escribir datos en el fichero
		FileWriter fw1=new FileWriter(destino);
		BufferedWriter bw1=new BufferedWriter(fw1);

		System.out.println("Lineas leidas de "+origen);
		int lineasLeidas=0;
		int lineasEscritas=0;
		String sigLinea;
		while((sigLinea=br1.readLine())!=null){
			if(sigLinea.charAt(0)=='+'||sigLinea.charAt(0)=='-'){
				bw1.write(sigLinea);

				//Insertar salto de línea
				bw1.newLine();
				lineasEscritas++;
			}
			else{
				System.out.println(sigLinea);
				lineasLeidas++;
			}
		}

		//Cerrar filtro de lectura
		br1.close();

		//Vaciar filtro de escritura
		bw1.flush();

		//Cerrar filtro de escritura
		bw1.close();

		System.out.println("Lineas escritas en "+destino+"="+lineasEscritas);
		System.out.println("Lineas leidas de "+origen+"="+lineasLeidas);
	}

}
