package Unidad11Java.ejercicioCinco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Fiesta_v2 {

    
    public static void main(String[] args) {
        
        LinkedHashSet<Persona_v2> listaPersona_v2s = new LinkedHashSet<>();
        listaPersona_v2s.add(new Persona_v2("Juan", 1234, LocalDate.of(2003, 9, 10)));
        listaPersona_v2s.add(new Persona_v2("Vivian", 5678, LocalDate.of(2002, 2, 18)));
        listaPersona_v2s.add(new Persona_v2("Juan", 9900, LocalDate.of(1987, 10, 6)));
        listaPersona_v2s.add(new Persona_v2("Jorge", 1234, LocalDate.of(2003, 9, 10)));
        listaPersona_v2s.add(new Persona_v2("Mari", 5678, LocalDate.of(2002, 2, 18)));
        listaPersona_v2s.add(new Persona_v2("Pepe", 9900, LocalDate.of(1987, 10, 6)));
        listaPersona_v2s.add(new Persona_v2("Vlad", 1234, LocalDate.of(2003, 9, 10)));
        listaPersona_v2s.add(new Persona_v2("Carlos", 5678, LocalDate.of(2002, 2, 18)));
        listaPersona_v2s.add(new Persona_v2("Juanita", 9900, LocalDate.of(1987, 10, 6)));
        //Al agregar esta otra Persona_v2 no se añade a la lista de Persona_v2s desde que implemente el hashcode y el equals de nombre en Persona_v2.
        listaPersona_v2s.add(new Persona_v2("Juanita", 9900, LocalDate.of(1987, 10, 6)));
        listaPersona_v2s.add(new Persona_v2("JUanita", 9900, LocalDate.of(1987, 10, 6)));


        
        listaPersona_v2s.forEach(Persona_v2 -> System.out.println(Persona_v2.toString() + " tiene una edad de: " + Persona_v2.calcularEdad()));
        System.out.println("---------  CALCULANDO LA EDAD MEDIA Y EL NOMBRE DEL MAYOR --------");
        int edadMediaPersona_v2s = 0;
        int sumatoriaEdades = 0;
        int cantidadPersona_v2s = listaPersona_v2s.size();
        int edadMayor = Integer.MIN_VALUE;
        Persona_v2 Persona_v2Mayor = new Persona_v2(null, 0, null);

        //Por qué esto es así?
        /* final int[] sumatoriaEdades = {0}; // Matriz de un solo elemento para almacenar la suma

        listaPersona_v2s.forEach(Persona_v2 -> sumatoriaEdades[0] += Persona_v2.calcularEdad()); */
        //listaPersona_v2s.forEach(Persona_v2 -> sumatoriaEdades += Persona_v2.calcularEdad());

        for (Persona_v2 Persona_v2 : listaPersona_v2s) {
            int edad = Persona_v2.calcularEdad();
            sumatoriaEdades += Persona_v2.calcularEdad();
            if (edad>edadMayor) {
                edadMayor = edad;
                Persona_v2Mayor = Persona_v2;
            }
        }

        try {
            if (cantidadPersona_v2s<=0) {
                throw new ArithmeticException("No se admite cantidades de 0 o menos.");
            } else {
                edadMediaPersona_v2s = sumatoriaEdades / cantidadPersona_v2s;
            }
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("La media de edades en la lista de la Fiesta_v2 es: " + edadMediaPersona_v2s);
        System.out.println("La Persona_v2 con la edad mayor es: " + Persona_v2Mayor);

        //Antes del equals no tenia orden, aparentemente es aleatorio, luego de implementar el equals nada ha cambiado pero si quisiera que tuviera un orden deberia implementar la interfaz comparable y declarar el metodo compareTo para poder ver un orden por ejemplo por nombre como lo hare en la lineas de abajo.
        
        System.out.println("--------- ORDENANDO LA LISTA POR NOMBRE ----------");

        //Avegiguar como, porque no supe como hacerlo y GPT me ofrecio esta solución.
        List<Persona_v2> listaOrdenada = new ArrayList<>(listaPersona_v2s);
        Collections.sort(listaOrdenada);
        listaOrdenada.forEach(Persona_v2 -> System.out.println(Persona_v2));

        //Solo cambie el tipo de lista a LinkedHashSet, no cambie nada más del codigo y vi que el orden de almacenamiento es el orden de inserción.

        //Tambien le quite el hashCode y el equals y vi que ahora agregar repetidos y sigue introduciendo por llegada. Sin quitar el compareTo aun funciona el ordenamiento de Collections.sort

    }

}