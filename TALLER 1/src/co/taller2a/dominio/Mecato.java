package co.taller2a.dominio;

public class Mecato {
    //Atributos
    private int codigo;
    private String nombre;
    private int precio;
    private int cantidadActual;
    public static final int CANTIDAD_MAXIMA_DE_UNIDADES= 8;

    public Mecato(int codigo, String nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadActual = CANTIDAD_MAXIMA_DE_UNIDADES;
    }

    public Mecato(int codigo, String nombre, int precio, int cantidadActual) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadActual = cantidadActual;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
