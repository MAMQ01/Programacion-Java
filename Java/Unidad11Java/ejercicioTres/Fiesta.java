package Unidad11Java.ejercicioTres;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Fiesta {

    
    public static void main(String[] args) {
        
        HashSet<Persona> listaPersonas = new HashSet<>();
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
                throw new IllegalArgumentException("No se admite cantidades de 0 o menos.");
            } else {
                edadMediaPersonas = sumatoriaEdades / cantidadPersonas;
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("La media de edades en la lista de la fiesta es: " + edadMediaPersonas);
        System.out.println("La persona con la edad mayor es: " + personaMayor);
        //Antes del equals no tenia orden, aparentemente es aleatorio, luego de implementar el equals nada ha cambiado pero si quisiera que tuviera un orden deberia implementar la interfaz comparable y declarar el metodo compareTo para poder ver un orden por ejemplo por nombre como lo hare en la lineas de abajo.
        System.out.println("--------- ORDENANDO LA LISTA POR NOMBRE ----------");
        //Avegiguar como
        List<Persona> listaOrdenada = new ArrayList<>(listaPersonas);
        Collections.sort(listaOrdenada);
        listaOrdenada.forEach(persona -> System.out.println(persona));

        /* public static Comparator<Persona> comparadorPorEdad = new Comparator<Persona>() {
        @Override
        public int compare(Persona persona1, Persona persona2) {
            return Integer.compare(persona1.getEdad(), persona2.getEdad());
        } */


    }

}