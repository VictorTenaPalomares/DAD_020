package tema2_variables;

public class EjemploReturn{
	 
	
	
	public static void main(String args[]){
	    
	    unMetodo(10);
	    System.out.println("FIN DE PROGRAMA");
	  }  
	  
	  
	  
	  
	  
	  static void unMetodo(int num){
	    System.out.println("Primera linea de unMetodo");
	    if(num==10){
	      System.out.println("Has introducido 10"); //Implica que se sale del método 
	      return;
	    }
	    System.out.println("Fin de linea de unMetodo");
	  }
	}
