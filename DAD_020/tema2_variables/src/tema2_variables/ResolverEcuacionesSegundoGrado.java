package tema2_variables;

public class ResolverEcuacionesSegundoGrado {
	 
    double a=1.5;
    double b=3.5;
    double c=1.5;
    double discriminante=Math.pow(b, 2)-4*a*c;
    double s1, s2;
    public static void main(String args[]){
        /* El método main se encargará de crear un objeto de la clase 
         * y llamar al método resolucion()
         */
    	ResolverEcuacionesSegundoGrado resg=  new ResolverEcuacionesSegundoGrado();
    	resg.resolucion();
    }
    void resolucion(){
        /* Este método se encargará de mostrar por consola las soluciones
         * de la ecuación y de llamar al método calculitos() cuando la 
         * ecuación tenga dos soluciones reales. Si la ecuación tiene una
         * sola solución real o soluciones complejas se mostrará un mensaje 
         * por consola indicándolo no se llamará al método calculitos()
         */
    	
    }
    void calculitos(double num1, double num2){
        double solMayor;
        double solMenor;
        /* Este método, mediante métodos estáticos de la clase Math, 
         * inicializará las variables locales solMenor y solMayor en base
         * a los argumentos num1 y num2.
         * Luego mostrará por consola:
         * 1) La solución mayor.
         * 2) La exponencial elevada a la solución mayor
         * 3) El coseno de la solución menor
         * 4) Las soluciones redondeadas hasta cuatro decimales
         * 5) El arcoseno de la solución mayor en radianes
         * 6) El arcoseno de la solución mayor en grados sexagesimales
         */
    }
}
