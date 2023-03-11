package modelo;

import javax.swing.*;
import java.awt.*;
/*
    *barra inferior que muestra la pagina actual y el numero de paginas
    * @extends JToolBar
    * creado el 23 de Febrero, 2023, 19 hrs
    * @autor Angel Zambrano & Julio Cepeda
    * @version POO -2023
 */

public class BarraInferior extends JToolBar {
   public BarraInferior(){
       super();
       this.setOrientation(JToolBar.HORIZONTAL);
       this.setFloatable(false);
       this.setVisible(true);
       //colocar abajo de la ventana
       JLabel label = new JLabel("pagina " + PanelTexto.contador + " de " + PanelTexto.paginas);
       this.add(label);
       //color
         this.setBackground(new Color(255,255,255));


   }
}
