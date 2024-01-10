package cadenaDeTexto;

import java.util.Scanner;

public class EjerciciosCadenas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre = "Lalo";
        
        // Decir si la cadena contiene el carácter ‘x’ a partir de la cuarta posición.
        
        //1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente:
        
        // a. Mostrar por pantalla el contenido de la cadena pasada a mayúsculas y minúsculas.
        System.out.println("En Minusculas su nombre es: "+nombre.toLowerCase());
        System.out.println("En Mayusculas su nombre es: "+nombre.toUpperCase());
        
        // b. Decir si en la cadena aparece el carácter ‘x’.
        if(nombre.toLowerCase().contains("x")){
            System.out.println(nombre+"Si contiene x");
        } else {
            System.out.println("No contiene x");
        }
        
        // c. Decir si la cadena tiene más de 10 posiciones.
        int longitudNombre = nombre.length();
        if(longitudNombre>10){
            System.out.println(nombre+"Si contiene tiene mas de 10 caracteres");
        } else {
            System.out.println("No contiene mas de 10 caracteres");
        }
        
        // d. Decir si la cadena contiene el carácter ‘x’ a partir de la cuarta posición.
        nombre = "carlxxx";
        System.out.println("El nombre "+nombre+((nombre.length() >= 4 && nombre.substring(3).contains("x"))?" contiene caracteres x":" no contiene caracteres x")+" a partir de la 4ta posición");
        // e. Crear una cadena formada por las 5 primeras posiciones de la cadena.
        String nuevaCadenaDe5 = nombre.substring(0, Math.min(nombre.length(), 5));
        System.out.println(nuevaCadenaDe5);
        // f. Crear una cadena formada por las 5 últimas posiciones de la cadena.
        String nuevaCadenaUltimas5 = nombre.substring(Math.max(0, nombre.length()-5));
        System.out.println(nuevaCadenaUltimas5);
        // g. Decir si la cadena es igual a la cadena “hola”.
        // h. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena es un número, esto es, contiene solo dígitos decimales (del 0 a 9)
        // i. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena es un número hexadecimal, esto es, contiene solo dígitos decimales (del 0 a 9) y letras de la A a F.
        // j. Si se encuentra con en su interior con “prueva” sustituir por “prueba”.
        // k. Decir si la primera posición de la cadena es igual a la última.
        // l. Decir cuántos dígitos numéricos hay en la cadena.
        // m. Decir si la cadena es un palíndromo (se lee igual hacia adelante como hacia atrás)
        // n. Crear una cadena que sea igual a la introducida, pero con la primera y última posiciones intercambiadas. Ejemplo: si introducen: “abcde” obtendría “ebcda”.
        sc.close();

    }
}
