package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.PanelTexto;
import principal.Main;

import javax.swing.text.StyledDocument;
import javax.swing.text.*;
import java.awt.Font;

public class AumentarLetra implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        aumentarLetra();
    }

    public void aumentarLetra(){

        final StyledDocument doc = PanelTexto.doc;
        int tamanoLetra = StyleConstants.getFontSize(doc.getCharacterElement(0).getAttributes());
        int inicio =Main.gui2.getPanelTexto().getSelectionStart();
        int fin = Main.gui2.getPanelTexto().getSelectionEnd();
        AttributeSet atributosActuales = doc.getCharacterElement(inicio).getAttributes();
        SimpleAttributeSet nuevoAtributo = new SimpleAttributeSet();
        nuevoAtributo.addAttributes(atributosActuales);
        StyleConstants.setFontSize(nuevoAtributo, tamanoLetra + 1);
        doc.setCharacterAttributes(inicio, fin - inicio, nuevoAtributo, true);
        try {
            PanelTexto.contenido = Main.gui2.getPanelTexto().getText(0, doc.getLength());
        } catch (BadLocationException ex) {
            throw new RuntimeException(ex);
        }
    }

}
