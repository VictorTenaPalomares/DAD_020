package tema2_variables;

class Hucha{
    static int numHuchas=0;
    double ahorros=0.0;
    public static void main(String args[]){
            Hucha hucha1=new Hucha();
            contarHuchas();
            hucha1.ahorros=2500;
            hucha1.modificarAhorros();
            Hucha hucha2=new Hucha();
            contarHuchas();
            hucha2.ahorros=5000;
            hucha2.modificarAhorros();
            System.out.println("Numero de huchas="+numHuchas);
        }
        //La funcionalidad del método varía en función de si es invocado
        //por el objeto hucha1 o por hucha2.
        //No tendría sentido considerarlo estático.
        public void modificarAhorros(){
            if(ahorros>4000){
                ahorros=ahorros-0.1*ahorros;
            }
               System.out.println("Ahorros="+ahorros);
        }
        //La funcionalidad del método es la misma,
        //independientemente del objeto empleado para invocarlo.
        //Sí tiene sentido declararlo estático.
        public static void contarHuchas(){
            numHuchas++;
        }
}