package tema9_EstructurasDeDatos;

public class EjemploStringBuffer {
	public static void main(String args[]){
        StringBuffer sb=new StringBuffer("Hola");
        /* no se crea una nueva StringBuffer, sino que se modifica
         * la que se ve afectada por el método reverse. No se necesita
         * almacenar el tipo de retorno de método en otra variable.
         */
        sb.reverse();
        System.out.println("La StringBuffer con los caracteres invertidos es: " +sb);
    }
}
