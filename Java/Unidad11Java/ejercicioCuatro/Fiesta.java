package Unidad11Java.ejercicioCuatro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Fiesta {

    
    public static void main(String[] args) {
        
        LinkedHashSet<Persona> listaPersonas = new LinkedHashSet<>();
        listaPersonas.add(new Persona("Juan", 1234, LocalDate.of(2003, 9, 10)));
        listaPersonas.add(new Persona("Vivian", 5678, LocalDate.of(2002, 2, 18)));
        listaPersonas.add(new Persona("Juan", 9900, LocalDate.of(1987, 10, 6)));
        listaPersonas.add(new Persona("Jorge", 1234, LocalDate.of(2003, 9, 10)));
        listaPersonas.add(new Persona("Mari", 5678, LocalDate.of(2002, 2, 18)));
        listaPersonas.add(new Persona("Pepe", 9900, LocalDate.of(1987, 10, 6)));
        listaPersonas.add(new Persona("Vlad", 1234, LocalDate.of(2003, 9, 10)));
        listaPersonas.add(new Persona("Carlos", 5678, LocalDate.of(2002, 2, 18)));
        listaPersonas.add(new Persona("Juanita", 9900, LocalDate.of(1987, 10, 6)));
        //Al agregar esta otra persona no se añade a la lista de personas desde que implemente el hashcode y el equals de nombre en Persona.
        listaPersonas.add(new Persona("Juanita", 9900, LocalDate.of(1987, 10, 6)));
        listaPersonas.add(new Persona("JUanita", 9900, LocalDate.of(1987, 10, 6)));


        
        listaPersonas.forEach(persona -> System.out.println(persona.toString() + " tiene una edad de: " + persona.calcularEdad()));
        System.out.println("---------  CALCULANDO LA EDAD MEDIA Y EL NOMBRE DEL MAYOR --------");
        int edadMediaPersonas = 0;
        int sumatoriaEdades = 0;
        int cantidadPersonas = listaPersonas.size();
        int edadMayor = Integer.MIN_VALUE;
        Persona personaMayor = new Persona(null, 0, null);

        //Por qué esto es así?
        /* final int[] sumatoriaEdades = {0}; // Matriz de un solo elemento para almacenar la suma

        listaPersonas.forEach(persona -> sumatoriaEdades[0] += persona.calcularEdad()); */
        //listaPersonas.forEach(persona -> sumatoriaEdades += persona.calcularEdad());

        for (Persona persona : listaPersonas) {
            int edad = persona.calcularEdad();
            sumatoriaEdades += persona.calcularEdad();
            if (edad>edadMayor) {
                edadMayor = edad;
                personaMayor = persona;
            }
        }

        try {
            if (cantidadPersonas<=0) {
                throw new ArithmeticException("No se admite cantidades de 0 o menos.");
            } else {
                edadMediaPersonas = sumatoriaEdades / cantidadPersonas;
            }
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("La media de edades en la lista de la fiesta es: " + edadMediaPersonas);
        System.out.println("La persona con la edad mayor es: " + personaMayor);

        //Antes del equals no tenia orden, aparentemente es aleatorio, luego de implementar el equals nada ha cambiado pero si quisiera que tuviera un orden deberia implementar la interfaz comparable y declarar el metodo compareTo para poder ver un orden por ejemplo por nombre como lo hare en la lineas de abajo.
        
        System.out.println("--------- ORDENANDO LA LISTA POR NOMBRE ----------");

        //Avegiguar como, porque no supe como hacerlo y GPT me ofrecio esta solución.
        List<Persona> listaOrdenada = new ArrayList<>(listaPersonas);
        Collections.sort(listaOrdenada);
        listaOrdenada.forEach(persona -> System.out.println(persona));

        //Solo cambie el tipo de lista a LinkedHashSet, no cambie nada más del codigo y vi que el orden de almacenamiento es el orden de inserción.

        //Tambien le quite el hashCode y el equals y vi que ahora agregar repetidos y sigue introduciendo por llegada. Sin quitar el compareTo aun funciona el ordenamiento de Collections.sort

    }

}