package co.taller1.dominio;

import java.util.List;

public class Nota {
    private double parcial;
    private double final_;
    private List<Double> notasSeguimiento;
    private Asignatura materia;

    public Nota(Asignatura materia) {
        this.materia = materia;
    }

    private double calcularSeguimiento(){
        double sumaNotas = 0;
        for (Double nota : this.notasSeguimiento) {
            sumaNotas += nota;
        }
        return (sumaNotas/this.notasSeguimiento.size());
    }
    public double calcularDefinitiva(double parcial, double final_){
        double definitiva = (calcularSeguimiento()*0.4)+(this.parcial*0.3)+(this.final_*0.3);
        return definitiva;
    }

    public double getParcial() {
        return parcial;
    }

    public double getFinal_() {
        return final_;
    }

    public List<Double> getNotasSeguimiento() {
        return notasSeguimiento;
    }

    public Asignatura getMateria() {
        return materia;
    }

    public void setParcial(double parcial) {
        this.parcial = parcial;
    }

    public void setFinal_(double final_) {
        this.final_ = final_;
    }

    public void setNotasSeguimiento(List<Double> notasSeguimiento) {
        this.notasSeguimiento = notasSeguimiento;
    }
}
