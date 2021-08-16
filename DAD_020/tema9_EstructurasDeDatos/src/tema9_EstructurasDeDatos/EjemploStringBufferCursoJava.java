package tema9_EstructurasDeDatos;

public class EjemploStringBufferCursoJava {
	public static void main(String args[]) {
        StringBuffer sb = new StringBuffer();
        // Se emplea append(String s)
        sb.append("Curso Java");
        // Se emplea append(int i)
        sb.append(25);
        System.out.println(sb);
    }
}
