package listeners;

import gui.MainGui;
import principal.Main;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static listeners.AbrirListener.archivoActual;
import metodos.Guardar;

public class GuardarListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        guardar();

    }
    public void guardar(){
        Guardar guardar = new Guardar();

        File archivo = archivoActual;
        if (archivo == null) {
            GuardarComoListener.guardarComo();

        } else {
            guardar.guardarArchivo(archivo);
            MainGui.titulo = archivo.getName();
            Main.gui2.setTitle(MainGui.titulo + " (guardado)");
        }



    }



}
