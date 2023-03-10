package gui;
import javax.swing.*;
import java.awt.*;

public class WelcomeGui extends JFrame{

   public WelcomeGui(){
       // Crear un JPanel como contenedor
       JPanel panel = new JPanel();
       panel.setLayout(new BorderLayout());
       //quitar bordes
       setUndecorated(true);
       // Crear un JLabel para la imagen y agregarlo al panel
       ImageIcon imageIcon = new ImageIcon("src\\img\\AncedaLogoB.png");
       JLabel imageLabel = new JLabel(imageIcon);
       panel.add(imageLabel, BorderLayout.CENTER);

       // Crear un JLabel para el texto y agregarlo al panel
       JLabel textLabel = new JLabel("Bienvenido, Iniciando...", SwingConstants.CENTER);
       textLabel.setFont(new Font("Arial", Font.BOLD, 20));
       panel.add(textLabel, BorderLayout.SOUTH);

       // Agregar el panel a la ventana
       add(panel);

       // Establecer el tamaño de la ventana y hacerla visible
       setSize(400, 300);
       setLocationRelativeTo(null);
       setVisible(true);


   }




}
