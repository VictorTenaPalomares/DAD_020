package tema9_EstructurasDeDatos;

public class Ejercicio1_StringBuffer_Solución {
	public static void main(String args[]){

		//Crear la StringBuffer y mostrarla por consola
		String s="Hola caracola";
		StringBuffer sb =new StringBuffer(s);
		System.out.println("La StringBuffer es: "+sb);

		//Mostrar capacidad y número de caracteres
		System.out.println("Capacidad="+sb.capacity());
		System.out.println("Longitud="+sb.length());

		//Sustituir el primer carácter por B y mostrar la SB modificada
		sb.setCharAt(0,'B');
		System.out.println(sb);

		//Agregar a la SB un entero y una String
		sb.append(5000);
		sb.append("cucu");
		System.out.println(sb);

		//Insertar la String bonita
		sb.insert(9,"bonita");
		System.out.println(sb);

		//Eliminar los tres primeros caracteres
		sb.delete(0,3);
		System.out.println(sb);

		//Almacenar en una String los últimos cuatro caracteres y mostrarla por consola
		String ultimosCarac=sb.substring(sb.length()-4,sb.length());
		System.out.println(ultimosCarac);

		//Mostrar capacidad y número de caracteres de la SB resultante
		System.out.println("Capacidad final="+sb.capacity());
		System.out.println("Longitud final="+sb.length());

		//Crear array de StringBuffer
		StringBuffer arraySB[]={new StringBuffer("Jesus"),new StringBuffer("Fernandez"),new StringBuffer("Ortega")};
		for(int i=0;i<arraySB.length;i++)
			System.out.print(arraySB[i]+" ");

	}

}
