package metodos;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copiar extends FileFilter {
    public Abrir abrir= new Abrir();
    public Copiar(){
    }
    @Override
    public boolean accept(File f) {
        if(f.isDirectory()){
            return true;
        }
        String extension = abrir.getExtension(f);
        if (extension != null) {
            return extension.equals("acd");
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "archivos de texto ACD (*.acd)";
    }
    public void copiarArchivo(FileOutputStream fos, FileInputStream fis){
        try{
            byte[] buffer = new byte[1024];
            int leido;
            while((leido=fis.read(buffer))>0){
                fos.write(buffer,0,leido);
            }
            JOptionPane.showMessageDialog(null, "Archivo copiado con éxito");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al copiar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
