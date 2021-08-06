package tema5_Arrays;

public class EjemploArray1 {
	public static void main(String args[]){
	    //Declaración, construcción e inicialización de un array de int
	    int enteros[]={5,8};
	   
	    //Declaración y construcción de otro array de int
	    int enterosBis[]=new int[3];
	    //Inicialización de enterosBis
	    enterosBis[0]=1;
	    enterosBis[1]=10;
	    enterosBis[2]=100;
	   
	    //Declaración, construcción e inicialización de un array de Integer
	    Integer integer[]={new Integer(5),new Integer(8)};
	    //Declaración, construcción e inicialización de un array de String
	    String nombres[]={"Jesus","Pepe"};
	   
	    //Obtener el número de elementos de cada array
	    System.out.println("Numero de elementos de cada array:");
	    System.out.println("De enteros: "+enteros.length);
	    System.out.println("De enterosBis: "+enterosBis.length);
	    System.out.println("De integer: "+integer.length);
	    System.out.println("De nombres: "+nombres.length);
	   
	    //Mostrar por consola los elementos de cada array
	    System.out.print("Elementos de enteros: ");
	    for(int i=0;i<enteros.length;i++)
	      System.out.print(enteros[i]+" ");
	   
	    System.out.print("\nElementos de enterosBis: ");
	    for(int i=0;i<enterosBis.length;i++)
	      System.out.print(enterosBis[i]+" ");
	    System.out.print("\nElementos de integer: ");
	    for(int i=0;i<integer.length;i++) System.out.print(integer[i]+" ");
	      System.out.print("\nElementos de nombres: ");
	    for(int i=0;i<nombres.length;i++)
	      System.out.print(nombres[i]+" ");
	  }
}
