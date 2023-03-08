package listeners;
import modelo.PanelTexto;
import principal.Main;
import javax.swing.text.StyledDocument;
import javax.swing.text.*;

public class FuentesListener{

    public static void cambiarFuente(String fuente){
        final StyledDocument doc1 = PanelTexto.doc;
        int inicio =Main.gui2.getPanelTexto().getSelectionStart();
        int fin = Main.gui2.getPanelTexto().getSelectionEnd();
        AttributeSet atributosActuales = doc1.getCharacterElement(inicio).getAttributes();
        SimpleAttributeSet nuevoAtributo = new SimpleAttributeSet();
        nuevoAtributo.addAttributes(atributosActuales);
        StyleConstants.setFontFamily(nuevoAtributo, fuente);
        doc1.setCharacterAttributes(inicio, fin - inicio, nuevoAtributo, true);
        try {
            PanelTexto.contenido = Main.gui2.getPanelTexto().getText(0, doc1.getLength());
        } catch (BadLocationException ex) {
            throw new RuntimeException(ex);
        }

    }
}
