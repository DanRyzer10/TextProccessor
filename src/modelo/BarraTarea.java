package modelo;
import javax.swing.*;
import java.awt.*;

public class BarraTarea extends JToolBar{
    public BarraTarea(){
        super();
        this.setOrientation(JToolBar.HORIZONTAL);
        this.setFloatable(false);
        this.setVisible(true);
        //crear un oton y asignarle una imagen

        JButton botonN = new JButton();
        botonN.setIcon(new ImageIcon("src\\img\\icons\\bold.png"));
        botonN.setToolTipText("Negrita");
        this.add(botonN);
        botonN.addActionListener(new listeners.BoldLsitener());
        this.addSeparator(new Dimension(20, 20));

        JButton botonI= new JButton();
        botonI.setIcon(new ImageIcon("src\\img\\icons\\italica.png"));
        botonI.setToolTipText("Cursiva");
        this.add(botonI);
        botonI.addActionListener(new listeners.ItalicListener());
        this.addSeparator(new Dimension(20, 20));

        JButton botonS = new JButton();
        botonS.setIcon(new ImageIcon("src\\img\\icons\\subrayar.png"));
        botonS.setToolTipText("Subrayado");
        this.add(botonS);
        this.addSeparator(new Dimension(20, 20));
        JButton botonC = new JButton();
        botonC.setIcon(new ImageIcon("src\\img\\icons\\textColor.png"));
        botonC.setToolTipText("Color de texto");
        this.add(botonC);
        this.addSeparator(new Dimension(20, 20));
        JButton botonA = new JButton();
        botonA.setIcon(new ImageIcon("src\\img\\icons\\agrandar.png"));
        botonA.setToolTipText("Aumentar tamaño");

        this.add(botonA);
        this.addSeparator(new Dimension(20, 20));
        JButton botonD = new JButton();
        botonD.setIcon(new ImageIcon("src\\img\\icons\\disminuir.png"));
        botonD.setToolTipText("Disminuir tamaño");
        this.add(botonD);
        this.addSeparator(new Dimension(20, 20));
        //aplicar espacio entre botones de 20 pixeles
        this.setMargin(new java.awt.Insets(20, 20, 20, 20));
        this.setBackground(Color.WHITE);


    }
}
