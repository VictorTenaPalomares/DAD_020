package tema5_Arrays;

public class EjemploArray3 {
	public static void main(String mierda[]){
	    int enteros[]=new int[3];
	    String nombres[]=new String[2];
	    enteros[0]=23; enteros[2]=500;
	    nombres[0]="Pepe";
	    
	    @SuppressWarnings("removal")
		Integer array[]= {new Integer(1),new Integer(2), new Integer(3)};
	    
	    System.out.println("Num elementos de enteros: "+enteros.length);
	    System.out.print("Los elementos del array enteros son: ");
	    for(int i=0;i<enteros.length;i++)
	      System.out.print(enteros[i]+" ");
	    System.out.println("\nNum elementos de nombres "+ nombres.length);
	    System.out.print("Los elementos del array nombres son: ");
	    for(int i=0;i< nombres.length;i++)
	      System.out.print(nombres [i]+" ");
	    System.out.println("\nFIN DE PROGRAMA");
	  }
}
