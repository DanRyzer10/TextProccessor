package metodos;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;

import javax.swing.text.rtf.*;
import principal.Main;
public class Guardar {
    public Document doc;
    public Guardar(){
        this.doc = Main.gui2.getPanelTexto().getDocument();
    }
    public void guardarArchivo(File file){
        try {
            OutputStream salida = new FileOutputStream(file);
            RTFEditorKit kit = new RTFEditorKit();
            kit.write(salida,this.doc,0,doc.getLength());
            salida.close();
            JOptionPane.showMessageDialog(null, "archivo guardado con exito");
        }catch(IOException | BadLocationException e){
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo");
        }
    }


}
