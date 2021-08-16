package tema10_GestionTiempo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EjemploGregorianCalendarSanFermin {
	public static void main(String args[]) {
		// Crear un calendario actual
		GregorianCalendar gcSanFermin = new GregorianCalendar(Calendar.YEAR, Calendar.JULY, 7);
		Date fechaSanFermin = gcSanFermin.getTime();
		System.out.println(fechaSanFermin);
	}
}
