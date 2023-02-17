package gui;

import modelo.PanelTexto;
import javax.swing.*;
import java.awt.*;

public class MainGui extends JFrame {
    public MainGui() {
        super("Documento sin titulo");
        Image icon = Toolkit.getDefaultToolkit().getImage("src\\img\\AncedaLogoA.png");
        setIconImage(icon);

        Color colorC = new Color(233,245,255);


        //panel de texto
        PanelTexto panelTexto = new PanelTexto();
        JScrollPane scrollPane = new JScrollPane(panelTexto);
        scrollPane.setPreferredSize(new Dimension(545, 842));
        panelTexto.setPreferredSize(new Dimension(545, 842));
        add(panelTexto, BorderLayout.CENTER);

        pack();

        setSize(800, 600);

        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);





    }

}

