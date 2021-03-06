package tema3_clase_String;

/*Crear una clase pública de nombre EjercicioString3 que contenga sólo al método
 *  main y mostrar por consola el número de veces que aparecen las letras a, o y
 *   e en la String del ejercicio anterior.

Además, si el número de veces que se repite la a es superior a 5 debe aparecer 
el mensaje "Exceso de a", si el número de veces que se repite la o es superior a
 5 debe mostrarse "Exceso de o" y si se repite más de 5 veces la letra e debe 
 mostrarse "Exceso de e"*/

public class EjercicioString3 {

	public static void main(String[] args) {

		int vecesA = 0;
		int vecesO = 0;
		int vecesE = 0;

		String frase = "Esta es una frase de prueba para el ejercicio de contar letras";

		for (int i = 0; i < frase.length(); i++) {

			if ((char) frase.charAt(i) == 'a') {
				vecesA++;
				
			}

			if ((char) frase.charAt(i) == 'o') {
				vecesO++;
				
			}

			if ((char) frase.charAt(i) == 'e') {
				vecesE++;
				
			}

		}
		
		System.out.print("Veces a: " + vecesA);
		if (vecesA > 5) {
			System.out.println(" Exceso de a");
		}
		System.out.println("Veces o: " + vecesO);
		if (vecesO > 5) {
			System.out.println(" Exceso de o");
		}
		System.out.print("Veces e: " + vecesE);
		if (vecesE > 5) {
			System.out.println(" Exceso de e");
		}

	}

}
