package tema6_Herencia;

public interface Poligono2S {
	public static final double CONSTANTE= Math.PI;
    double calcularArea();
}
 class Cuadrado implements Poligono2S{
    double x1,y1,x2,y2;
    Cuadrado(double x1, double y1, double x2, double y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    public double calcularArea(){
        return Math.abs((x2-x1)*(y2-y1));
    }
    public static void main(String args[]){
        Cuadrado cua=new Cuadrado(1,2,3,4);
        System.out.println("Area="+cua.calcularArea());
        System.out.println("FIN DE PROGRAMA");
    }
}