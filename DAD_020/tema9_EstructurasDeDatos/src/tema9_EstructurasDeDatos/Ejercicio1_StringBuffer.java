package tema9_EstructurasDeDatos;

public class Ejercicio1_StringBuffer {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Hola, bienvenido");

		System.out.println(sb);
		System.out.println("La capacidad actual es de: " + sb.capacity());
		System.out.println("La longitud actual es de: " + sb.length());

		sb.replace(0, 1, "B");
		System.out.println(sb);

		int numero = 5000;
		String palabra = "cursoJava";

		System.out.println(sb.append(numero).append(palabra));
		System.out.println(sb.insert(10, "--"));
		System.out.println(sb.delete(0, 3));
		String finall = sb.substring(25, 28);
		System.out.println(finall);

		System.out.println("La capacidad final es de: " + sb.capacity());
		System.out.println("La longitud final es de: " + sb.length());

		Object[] array = new Object[3];
		StringBuffer nombre = new StringBuffer("Víctor");
		StringBuffer apellido1 = new StringBuffer("Tena");
		StringBuffer apellido2 = new StringBuffer("Palomares");

		array[0] = nombre;
		array[1] = apellido1;
		array[2] = apellido2;

		for (Object object : array) {
			System.out.print(object.toString() + " ");
		}

	}

}
