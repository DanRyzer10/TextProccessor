package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.PanelTexto;
import principal.Main;
import javax.swing.text.StyledDocument;
import javax.swing.text.*;
/*
    *Listener de Barra de herramientas que aplica negrita al texto seleccionado
    * @implements ActionListener
    * creado el 19 de Febrero, 2023, 18:21 hrs
    * @autor Angel Zambrano & Julio Cepeda
    * @version POO -2023
 */

public class BoldLsitener implements ActionListener {
    boolean negritaActiva = false;
    @Override
    public void actionPerformed(ActionEvent e) {
        negritaActiva = !negritaActiva;
        aplicarNegrita(negritaActiva);
    }
    /*
        *Aplica negrita al texto seleccionado
    */

    public void aplicarNegrita(boolean negritaActiva){
        final StyledDocument doc1 = PanelTexto.doc;

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
