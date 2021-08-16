package tema9_EstructurasDeDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ejercicio2_StringTokenizer {

	public static void main(String[] args) {

		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader entradaBf = new BufferedReader(entrada);

		System.out.println("Hola querido user, por favor, introduce una frase con varias palabras");

		try {
			
			//1. Solicitar frase
			String fraseUser = entradaBf.readLine();
			entradaBf.close();
			StringTokenizer tokenizer = new StringTokenizer(fraseUser);
			
			//2. Mostrar el número de palabras que tiene la frase introducida
			System.out.println("La frase que has introducido tiene un total de "+tokenizer.countTokens());
			System.out.println("Te las separo por lineas: ");
			
			StringBuffer[] stringBuffer=new StringBuffer[tokenizer.countTokens()];
			int i=0;
			
			//3. Separar por líneas
			while (tokenizer.hasMoreTokens()) {
				System.out.println(tokenizer.nextToken());
				
				stringBuffer[i]=new StringBuffer(tokenizer.nextToken());
				stringBuffer[i].reverse();
				i++;
				
			}

			//4. Almacenar en un array las palabras de la frase
			
			
			
			
//			System.out.println("Elementos del array:");
//			
//			for (int j = 0; i < stringBuffer.length; i++) {
//				System.out.println(stringBuffer[i]+"\t"+stringBuffer[i].getClass().getName());
//			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			System.out.println("Has introducido texto no vállido");
			e.printStackTrace();
		}
		
		
		

	}

}
