package listeners;
import gui.MainGui;
import metodos.Abrir;
import principal.Main;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
public class AbrirListener implements ActionListener {
    public static File archivoActual=null;

    @Override
    public void actionPerformed(ActionEvent e) {
        abrir();
    }
    public void abrir(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Abrir archivo");
        fileChooser.setFileFilter(new Abrir());
        int seleccion = fileChooser.showOpenDialog(null);
        if (seleccion==JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            Abrir.cargarArchivo(file, Main.gui2.getPanelTexto());
            MainGui.titulo = file.getName();
            Main.gui2.setTitle(MainGui.titulo);
            archivoActual = file;
        }

    }
}
