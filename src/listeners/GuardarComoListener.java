package listeners;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import gui.MainGui;
import metodos.Abrir;
import metodos.Guardar;
import principal.Main;
import static listeners.AbrirListener.archivoActual;

public class GuardarComoListener implements ActionListener{
    public static boolean guardado = false;
    @Override
    public void actionPerformed(ActionEvent e) {
        guardarComo();
    }

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
            GuardarListener.actualizarTitulo(true);
        }

    }
}
