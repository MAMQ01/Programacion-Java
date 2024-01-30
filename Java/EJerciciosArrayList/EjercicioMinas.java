package EJerciciosArrayList;
import java.util.Random;
import java.util.Scanner;


public class EjercicioMinas {
    /*     1. Vamos a crear un tablero para jugar al buscaminas, El tablero será una matriz nxm de enteros, cuyos valores serán 0 o -1 si tiene o no tiene una mina. Crea una función de nombre crearTablero que se le pasan 3 números positivos, los dos primeros corresponden al tamaño de una matriz, el tercer parámetro corresponde al número de minas a poner en el tablero. La función devuelve la matriz de enteros creada.
    
    2. Crea una función tirada que tiene como parámetro una matriz de números enteros y 2 números enteros. Devuelve verdadero si en la posición de la matriz hay un -1 o falso si hay un 0. Si hay un 0 cambiará su valor por un -2.
    
    3. Crea una función de nombre mostrarMatriz a la que se le pasa una matriz de números enteros y un valor booleano. Según el valor del parámetro booleano mostrará la matriz completa o mostrará si es 0 o -1 un espacio en blanco y si es un -2 mostrará una X. Haz que la matriz se vea de forma correcta en formato filas y columnas.
    
    4. Crea una función de nombre rellenarMatriz a la que se le pasa una matriz de números enteros y recorrerá la matriz y en las casillas que tengan un 0, modificará su valor con el número de casillas adyacentes que contienen una mina (es decir, que están a su lado o en diagonal y que su valor es -1) */
    
    public static void main(String[] args) {
        EjercicioMinas mina = new EjercicioMinas();
        int[][] mapaMinas = mina.mapaMinas();
        boolean estadoCasilla = mina.tirada(mapaMinas, 0, 0);
        mina.mostrarMatriz(mapaMinas, estadoCasilla);
        mina.rellenarMatriz(mapaMinas);
    }

    public static int buscaEntero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero entero positivo");
        String numeroEntero = sc.nextLine();  
        if (numeroEntero.matches("^[0-9]+$")) {
            return Integer.parseInt(numeroEntero);
        } else {
            System.err.println("Introdujo un valor invalido, debe ser entero positivo");
            return buscaEntero();
        }
    }

    public int[][] mapaMinas(){
        int numeroFilas = buscaEntero();
        int numeroColumnas = buscaEntero();
        int[][] mapaMinas = new int[numeroFilas][numeroColumnas];
        System.out.println("Cuantas minas va a ingresar?");
        int cantidadMinas = buscaEntero();
        int conteoMinas=0;
        do {
            int fila = new Random().nextInt(numeroFilas);
            int columna = new Random().nextInt(numeroColumnas);
            if (mapaMinas[fila][columna] != -1) {
                mapaMinas[fila][columna] = -1;
                conteoMinas++;
            }
        } while (conteoMinas<cantidadMinas);
        for (int i = 0; i < mapaMinas.length; i++) {
            for (int j = 0; j < mapaMinas[i].length; j++) {
                if (mapaMinas[i][j]!=-1) {
                    mapaMinas[i][j] = 0;
                }
            }
        }
        return mapaMinas;
    }

    public boolean tirada(int[][] mapaMinas, int numeroUno, int numeroDos){
        if (mapaMinas[numeroUno][numeroDos]==-1) {
            return true;
        } else if (mapaMinas[numeroUno][numeroDos]==0){
            mapaMinas[numeroUno][numeroDos]=-2;
            return false;
        }
        return false;
    }

    public void mostrarMatriz(int[][] mapaMinas, boolean estadoCasilla){
        int[][] mapaMinasLocal = mapaMinas;
        for (int i = 0; i < mapaMinasLocal.length; i++) {
            for (int j = 0; j < mapaMinasLocal[i].length; j++) {
                if (estadoCasilla) {
                    System.out.print(mapaMinasLocal[i][j] + " ");
                } else {
                    if (mapaMinasLocal[i][j]==-1 || mapaMinasLocal[i][j]==0) {
                        System.out.print(" .");
                    } else if (mapaMinasLocal[i][j]==-2){
                        System.out.print(" X ");
                    } else {
                        System.out.print(" ..");
                    }
                }
            }
            System.out.println();
        }
    }

    public void rellenarMatriz(int[][] mapaMinas){
        System.out.println("Entrando a rellenar matriz");
        for (int i = 0; i < mapaMinas.length; i++) {
            for (int j = 0; j < mapaMinas[i].length; j++) {
                System.out.print(mapaMinas[i][j] + " ");
            }
            System.out.println();
        }
        cuentaMinas(mapaMinas);
    }

    public int cuentaMinas(int[][] mapaMinas){
        int contadorMinas=0;
        int contadorAuxiliar=0;
        for (int i = 0; i < mapaMinas.length; i++) {
            for (int j = 0; j < mapaMinas[i].length; j++) {
                contadorAuxiliar++;
                if (j < mapaMinas.length -1 && mapaMinas[i][j+1] == -1 && mapaMinas[i][j] == 0){
                    System.out.println("En la pocision " + contadorAuxiliar + " a la derecha hay mina");
                    contadorMinas++;
                }
                if (j < mapaMinas.length -1 && i < mapaMinas[j].length -1 && mapaMinas[i+1][j+1] == -1 && mapaMinas[i][j] == 0){
                    System.out.println("En la pocision " + contadorAuxiliar + " a la derecha y abajo hay mina");
                    contadorMinas++;
                } // Hasta aca funciona correctamente la validacion a la derecha y abajo a la derecha
                if (i < mapaMinas.length +1 && mapaMinas[i-1][j] == -1 && mapaMinas[i][j] == 0){
                    System.out.println("En la pocision " + contadorAuxiliar + " a la izquierda hay mina");
                }
            }
        }
        return contadorMinas;
    }
}
