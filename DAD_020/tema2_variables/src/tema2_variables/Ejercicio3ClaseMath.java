package tema2_variables;

public class Ejercicio3ClaseMath {
    public static void main (String args[]){
        System.out.println(Math.ceil(10.8));// Redondea al alza
        System.out.println(Math.ceil(1.8956478));
        System.out.println(Math.ceil(-5.96));
        System.out.println(Math.ceil(-0.9));
        
        System.out.println(Math.floor(10.8));// Redondea a la baja
        System.out.println(Math.floor(1.8956478));
        System.out.println(Math.floor(-5.96));
        System.out.println(Math.floor(-0.9));
        
        System.out.println(Math.rint(10.2));// Redondea al entero más cercano al decimal 
        System.out.println(Math.rint(10.8));
        System.out.println(Math.rint(10.51));
        
        System.out.println(Math.round(10.2));
        System.out.println(Math.round(10.8));
        
        System.out.println(Math.rint(3.891));
        System.out.println(Math.rint(3.891*100)/100);
    }
}
