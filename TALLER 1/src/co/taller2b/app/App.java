package co.taller2b.app;

import co.taller2b.domonio.Agenda;
import co.taller2b.domonio.Contacto;

public class App {
    public static void main(String[] args) {
        Agenda AgendaDavid= new Agenda();
        Contacto Miguel =new Contacto("Miguel", "Rios",320557484);
        Contacto Camilo = new Contacto("Camilo","Ayala",320869204);
        Contacto Jorge =new Contacto("Jorge", "Carmona",310735434);
        Contacto Guillermo = new Contacto("Guillermo","Gil",320557279);
        AgendaDavid.crearContacto(Jorge);
        AgendaDavid.crearContacto(Guillermo);
        AgendaDavid.crearContacto(Miguel);
        AgendaDavid.crearContacto(Camilo);
        System.out.println("Antes de eliminar.");
        for (Contacto contacto: AgendaDavid.getContactos()) {
            System.out.println(contacto.getNombre()+" "+contacto.getApellido()+"\n*Nro de celular: "+contacto.getNroCelular());
            System.out.println("\n");
        }
        AgendaDavid.eliminarContacto(Miguel);
        System.out.println("Despues de eliminar.");
        for (Contacto contacto: AgendaDavid.getContactos()) {
            System.out.println(contacto.getNombre()+" "+contacto.getApellido()+"\n*Nro de celular: "+contacto.getNroCelular());
            System.out.println("\n");
        }
        System.out.println("Antes de cambiar nro.");
        AgendaDavid.cambiarNroCelular(315657265, Camilo);
        for (Contacto contacto: AgendaDavid.getContactos()) {
            System.out.println(contacto.getNombre()+" "+contacto.getApellido()+"\n*Nro de celular: "+contacto.getNroCelular());
            System.out.println("\n");
        }
    }
}
