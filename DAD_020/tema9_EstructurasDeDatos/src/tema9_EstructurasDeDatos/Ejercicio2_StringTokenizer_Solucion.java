package tema9_EstructurasDeDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ejercicio2_StringTokenizer_Solucion {
	public static void main(String args[]) throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Introduce una frase con varias palabras: ");
		String frase=br.readLine();
		StringTokenizer st=new StringTokenizer(frase);
		StringBuffer[] arraySB=new StringBuffer[st.countTokens()];
		int i=0;
		String token;
		System.out.println("Numero de palabras= "+st.countTokens());
		while(st.hasMoreTokens()){
			token=st.nextToken();
			System.out.println(token);
			arraySB[i]=new StringBuffer(token);
			arraySB[i].reverse();
			i++;
		}
		System.out.println("Elementos del array:");
		for(int j=0;j<arraySB.length;j++)
			System.out.println(arraySB[j]+"\t"+arraySB[j].getClass().getName());
	}

}
