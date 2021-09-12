package co.taller2a.dominio;

import java.util.ArrayList;
import java.util.List;

public class DispensadorMecato {
    //Atributos
    private String marca;
    private List<Mecato> productos;
    public static final int CANTIDAD_MAXIMA_DE_PRODUCTOS=10;

    public DispensadorMecato(String marca) {
        this.marca = marca;
        this.productos = new ArrayList<>();
    }

    public Mecato buscar(int codigo){
        Mecato mecatoBuscado = null;
        for (Mecato mecato:this.productos) {
            if (mecato.getCodigo()==codigo){
                mecatoBuscado = mecato;
            }
        }
        return mecatoBuscado;
    }

    public Mecato buscar(String nombre){
        Mecato mecatoBuscado = null;
        for (Mecato mecato:this.productos) {
            if(mecato.getNombre().equalsIgnoreCase(nombre)){
                mecatoBuscado = mecato;
                break;
            }
        }
        return mecatoBuscado;
    }

    public boolean sacar(Mecato mecato){
        if(mecato != null){
            mecato.setCantidadActual(mecato.getCantidadActual()-1);
            return true;
        }
        return false;
    }

    public boolean sacarUnidad(int codigo){
        Mecato mecatoBuscado = buscar(codigo);
        return sacar(mecatoBuscado);
    }
    public boolean sacarUnidad(String nombre){
        Mecato mecatoBuscado = buscar(nombre);
        return sacar(mecatoBuscado);
    }
    public List<String> consultarAgotados(){
        List<String> agotados = new ArrayList<>();
        for (Mecato mecato:this.productos) {
            if(mecato.getCantidadActual()==0){
                agotados.add(mecato.getNombre());
            }
        }
        return agotados;
    }
    public int consultarUnidades(int codigo){
        Mecato mecatoBucado = buscar(codigo);
        return mecatoBucado.getCantidadActual();
    }
    public int consultarTotalUnidades(){
        int unidadesTotales = 0;
        for (Mecato mecato:this.productos) {
            unidadesTotales += mecato.getCantidadActual();
        }
        return unidadesTotales;
    }
    public void aumentarStock(int codigo, int cantidad){
        Mecato mecato = buscar(codigo);
        if(mecato!=null) {
            if ((mecato.getCantidadActual()+cantidad) < Mecato.CANTIDAD_MAXIMA_DE_UNIDADES) {
                mecato.setCantidadActual(mecato.getCantidadActual() + cantidad);
            }
            else{
                mecato.setCantidadActual(Mecato.CANTIDAD_MAXIMA_DE_UNIDADES);
            }
        }
    }

    public String getMarca() {
        return marca;
    }

    public List<Mecato> getProductos() {
        return productos;
    }
}
