package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.PanelTexto;
import principal.Main;
import javax.swing.text.StyledDocument;
import javax.swing.text.*;
public class ItalicListener implements ActionListener {
    boolean italicaActiva = false;

    @Override
    public void actionPerformed(ActionEvent e) {
        italicaActiva = !italicaActiva;
        applyItalic(italicaActiva);

    }
    public void applyItalic(boolean italicaActiva) {
        final StyledDocument doc = PanelTexto.doc;
        Style estilo= doc.addStyle(null,null);
        Style estiloActual = doc.getStyle(PanelTexto.doc.getCharacterElement(
                Main.gui2.getPanelTexto().getSelectionStart()).getAttributes().getAttribute(StyleConstants.NameAttribute).toString());
        int inicio =Main.gui2.getPanelTexto().getSelectionStart();
        int fin = Main.gui2.getPanelTexto().getSelectionEnd();
        AttributeSet atributosActuales = doc.getCharacterElement(inicio).getAttributes();
        SimpleAttributeSet nuevoAtributo = new SimpleAttributeSet();
        nuevoAtributo.addAttributes(atributosActuales);
        StyleConstants.setItalic(nuevoAtributo, italicaActiva);
        doc.setCharacterAttributes(inicio, fin - inicio, nuevoAtributo, true);
        try {
            PanelTexto.contenido = Main.gui2.getPanelTexto().getText(0, doc.getLength());
        } catch (BadLocationException ex) {
            throw new RuntimeException(ex);
        }
    }
}
