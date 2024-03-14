package Unidad10Java.ejercicioUnoAOcho;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class EjercicioUnoAOcho {
    
    public static void main(String[] args) {
        
        /*1. Implementa un programa que pida al usuario un valor entero A utilizando un
        nextInt() (de Scanner) y luego muestre por pantalla el mensaje “Valor introducido:
        …”. Se deberá tratar la excepción InputMismatchException que lanza nextInt()
        cuando no se introduce un entero válido. En tal caso se mostrará el mensaje “Valor
        introducido incorrecto”. */

        Scanner scInt = new Scanner(System.in);
        /* int enteroA;
        try {
            enteroA = sc.nextInt();
            System.out.println("El valor introducido es: " + enteroA);
            
        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Valor introducido incorrecto");
            e.printStackTrace();
        } */

        /*2. Implementa un programa que pida dos valores int A y B utilizando un nextInt() (de
        Scanner), calcule A/B y muestre el resultado por pantalla. Se deberán tratar de
        forma independiente las dos posibles excepciones, InputMismatchException y
        ArithmeticException, mostrando en cada caso un mensaje de error diferente. */

        /* int enteroA;
        int enteroB;
        int divisionAB;
        try {
            System.out.println("Introduzca el primer número: ");
            enteroA = scInt.nextInt();
            System.out.println("Introduzca el segundo número: ");
            enteroB = scInt.nextInt();
            divisionAB = enteroA/enteroB;
            //No entiendo porqué al introducir un valor double o String lee la siguiente línea.
            System.out.println("El valor introducido es: " + divisionAB);
        } catch (InputMismatchException e) {
            System.err.println("Valor introducido incorrecto " + e.getMessage());
            e.printStackTrace();
        }  catch (ArithmeticException e) {
            System.err.println("Valor introducido incorrecto, no es una operación arimetica válida. " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Valor introducido incorrecto, no es la excepción: InputMismatch ni Arimethic. " + e.getMessage());
            e.printStackTrace();
        } */

        /*3. Implementa un programa que cree un vector tipo double de tamaño 5 y luego,
        utilizando un bucle, pida cinco valores por teclado y los introduzca en el vector.
        Tendrás que manejar la/las posibles excepciones y seguir pidiendo valores hasta
        rellenar completamente el vector. */

        Scanner scDouble = new Scanner(System.in);
        /* int i = 0;
        double[]vectorDouble = new double[5];
        try {
            do {
                System.out.println("Ingrese el valor: " + (i+1) + " de su vector double");
                double valorArray = scDouble.nextDouble(); 
                vectorDouble[i] = valorArray;
                i++;
            } while (i<5);
        } catch (InputMismatchException e) {
            System.err.println("Valor introducido incorrecto. " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("ERROR! no es la excepción: InputMismatch ni Arimethic. " + e.getMessage());
            e.printStackTrace();
        }

        for (int j = 0; j < vectorDouble.length; j++) {
            System.out.println(vectorDouble[j]);
        } */

        /* 4. Implementa un programa que cree un vector de enteros de tamaño N (número
        aleatorio entre 1 y 100) con valores aleatorios entre 1 y 10. Luego se le preguntará
        al usuario qué posición del vector quiere mostrar por pantalla, repitiéndose una y
        otra vez hasta que se introduzca un valor negativo. Maneja todas las posibles
        excepciones. */

        /* int tamanyoArray = ThreadLocalRandom.current().nextInt(1,101);
        int[] vectorNEnteros = new int[tamanyoArray];
        int posicionBuscada = 0;
        for (int i = 0; i < vectorNEnteros.length; i++) {
            vectorNEnteros[i] = ThreadLocalRandom.current().nextInt(1,11);
        }
        try {
            do {
                System.out.println("Cúal posición de su array desea ver?");
                posicionBuscada = scInt.nextInt();
                System.out.println("El valor de su array en la posicion: " + posicionBuscada + " es: " + vectorNEnteros[posicionBuscada]);
            } while (posicionBuscada>0);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Su posicion escogida excede el limite del array.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Excepción encontrada.");
            e.printStackTrace();
        } */

        /*5. Implementa un programa con tres funciones:
        ◦ void imprimePositivo(int p): Imprime el valor p. Lanza una ‘Exception’ si p < 0
        ◦ void imprimeNegativo(int n): Imprime el valor n. Lanza una ‘Exception’ si p >=
        0
        ◦ La función main para realizar pruebas. Puedes llamar a ambas funciones varias
        veces con distintos valores, hacer un bucle para pedir valores por teclado y
        pasarlos a las funciones, etc. Maneja las posibles excepciones. */



        /* 6. Implementa una clase Gato con los atributos nombre y edad, un constructor con
        parámetros, los getters y setters, además de un método imprimir() para mostrar
        los datos de un gato. El nombre de un gato debe tener al menos 3 caracteres y la
        edad no puede ser negativa. Por ello, tanto en el constructor como en los setters,
        deberás comprobar que los valores sean válidos y lanzar una ‘Exception’ si no lo
        son. Luego, haz una clase principal con main para hacer pruebas: instancia varios
        objetos Gato y utiliza sus setters, probando distintos valores (algunos válidos y
        otros incorrectos). Maneja las excepciones. */

        /* 7. Crea una copia del programa anterior y modifica el main para hacer lo siguiente:
        ◦ Crea un ArrayList<Gato>. Luego, utilizando un bucle, pide al usuario que
        introduzca los datos de 5 gatos: utiliza un Scanner para pedir los datos,
        instancia el objeto y guárdalo en el ArrayList. Por último, imprime la
        información de los gatos.
        ◦ Maneja las posibles excepciones de modo que en el ArrayList solo
        almacenemos objetos Gato válidos y el bucle se repita hasta crear y almacenar
        correctamente 5 gatos. */

        EjercicioUnoAOcho ej8 = new EjercicioUnoAOcho();

        /* ej8.imprimePositivo(-2);
        ej8.imprimeNegativo(2); */

        

    }

    void imprimePositivo(int p){
        try {
            if (p>0) {
                System.out.println("El numero sí es positivo " + p);
            } else {
                throw new Exception("introdujo un número negativo");
            }           
        } catch (Exception e) {
            System.out.println("Excepción encontrada por p < 0.");
        }
    }

    void imprimeNegativo(int p){
        try {
            if (p<0) {
                System.out.println("El numero es negativo " + p);
            } else {
                throw new Exception("introdujo un número positivo");
            }           
        } catch (Exception e) {
            System.out.println("Excepción encontrada por p > 0.");
        }
    }

}