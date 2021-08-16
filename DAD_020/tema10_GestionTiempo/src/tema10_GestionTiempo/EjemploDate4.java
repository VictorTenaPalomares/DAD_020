package tema10_GestionTiempo;

import java.text.DateFormat;
import java.util.Date;
/*devuelve una String que encapsula la información temporal con el formato 
 * deseado. Es el método que debe aplicarse sobre el DateFormat que almacena el
 *  formato para obtener la información temporal formateada. MUY USADO.*/
public class EjemploDate4 {
	public static void main(String args[]) throws Exception{
        //Crear objeto Date con el primer constructor
        Date ahora=new Date();
        DateFormat df = DateFormat.getInstance();
        
        //Fecha formateada en castellano estilo short.
        String fechaFormateada = df.format(ahora);
        System.out.println(fechaFormateada);
    }
}
