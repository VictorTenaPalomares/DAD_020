package tema4_excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploThrows4 {
	public static void main(String args[]) {
        EjemploThrows4 et4 = new EjemploThrows4();
        et4.construirFlujo();
        System.out.println("FIN DE PROGRAMA");
    }
 
    void construirFlujo() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        capturarDato(br);
        System.out.println("Fin del metodo construirFlujo");
    }
 
    void capturarDato(BufferedReader filtro) {
        System.out.print("Escribe un número entero: ");
        try {
            String teclado = filtro.readLine();
            int num = Integer.parseInt(teclado);
            System.out.println("Número entero introducido " + teclado);
        } catch (IOException e) {
            System.out.println("Error ---" + e.toString());
        } catch (NumberFormatException nfe) {
            System.out.println("Dato incorrecto. No es un número.");
            nfe.printStackTrace();
        }
    }
}
