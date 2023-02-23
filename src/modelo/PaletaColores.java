package modelo;
import java.awt.Color;

public class PaletaColores {
    public Color[] colores = new Color[10];

    public PaletaColores(){
        this.colores[0] = new Color(255, 255, 255);
        this.colores[1] = new Color(0, 0, 0);
        this.colores[2] = new Color(255, 0, 0);
        this.colores[3] = new Color(0, 255, 0);
        this.colores[4] = new Color(0, 0, 255);
        this.colores[5] = new Color(255, 255, 0);
        this.colores[6] = new Color(255, 0, 255);
        this.colores[7] = new Color(0, 255, 255);
        this.colores[8] = new Color(255, 128, 0);
        this.colores[9] = new Color(128, 128, 128);
    }
}
