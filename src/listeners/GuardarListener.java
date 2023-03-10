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
        if (archivoActual == null) {
            GuardarComoListener.guardarComo();

        } else {
            guardar.guardarArchivo(archivoActual);
            Main.gui2.setTitle(archivoActual.getName());
            actualizarTitulo(Main.gui2.getPanelTexto().cambiosPendientes);


        }



    }
    public static void actualizarTitulo(boolean cambiosGuardados){
        if(archivoActual!=null){
            if(cambiosGuardados){

                Main.gui2.setTitle(archivoActual.getName() + " (Guardado)");
            }else{

                Main.gui2.setTitle(archivoActual.getName() + "*");
            }
        }
    }



}
