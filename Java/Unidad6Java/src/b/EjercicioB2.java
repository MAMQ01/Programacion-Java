package Unidad6Java.src.b;

import java.util.Scanner;

public class EjercicioB2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Usar la clase constructora persona
        // Crear la persona 1 y hardcodea la entrada
        Persona personaUno = new Persona(165460, 60, "Carlos", "Nuñez");


        if (personaUno.dni >= 18) {
            System.out.println(
                    personaUno.nombre + personaUno.apellidos + " eres mayor de edad, tu edad es: " + personaUno.edad);
        } else {
            System.out.println(
                    personaUno.nombre + personaUno.apellidos + " eres mayor de edad, tu edad es: " + personaUno.edad);
        }
        // Crear la persona 2 y recibir sus datos

        Persona personaDos = new Persona(143423545,23,"aria","stark");


        if (personaUno.dni >= 18) {
            System.out.println(
                    personaDos.nombre + personaDos.apellidos + " eres mayor de edad, tu edad es: " + personaDos.edad);
        } else {
            System.out.println(
                    personaDos.nombre + personaDos.apellidos + " eres mayor de edad, tu edad es: " + personaDos.edad);
        }
        sc.close();
    }
}

