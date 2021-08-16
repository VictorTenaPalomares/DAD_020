package tema9_EstructurasDeDatos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


public class Ejercicio3_Vector {

	@SuppressWarnings({ "unlikely-arg-type", "removal" })
	public static void main(String[] args) {

		Vector<Comparable> v = new Vector<Comparable>();
		v.add("Jupiter");
		v.add("Marte");
		v.add("Mercurio");
		v.add("Neptuno");
		v.add("Plutón");
		v.add("Saturno");
		v.add("Tierra");
		v.add("Urano");
		v.add("Venus");

		System.out.println(v.capacity());
		System.out.println(v.size());

		if (v.contains("Saturno")) {
			System.out.println("El vector contiene a Saturno");
			System.out.println("La posición que ocupa Saturno es la " + v.indexOf("Saturno") + "ª");
		}

		System.out.println("El pimer elemento del vector es: " + v.get(0));
		System.out.println("El último elemento del vector es: " + v.get(v.size() - 1));

		StringBuffer sb = new StringBuffer("Madrid");

		v.add(6, sb);
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.add(new Integer(37));

		System.out.println("Los últimos elementos agregados al vector son: " + v.get(6) +", "+ v.get(v.size() - 1));
		
		for (int i = 0; i < v.size(); i++) { // así es como se itera sobre una lista
			System.out.println(v.elementAt(i));
			
		}
		
		
		v.removeAllElements();// A tomar por culo
		
		System.out.println("Después de eliminar sus elementos:");
		System.out.println(v.capacity());
		System.out.println(v.size());
		

	}

}
