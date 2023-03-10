package modelo;
import listeners.FuentesListener;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;
/*
    *barra de herramientas que contiene los botones de negrita, cursiva, subrayado, color de texto y fuentes
    * @extends JToolBar
    * creado el 21 de Febrero, 2023, 18:34 hrs
    * @autor Angel Zambrano & Julio Cepeda
    * @version POO -2023
 */

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
        botonS.addActionListener(new listeners.SubrayadoListener());
        this.add(botonS);
        this.addSeparator(new Dimension(20, 20));
        JButton botonC = new JButton();
        botonC.setIcon(new ImageIcon("src\\img\\icons\\textColor.png"));
        botonC.setToolTipText("ultimo color usado");

        this.add(botonC);

        JButton botonF = new JButton();
        botonF.setIcon(new ImageIcon("src\\img\\icons\\arrow.png"));
        botonF.setToolTipText("paleta de colores");
        botonF.addActionListener(new listeners.EditorColor());
        this.add(botonF);
        this.addSeparator(new Dimension(20, 20));
        JButton botonA = new JButton();
        botonA.setIcon(new ImageIcon("src\\img\\icons\\agrandar.png"));
        botonA.setToolTipText("Aumentar tama??o");
        botonA.addActionListener(new listeners.AumentarLetra());

        this.add(botonA);
        this.addSeparator(new Dimension(20, 20));
        JButton botonD = new JButton();
        botonD.setIcon(new ImageIcon("src\\img\\icons\\disminuir.png"));
        botonD.setToolTipText("Disminuir tama??o");
        botonD.addActionListener(new listeners.DisminuirLetra());
        this.add(botonD);
        this.addSeparator(new Dimension(20, 20));

        //boton de fuentes
        JComboBox<String> combobox;
        String[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        combobox = new JComboBox<>(fuentes);
        JButton botonFuentes = new JButton("seleccionar fuente");
        botonFuentes.addActionListener(e -> {
            int resultado = JOptionPane.showConfirmDialog(null, combobox, "Seleccione una fuente", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (resultado ==JOptionPane.OK_OPTION){
                String fuente = Objects.requireNonNull(combobox.getSelectedItem()).toString();
                FuentesListener.cambiarFuente(fuente);
            }
        });
        botonFuentes.setToolTipText("seleccionar fuente");
        this.add(botonFuentes);
        this.addSeparator(new Dimension(20, 20));
        //aplicar espacio entre botones de 20 pixeles
        this.setMargin(new java.awt.Insets(20, 20, 20, 20));
        this.setBackground(Color.WHITE);
        this.addSeparator(new Dimension(20, 20));

        JButton botonG = new JButton();
        botonG.setIcon(new ImageIcon("src\\img\\icons\\quitar-texto.png"));
        botonG.setToolTipText("Quitar todo el formato");
        botonG.addActionListener(new listeners.QuitarFormatoListener());
        this.add(botonG);




    }
}
