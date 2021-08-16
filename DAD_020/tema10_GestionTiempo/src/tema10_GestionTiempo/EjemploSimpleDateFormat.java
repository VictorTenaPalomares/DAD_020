package tema10_GestionTiempo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploSimpleDateFormat {
	public static void main(String args[]){
 
        Date ahora=new Date();
        
        /*
         * Los caracteres que no son de formato se escriben 
         * entre comillas simples.
         */
        String formato="dd 'de' MMMMMMMMMM 'de' yyyy, EEEEEEEEE HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        System.out.println("Fecha actual: " + sdf.format(ahora));
    }
}
