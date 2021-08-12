package tema8_GestionFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFicheroCaracterACaracterConFiltroLineaALinea {
	public static void main(String args[]){
        String rutaFichero="C:\\cursojava\\tema8_GestionFicheros\\escritura.txt";
        try{
            long ini=System.currentTimeMillis();
            
            //Lectura de un fichero de 700 KB
            FileReader fr=new FileReader(rutaFichero);
            BufferedReader br=new BufferedReader(fr);
            String siguienteLinea;
            while((siguienteLinea=br.readLine())!=null){} // La implementación más óptima es la que se hace a través del método readline()
            br.close();
            System.out.println("Tiempo ejecucion="+
                (System.currentTimeMillis()-ini)+" ms");
                
            //Se obtienen tiempos de ejecucion del orden de los 70 ms
        }catch(IOException e){
            System.out.println("Error---"+e.toString());
        }
    }
}

/*La forma óptima de leer un fichero usando flujos de caracteres es utilizar un
 *  filtro asociado a la clase BufferedReader y el método de lectura readLine() 
 *  que permite leer línea a línea. También se podría hacer con flujos de bytes.*/
 