package tema10_GestionTiempo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploSimpleDateFormat2 {
	public static void main(String args[]) {
		Date ahora = new Date();
		String formato = "dd*MM*yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		System.out.println("Fecha actual: " + sdf.format(ahora));
	}
}
