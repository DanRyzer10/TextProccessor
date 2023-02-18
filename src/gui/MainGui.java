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

        JPanel panel2= new JPanel();



        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.setBackground(colorC);
        JScrollPane scrollPane = new JScrollPane(panel2);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        //agregar panel de texto
        PanelTexto panelTexto = new PanelTexto();
        panel2.add(panelTexto, BorderLayout.CENTER);


        setSize(800, 600);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);





    }

}

