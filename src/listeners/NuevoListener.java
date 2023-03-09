package listeners;

import gui.MainGui;
import principal.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


import static listeners.AbrirListener.archivoActual;

public class NuevoListener implements ActionListener {

    public File file;
    public NuevoListener(){
        this.file = archivoActual;
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public void nuevo(){
        if (this.file !=null){
            //cerrar el archivo
            this.file = null;
        }
        //crear un nuevo archivo
        Main.gui2.getPanelTexto().setText("");
        MainGui.titulo = "Documento sin titulo";
        Main.gui2.setTitle(MainGui.titulo);


    }
}
