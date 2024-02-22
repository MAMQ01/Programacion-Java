package Unidad9Java.agenda_v2;

import java.time.LocalDate;

public class ProgramaAgenda {
    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();

        ContactoEmpresa contactoUno = new ContactoEmpresa("TCC", 1234567890, "tcc.com");
        ContactoEmpresa contactoDos = new ContactoEmpresa("Emirates", 1234567890, "emirates.com");
        ContactoPersona contactoTres = new ContactoPersona("Ana", 1234, LocalDate.of(2001, 10, 10));
        ContactoPersona contactoCuatro = new ContactoPersona("Julio", 1234, LocalDate.of(1991, 02, 10));
        ContactoPersona contactoCinco = new ContactoPersona("Ana", 1234, LocalDate.of(2001, 10, 10));
        ContactoEmpresa contactoSeis = new ContactoEmpresa("TCC", 1234567890, "otrositiowebTCC.com");
        ContactoEmpresa contactoSeiss = new ContactoEmpresa("TCC", 1234567890, "otrositiowebTCC.com");
        

        System.out.println("-----  Añadiendo contactos  -----");
        agenda.anyadirContacto(contactoUno);
        agenda.anyadirContacto(contactoDos);
        agenda.anyadirContacto(contactoTres);
        agenda.anyadirContacto(contactoCuatro);
        agenda.anyadirContacto(contactoCinco); //Retorna false, por lo tanto no se añade
        agenda.anyadirContacto(contactoSeis);
        agenda.anyadirContacto(contactoSeiss);

        System.out.println("-----  Listando los contactos  -----");
        agenda.listarContactos();

        System.out.println("-----  Mostrando el indice del contacto Ana  -----");
        System.out.println("El indice del contacto con el nombre Ana es: " + agenda.buscaContacto("Ana"));
        System.out.println("El indice del contacto con el nombre Emirates es: " + agenda.buscaContacto("Emirates"));

        System.out.println("-----  Mostrando la cantidad de contactos  -----");
        System.out.println("La cantidad de contactos en su agenda es: " + agenda.getLista().size());

        //Comparacion si dos ContactoEmpresa son distintos o no, devuelve true porque son iguales en todo.
        System.out.println(contactoUno.equals(contactoSeis));

        agenda.eliminarContacto(contactoSeis);
        agenda.eliminarContacto(contactoSeis);
        agenda.listarContactos();

        System.out.println("----------------------");
        System.out.println("-----  Mostrando el indice del contacto Ana  -----");
        System.out.println("El indice del contacto con el nombre Ana es: " + agenda.buscaContacto("Ana"));
        System.out.println("El indice del contacto con el nombre Emirates es: " + agenda.buscaContacto("Emirates"));

        System.out.println("-----  Mostrando la cantidad de contactos  -----");
        System.out.println("La cantidad de contactos en su agenda es: " + agenda.getLista().size());
    }
}
