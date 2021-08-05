package tema4_excepciones;

public class ExcepcionConTryCatch {
	public static void main(String args[]){
	    int x=10;
	    try{
	      for(int i=5;i>-6;i--) {
	        System.out.println(x/i);
	      }
	    }catch(ArithmeticException ae){
	      System.out.println("Error, division por cero " + ae.getMessage());
	    }finally{
	      System.out.println("Estoy en el finally");
	    }
	    System.out.println("FIN DE PROGRAMA");
	  }
}
