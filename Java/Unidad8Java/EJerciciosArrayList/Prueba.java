package Unidad8Java.EJerciciosArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Prueba {
/*     public static void main(String[] args) {
        // Crear un array de ArrayList
        ArrayList<Integer>[] arrayDeArrayList = new ArrayList[3];

        // Inicializar cada ArrayList en el array
        for (int i = 0; i < arrayDeArrayList.length; i++) {
            arrayDeArrayList[i] = new ArrayList<>();
        }

        // Añadir elementos a los ArrayList individuales
        arrayDeArrayList[0].add(1);
        arrayDeArrayList[0].add(2);
        arrayDeArrayList[1].add(3);
        arrayDeArrayList[2].add(4);
        arrayDeArrayList[2].add(5);

        // Imprimir el contenido de cada ArrayList en el array
        for (ArrayList<Integer> arrayList : arrayDeArrayList) {
            System.out.println(arrayList);
        }
    } */
        public static void main(String[] args) {
        // Crear un ArrayList de arrays
        ArrayList<int[]> arrayListDeArrays = new ArrayList<>();

        // Crear y agregar arrays al ArrayList
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};

        arrayListDeArrays.add(array1);
        arrayListDeArrays.add(array2);
        arrayListDeArrays.add(array3);

        // Imprimir el contenido del ArrayList de arrays
        for (int[] array : arrayListDeArrays) {
            System.out.println(Arrays.toString(array));
        }
    }
}
