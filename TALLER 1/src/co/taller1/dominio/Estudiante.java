package co.taller1.dominio;

public class Estudiante {
    //Atributos
    private String identificaion;
    private String nombre;
    private int semestreActual;
    private char genero;
    private Nota nota;

    public Estudiante(String identificaion, String nombre) {
        this.identificaion = identificaion;
        this.nombre = nombre;
    }

    public Estudiante(String identificaion, String nombre, int semestreActual) {
        this.identificaion = identificaion;
        this.nombre = nombre;
        this.semestreActual = semestreActual;
    }

    public String getIdentificaion() {
        return identificaion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSemestreActual() {
        return semestreActual;
    }

    public char getGenero() {
        return genero;
    }

    public Nota getNota() {
        return nota;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }
}
