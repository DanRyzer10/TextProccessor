package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;
import  javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;


import metodos.Guardar;

import javax.swing.*;

public class GuardarListener implements ActionListener{


    @Override
    public void actionPerformed(ActionEvent e) {
        guardar();
    }

    public void guardar(){
        Guardar guardar = new Guardar();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar archivo");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de texto", "acd"));
        int seleccionUsuario = fileChooser.showSaveDialog(null);
        if (seleccionUsuario == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (file != null) {
                if (!file.getName().endsWith(".acd")) {
                    file = new File(file.getAbsolutePath() + ".acd");
                }
                guardar.guardarArchivo(file);
            }
        }
    }
}
