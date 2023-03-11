package listeners;
import gui.MainGui;
import principal.Main;
import javax.swing.*;
import java.awt.event.*;
import static listeners.AbrirListener.archivoActual;

/*
  *Listener de Menu que crea un nuevo archivo
  * @implements ActionListener
  * creado el 28 de Febrero, 2023, 22:46 hrs
  * @autor Angel Zambrano & Julio Cepeda
  * @version POO -2023
 */

public class NuevoListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    /*
      *crea un nuevo archivo
      * si el archivo actual tiene cambios pendientes, se abre una ventana de confirmacion
      * si el archivo actual no tiene cambios pendientes, se crea un nuevo archivo
     */
    public void nuevo(){
        if (archivoActual !=null){
            if(Main.gui2.getPanelTexto().cambiosPendientes){
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea guardar los cambios?", "Guardar", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    GuardarListener.guardar();
                }
            }
            archivoActual = null;
        }

        Main.gui2.getPanelTexto().setText("");
        MainGui.titulo = "Documento sin titulo";
        Main.gui2.setTitle(MainGui.titulo);



    }
}
