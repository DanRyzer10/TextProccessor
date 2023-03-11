package metodos;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.text.rtf.*;
import principal.Main;
/*
    *Clase que guarda el archivo en la ruta que el usuario elija
    * @extends FileFilter
    * creado el 28 de Febrero, 2023, 21:34 hrs
    * @autor Angel Zambrano & Julio Cepeda
    * @version POO -2023
 */
public class Guardar {
    public Document doc;
    public Guardar(){
        this.doc = Main.gui2.getPanelTexto().getDocument();
    }
    /*
        *Guarda el archivo
        * @param file archivo que se va a guardar
     */
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
