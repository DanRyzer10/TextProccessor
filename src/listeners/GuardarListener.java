package listeners;
import principal.Main;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static listeners.AbrirListener.archivoActual;
import metodos.Guardar;
/*
  *Listener de Menu que guarda los cambios del archivo actual
  * implementa interfaz ActionListener
  * creado el 28 de Febrero, 2023, 22:46 hrs
  * @autor Angel Zambrano & Julio Cepeda
  * @version POO -2023
 */


public class GuardarListener implements ActionListener{
    public static boolean guardado = false;
    public static File archivo = null;
    @Override
    public void actionPerformed(ActionEvent e) {
        guardar();

    }
    /*
       *guarda los cambios del archivo actual
       * si no hay ningun archivo abierto, llama al listener guardarComoListener
     */

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
    /*
       *actualiza el titulo de la ventana principal
       * si el archivo actual no tiene cambios pendientes, se le agrega (Guardado) al titulo
       * si el archivo actual tiene cambios pendientes, se le agrega un asterisco al titulo
       * @param cambiosGuardados booleano que indica si el archivo actual tiene cambios pendientes
     */
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
