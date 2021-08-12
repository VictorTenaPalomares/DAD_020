package tema8_GestionFicheros;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FlujoEscrituraBytes1 {
	public static void main(String args[]){
        String rutaFichero="C:\\cursojava\\tema8_GestionFicheros\\escrituraByte.txt";
        try{
            FileOutputStream fos=new FileOutputStream(rutaFichero, true);
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            bos.write(72);
            
            //Vaciar el filtro
            bos.flush();
            
            //Cerrar el filtro
            bos.close();
        }catch(IOException e){
            System.out.println("Error---"+e.toString());
        }
    }
}
