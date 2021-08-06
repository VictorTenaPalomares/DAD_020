package tema4_excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2_Excepciones_Solucion {
	public static void main(String args[])throws IOException{
		double total=0;
		double totalPositivos=0;
		double totalNegativos=0;
		boolean control;
		int numeros=0;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		do{
			try{
				System.out.print("Cuantos numeros quieres sumar? ");
				numeros=Integer.parseInt(br.readLine());
				if(numeros>=0)
					control=false;
				else{
					System.out.println("Debes introducir un numero entero mayor que cero");
					control=true;
				}
			}catch(NumberFormatException nfe){
				control=true;
				System.out.println("Debes introducir un numero");
			}
		}while(control);
		System.out.println("Teclea el primero y pulsa Enter, teclea el segundo y pulsa enter, etc");
		for(int i=1;i<=numeros;i++){
			try{
				double num=Double.parseDouble(br.readLine());
				total+=num;
				if(num>0)
					totalPositivos+=num;
				else
					totalNegativos+=num;
			}catch(NumberFormatException nfe){
				i--;
				System.out.println("Solo se admiten numeros");
			}
		}
		System.out.println("No va mas. Serie de numeros completada");
		System.out.println("Suma total= "+total);
		System.out.println("Suma de los positivos= "+totalPositivos);
		System.out.println("Suma de los negativos= "+totalNegativos);
		System.out.println("FIN DEL PROGRAMA");
	}

}
