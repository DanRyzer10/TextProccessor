package principal;
import gui.MainGui;
import gui.WelcomeGui;

public class Main {
    /*
    * Metodo para abrir la ventana de bienvenida y esperar 5 segundos
    * para cerrarla y abrir la ventana principal
    *
     */
    public static void timeWindow(){
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
        MainGui gui2 = new MainGui();

    }
    public static void main(String[] args) {
        timeWindow();
    }
}