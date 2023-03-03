package gui;
import modelo.Autor;

import javax.swing.*;

public class AutorsFrame extends JFrame {
    Autor autor1=new Autor("Angel Zambrano","//", "angel@mail.ec");
    Autor autor2=new Autor("Julio Cepeda","//", "jecpda@gmail.com");
    public AutorsFrame() {
        super("Autores");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        //abrir en el centro de la pantalla
        this.setLocationRelativeTo(null);
        //hacer que la ventana no pueda ser redimensionada
        this.setResizable(false);
        this.setVisible(true);
        //crear un layout para el panel
        JPanel panel = new JPanel();
        BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(layout);
        panel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
        this.add(panel);
        JLabel autor1Name = new JLabel("Autor: " + autor1.getNombre());
        panel.add(autor1Name);
        //colocar a laa derecha
        autor1Name.setAlignmentX(RIGHT_ALIGNMENT);
        //añadir un espacio
        panel.add(Box.createVerticalStrut(10));
        JLabel email1 = new JLabel("Email: " + autor1.getCorreo());
        panel.add(email1);
        email1.setAlignmentX(RIGHT_ALIGNMENT);
        panel.add(Box.createVerticalStrut(180));
        JLabel autor2Name = new JLabel("Autor: " + autor2.getNombre());
        panel.add(autor2Name);
        autor2Name.setAlignmentX(RIGHT_ALIGNMENT);
        panel.add(Box.createVerticalStrut(10));
        JLabel email2 = new JLabel("Email: " + autor2.getCorreo());
        panel.add(email2);
        panel.add(Box.createVerticalStrut(10));
        email2.setAlignmentX(RIGHT_ALIGNMENT);
        JLabel imageDonate = new JLabel(new ImageIcon("src\\img\\icons\\heart.png"));
        panel.add(imageDonate);
        //poner abajo a la derecha
        imageDonate.setAlignmentX(RIGHT_ALIGNMENT);


    }
}
