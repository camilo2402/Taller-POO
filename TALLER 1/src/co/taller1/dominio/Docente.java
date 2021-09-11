package co.taller1.dominio;

public class Docente {
    //Atributos
    private String identificacion;
    private String nombre;
    private int edad;

    public Docente(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
