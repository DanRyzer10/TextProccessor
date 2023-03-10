package principal;
import gui.MainGui;
import gui.WelcomeGui;
import listeners.GuardarListener;

public class Main {
    public static MainGui gui2;



    public static void main(String[] args) {
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
        gui2.getPanelTexto().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GuardarListener.actualizarTitulo(false);
            }

        });
    }

}