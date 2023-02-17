package modelo;
import javax.swing.*;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class PanelTexto extends JTextPane{
    public String contenido;
    public JScrollPane scrollPane;
    public JPanel panelWritter;

    public PanelTexto(){
        super();
        this.contenido = "";
        this.panelWritter = new JPanel(new BorderLayout());
        this.scrollPane = new JScrollPane(this.panelWritter);
        this.scrollPane.setPreferredSize(new Dimension(545, 842));
        this.panelWritter.setPreferredSize(new Dimension(545, 842));
        this.panelWritter.setMaximumSize(new Dimension(545, 842));
        this.panelWritter.setMinimumSize(new Dimension(545, 842));
        this.add(this.scrollPane, BorderLayout.CENTER);


        //lo que escriba en el panel de texto se guarda en la variable contenido
        this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contenido = getText();
            }
        });
    }





}
