package co.taller2b.domonio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Agenda {
    //Atributos
    private List<Contacto> contactos = new ArrayList<>();
    public static final int CAPACIDAD_MAXIMA_DE_CONTACTOS = 20;


    public void crearContacto(Contacto contacto){
        if(contacto != null){
            if(contactos.size()<CAPACIDAD_MAXIMA_DE_CONTACTOS) {
                this.contactos.add(contacto);
            }
        }
    }
    public boolean eliminarContacto(Contacto contactoAEliminar){
        if(contactoAEliminar != null) {
            this.contactos.remove(contactoAEliminar);
            return true;
        }
        return false;
    }
    public Contacto buscarNombre(String nombre){
        Contacto contactoBuscado = null;
        for (Contacto contacto:this.contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)){
                contactoBuscado = contacto;
                break;
            }
        }
        return contactoBuscado;
    }
    public Contacto buscarApellido(String apellido){
        Contacto contactoBuscado = null;
        for (Contacto contacto:this.contactos) {
            if (contacto.getApellido().equalsIgnoreCase(apellido)){
                contactoBuscado = contacto;
                break;
            }
        }
        return contactoBuscado;
    }
    public Contacto buscarNroCelular(long nroCelular){
        Contacto contactoBuscado = null;
        for (Contacto contacto:this.contactos) {
            if (contacto.getNroCelular()==nroCelular){
                contactoBuscado = contacto;
                break;
            }
        }
        return contactoBuscado;
    }
    public boolean cambiarNroCelular(long nuevoNroCelular, Contacto contacto){
        if(contacto!=null){
            contacto.setNroCelular(nuevoNroCelular);
            return true;
        }
        return false;
    }
    public List<Contacto> ordenarContactosEnOrdenAlfabetico(){
        Collections.sort(contactos);
        return contactos;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

}
