package tema10_GestionTiempo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.util.Locale;

public class Ejercicio1_DateFormat {
	public static void main(String[] args) throws IOException {

		System.out.println("Hola, escribe el idioma con el quieres que trabajemos...");
		System.out.println();
		System.out.println("Puedes elegir entre: alemán, francés, italiano o castellano");

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(is);

		String idioma = bf.readLine();
		bf.close();

		DateFormatSymbols dfs;

		switch (idioma) {

		case "alemán":
			dfs = new DateFormatSymbols(Locale.GERMAN);
			break;

		case "francés":
			dfs = new DateFormatSymbols(Locale.FRENCH);
			break;

		case "italiano":
			dfs = new DateFormatSymbols(Locale.ITALIAN);
			break;

		case "castellano":
			dfs = new DateFormatSymbols(Locale.getDefault());
			break;
		default:
			dfs = null;
		}

		if (dfs != null) {

			System.out.println("Los meses en " + idioma + " son: ");
			for (String mes : dfs.getMonths()) {
				System.out.print(mes+" ");
			}

			System.out.println("Los días de la semana en " + idioma + " son:");
			for (String dia : dfs.getWeekdays()) {
				System.out.print(dia+" ");
			}
		} else {
			System.out.print("El idioma introducido no está dentro de los seleccionables");
		}
	}
}
