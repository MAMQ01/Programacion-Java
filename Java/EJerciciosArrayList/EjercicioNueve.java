package EJerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioNueve {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
/* Ejercicio 9 - Jugando al...
Implementa el método lineas que recibe como parámetro una matriz de números
enteros que representa el tablero de un juego (de cualquier número de filas y columnas)
y retorna como resultado un ArrayList con las filas donde se haya producido una “línea”.
Cada elemento de la matriz del tablero tendrá un número entero que representa si es
está ocupada por un bloque o no. Cada número entero podrá ser:
0 – casilla vacía
1 – casilla ocupada por un bloque de color rojo
2 – casilla ocupada por un bloque de color verde
3 – casilla ocupada por un bloque de color azul
En el juego, se considera que se ha conseguido una “línea” cuando todas las casillas de la
misma fila de la matriz están ocupadas por bloques.
Por ejemplo, dada la matriz A: */

/* Líneas serían las filas 4, 5 y 7, por lo que método retornará este ArrayList
4 6 7
Para tus pruebas puedes usar esta matriz
int[][]
tablero={{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,3},{0,2,2,0,3},{2,2,1,1,3},{0,3,2,2,1},{1,3,2,2,1},
{3,3,1,2,1}}; */
        EjercicioNueve ejercicioNueve = new EjercicioNueve();
        int[][] tablero={{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,3},{0,2,2,0,3},{2,2,1,1,3},{0,3,2,2,1},{1,3,2,2,1}};
        ejercicioNueve.lineas(tablero, 7, 5);
    }

    public ArrayList<Integer> lineas(int[][] tablero, int numeroFila, int numeroColumna){
        int contadorCeros=0;
        ArrayList<Integer> listaSinCeros = new ArrayList<>();
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++){
                if (tablero[fila][columna]==0) {
                    contadorCeros++;
                }
            }
            if(contadorCeros==0){
                listaSinCeros.add(fila);
            }
            contadorCeros=0;
        }
        /* System.out.print("Las filas que sí son validas por tener valores dentro son: ");
        for (int is : listaSinCeros) {
            System.out.print(is+" ");
        } */
        return listaSinCeros;
    }
}