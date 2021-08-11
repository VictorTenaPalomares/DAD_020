package tema5_Arrays;

public class Ejercicio3_RellenarCodigo {

	String frutas[] = new String[5];

	void inicializarArray() {

		frutas[0] = "pera";
		frutas[1] = "limón";
		frutas[2] = "melocotón";
		frutas[3] = "nectarina";
		frutas[4] = "uva";
		int[] frutasCaracteres = new int[5];

		for (int i = 0; i < frutas.length; i++) {
			frutasCaracteres[i] = frutas[i].length();
		}

		mostrarArrayInicial(frutasCaracteres);

	}

	void mostrarArrayInicial(int frutasCaracteres[]) {

		System.out.println("Los elementos del array son :");
		for (int i = 0; i < frutasCaracteres.length; i++) {
			System.out.print(" " + frutas[i] + ", ");
		}

		int producto = 1;
		System.out.print("\n El resultado del producto de los caracteres de cada fruta es = ");
		for (int i = 0; i < frutasCaracteres.length; i++) {
			producto *= frutasCaracteres[i];
		}
		System.out.println(producto);

	}

	String[] crearNuevoArray() {

		String[] frutillasNuevo = new String[5];

		for (int i = 0; i < frutillasNuevo.length; i++) {
			if (frutas[i].length() > 6) {
				frutas[i] = "melón";
			}
			frutillasNuevo[i] = frutas[i];
		}
		return frutillasNuevo;
	}

	void mostrarNuevoArray(String frutasNuevo[]) {
		System.out.println("Los elementos del array nuevo son: ");
		for (int i = 0; i < frutasNuevo.length; i++) {
			System.out.print(" " + frutasNuevo[i] + ", ");
		}
	}

	public static void main(String[] args) {
		Ejercicio3_RellenarCodigo e3 = new Ejercicio3_RellenarCodigo();

		e3.inicializarArray();
		e3.mostrarNuevoArray(e3.crearNuevoArray());
		System.out.println("\n FIN DEL PROGRAMA");

	}

}
