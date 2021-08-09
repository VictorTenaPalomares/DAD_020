package tema6_Herencia;

public class Polimorfismo {
public static void main(String[] args) {
	Polimorfismo pol=new Polimorfismo();
	
	pol.unMetodo("Cucu");
	
}

public void unMetodo(Object obj) {
	
	String s=(String) obj;
	System.out.println(s.length());
	
	//si se descomenta error porque length() es método de la clase string y no de object
	//System.out.println(obj.length());
	
}
}
