package tema9_EstructurasDeDatos;

import java.util.StringTokenizer;

public class EjemploStringTokenizerHola {
	public static void main(String args[]){
        String texto = "Hola";
        StringTokenizer st = new StringTokenizer(texto);
        System.out.println("Número de tokens: " + st.countTokens());
        System.out.println(st.hasMoreTokens());
    }
	
}
