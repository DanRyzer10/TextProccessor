package modelo;
import javax.swing.*;

import java.awt.*;

public class PanelTexto extends JTextPane{
    public String contenido;


    public PanelTexto(){
        super();
        this.contenido = "";
        this.setBackground(Color.WHITE);
        this.setFont(new Font("Arial", Font.PLAIN, 12));
        this.setMargin(new Insets(10,10,10,10));
        setPreferredSize(new Dimension(545, 842));
        setMaximumSize(new Dimension(545, 842));
        setMinimumSize(new Dimension(545, 842));


        this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contenido = getText();
            }
        });
    }





}
