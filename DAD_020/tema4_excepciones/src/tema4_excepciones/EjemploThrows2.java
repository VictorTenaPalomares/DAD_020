package tema4_excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploThrows2 {
	public static void main(String args[]){
	    EjemploThrows2 et2=new EjemploThrows2();
	    et2.construirFlujo();
	    System.out.println("FIN DE PROGRAMA");
	  }
	  void construirFlujo(){
	    InputStreamReader isr=new InputStreamReader(System.in);
	    BufferedReader br=new BufferedReader(isr);
	    try{
	      capturarDato(br);
	    }catch(IOException e){
	      System.out.println("Error---" + e.toString());
	    }
	    System.out.println("Fin del metodo EjemploThrows2");
	  }
	  void capturarDato(BufferedReader filtro) throws IOException{
	    System.out.print("Escribe algo: ");
	    String teclado=filtro.readLine();
	    System.out.println("Lo introducido por teclado es " + teclado);
	  }
}
