package tema10_GestionTiempo;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio2_FormatosNumericos {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Hola, introduce una cantidad en pesetas");
		
		Scanner entrada=new Scanner(System.in);		
		double pesetas=entrada.nextDouble();
		entrada.close();
		
		double euros=pesetas/166.386;	
		
		System.out.println("Las pesetas que has introducido hacen un total de "+euros+" €");
		
		System.out.println("Si redondeamos y aplicamos formato nos quedan: "+NumberFormat.getInstance().format(euros));
		
		

		
		
	}

}
