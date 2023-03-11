package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.PanelTexto;
import principal.Main;
import javax.swing.text.StyledDocument;
import javax.swing.text.*;
/*
    *Listener de Menu que aplica el estilo italica al texto seleccionado
    * implementa interfaz ActionListener
    * creado el 28 de Febrero, 2023, 22:46 hrs
    * @autor Angel Zambrano & Julio Cepeda
    * @version POO -2023
*/

public class ItalicListener implements ActionListener {
    boolean italicaActiva = false;

    @Override
    public void actionPerformed(ActionEvent e) {
        italicaActiva = !italicaActiva;
        applyItalic(italicaActiva);

    }
    /*
        *aplica el estilo italica al texto seleccionado
        * @param italicaActiva booleano que indica si el estilo italica esta activo
     */
    public void applyItalic(boolean italicaActiva) {
        final StyledDocument doc = PanelTexto.doc;
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
