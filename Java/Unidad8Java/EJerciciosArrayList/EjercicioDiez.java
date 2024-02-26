package Unidad8Java.EJerciciosArrayList;

import java.util.Scanner;

public class EjercicioDiez {
    
    /* Ejercicio 10
    Implementa un programa que cree una matriz de tamaño F x C (estos valores se
    introducirán como parámetros en la línea de comandos) y la rellene con números
    enteros aleatorios entre 1 y 20. Luego pedirá por teclado un número V y mostrará por
    pantalla cuántos valores de cada fila son múltiplos de V. Supondremos que el usuario
    introducirá valores válidos por lo que no será necesario comprobarlos.
    Por ejemplo, dada esta matriz de 3x3 y V=5
    5 10 9
    1 6 19
    20 15 10
    El programa mostrará por pantalla:
    Fila 1: 2
    Fila 2: 0
    Fila 3: 3 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca F para su matriz");
        int f = sc.nextInt();
        System.out.println("introduzca C para su matriz");
        int c = sc.nextInt();

        int[][] matriz = new int[f][c];
        
    }
    
}