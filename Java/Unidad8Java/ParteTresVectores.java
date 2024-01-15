package Unidad8Java;

import java.util.Arrays;
import java.util.Scanner;

public class ParteTresVectores {

    public static void matriz1A25(){
        int[][] matriz = new int[5][5];
        int indice = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = indice;
                indice++;
            }
        }
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }

    public static void matrizTablaUnoADiez(){
        int [][] tablasUnoAlDiez = new int[10][10];
        for (int i = 1; i <= tablasUnoAlDiez.length; i++) {
            for (int j = 0; j < 10; j++) {
                tablasUnoAlDiez[i-1][j] = i * (j + 1);
            }
        }
    
        for (int i = 0; i < tablasUnoAlDiez.length; i++) {
            System.out.println(Arrays.toString(tablasUnoAlDiez[i]));
        }
    }

    public static void descubreMayoresMenoresEIgualesACero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cuantas filas tiene su matriz");
        int cantidadFilas = sc.nextInt();
        System.out.println("Introduzca cuantas columnas tiene su matriz");
        int cantidadColumnas = sc.nextInt();
        int contadorMayores = 0;
        int contadorMenores = 0;
        int contadorIgualesACero = 0;

        int [][] array = new int[cantidadFilas][cantidadColumnas];
        for (int fila = 0; fila < cantidadFilas; fila++) {
            for (int columna = 0; columna < cantidadColumnas; columna++) {
                System.out.println("Introduzca el valor de la matriz en la fila: " + fila + " y la columna: " + columna);
                System.out.println("");
                array[fila][columna] = sc.nextInt();
                if(array[fila][columna] > 0){
                    contadorMayores++;
                } else if (array[fila][columna] < 0){
                    contadorMenores++;
                } else {
                    contadorIgualesACero++;
                }
            }
        }

        for (int fila = 0; fila < cantidadFilas; fila++) {
            System.out.println(Arrays.toString(array[fila]));
        }

        System.out.println("#s Mayores: "+contadorMayores+" Menores: "+contadorMenores+" iguales a cero: "+contadorIgualesACero);
    }

    public static void notasAlumnos(){
        Scanner sc = new Scanner(System.in);
        int[][] notasAlumno = new int[4][5];
    
        for (int alumno = 0; alumno < notasAlumno.length; alumno++) {
            double notaMaxima = Double.MIN_VALUE;
            double notaMinima = Double.MAX_VALUE;
            double notaMedia = 0;
    
            for (int asignatura = 0; asignatura < notasAlumno[alumno].length; asignatura++) {
                System.out.print("Ingrese la nota del Alumno " + (alumno + 1) + " para la Asignatura " + (asignatura + 1) + ": ");
                notasAlumno[alumno][asignatura] = sc.nextInt();
    
                notaMaxima = Math.max(notaMaxima, notasAlumno[alumno][asignatura]);
                notaMinima = Math.min(notaMinima, notasAlumno[alumno][asignatura]);
                notaMedia = notaMedia + notasAlumno[alumno][asignatura];
            }

            notaMedia = notaMedia / notasAlumno[alumno].length;
            System.out.println("Estadisticas para el Alumno " + (alumno + 1) + ":");
            System.out.println("Nota máxima: " + notaMaxima);
            System.out.println("Nota mínima: " + notaMinima);
            System.out.println("Nota media: " + notaMedia);
        }
    }

    public static void main(String[] args) {
    /* 21. Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del
    1 al 25 y luego muestre la matriz por pantalla. */

    //matriz1A25();

    /* 22. Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas
    de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por
    pantalla. */

    //matrizTablaUnoADiez();

    /* 23. Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por
    teclado) e introduzca en ella NxM valores (también introducidos por teclado). Luego
    deberá recorrer la matriz y al final mostrar por pantalla cuántos valores son mayores
    que cero, cuántos son menores que cero y cuántos son igual a cero. */

    //descubreMayoresMenoresEIgualesACero();

    /* 24. Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
    “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por
    teclado y luego el programa mostrará la nota mínima, máxima y media de cada
    alumno. */

    //notasAlumnos();

    /* 25. Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
    empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por
    teclado la información de N personas distintas (valor también introducido por teclado).
    Para cada persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta
    información debe guardarse en una única matriz. Luego se mostrará por pantalla el
    sueldo medio de cada género. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de personas: ");
        int numeroDePersonas = sc.nextInt();
        double mediaSalarioHombre = 0;
        double mediaSalarioMujer = 0;
        
        double[][] matrizSueldos = new double[numeroDePersonas][2];
        for (int persona = 0; persona < matrizSueldos[persona].length; persona++) {
            System.out.println("Ingrese (0 si es hombre y 1 si es mujer)");
            int genero = sc.nextInt();
            System.out.println("Ingrese su salario");
            double salario = sc.nextDouble();
            for (int i = 0; i < matrizSueldos.length; i++) {
                if(genero==0){
                    matrizSueldos[persona][0]=salario;
                } else if (genero==1) {
                    matrizSueldos[persona][1]=salario;
                } else {
                    System.err.println("Introdujo un valor no válido");
                }
            }
            mediaSalarioHombre = (mediaSalarioHombre + matrizSueldos[persona][0]) / (persona+1);
        }

        System.out.println("La media del salario de los hombres es: "+mediaSalarioHombre);
    }
}
