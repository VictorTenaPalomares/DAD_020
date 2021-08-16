package tema10_GestionTiempo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class EjemploSimpleDateFormat3 {
	public static void main(String args[]) {
		EjemploSimpleDateFormat3 esdf = new EjemploSimpleDateFormat3();

		Date ahora = new Date();

		// Definir formato
		String formato = "dd 'de' MMMMMMMMMM 'de' yyyy, EEEEEEEEE HH:mm:ss";

		// Construcción de cuatro SimpleDateFormat asociados a España,
		// Francia, Italia y Alemania
		SimpleDateFormat sdfEspañol = new SimpleDateFormat(formato, Locale.getDefault());
		SimpleDateFormat sdfFrances = new SimpleDateFormat(formato, Locale.FRANCE);
		SimpleDateFormat sdfItaliano = new SimpleDateFormat(formato, Locale.ITALY);
		SimpleDateFormat sdfAleman = new SimpleDateFormat(formato, Locale.GERMANY);

		// Almacenar los SimpleDateFormat en un array
		SimpleDateFormat formatos[] = { sdfEspañol, sdfFrances, sdfItaliano, sdfAleman };
		esdf.mostrarFechaHora(formatos, ahora);
	}

	public void mostrarFechaHora(SimpleDateFormat formatos[], Date ahora) {
		Locale loc[] = { Locale.getDefault(), Locale.FRANCE, Locale.ITALY, Locale.GERMANY };
		for (int i = 0; i < formatos.length; i++)
			System.out.println("Fecha-Hora en " + loc[i].getDisplayCountry() + ": " + formatos[i].format(ahora));
	}
}
