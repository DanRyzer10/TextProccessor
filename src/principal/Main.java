package principal;
import gui.MainGui;
import gui.WelcomeGui;
import modelo.PanelTexto;

import javax.swing.*;

public class Main {
    public static MainGui gui2;
    /*
    * Metodo para abrir la ventana de bienvenida y esperar 5 segundos
    * para cerrarla y abrir la ventana principal
    *
     */
    public static JFrame timeWindow(){
        WelcomeGui gui = new WelcomeGui();
        //esperar cinco segundos
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //cerrar ventana
        gui.dispose();
        //abrir ventana principal
        gui2 = new MainGui();
        //imprimir la variable contenido de la clase PanelTexto cada 10 segundos
        //para ver si se esta guardando el texto
        while(true){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(gui2.getPanelTextoContent());
        }




    }
    public static void main(String[] args) {
        timeWindow();
        //imprimir la variable contenido de la clase PanelTexto cada 10 segundos
        //para ver si se esta guardando el texto



    }
}