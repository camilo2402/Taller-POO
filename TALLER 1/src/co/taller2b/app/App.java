package co.taller2b.app;

import co.taller2b.domonio.Agenda;
import co.taller2b.domonio.Contacto;

public class App {
    public static void main(String[] args) {
        Agenda AgendaDavid= new Agenda();
        Contacto Miguel =new Contacto("Miguel", "Rios",3205574847l);
        Contacto Camilo = new Contacto("Camilo","Ayala",3208692047l);
        Contacto Jorge =new Contacto("Jorge", "Carmona",3107354342l);
        Contacto Guillermo = new Contacto("Guillermo","Gil",3205572079l);
        AgendaDavid.crearContacto(Jorge);
        AgendaDavid.crearContacto(Guillermo);
        AgendaDavid.crearContacto(Miguel);
        AgendaDavid.crearContacto(Camilo);
        for (Contacto contacto: AgendaDavid.getContactos()) {
            System.out.println(contacto.getNombre() + " " + contacto.getApellido() + "\n*Nro de celular: " + contacto.getNroCelular());
            System.out.println("\n");
        }
    }
}
