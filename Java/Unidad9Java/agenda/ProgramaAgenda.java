package Unidad9Java.agenda;

public class ProgramaAgenda {
    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();

        Contacto contactoUno = new Contacto("Juan", 10);
        Contacto contactoDos = new Contacto("Ana", 10);

        agenda.lista.add(contactoUno);
        agenda.lista.add(contactoDos);

        System.out.println(agenda.buscaContacto("Ana"));
    }
}
