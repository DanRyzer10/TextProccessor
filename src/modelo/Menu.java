package modelo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import gui.AutorsFrame;
import listeners.GuardarListener;

public class Menu extends JMenuBar{
    public Menu() {

        super();
        JMenu archivo = new JMenu("Archivo");
        this.add(archivo);
        JMenu autores = new JMenu("Acerca de");
        this.add(autores);
        JMenuItem nuevo = new JMenuItem("Nuevo");
        archivo.add(nuevo);
        JMenuItem abrir = new JMenuItem("Abrir");
        archivo.add(abrir);
        JMenuItem guardar = new JMenuItem("Guardar");
        archivo.add(guardar);
        guardar.addActionListener(new GuardarListener());
        JMenuItem sobreescribir = new JMenuItem("Sobreescribir");
        archivo.add(sobreescribir);
        JMenuItem autors = new JMenuItem("autores");
        autors.addActionListener(evt -> new AutorsFrame());
        autores.add(autors);

        //aplicar un color
        Color colorC = new Color(255,255,255);

        this.setBackground(colorC);


    }


}
