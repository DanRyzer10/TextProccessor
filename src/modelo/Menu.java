package modelo;
import java.awt.*;
import javax.swing.*;
import gui.AutorsFrame;
import listeners.*;


public class Menu extends JMenuBar{
    public Menu() {

        super();
        JMenu archivo = new JMenu("Archivo");
        this.add(archivo);
        JMenu autores = new JMenu("Acerca de");
        this.add(autores);
        JMenuItem nuevo = new JMenuItem("Nuevo");
        archivo.add(nuevo);
        nuevo.addActionListener(evt -> new NuevoListener().nuevo());

        JMenuItem abrir = new JMenuItem("Abrir");
        archivo.add(abrir);
        abrir.addActionListener(new AbrirListener());
        JMenuItem guardarComo = new JMenuItem("Guardar como...");
        archivo.add(guardarComo);
        guardarComo.addActionListener(new GuardarComoListener());
        JMenuItem guardar = new JMenuItem("Guardar");
        archivo.add(guardar);
        JMenuItem copiar = new JMenuItem("Copiar archivo existente");
        archivo.add(copiar);
        copiar.addActionListener(new CopiarListener());
        guardar.addActionListener(new GuardarListener());
        JMenuItem autors = new JMenuItem("autores");
        autors.addActionListener(evt -> new AutorsFrame());
        autores.add(autors);

        //aplicar un color
        Color colorC = new Color(255,255,255);

        this.setBackground(colorC);


    }


}
