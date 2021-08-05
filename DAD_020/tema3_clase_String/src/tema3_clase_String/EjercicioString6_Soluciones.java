package tema3_clase_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioString6_Soluciones {
public static void main(String[] args) throws IOException {
	//Generar un número aleatorio perteneciente a [0, 100]
			int numero=(int)(Math.random()*100);
			int num;
			int intentos=0;

			//Crear flujo y filtro que permite capturar datos introducidos por teclado
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);

			System.out.println("---------------------------------------");
			System.out.println("Adivina un numero entero entre 0 y 100");
			System.out.println("---------------------------------------");

			String teclado;
			do{
				intentos++;
				System.out.println("Introduce un numero o pulsa * para salir");
				teclado=br.readLine();
				if(teclado.equals("*")){
					System.out.println("Has pulsado *. ADIOS");
					break;
				}
				else{
					num=Integer.parseInt(teclado);
					if(num>=0 && num<=100){
						if (num>numero)
							System.out.println("El numero buscado es menor");
						else if(num<numero)
							System.out.println("El numero buscado es mayor");
						else
							System.out.println("HAS ACERTADO!! despues de "+
							intentos+" intentos");
					}
					else
						System.out.println("Fuera de rango.Intentalo de nuevo");
				}
			}while(num!=numero);
			System.out.println("FIN DE PROGRAMA");

}
}
