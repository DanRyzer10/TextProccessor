package listeners;
import modelo.PanelTexto;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyledDocument;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
    *Listener de Menu que quita todo el formato al texto seleccionado
    * @implements ActionListener
    * creado el 2 de marzo, 2023, 19:49 hrs
    * @autor Angel Zambrano & Julio Cepeda
    * @version POO -2023
 */

public class QuitarFormatoListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        quitarFormato();
    }
    /*
        *Quita todo el formato al texto seleccionado
     */
    public void quitarFormato(){
        final StyledDocument doc = PanelTexto.doc;
        doc.setCharacterAttributes(0, doc.getLength(), new SimpleAttributeSet(), true);
    }


}
