package tema8_GestionFicheros;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FlujoEscrituraBytes2 {
	public static void main(String args[]){
        String rutaFichero="C:\\cursojava\\tema8_GestionFicheros\\escritura.txt";
        try{
            FileOutputStream fos=new FileOutputStream(rutaFichero);
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            
            //Se escriben los caracteres Unicode del alfabeto occidental
            for(int i=0;i<256;i++)
                bos.write(i);
            bos.flush();
            bos.close();
        }catch(IOException e){
            System.out.println("Error---"+e.toString());
        }
    }
}
