package tema3_clase_String;


/*Crear una clase pública de nombre EjercicioString2 que contenga sólo al método
 *  main y que muestre por consola el número de veces que aparece la letra "a" 
 *  en la siguiente String "Esta es una frase de prueba para el ejercicio de 
 *  contar letras"*/

public class EjercicioString2 {

	public static void main(String[] args) {

		int veces = 0;

		String frase = "Esta es una frase de prueba para el ejercicio de contar letras";

		for (int i = 0; i < frase.length(); i++) {

			if ((char) frase.charAt(i) == 'a') {
				veces++;
			}	

		}
		
		 System.out.println("El caracter 'a' aparece un total de "+veces+" veces"
		 		+ " en la frase: \n" +frase );

	}
}
