package tema10_GestionTiempo;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/*devuelve un objeto Date generado en base a la cadena de texto que se le pasa 
 * al argumento. Si esa cadena no concuerda con el formato del DateFormat sobre
 *  el que se aplica, se lanza una ParseException. Esta excepción es de gestión 
 *  obligatoria, así que hay que considerarla en un bloque try … catch o con la 
 *  cláusula throws.*/
public class EjemploDate5 {
	public static void main(String args[]) throws Exception {
		DateFormat df = DateFormat.getInstance();
		/*
		 * Si las cadenas de texto no se adaptan al formato del DateFormat se lanza una
		 * ParseException.
		 */
		String fecha1 = "22/03/80 13:55";
		String fecha2 = "22/03/80 13:54";
		try {
			Date d1 = df.parse(fecha1);
			Date d2 = df.parse(fecha2);
			System.out.println(d1.getTime() - d2.getTime());
		} catch (ParseException e) {
			System.out.println("Dato de fecha incorrecto");
		}

	}
}
