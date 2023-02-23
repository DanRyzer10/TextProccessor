package modelo;
import java.awt.*;
import javax.swing.*;

public class Menu extends JMenuBar{
    public Menu() {

        super();
        JMenu archivo = new JMenu("Archivo");
        this.add(archivo);
        JMenu autores = new JMenu("Autores");
        this.add(autores);
        JMenuItem nuevo = new JMenuItem("Nuevo");
        archivo.add(nuevo);
        JMenuItem abrir = new JMenuItem("Abrir");
        archivo.add(abrir);
        JMenuItem guardar = new JMenuItem("Guardar");
        archivo.add(guardar);
        JMenuItem sobreescribir = new JMenuItem("Sobreescribir");
        archivo.add(sobreescribir);
        JMenuItem autors = new JMenuItem("Autores");
        autores.add(autors);
        //aplicar un color
        Color colorC = new Color(255,255,255);

        this.setBackground(colorC);


    }


}
