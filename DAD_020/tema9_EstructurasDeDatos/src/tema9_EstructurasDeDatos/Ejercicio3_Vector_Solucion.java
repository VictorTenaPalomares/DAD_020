package tema9_EstructurasDeDatos;

import java.util.Vector;

public class Ejercicio3_Vector_Solucion {
	public static void main(String args[]){

		//Crear el Vector y agregar Strings
		Vector v=new Vector();
		v.addElement("Jupiter");
		v.addElement("Marte");
		v.addElement("Mercurio");
		v.addElement("Neptuno");
		v.addElement("Pluton");
		v.addElement("Saturno");
		v.addElement("Tierra");
		v.addElement("Urano");
		v.addElement("Venus");

		//Mostrar capacidad y num elementos
		System.out.println("Capacidad= "+v.capacity());
		System.out.println("Num elem= "+v.size()+"\n");

		//Comprobar si Saturno pertenece al Vector
		if(v.contains("Saturno")){
			System.out.println("\nEl vector contiene a Saturno");
			System.out.println("Posicion de Saturno= "+v.indexOf("Saturno"));
		}

		//Mostrar primer y último elemento
		System.out.println("\nPrimer elemento= "+v.firstElement());
		System.out.println("Ultimo elemento= "+v.lastElement()+"\n");

		//Insertar dp de Tierra la StringBuffer Logroño
		System.out.println("Agregando Logro"+(char)164+"o");
		String s="Logro"+(char)164+"o";
		StringBuffer sb=new StringBuffer(s);
		v.insertElementAt(sb,v.indexOf("Tierra")+1);

		//Mostrar nueva capacidad y num elem
		System.out.println("Nueva capacidad= "+v.capacity());
		System.out.println("Nuevo num elem= "+v.size()+"\n");

		//Agregar objeto Integer edad
		System.out.println("Agregando objeto Integer 28");
		Integer edad=new Integer(28);
		v.addElement(edad);

		//Mostrar elem del Vector
		System.out.println("Elementos del vector:");
		System.out.println("**********************************************");
		for(int i=0; i<v.size();i++)
			System.out.print(v.elementAt(i)+" ");
		System.out.println();
		System.out.println("**********************************************");

		//Eliminar todos los elem del Vector
		System.out.println("\nAhora me los cargo");
		v.removeAllElements();

		//Mostrar nueva capacidad y num elem
		System.out.println("Capacidad final= "+v.capacity());
		System.out.println("Num final elem= "+v.size());
	}

}
