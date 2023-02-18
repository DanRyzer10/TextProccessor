package modelo;
import javax.swing.*;

public class DlgAutor extends JDialog{
    public DlgAutor(){
        super();
        this.setTitle("Acerca de");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setVisible(true);

    }
}
