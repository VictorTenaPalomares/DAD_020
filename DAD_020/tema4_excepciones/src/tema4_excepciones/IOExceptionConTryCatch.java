package tema4_excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExceptionConTryCatch {
	public static void main(String args[]){
	    InputStreamReader isr=new InputStreamReader(System.in);
	    BufferedReader br=new BufferedReader(isr);
	    System.out.print("Teclea Hola:");
	    try{
	      String teclado=br.readLine();
	      if(teclado.equals("Hola")){
	        System.out.println("Has escrito Hola");
	      }else{
	        System.out.println("No has escrito el texto correcto. Debes escribir Hola");
	      }
	    }catch(IOException e){
	      System.out.println("Error---" + e.toString());
	    }
	  }
}
