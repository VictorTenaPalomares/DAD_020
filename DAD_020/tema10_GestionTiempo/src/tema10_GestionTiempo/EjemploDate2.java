package tema10_GestionTiempo;

import java.util.Date;

public class EjemploDate2 {
	
	public static void main(String args[]) throws Exception{
        //Crear objeto Date con el primer constructor
        Date ahora=new Date();
        System.out.println(ahora);
        // objeto Date que apunta al epoch
        ahora.setTime(0);
        System.out.println(ahora);
        
        //Milisegundos contenidos en un día
        long msgUnDia = 24*60*60*1000;
        ahora.setTime(msgUnDia);
        System.out.println(ahora);
    }
	
}
