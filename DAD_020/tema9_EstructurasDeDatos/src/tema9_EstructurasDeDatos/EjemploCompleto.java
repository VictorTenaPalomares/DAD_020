package tema9_EstructurasDeDatos;

public class EjemploCompleto {
	public static void main(String args[]){
        StringBuffer sb=new StringBuffer();
        //Por consola aparecerá una línea vacía
        System.out.println(sb);
        System.out.println("Capacidad inicial= "+sb.capacity());
        System.out.println("Longitud inicial= "+sb.length());
        sb.append("cucu");
        System.out.println(sb);
        System.out.println("Capacidad final= "+sb.capacity());
        System.out.println("Longitud final= "+sb.length());
        /*El método "Class getClass()" pertenece a la clase Object
         *y, por tanto, puede aplicarse a cualquier objeto que herede de
         *Object. El método "String getName()" devuelve el nombre de la
         *clase a la que pertenece el objeto sb.
         */
        System.out.println(sb.getClass().getName());
        sb.deleteCharAt(011);
        System.out.println(sb);
    }
}
