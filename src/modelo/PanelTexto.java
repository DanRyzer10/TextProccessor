package modelo;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.text.StyledEditorKit;
import javax.swing.event.*;

import java.awt.*;

public class PanelTexto extends JTextPane{
    public String contenido;


    public PanelTexto() {
        super();
        this.contenido = "";
        this.setBackground(Color.WHITE);
        this.setFont(new Font("Arial", Font.PLAIN, 15));
        this.setForeground(Color.BLACK);
        this.setMargin(new Insets(10, 10, 10, 10));

        setPreferredSize(new Dimension(545, 842));
        setMaximumSize(new Dimension(545, 842));
        setMinimumSize(new Dimension(545, 842));

        //estilo documento
        StyledDocument doc = this.getStyledDocument();
        Style style = this.addStyle("mystyle", null);
        StyleConstants.setLineSpacing(style, 0.2f);
        StyleConstants.setAlignment(style, StyleConstants.ALIGN_LEFT);
        StyleConstants.setFontFamily(style, "Arial");
        StyleConstants.setFontSize(style, 12);
        StyleConstants.setLeftIndent(style, 20);
        StyleConstants.setRightIndent(style, 20);
        StyleConstants.setFirstLineIndent(style, 20);
        StyleConstants.setSpaceAbove(style, 10);
        StyleConstants.setSpaceBelow(style, 10);
        StyleConstants.setItalic(style, false);
        doc.setParagraphAttributes(0, doc.getLength(), style, true);



        //agregar marcos grises
        this.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY));

        this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contenido = getText();
            }

        });

        /*
        this.setEditorKit(new StyledEditorKit() {
            @Override
            public ViewFactory getViewFactory() {
                final StyledEditorKit.StyledViewFactory factory = new StyledViewFactory();
                return factory;
            }
        });


        this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contenido = getText();
            }
        });


         */


    }
}
