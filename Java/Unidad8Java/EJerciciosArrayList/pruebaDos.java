package Unidad8Java.EJerciciosArrayList;

import java.util.ArrayList;

public class pruebaDos {
public static void main(String[] args) {
        // Crear un ArrayList bidimensional
        ArrayList<ArrayList<Integer>> arrayBidimensional = new ArrayList<>();

        // Crear la primera fila y agregar algunos valores
        ArrayList<Integer> fila1 = new ArrayList<>();
        fila1.add(1);
        fila1.add(2);
        fila1.add(3);

        // Crear la segunda fila y agregar algunos valores
        ArrayList<Integer> fila2 = new ArrayList<>();
        fila2.add(4);
        fila2.add(5);
        fila2.add(6);

        // Agregar las filas al ArrayList bidimensional
        arrayBidimensional.add(fila1);
        arrayBidimensional.add(fila2);

        // Acceder y mostrar un valor
        int valor = arrayBidimensional.get(0).get(1);
        System.out.println("Valor en la posición (0,1): " + valor);

        System.out.println(arrayBidimensional.get(1).get(2));
        // Cambiar un valor
        arrayBidimensional.get(1).set(2, 99);
        // Mostrar el nuevo valor
        System.out.println("Nuevo valor en la posición (1,2): " + arrayBidimensional.get(1).get(2));
    }
}
