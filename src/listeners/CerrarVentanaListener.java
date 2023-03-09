package listeners;
import principal.Main;
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import static principal.Main.gui2;
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
