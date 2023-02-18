package gui;

import modelo.PanelTexto;
import javax.swing.*;
import java.awt.*;
import modelo.Menu;
import modelo.BarraTarea;

public class MainGui extends JFrame {
    public MainGui() {
        super("Documento sin titulo");
        Image icon = Toolkit.getDefaultToolkit().getImage("src\\img\\AncedaLogoA.png");
        setIconImage(icon);

        Color colorC = new Color(233,245,255);
        //agregar menu
        Menu menu = new Menu();
        setJMenuBar(menu);
        BarraTarea barra = new BarraTarea();
        getContentPane().add(barra, BorderLayout.PAGE_START);

        setSize(800, 600);

        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);





    }

}

