package tema8_GestionFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FlujoLecturaCaracteres1 {
	public static void main(String args[]){
        String rutaFichero="C:\\cursojava\\tema8_GestionFicheros";
        try{
            FileReader fr=new FileReader(rutaFichero);
            BufferedReader br=new BufferedReader(fr);
            String siguienteLinea;
            System.out.println("Lineas que componen el fichero:");
            while((siguienteLinea=br.readLine())!=null)
                System.out.println(siguienteLinea);
            br.close();
        }catch(IOException e){
            System.out.println("Error---"+e.toString());
        }
    }
}
