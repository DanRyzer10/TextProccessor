package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.PanelTexto;
import principal.Main;
import javax.swing.text.StyledDocument;
import javax.swing.text.*;
/*
 * listener de barra de tareas que eschucha el evento de subrayado
 * @implements ActionListener
 * creado el 01 de marzo, 2023, 14:45 hrs
 * @autor Angel Zambrano & Julio Cepeda
 * @version POO -2023
 */

public class SubrayadoListener implements ActionListener{
    boolean subrayadoActivo = false;
    @Override
    public void actionPerformed(ActionEvent e) {
        subrayadoActivo = !subrayadoActivo;
        subrayado(subrayadoActivo);
    }
    /*
     * metodo que subraya el texto seleccionado
     * @param activo booleano que indica si el subrayado esta activo o no
     */
    public void subrayado(boolean activo){
        final StyledDocument doc1 = PanelTexto.doc;

        int inicio =Main.gui2.getPanelTexto().getSelectionStart();
        int fin = Main.gui2.getPanelTexto().getSelectionEnd();
        AttributeSet atributosActuales = doc1.getCharacterElement(inicio).getAttributes();
        SimpleAttributeSet nuevoAtributo = new SimpleAttributeSet();
        nuevoAtributo.addAttributes(atributosActuales);
        StyleConstants.setUnderline(nuevoAtributo, subrayadoActivo);
        doc1.setCharacterAttributes(inicio, fin - inicio, nuevoAtributo, true);
        try {
            PanelTexto.contenido = Main.gui2.getPanelTexto().getText(0, doc1.getLength());
        } catch (BadLocationException ex) {
            throw new RuntimeException(ex);
        }

    }
}
