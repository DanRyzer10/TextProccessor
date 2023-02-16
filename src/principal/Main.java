package principal;
import gui.MainGui;
import gui.WelcomeGui;

public class Main {
    public static void timeWindow(){
        WelcomeGui gui = new WelcomeGui();
        //esperar cinco segundos
        try {
            Thread.sleep(5000);
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