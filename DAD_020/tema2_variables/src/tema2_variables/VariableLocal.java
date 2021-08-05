package tema2_variables;

public class VariableLocal{
    public static void main(String args[]){
        VariableLocal vl=new VariableLocal();
        /**
         * La variable entera i es local pues está declarada e inicializada
         * dentro de un bucle for. Si se usa fuera del código del for se
         * producirá un error de compilación
         */
        for(int i=0;i<=5;i++){
            System.out.println(i);
            System.out.println("Repeticion "+i);
        }
        vl.mostrarVariable();
    }
    void mostrarVariable(){
        //Línea que provoca error de compilación.
        //Acceso incorrecto a una variable local
        //System.out.println(i+1);
    }
}