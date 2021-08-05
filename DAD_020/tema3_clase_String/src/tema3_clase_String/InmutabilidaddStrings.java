package tema3_clase_String;

class InmutabilidadStrings{
    public static void main(String args[]){
	//String a la que apunta la variable referenciada s.
	String s="Jesus";
		
	//Al aplicarle el método concat(..), se crea otra String, 
	//que contiene Jesus Fernandez, sin modificar la original. 
	//Ocurre, que la nueva String está desreferenciada, es decir,
	//no hay ninguna variable que apunte a la misma.
	s.concat(" Fernandez");
		
	//Por consola: Jesus
	System.out.println(s);
		
	/* 
	 * La clase StringBuffer se estudiará más adelante. Basta saber que 
	 * se emplea para almacenar cadenas de texto que cambian con mucha
	 * frecuencia. Se introduce para comprobar que sólo las Strings
	 * son inmutables, no el resto de objetos.
	 */
		 
	//StringBuffer a la que apunta la variable referenciada sb.
	StringBuffer sb=new StringBuffer("Jesus");
	
	//Al aplicarle el método append(..), NO se crea otra,
	//sino que se modifica la original agregándole " Fernandez"
	sb.append(" Fernandez");
		
	//Por consola: Jesus Fernandez
	System.out.println(sb);
	
	/* Si se trabaja con variables primitivas */
	int x=10;
	x++;
		
	//Por consola: 11
	System.out.println(x);
    }
}
