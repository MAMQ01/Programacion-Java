package Unidad8Java;

import java.util.Arrays;
import java.util.Scanner;

public class Vectores {
    //Pide 10 numeros por teclado y los muestra
    public static double[] pideDiezNumerosPorTeclado(){
        Scanner sc = new Scanner(System.in);
        double[] arrayDiezNumeros = new double[10];
        for (int i = 0; i < arrayDiezNumeros.length; i++) {
            System.out.println("Introduzca uno de los numeros a almacenar");
            arrayDiezNumeros[i] = sc.nextDouble();
        }
        return arrayDiezNumeros;
    }
    //Suma un array devuelve un double
    public static double sumaArray(double[] array){
        double suma = 0;
        for (double d : array) {
            suma +=+ d;
        }
        return suma;
    }

    public static void minimoMaximoDeArray(){
        double minimo = 0;
        double maximo = 0;
        double[] array = pideDiezNumerosPorTeclado();
        for (double d : array) {
            minimo = Math.min(minimo, d);
            maximo = Math.min(maximo, d);
        }
    }
    
    public static void main(String[] args) {
        //VECTORES
        /* 1. Crea un programa que pida diez números reales por teclado, los almacene en un
        array, y luego muestre todos sus valores. */
        System.out.println(Arrays.toString(pideDiezNumerosPorTeclado()));
        /* 2. Crea un programa que pida diez números reales por teclado, los almacene en un
        array, y luego muestre la suma de todos los valores. */
        System.out.println(sumaArray(pideDiezNumerosPorTeclado()));
        /* 3. Crea un programa que pida diez números reales por teclado, los almacene en un
        array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla. */
        System.out.println();
        /* 4. Crea un programa que pida veinte números enteros por teclado, los almacene en un
        array y luego muestre por separado la suma de todos los valores positivos y negativos. */
        /* 5. Crea un programa que pida veinte números reales por teclado, los almacene en un
        array y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de
        valores. */ 
        /* 6. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
        N, escriba M en todas sus posiciones y lo muestre por pantalla. */
        /* 7. Crea un programa que pida dos valores enteros P y Q, luego cree un array que
        contenga todos los valores desde P hasta Q, y lo muestre por pantalla. */
        /* 8. Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
        utilizando Math.random(), y luego le pida al usuario un valor real R. Por último,
        mostrará cuántos valores del array son igual o superiores a R. */
        /* 9. Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
        enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N
        y mostrará en qué posiciones del array aparece N. */
        /* 10. Crea un programa para realizar cálculos relacionados con la altura (en metros) de
        personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas por
        teclado. Luego mostrará la altura media, máxima y mínima así como cuántas personas
        miden por encima y por debajo de la media. */
    }
}
