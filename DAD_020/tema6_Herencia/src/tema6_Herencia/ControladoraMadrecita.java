package tema6_Herencia;

public class ControladoraMadrecita {
	public static void main(String args[]){
		Hijita hij=new Hijita();
		hij.muestraNombreHijita();
		hij.saludo();
		System.out.println("FIN DE PROGRAMA");
	    }
}

 class Madrecita{
    String nombre="Rebeca";
    void saludo(){
	System.out.println("Estas en la clase Madrecita y me llamo "+nombre);
    }
}
 
class Hijita extends Madrecita{	
    //Variable de instancia de nombre coincidente con el de su superclase. 
    String nombre="Susana";
    //Método de nombre coincidente con el de su superclase
    void saludo(){
	System.out.println("Estoy en la clase Hijita y me llamo "+nombre);
    }
    void muestraNombreHijita(){
	System.out.println("Nombre hijita= "+nombre);
	//Se muestra la variable de la superclase
	System.out.println("Nombre madrecita= "+super.nombre);
	saludo();
	//Se invoca el método de la superclase
	super.saludo();
    }
}
