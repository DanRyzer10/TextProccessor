package listeners;
import modelo.PanelTexto;

import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyledDocument;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuitarFormatoListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        quitarFormato();
    }
    public void quitarFormato(){
        final StyledDocument doc = PanelTexto.doc;
        doc.setCharacterAttributes(0, doc.getLength(), new SimpleAttributeSet(), true);
    }


}
