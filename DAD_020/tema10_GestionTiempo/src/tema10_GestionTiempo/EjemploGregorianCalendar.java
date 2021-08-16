package tema10_GestionTiempo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EjemploGregorianCalendar {
	public static void main(String args[]) {
		// Crear un calendario actual
		GregorianCalendar gc = new GregorianCalendar(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH);
		GregorianCalendar gcFuturo = new GregorianCalendar(2015, Calendar.DECEMBER, 25);
		
		System.out.println(gc);
		System.out.println(gcFuturo);
	}
}
