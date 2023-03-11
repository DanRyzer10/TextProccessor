package modelo;
import javax.swing.*;
/*
    *clase que contiene el dialogo de acerca de
    * @extends JDialog
    * creado el 29 de Febrero, 2023, 22:56 hrs
    * @autor Angel Zambrano & Julio Cepeda
    * @version POO -2023
 */

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
