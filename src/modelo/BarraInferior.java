package modelo;

import javax.swing.*;
import java.awt.*;

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
