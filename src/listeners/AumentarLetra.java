package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.PanelTexto;
import principal.Main;
import javax.swing.text.StyledDocument;
import javax.swing.text.*;
/*
    *Listener de Barra de herramientas que aumenta el tamaño de la letra del texto seleccionado
    * @implements ActionListener
    * creado el 21 de Febrero, 2023, 21:34 hrs
    * @autor Angel Zambrano & Julio Cepeda
    * @version POO -2023
 */


public class AumentarLetra implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        aumentarLetra();
    }
    /*
        *Aumenta el tamaño de la letra del texto seleccionado
    */

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
