package javaprop;

import javaprop.vistas.JFrameVistaPrincipal;

/**
 *
 * @author Mariana
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Controlador c = new Controlador();
                c.iniciar();  
            }
        });
    }
    
}
