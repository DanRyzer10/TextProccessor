package modelo;
import javax.swing.*;

import java.awt.*;

public class PanelTexto extends JTextPane{
    public String contenido;
    public JScrollPane scrollPane;
    public JPanel panelWritter;

    public PanelTexto(){
        super();
        this.contenido = "";

        this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contenido = getText();
            }
        });
    }





}
