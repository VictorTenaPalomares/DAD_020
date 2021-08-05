package tema3_clase_String;

/*Crear una clase pública de nombre EjercicioString1 que contenga sólo al método main y partiendo de la String "En mi próxima vida, creere en la reencarnación" declarada e inicializada como variable de tipo String, mostrar por consola lo siguiente:

Su longitud
El carácter asociado al índice 7
La subcadena "creere"
El índice que ocupa el carácter 'x'
La String transformada en mayúsculas
Por último, comprobar si el primer carácter de la String es 'E' y mostrar por consola un mensaje que lo indique.*/

public class EjercicioString1 {
public static void main(String[] args) {
	
	String frase="En mi próxima vida, creeré en la reencarnación"; 
	
	System.out.println(frase.length());
	System.out.println(frase.charAt(7));
	System.out.println(frase.substring(20,26));
	System.out.println(frase.indexOf('x'));
	System.out.println(frase.toUpperCase());

	if (frase.startsWith("E")) {
		System.out.println("El primer caracter de la frase es una 'E'");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
