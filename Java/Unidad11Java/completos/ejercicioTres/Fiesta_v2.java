package Unidad11Java.completos.ejercicioTres;

import java.time.LocalDate;
import java.util.HashSet;

public class Fiesta_v2 {
    HashSet<Persona> invitados = new HashSet<>();


    public static void main(String[] args) {

        Fiesta_v2 fiesta2 = new Fiesta_v2();

        fiesta2.invitados.add(new Persona("Persona1", 12345, "coco@gmail.com", LocalDate.of(2001, 8, 29)));
        fiesta2.invitados.add(new Persona("Persona1", 12345, "coco@gmail.com", LocalDate.of(2001, 8, 29)));
        fiesta2.invitados.add(new Persona("Persona3", 12345, "coco@gmail.com", LocalDate.of(2004, 8, 29)));
        
        for (Persona personaInvitada : fiesta2.invitados) {
            System.out.println(personaInvitada);
        }
    }

}
