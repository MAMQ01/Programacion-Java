package Unidad8Java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ParteDosVectores {

    //Ejercicio 11
    public static void dosArraysCienInt(){
        int[] array1 = new int[100];
        int[] array2 = new int[100];

        for (int i = 0; i < 100; i++) {
            array1[i] = i + 1;
        }
        for (int i = 0; i < 100; i++) {
            array2[i] = array1[99 - i];
        }
        System.out.println("Array 1 (Normal)"+Arrays.toString(array1));
        System.out.println("----------------------");
        System.out.println("Array 2 (Inverso)"+Arrays.toString(array2));
    }

    public static void menuCompletaArray10(){
        int[] arayDiezEnteros = new int[10];
        for (int i : arayDiezEnteros) {
            i=(int) (1 + Math.random()*10);
        }
        Scanner sc = new Scanner(System.in);
        boolean salida = false;
        String opcionSalir = "c";
        String valorIntroducido;
        do {
            System.out.println("Introduzca la opcion deseada, sólo una opcion (letra)");
            System.out.printf(
                "a. Mostrar valores.%n" + //
                "b. Introducir valor.%n" + //
                "c. Salir. %n");
            valorIntroducido = sc.nextLine().toLowerCase();
                switch (valorIntroducido) {
                    case "a":
                    System.out.println("Logica A");
                    for (int i : arayDiezEnteros) {
                        System.out.println(Arrays.toString(arayDiezEnteros));
                    }
                        break;
                    case "b":
                    System.out.println("Logica B");
                    System.out.println("Introduzca el Valor");
                    int V = sc.nextInt();
                    System.out.println("Introduzca la Posición");
                    int P = sc.nextInt();
                    if (P>=0 && P<=99) {
                        arayDiezEnteros[P]=V;
                    }
                        break;
                    case "c":
                        System.out.println("Logica C");
                        break;
                    default:
                        System.err.println("Introdujo una opcion incorrecta.");
                        break;
                }
                if(valorIntroducido.equals(opcionSalir)){
                    salida=true;
                }
        } while (!salida);
    }

    public static void arrayConCincoNumerosDe0A5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cuantos numeros desea introducir (La longitud de su Array)");
        int numerosAIntroducir = sc.nextInt();
        int[] arrayEnSecuencia = new int[numerosAIntroducir];
        System.out.println("Introduzca el valor inicial");
        int valorInicial = sc.nextInt();
        System.out.println("Introduzca el valor incremento");
        int valorIncremento = sc.nextInt();
        for (int i = valorInicial; i < arrayEnSecuencia.length; i++) {
            arrayEnSecuencia[i]=i;
        }
        System.out.println(Arrays.toString(arrayEnSecuencia));
    }

    public static void arrayDeNConCambioP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cuantos numeros desea introducir (La longitud de su Array)");
        int numerosAIntroducir = sc.nextInt();
        int[] arrayEnSecuencia = new int[numerosAIntroducir];
        System.out.println("Introduzca el valor inicial");
        int valorInicial = sc.nextInt();
        System.out.println("Introduzca el valor incremento");
        int valorIncremento = sc.nextInt();
        int a;
        int b;
        int c;
        for (int i = 0; i < arrayEnSecuencia.length; i++) {
            a=valorInicial;
            b=valorIncremento;
            arrayEnSecuencia[i]=valorInicial;
            c=a+b;
            valorInicial=c;
        }
        System.out.println(Arrays.toString(arrayEnSecuencia));
    }

    public static void secuencia122333(){
        int tamano = 10;
        int sumatoria = 0;
        for (int i = 1; i <= tamano; i++) {
            sumatoria += i;
        }
        int[] array = new int[sumatoria];
        int indice = 0;
        for (int i = 1; i <= tamano; i++) {
            for (int j = 1; j <= i; j++) {
                array[indice] = i;
                indice++;
            }
        }
        for (int valor : array) {
            System.out.print(valor + " ");
        }
    }

    public static void secuencia122333ArraysFill(){
        int tamano = 10;
        int sumatoria = 0;
        int indice = 0;
        for (int i = 1; i <= tamano; i++) {
            sumatoria += i;
        }
        int[] array = new int[sumatoria];
        for (int i = 1; i <= tamano; i++) {
            Arrays.fill(array, indice, indice + i, i);
            indice += i;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void dosArraysPrimerosDiezUltimosDiez(){
        Scanner sc = new Scanner(System.in);
        int[] primerosDiez = new int[10];
        int[] ultimosDiez = new int[10];
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el valor #" + (i + 1) + ": ");
            int valor = sc.nextInt();
            if (i < 10) {
                primerosDiez[i] = valor;
            } else {
                ultimosDiez[i - 10] = valor;
            }
        }
        System.out.println("Primeros 10 valores: " + Arrays.toString(primerosDiez));
        System.out.println("Últimos 10 valores: " + Arrays.toString(ultimosDiez));

        if (Arrays.equals(primerosDiez, ultimosDiez)) {
            System.out.println("Los dos arrays son iguales");
        } else {
            System.out.println("Los dos arrays no son iguales");
        }
    }

    public static void arrayOrdenadoDe30IntAleatorioDe0A9(){
        int[] array = new int[30];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Array antes de ordenar: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Array después de ordenar: " + Arrays.toString(array));
    }

    public static void arrayCienIntEntre1Y100(){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int) (Math.random()*100);
        }
        System.out.println("Introduzca el numero para buscar cuantas veces está dentro del array aleatorio 1-1000");
        int valorABuscar = sc.nextInt();
        int contador = 0;
        //System.out.println("El array original es: "+Arrays.toString(array));
        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorABuscar) {
                encontrado = true;
                contador++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("El valor " + valorABuscar + " aparece: "+contador+" veces");
        if (!encontrado) {
            System.out.println("El valor " + valorABuscar + " no se encuentra en el array");
        }
    }

    public static void reversaUnArrayOrdenado(int[] array){
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        
    }

    static void invertirArray(int[] array) {
        int longitud = array.length;
        for (int i = 0; i < longitud / 2; i++) {
            // Intercambiar elementos simétricos desde ambos extremos
            int temp = array[i];
            array[i] = array[longitud - 1 - i];
            array[longitud - 1 - i] = temp;
            System.out.println(Arrays.toString(array));
        }
    }

    public static int[] pidePuntuacionesRanking(){
        int numeroJugadores = 8;
        int[] arrayPuntuaciones = new int[numeroJugadores];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrayPuntuaciones.length; i++) {
            System.out.print("Ingresa la puntuación del jugador " + (i + 1) + ": ");
            arrayPuntuaciones[i] = sc.nextInt();
        }
        Arrays.sort(arrayPuntuaciones);
        System.out.println("Array original "+Arrays.toString(arrayPuntuaciones));
        return arrayPuntuaciones;
    }

    public static void main(String[] args) {

        /* 11. Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá
        en el primer array todos los valores del 1 al 100. Por último, deberá copiar todos los
        valores del primer array al segundo array en orden inverso, y mostrar ambos por
        pantalla. */

        //dosArraysCienInt();

        /* 12. Crea un programa que cree un array de 10 enteros y luego muestre el siguiente
        menú con distintas opciones:
        a. Mostrar valores.
        b. Introducir valor.
        c. Salir.
        La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y
        una posición P, luego escribirá V en la posición P del array. El menú se repetirá
        indefinidamente hasta que el usuario elija la opción ‘c’ que terminará el programa. */

        //menuCompletaArray10();

        /* 13. Crea un programa que permita al usuario almacenar una secuencia aritmética en un
        array y luego mostrarla. Una secuencia aritmética es una serie de números que
        comienza por un valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1
        e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37…
        El programa solicitará al usuario V, I además de N (nº de valores a crear). */

        //arrayDeNConCambioP();

        /* 14. Crea un programa que cree un array de enteros e introduzca la siguiente secuencia
        de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego
        la muestre por pantalla. */

        //secuencia122333();
        
        /* 16. Crea un programa que cree un array de enteros e introduzca la siguiente secuencia
        de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego
        la muestre por pantalla. En esta ocasión has de utilizar Arrays.fill(). */

        //secuencia122333ArraysFill();

        /* 17. Crea un programa que pida al usuario 20 valores enteros e introduzca los 10
        primeros en un array y los 10 últimos en otro array. Por último, comparará ambos
        arrays y le dirá al usuario si son iguales o no. */

        //dosArraysPrimerosDiezUltimosDiez();

        /* 18. Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios
        entre 0 y 9. Luego ordena los valores del array y los mostrará por pantalla. */

        //arrayOrdenadoDe30IntAleatorioDe0A9();

        /* 19. Necesitamos crear un programa para mostrar el ranking de puntuaciones de un
        torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las
        puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800, de
        tipo entero) y luego muestre las puntuaciones en orden descendente (de la más alta a
        la más baja). */

        reversaUnArrayOrdenado(pidePuntuacionesRanking());

        /* 20. Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros
        aleatorios entre 0 y 99. Luego pedirá por teclado un valor N y se mostrará por pantalla
        si N existe en el array, además de cuantas veces. */

        //arrayCienIntEntre1Y100();
    }
}
