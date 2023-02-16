package gui;

import javax.swing.*;

public class MainGui extends JFrame {
    public MainGui() {
        super("Documento sin titulo");
        setSize(800, 600);
        //hacer que el tamaño de la ventana ocupe toda la pantalla pero que se pueda hacer mas pequeña
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

}

