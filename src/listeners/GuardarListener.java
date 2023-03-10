package listeners;

import gui.MainGui;
import principal.Main;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static listeners.AbrirListener.archivoActual;
import metodos.Guardar;


public class GuardarListener implements ActionListener{
    public static boolean guardado = false;
    public static File archivo = null;
    @Override
    public void actionPerformed(ActionEvent e) {
        guardar();

    }

    public static void guardar(){
        Guardar guardar = new Guardar();
        archivo = archivoActual;
        if (archivo == null) {
            GuardarComoListener.guardarComo();

        } else {
            guardar.guardarArchivo(archivo);
            Main.gui2.setTitle(archivo.getName());
            actualizarTitulo(Main.gui2.getPanelTexto().cambiosPendientes);

        }



    }
    public static void actualizarTitulo(boolean cambiosGuardados){
        if(archivo!=null){
            if(cambiosGuardados){
                MainGui.titulo = archivo.getName();
                Main.gui2.setTitle(MainGui.titulo + " (Guardado)");
            }else{
                MainGui.titulo = archivo.getName();
                Main.gui2.setTitle(MainGui.titulo + "*");
            }
        }
    }



}
