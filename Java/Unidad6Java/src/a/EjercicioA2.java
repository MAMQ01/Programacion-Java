package Unidad6Java.src.a;
import java.util.Scanner;

public class EjercicioA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Usar la clase persona
        // Crear la persona 1 y recibir sus datos
        Persona personaUno = new Persona();

        System.out.println("Ingrese su DNI");
        personaUno.dni = sc.nextInt();
        System.out.println("Su DNI es: " + personaUno.dni);

        System.out.println("Ingrese su nombre");
        personaUno.nombre = sc.next();
        System.out.println("Su nombre es: " + personaUno.nombre);

        System.out.println("Ingrese sus apellidos");
        personaUno.apellidos = sc.next();
        System.out.println("Sus apellidos son: " + personaUno.apellidos);

        System.out.println("Ingrese su edad");
        personaUno.edad = sc.nextInt();

        if (personaUno.dni >= 18) {
            System.out.println(
                    personaUno.nombre + personaUno.apellidos + " eres mayor de edad, tu edad es: " + personaUno.edad);
        } else {
            System.out.println(
                    personaUno.nombre + personaUno.apellidos + " eres mayor de edad, tu edad es: " + personaUno.edad);
        }
        // Crear la persona 2 y recibir sus datos

        Persona personaDos = new Persona();

        System.out.println("Ingrese su DNI");
        personaDos.dni = sc.nextInt();
        System.out.println("Su DNI es: " + personaDos.dni);

        System.out.println("Ingrese su nombre");
        personaDos.nombre = sc.next();
        System.out.println("Su nombre es: " + personaDos.nombre);

        System.out.println("Ingrese sus apellidos");
        personaDos.apellidos = sc.next();
        System.out.println("Sus apellidos son: " + personaDos.apellidos);

        System.out.println("Ingrese su edad");
        personaDos.edad = sc.nextInt();

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

class Persona {
    int dni, edad;
    String nombre, apellidos;
}