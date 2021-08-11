package tema5_Arrays;


	public class Ejercicio3_RellenarCodigoSolucion{
		String frutas[]=new String[5];
		void inicializarArray(){
			frutas[0]="pera";
			frutas[1]="limon";
			frutas[2]="melocoton";
			frutas[3]="nectarina";
			frutas[4]="uva";
			int frutillasCaracteres[]=new int[frutas.length];
			for(int i=0;i<frutillasCaracteres.length;i++)
				frutillasCaracteres[i]=frutas[i].length();
			mostrarArrayInicial(frutillasCaracteres);
		}
		void mostrarArrayInicial(int frutasCaracteres[]){
			System.out.print("Elementos del primer array fruticola: [");
			for(int i=0;i<frutas.length;i++){
				if(i!=frutas.length-1)
					System.out.print(frutas[i]+", ");
				else
					System.out.print(frutas[i]+"]");
			}
			System.out.println();
			int producto=1;
			for(int i=0;i<frutasCaracteres.length;i++)
				producto*=frutasCaracteres[i];
			System.out.println("Producto del numero de caracteres= "+producto);
		}
		String[] crearNuevoArray(){
			String frutillasNuevo[]=frutas;
			for(int i=0;i<frutillasNuevo.length;i++){
				if(frutillasNuevo[i].length()>6)
					frutillasNuevo[i]="melon";
			}
			return frutillasNuevo;
		}
		void mostrarNuevoArray(String frutasNuevo[]){
			System.out.print("Elementos del nuevo array fruticola: [");
			for(int i=0;i<frutasNuevo.length;i++){
				if(i!=frutasNuevo.length-1)
					System.out.print(frutasNuevo[i]+", ");
				else
					System.out.print(frutasNuevo[i]+"]");
			}
		}
		public static void main(String args[]){
			Ejercicio3_RellenarCodigoSolucion af=new Ejercicio3_RellenarCodigoSolucion();
			af.inicializarArray();
			String frutasNuevo[]=af.crearNuevoArray();
			af.mostrarNuevoArray(frutasNuevo);
			System.out.println("\nFIN DEL PROGRAMA");
		}
	}


