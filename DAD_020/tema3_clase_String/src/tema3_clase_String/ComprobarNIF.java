package tema3_clase_String;

public class ComprobarNIF {
public static void main(String[] args) {
	String nif="16156159B";
	ComprobarNIF cn=new ComprobarNIF();
	boolean nifValido=cn.comprobar(nif);
	cn.mostrarMensaje(nif,nifValido);
	System.out.println("FIN DE PROGRAMA");
}

/*
 * Método que comprueba si un nif es válido o no. Condiciones que debo comprobar:
 * Longitud cadena = 9
 * Último carácter debe ser letra; el resto dígitos
 * @param nif El nif a comprobar
 * @return true si nif válido
 */
public boolean comprobar(String nif){

	// Variable que controla la validez del nif
	boolean esNifValido=true;
	
	// Longitud del nif
	int longitud=nif.length();
	
	// true si el último carácter es dígito; false en caso contrario
	boolean esUltimoCaracterDigito=Character.isDigit(nif.charAt(longitud-1));
	
	// Si la longitud de la cadena es distinta de nueve o el último carácter es un dígito
	// el nif no es correcto. Por tanto salgo del met devolviendo false
	if(longitud!=9 || esUltimoCaracterDigito)
		esNifValido = false;
	else{
		for(int i=0;i<longitud-1;i++)
			if(Character.isLetter(nif.charAt(i)))
				esNifValido = false;
	}
	return esNifValido;
}

/*
 * Muestra la parte numérica del nif y un mensaje indicando si es válido
 * @param nif El nif
 * @param nifValido Si es true, el nif es válido
 */
public void mostrarMensaje(String nif,boolean nifValido){
	if(nifValido){
		System.out.println(nif+" es un NIF valido");
		String numerosNIF=nif.substring(0,nif.length()-1);
		System.out.println("Parte numerica del NIF= "+numerosNIF);
	}
	else
		System.out.println(nif+" no es un NIF valido");
}
}		
