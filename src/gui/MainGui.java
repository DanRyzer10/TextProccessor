package gui;
import modelo.BarraInferior;
import modelo.PanelTexto;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import modelo.Menu;
import modelo.BarraTarea;
import listeners.CerrarVentanaListener;
/*
 *panel principal de la aplicacion
 * @extends Jframe
 * creado el 16 de febrero,2023, 11:22 hrs
 * @autor Angel Zambrano
 * @version POO -2023
 */
public class MainGui extends JFrame {

    final private PanelTexto panelTexto;
    public static String titulo="Documento sin titulo";
    public MainGui() {
        super(titulo);
        Image icon = Toolkit.getDefaultToolkit().getImage("src\\img\\AncedaLogoA.png");
        setIconImage(icon);

        Color colorC = new Color(233,245,255);
        //agregar menu
        Menu menu = new Menu();
        setJMenuBar(menu);
        BarraTarea barra = new BarraTarea();
        getContentPane().add(barra, BorderLayout.PAGE_START);



        BarraInferior barraInferior = new BarraInferior();
        getContentPane().add(barraInferior, BorderLayout.PAGE_END);

        JPanel panel2= new JPanel();

        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.setBackground(colorC);
        Border border = BorderFactory.createEmptyBorder(20,20,20,20);
        panel2.setBorder(border);
        panelTexto = new PanelTexto();
        panel2.add(panelTexto, BorderLayout.CENTER);
        JScrollPane scrollPane = new JScrollPane(panel2);

        getContentPane().add(scrollPane, BorderLayout.CENTER);


        setSize(800, 600);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);
        this.addWindowListener(new CerrarVentanaListener());



    }
    public PanelTexto getPanelTexto(){
        return panelTexto;
    }

}

