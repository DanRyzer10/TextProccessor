package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.PanelTexto;
import principal.Main;

import javax.swing.text.StyledDocument;
import javax.swing.text.*;


public class BoldLsitener implements ActionListener {
    boolean negritaActiva = false;
    @Override
    public void actionPerformed(ActionEvent e) {
        negritaActiva = !negritaActiva;
        aplicarNegrita(negritaActiva);
    }
    public void aplicarNegrita(boolean negritaActiva){
        final StyledDocument doc1 = PanelTexto.doc;
        Style estilo = doc1.addStyle(null, null);
        Style estiloActual = doc1.getStyle(PanelTexto.doc.getCharacterElement(
                Main.gui2.getPanelTexto().getSelectionStart()).getAttributes().getAttribute(StyleConstants.NameAttribute).toString());

        int inicio =Main.gui2.getPanelTexto().getSelectionStart();
        int fin = Main.gui2.getPanelTexto().getSelectionEnd();
        AttributeSet atributosActuales = doc1.getCharacterElement(inicio).getAttributes();
        SimpleAttributeSet nuevoAtributo = new SimpleAttributeSet();
        nuevoAtributo.addAttributes(atributosActuales);
        StyleConstants.setBold(nuevoAtributo, negritaActiva);
        doc1.setCharacterAttributes(inicio, fin - inicio, nuevoAtributo, true);
        try {
            PanelTexto.contenido = Main.gui2.getPanelTexto().getText(0, doc1.getLength());
        } catch (BadLocationException ex) {
            throw new RuntimeException(ex);
        }
    }
}
