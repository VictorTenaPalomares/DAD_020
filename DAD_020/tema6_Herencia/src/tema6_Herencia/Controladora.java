package tema6_Herencia;

 class MiCompañero {

	String nombre = "Charly";
	String tefCasa = "941202225";
	String tefMovil = "609253540";
	double factorial = 1;

	void muestrTelefonos() {
		System.out.println("Nombre= " + nombre);
		System.out.println("Teléfono de casa= " + tefCasa);
		System.out.println("Teléfono móvil= " + tefMovil);
	}

	double calculaFactorial(int numero) {
		for (int i = 1; i <= numero; i++) {
			factorial *= i;
		}
		return factorial;
	}

}

class Calculo extends MiCompañero {

	int edad = 2;
	int tefCasaUltimo = Integer.parseInt(tefCasa.substring(tefCasa.length() - 1));

	void calculito(double fact) {

		if (fact/edad<15) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		
	}
}

public class Controladora{
	public static void main(String[] args) {
		
		MiCompañero compañero=new MiCompañero();
		Calculo calculo=new Calculo();
			
		compañero.muestrTelefonos();
		System.out.println("El factorial de la última cifra del teléfono es: " + 
		compañero.calculaFactorial(calculo.tefCasaUltimo));
		calculo.calculito(calculo.tefCasaUltimo);
		System.out.println("FIN");
	}
}
