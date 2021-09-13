package co.taller2b.domonio;

public class Contacto implements Comparable<Contacto>{
    //Atributos
    private String nombre;
    private String apellido;
    private long nroCelular;

    public Contacto(String nombre, String apellido, long nroCelular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroCelular = nroCelular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getNroCelular() {
        return nroCelular;
    }

    public void setNroCelular(long nroCelular) {
        this.nroCelular = nroCelular;
    }

    @Override
    public int compareTo(Contacto o) {
        return this.nombre.compareTo(o.getNombre());
    }
}
