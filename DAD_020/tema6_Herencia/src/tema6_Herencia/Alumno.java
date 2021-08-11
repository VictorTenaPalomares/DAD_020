package tema6_Herencia;

public class Alumno {

	private String nombre;
	private String apellidos;
	private int edad;

	public Alumno(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void mostrarNosotros() {
		System.out.println(
				"Me llamo " + this.getNombre() + " " + this.getApellidos() + " y tengo " + this.getEdad() + " años");
	}

}

class UsoAlumno {
	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("Víctor", "Tena Palomares", 37);
		Alumno alumno2 = new Alumno("Enzo", "Tena Masip", 7);
		Alumno alumno3 = new Alumno("Corinne", "Masip Escudero", 36);
		
		alumno1.mostrarNosotros();
		alumno2.mostrarNosotros();
		alumno3.mostrarNosotros();
	}
}
