package tema9_EstructurasDeDatos;

import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;

public class EjemploStringTokenizer2 {
	public static void main(String args[]){
        String texto="Esto es un*curso de*Java";
        StringTokenizer st=new StringTokenizer(texto,"*");
        System.out.println("Num tokens totales= "+st.countTokens());
        System.out.println("_______________________________");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
            System.out.println("Num tokens restantes= "+st.countTokens());
            
            
            
            
        }
    }
	
}
