package tema6_Herencia;

class Animal1{
    void comer(){
        System.out.println("Comiendo comida generica un animal generico");
    }
}
 
class Vaca1 extends Animal1{
    //Redefinición del método comer() en la subclase Vaca
    void comer(){
        System.out.println("Metodo comer() redefinido en la clase Vaca.");
        System.out.println("Comiendo hierba una vaca generica");
    }
    void vaquear(){
        System.out.println("Vaqueando");
    }
}
 
class Toro1 extends Animal1{
    //Redefinición del método comer() en la subclase Toro
    void comer(){
        System.out.println("Metodo comer() redefinido en la clase Toro.");
        System.out.println("Comiendo hierba un toro generico");
    }
    void torear(){
        System.out.println("Toreando");
    }
}
 
class EjemploAnimales1{
    public static void main(String args[]){
        Animal1 ani=new Animal1();
        ani.comer();
        Vaca1 vac=new Vaca1();
        vac.comer();
        vac.vaquear();
        Toro1 tor=new Toro1();
        tor.comer();
        tor.torear();
        
        //Polimorfismo:posibilidad de inicializar una variable referenciada 
        //de la superclase mediante un objeto de una subclase
        //Mediante dicha variable "polimórfica",se puede acceder a todos los
        //métodos redefinidos en la subclase. NO A LOS PROPIOS DE LA CLASE.
        Animal1 aniVaca=new Vaca1();
        aniVaca.comer();
        Animal1 aniToro=new Toro1();
        aniToro.comer();
        
        //Error al compilar si se descomentan
        //aniVaca.vaquear();
        //aniToro.torear();
        System.out.println("FIN DE PROGRAMA");
    }
}
