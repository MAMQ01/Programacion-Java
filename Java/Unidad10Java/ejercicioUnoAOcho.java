package Unidad10Java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicioUnoAOcho {
    
    public static void main(String[] args) {
        
        /* Implementa un programa que pida al usuario un valor entero A utilizando un
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

        /* Implementa un programa que pida dos valores int A y B utilizando un nextInt() (de
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

        /* Implementa un programa que cree un vector tipo double de tamaño 5 y luego,
        utilizando un bucle, pida cinco valores por teclado y los introduzca en el vector.
        Tendrás que manejar la/las posibles excepciones y seguir pidiendo valores hasta
        rellenar completamente el vector. */


        Scanner scDouble = new Scanner(System.in);
        int i = 0;
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
        }
    } 
}