import java.util.Random;

public class MatrizConSumasSimple {

    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10); // Tamaño de filas (0-9)
        int m = rand.nextInt(10); // Tamaño de columnas (0-9)

        int[][] matriz = new int[n][m]; // Creamos la matriz
        int[] sumasFilas = new int[n]; // Array para sumas de filas
        int[] sumasColumnas = new int[m]; // Array para sumas de columnas

        // Llenamos la matriz y calculamos sumas
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = rand.nextInt(100) + 1; // Número aleatorio (1-100)
                sumasFilas[i] += matriz[i][j]; // Sumamos a la fila actual
                sumasColumnas[j] += matriz[i][j]; // Sumamos a la columna actual
            }
        }

        // Mostramos la matriz
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }

        // Mostramos las sumas de filas
        System.out.println("Sumas de filas:");
        for (int suma : sumasFilas) {
            System.out.print(suma + "\t");
        }
        System.out.println();

        // Mostramos las sumas de columnas
        System.out.println("Sumas de columnas:");
        for (int suma : sumasColumnas) {
            System.out.print(suma + "\t");
        }
    }
}