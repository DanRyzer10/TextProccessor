package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.PanelTexto;
import principal.Main;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
public class EditorColor implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        Color color = JColorChooser.showDialog(null, "Seleccione un color", Color.BLACK);
        if (color != null) {
            cambiarColor(color);
        }
    }
    public void cambiarColor(Color color){
        final StyledDocument doc1 = PanelTexto.doc;

        int inicio =Main.gui2.getPanelTexto().getSelectionStart();
        int fin = Main.gui2.getPanelTexto().getSelectionEnd();
        AttributeSet atributosActuales = doc1.getCharacterElement(inicio).getAttributes();
        SimpleAttributeSet nuevoAtributo = new SimpleAttributeSet();
        nuevoAtributo.addAttributes(atributosActuales);
        StyleConstants.setForeground(nuevoAtributo, color);
        doc1.setCharacterAttributes(inicio, fin - inicio, nuevoAtributo, true);
        try {
            PanelTexto.contenido = Main.gui2.getPanelTexto().getText(0, doc1.getLength());
        } catch (BadLocationException ex) {
            throw new RuntimeException(ex);
        }

    }

}
