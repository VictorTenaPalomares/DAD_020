package tema10_GestionTiempo;

import java.util.Locale;

public class EjemploLocale1 {
	public static void main(String args[]) {
		EjemploLocale1 el1 = new EjemploLocale1();

		// Locale asociado a la máquina donde se ejecuta
		Locale loc = Locale.getDefault();
		el1.informacion(loc);
		System.out.println("****************************");

		// Locale asociado a Francia. Se usa variable de campo estática
		loc = Locale.FRANCE;
		el1.informacion(loc);
	}

	public void informacion(Locale loc) {
		System.out.println("Locale analizado: " + loc);
		System.out.println("Codigo lengua= " + loc.getLanguage());
		System.out.println("Codigo pais= " + loc.getCountry());
		System.out.println("Lengua pais (en lengua local)= " + loc.getDisplayLanguage());
		System.out.println("Nombre pais (en lengua local)= " + loc.getDisplayCountry());
		System.out.println("Codigo ISO lengua= " + loc.getISO3Language());
		System.out.println("Codigo ISO pais= " + loc.getISO3Country());
	}
}
