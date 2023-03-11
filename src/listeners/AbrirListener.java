package listeners;

import metodos.Abrir;
import principal.Main;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
/*
    *Listener de Menu que abre el archivo buscando en la ruta que el usuario elija

    * @implements ActionListener
    * creado el 21 de Febrero, 2023, 21:34 hrs
    * @autor Angel Zambrano & Julio Cepeda
    * @version POO -2023
*/

public class AbrirListener implements ActionListener {
    public static File archivoActual=null;

    @Override
    public void actionPerformed(ActionEvent e) {
        abrir();
    }
    /*
        *Abre archivos .acd desde la ruta que el usuario elija, mediante un JFileChooser
    */

    public void abrir(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Abrir archivo");
        fileChooser.setFileFilter(new Abrir());
        int seleccion = fileChooser.showOpenDialog(null);
        if (seleccion==JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            Main.gui2.setTitle(file.getName());
            Main.gui2.getPanelTexto().setText("");
            Abrir.cargarArchivo(file, Main.gui2.getPanelTexto());
            archivoActual = file;


        }

    }

}
