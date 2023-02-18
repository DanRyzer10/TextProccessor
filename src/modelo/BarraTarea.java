package modelo;
import javax.swing.*;

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

        JButton botonI= new JButton();
        botonI.setIcon(new ImageIcon("src\\img\\icons\\italica.png"));
        botonI.setToolTipText("Cursiva");
        this.add(botonI);

        JButton botonS = new JButton();
        botonS.setIcon(new ImageIcon("src\\img\\icons\\subrayar.png"));
        botonS.setToolTipText("Subrayado");
        this.add(botonS);
        JButton botonC = new JButton();
        botonC.setIcon(new ImageIcon("src\\img\\icons\\textColor.png"));
        botonC.setToolTipText("Color de texto");
        this.add(botonC);
        JButton botonA = new JButton();
        botonA.setIcon(new ImageIcon("src\\img\\icons\\agrandar.png"));
        botonA.setToolTipText("Aumentar tamaño");
        this.add(botonA);
        JButton botonD = new JButton();
        botonD.setIcon(new ImageIcon("src\\img\\icons\\disminuir.png"));
        botonD.setToolTipText("Disminuir tamaño");
        this.add(botonD);



    }
}
