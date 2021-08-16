package tema10_GestionTiempo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatosFechasHoras {
	public static void main(String args[]){
        FormatosFechasHoras ffh=new FormatosFechasHoras();
 
        //Crear objeto Date
        Date ahora=new Date();
 
        //Construcción de cuatro DateFormat asociados a España, Francia, 
        //Italia y Alemania
        DateFormat dfEspañol=DateFormat.getDateTimeInstance(DateFormat.LONG,
                            DateFormat.LONG,Locale.getDefault());
        DateFormat dfFrances=DateFormat.getDateTimeInstance(DateFormat.LONG,
                            DateFormat.LONG,Locale.FRANCE);
        DateFormat dfItaliano=DateFormat.getDateTimeInstance(DateFormat.LONG,
                            DateFormat.LONG,Locale.ITALY);
        DateFormat dfAleman=DateFormat.getDateTimeInstance(DateFormat.LONG,
                            DateFormat.LONG,Locale.GERMANY);
                            
        //Almacenar los DateFormat en un array
        DateFormat formatos[]={dfEspañol, dfFrances, dfItaliano, dfAleman};
        ffh.mostrarFechaHora(formatos,ahora);
    }
    public void mostrarFechaHora(DateFormat formatos[],Date ahora){
        Locale loc[]={Locale.getDefault(),Locale. FRANCE,Locale.ITALY,
                        Locale.GERMANY};
        for(int i=0;i<formatos.length;i++)
            System.out.println("Fecha-Hora (LONG) en "+
                loc[i].getDisplayCountry()+": "+formatos[i].format(ahora));
    }
}
