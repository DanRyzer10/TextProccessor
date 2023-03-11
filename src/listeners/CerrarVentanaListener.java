package listeners;
import principal.Main;
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import static principal.Main.gui2;
/*
    *Listener de la ventana que pregunta al usuario si desea guardar el archivo antes de salir
    * @implements WindowListener
    * creado el 21 de Febrero, 2023, 21:34 hrs
    * @autor Angel Zambrano & Julio Cepeda
    * @version POO -2023
 */
public class CerrarVentanaListener implements WindowListener {
    @Override
    public void windowClosing(WindowEvent e) {
        if(gui2.getTitle().equals("Documento sin titulo")|| !gui2.getTitle().contains(String.valueOf('('))){
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea guardar el archivo antes de salir?");
            if (respuesta == JOptionPane.YES_OPTION) {
                GuardarListener.guardar();
            }else if (respuesta == JOptionPane.NO_OPTION) {
                Main.gui2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        }else {
            gui2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }


    }
    @Override
    public void windowOpened(WindowEvent e) {}
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e){}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}

}
