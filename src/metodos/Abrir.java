package metodos;
import modelo.PanelTexto;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.*;
import javax.swing.text.rtf.RTFEditorKit;
public class Abrir extends FileFilter {
    @Override
    public boolean accept(File f) {
        if(f.isDirectory()){
            return true;
        }
        String extension = getExtension(f);
        if (extension != null) {
            return extension.equals("acd");
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "archivos de texto ACD (*.acd)";
    }
    protected String getExtension(File f){
        String extension = null;
        String filename = f.getName();
        int index = filename.lastIndexOf('.');
        if (index >0 && index< filename.length()-1){
            extension = filename.substring(index+1).toLowerCase();
        }
        return extension;
    }
    public static void cargarArchivo(File archivo, JTextPane panel){
        try {
            RTFEditorKit kit = new RTFEditorKit();
            StyledDocument doc = PanelTexto.doc;
            kit.read(new FileInputStream(archivo), doc, 0);
            panel.setStyledDocument(doc);
        } catch (IOException | BadLocationException e) {
            e.printStackTrace();
        }


    }
}
