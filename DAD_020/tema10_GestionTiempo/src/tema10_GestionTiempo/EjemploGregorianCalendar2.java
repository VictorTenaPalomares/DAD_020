package tema10_GestionTiempo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EjemploGregorianCalendar2 {
	public static void main(String args[]) {
		// Crear un calendario actual
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(Calendar.YEAR, 2005);
		gc.set(Calendar.MONTH, 5);
		gc.set(Calendar.DAY_OF_MONTH, 25);
		
		//Es equivalente a GregorianCalendar gc=new GregorianCalendar(2002,5,18);
	}
}
