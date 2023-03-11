package modelo;
/*
    *Clase que contiene los atributos de un Autor
    *creado el 20 de febrero, 2023, 21:57 hrs
    * @autor Angel Zambrano & Julio Cepeda
    * @version POO -2023
 */
public class Autor {
    private String nombre,photoPath,correo;

    public Autor(String nombre, String photoPath, String correo) {
        this.nombre = nombre;
        this.photoPath = photoPath;
        this.correo = correo;
    }

    //metodos get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPhotoPath() {
        return photoPath;
    }
    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", photoPath='" + photoPath + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
