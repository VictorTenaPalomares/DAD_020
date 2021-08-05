package tema2_variables;

public class Ejercicio2Sintaxis{
    static String nombre="Carlos";
    static void dimeNombre(){
        String mote="cucu";
        System.out.println("Tu nombre es "+nombre+" y tu mote es "+mote);
    }
    public int mostrarEdad(int anNacimiento){
        return 2003-anNacimiento;
    }
    public static void main(String args[]){
    	Ejercicio2Sintaxis ej=new Ejercicio2Sintaxis();
        dimeNombre();
        System.out.println(nombre+" tiene "+ej.mostrarEdad(1960)+" años");    
        System.out.println("FIN DEL PROGRAMA");
    }
}

