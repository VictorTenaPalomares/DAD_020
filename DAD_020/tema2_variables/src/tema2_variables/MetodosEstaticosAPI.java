package tema2_variables;

public class MetodosEstaticosAPI{
    public static void main(String args[]){
        int num=100;
        System.out.println("La raiz cuadrada de "+num+" es "+Math.sqrt(num));
        
        //Bloque try ... catch. Se estudiará más adelante. A nivel de 
        //ejecución no afecta.
        //Se introduce un retardo en la ejecución del código de 3 sg
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){}
        System.out.println("La potencia de 2 elevado a 8 es "+Math.pow(2,8));
    }
}
