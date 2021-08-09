package tema6_Herencia;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MiVentana extends Frame implements WindowListener{
    
   public MiVentana(String titulo){ // constructor
        
        //Invocar el constructor de Frame que tiene como argumento una String
        super(titulo);
        
        //Asignar al objeto en curso, o sea a una Frame, color de fondo
        //Es equivalente a this.setBackground(Color.cyan)
        setBackground(Color.cyan);
        
        /*
         * Agregar al objeto en curso es decir, al marco, 
         * un escuchador de eventos. En este caso,
         * se emplea para el cierre de la ventana. El argumento del método 
         * tiene que ser un objeto WindowListener, es decir, una clase que
         * implemente la interface WindowListener. Como la clase en curso
         * la implementa, se emplea this.
         */
        addWindowListener(this);
    }
    
    /*
     * Se llenan de código TODOS los métodos que declara la interface 
     * implementada. Si sólo se desea gestionar el cierre de la ventana
     * se llenará de código el método windowClosing(..) con la línea
     * System.exit(0). Esto provoca el final de la ejecución de la máquina
     * virtual. Consultar este método estático de la clase System en la API.
     * El resto de métodos se llena de código vacío {}.
     */
    public void windowActivated(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowClosing(WindowEvent e){
        System.out.println("Adios");
        System.exit(0);
    }
    public void windowDeactivated(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
 
    public static void main(String args[]){
        
        //Invocar al constructor de la clase pasándole lo que está esperando
        MiVentana mv=new MiVentana("Mi primera ventana chapucera");
        
        //Situar la ventana
        mv.setLocation(100,40);
        
        //Dimensionar la ventana
        mv.setSize(550,250);
        
        //Hacer visible la ventana
        mv.setVisible(true);
    }
}