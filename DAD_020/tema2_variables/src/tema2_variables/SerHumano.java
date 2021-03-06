package tema2_variables;

public class SerHumano{
    //Declaración de tres variables de instancia
    String nombre;
    String colorOjos;
    int edad;
    void mostrarCaracteristicas(){
        System.out.println(nombre+" tiene "+edad+" años");
        System.out.println("Sus ojos son "+colorOjos);
    }
    void eresMayorEdad(){
        if(edad>=18){
            System.out.println(nombre+" es mayor de edad");
            System.out.println("Tiene "+edad+" años");
        }
        else{
            System.out.println(nombre+" es menor de edad");
            System.out.println("Tiene "+edad+" años");
        }
    }
    public static void main(String args[]){
        /*Instanciar un objeto de la clase y asignar valor a sus variables
        de instancia*/
        SerHumano sh1=new SerHumano();
        /*
         * Las variables de instancia se inicializan mediante un objeto de
         * la clase. Sus valores constituyen el estado del objeto.
         * Si sólo se crea un objeto, resulta más cómodo inicializarlas
         * en la misma línea donde fueron declaradas:
         * String nombre="Jesus";
         * String colorOjos="azules";
         * int edad=28;
         */
        sh1.nombre="Jesus";
        sh1.colorOjos="azules";
        sh1.edad=28;
        sh1.mostrarCaracteristicas();
        sh1.eresMayorEdad();
        System.out.println("---------------------");
        //Otro objeto de la clase y asignación de otros valores
        SerHumano sh2=new SerHumano();
        sh2.nombre="Rebeca";
        sh2.colorOjos="verdes";
        sh2.edad=27;
        sh2.mostrarCaracteristicas();
        sh2.eresMayorEdad();
        System.out.println("---------------------");
        System.out.println("FIN DEL PROGRAMA");
    }
}
