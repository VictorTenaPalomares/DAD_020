package tema9_EstructurasDeDatos;

import java.util.StringTokenizer;

public class EjemploStringTokenizer1 {
	public static void main(String args[]){
        String texto="Esto es un curso de java";
        StringTokenizer st=new StringTokenizer(texto);
        System.out.println("Num tokens totales= "+st.countTokens());
        System.out.println("_______________________________");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
            System.out.println("Num tokens restantes= "+st.countTokens());
        }
        System.out.println("_______________________________");
        System.out.println("Num tokens dp de extraccion= "+st.countTokens());        
        /*
         * Si se repite el bucle, no se muestra nada, pues la StringTokenizer
         * sobre la que se aplica el método hasMoreTokens() ya no contiene 
         * tokens
         */
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
            System.out.println("Num tokens= "+st.countTokens());
        }
        System.out.println("FIN DE PROGRAMA");
    }
}
