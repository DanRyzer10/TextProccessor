package listeners;

import metodos.Copiar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopiarListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            copiar();
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }

    }

    public void copiar() throws FileNotFoundException {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Copiar archivo");
        fileChooser.setFileFilter(new Copiar());
        int seleccionUsuario = fileChooser.showOpenDialog(null);
        if (seleccionUsuario == JFileChooser.APPROVE_OPTION) {
            File archivoACopiar = fileChooser.getSelectedFile();
            JFileChooser fileChooserDestino = new JFileChooser();
            fileChooserDestino.setDialogTitle("Seleccionar destino de la copia");
            fileChooserDestino.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int seleccionUsuarioDestino = fileChooserDestino.showSaveDialog(null);
            if (seleccionUsuarioDestino == JFileChooser.APPROVE_OPTION) {
                File destino = fileChooserDestino.getSelectedFile();
                String nombreArchivoACopiar = archivoACopiar.getName();
                String rutaArchivoACopiar = archivoACopiar.getAbsolutePath();
                String rutaArchivoDestino = destino.getAbsolutePath() + File.separator + nombreArchivoACopiar;
                FileInputStream fis = new FileInputStream(rutaArchivoACopiar);
                FileOutputStream fos = new FileOutputStream(rutaArchivoDestino);
                Copiar copiar = new Copiar();
                copiar.copiarArchivo(fos, fis);
    }   }   }

}
