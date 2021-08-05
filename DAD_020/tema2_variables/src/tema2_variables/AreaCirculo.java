package tema2_variables;

public class AreaCirculo{
    /**
     * Declaración e inicialización de la variable de instancia estática 
     * valorPi mediante la variable de campo estática PI de la clase 
     * java.lang.Math de la API. Como PI no se encuentra en la clase 
     * AreaCirculo, debe anteponerse el nombre de la clase en la que se 
     * encuentra definida, es decir, Math.
     */
    static double valorPi=Math.PI;
    double radio=10.3;
    
    
    
    
    
    public static void main(String args[]){
        AreaCirculo ac=new AreaCirculo();
        /**
         * A radio se accede mediante un objeto de la clase ya que no es 
         * estática, a valorPi directamente ya que es estática y está en la 
         * clase desde la que se accede
         */
        double area=valorPi*ac.radio*ac.radio;
        System.out.println("Area circulo de radio "+ac.radio+"= "+area);
    }
}
