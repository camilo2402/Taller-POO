package co.taller1.dominio;

import java.util.List;

public class Asignatura {
    private String nombre;
    private int nroCreditos;
    private List<Estudiante> estudiantes;
    private Docente docente;

    public String getNombre() {
        return nombre;
    }

    public int getNroCreditos() {
        return nroCreditos;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setNroCreditos(int nroCreditos) {
        this.nroCreditos = nroCreditos;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
