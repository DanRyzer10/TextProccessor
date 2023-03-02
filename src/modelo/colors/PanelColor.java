package modelo.colors;

import javax.swing.*;
import java.awt.*;

public class PanelColor extends JFrame {
    public PanelColor(){
        super("Panel de colores");
        setSize(400, 300);
        setLayout(null);
        setVisible(true);
        setLayout(new GridLayout(1, 3));
        //crear un boton de color rojo
        JButton botonRojo = new JButton(" ");
        botonRojo.setBackground(Color.RED);
        botonRojo.setBounds(10, 10, 100, 100);
        add(botonRojo);
        //crear un boton de color verde
        JButton botonVerde = new JButton(" ");
        botonVerde.setBackground(Color.GREEN);
        botonVerde.setBounds(10, 10, 100, 100);
        add(botonVerde);
        //crear un boton de color azul
        JButton botonAzul = new JButton(" ");
        botonAzul.setBackground(Color.BLUE);
        botonAzul.setBounds(10, 10, 100, 100);
        add(botonAzul);

        setVisible(true);

    }
}
