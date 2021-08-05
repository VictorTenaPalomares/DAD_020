package tema2_variables;

public class SerHumanoBis{
    String nombre;
    String colorOjos;
    int edad;
    /*
     * Declaración e inicialización de una variable de instancia estática
     * Tiene sentido declararla estática pues todos los objetos
     * de la clase, teniendo en cuenta que ésta modela a un ser humano,
     * habitan en el mismo planeta
     */
    static String planeta="Tierra";
    void mostrarCaracteristicas(){
        System.out.println(nombre+" tiene "+edad+" años");
        System.out.println("Sus ojos son "+colorOjos);
        System.out.println("Su planeta es la "+planeta);
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
        SerHumanoBis shb1=new SerHumanoBis();
        shb1.nombre="Jesus";
        shb1.colorOjos="azules";
        shb1.edad=28;
        shb1.mostrarCaracteristicas();
        shb1.eresMayorEdad();
        
        System.out.println("---------------------");
        SerHumanoBis shb2=new SerHumanoBis();
        shb2.nombre="Rebeca";
        shb2.colorOjos="verdes";
        shb2.edad=27;
        shb2.mostrarCaracteristicas();
        shb2.eresMayorEdad();
        System.out.println("---------------------");
        System.out.println("FIN DEL PROGRAMA");
    }
}
