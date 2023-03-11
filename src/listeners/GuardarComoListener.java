package listeners;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import metodos.Abrir;
import metodos.Guardar;
import principal.Main;
import static listeners.AbrirListener.archivoActual;
/*
  *Listener de Menu que guarda el archivo en la ruta que el usuario elija
  * implementa interfaz ActionListener
  * creado el 28 de Febrero, 2023, 22:46 hrs
  * @autor Angel Zambrano & Julio Cepeda
  * @version POO -2023
 */

public class GuardarComoListener implements ActionListener{
    public static boolean guardado = false;
    @Override
    public void actionPerformed(ActionEvent e) {
        guardarComo();
    }

    /*
       *Guarda el archivo en la ruta que el usuario elija, mediante un JFileChooser
     */
    public static void guardarComo() {
        Guardar guardar = new Guardar();
        File file = null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar archivo");
        fileChooser.setFileFilter(new Abrir());
        int seleccionUsuario = fileChooser.showSaveDialog(null);
        if (seleccionUsuario == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            if (!file.getName().endsWith(".acd")) {
                file = new File(file.getAbsolutePath() + ".acd");
            }
            if (file.exists()) {
                int opcion = JOptionPane.showConfirmDialog(null, "El archivo ya existe, ¿desea sobrescribirlo?", "Advertencia", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.NO_OPTION) {
                    return;
                }
            }
            guardar.guardarArchivo(file);
            Main.gui2.setTitle(file.getName());
            archivoActual = file;
            GuardarListener.actualizarTitulo(Main.gui2.getPanelTexto().cambiosPendientes);
        }

    }
}
