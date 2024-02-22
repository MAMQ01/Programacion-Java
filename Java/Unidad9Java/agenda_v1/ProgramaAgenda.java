package Unidad9Java.agenda_v1;

public class ProgramaAgenda {
    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();

        Contacto contactoUno = new Contacto("Jaime", 10);
        Contacto contactoDos = new Contacto("Juan", 10);
        Contacto contactoTres = new Contacto("Ana", 10);
        Contacto contactoCuatro = new Contacto("Karl", 10);
        Contacto contactoCinco = new Contacto("Ana", 10);

        System.out.println("-----  Añadiendo contactos  -----");
        agenda.anyadirContacto(contactoUno);
        agenda.anyadirContacto(contactoDos);
        agenda.anyadirContacto(contactoTres);
        agenda.anyadirContacto(contactoCuatro);
        agenda.anyadirContacto(contactoCinco); //Retorna false, por lo tanto no se añade
        System.out.println("-----  Listando los contactos  -----");
        agenda.listarContactos();

        System.out.println("-----  Mostrando el indice del contacto Ana  -----");
        System.out.println("El indice del contacto con el nombre Ana es: " + agenda.buscaContacto("Ana"));
        System.out.println("-----  Mostrando la cantidad de contactos  -----");
        System.out.println("La cantidad de contactos en su agenda es: " + agenda.getLista().size());

    }
}
