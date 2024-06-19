package repaso;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Application {

    public static void main(String[] args) {
        System.out.println("Genere un numero aleatorio que escriba 6 numeros mas repetidos entre 5 millones de 1-49 para saber cual es el numero que probablemente más ganará");
        /* HashMap<Integer, Integer> par = new HashMap<>();
        int[] masRepetidos = {0,0,0,0,0,0};
        for (Map.Entry<Integer, Integer> entry : par.entrySet()) {
            par.put(ThreadLocalRandom.current().nextInt(48)+1, ThreadLocalRandom.current().nextInt(5000000));
            for (int i : masRepetidos) {
                if (entry.getValue()>i) {
                    System.out.println("El mas repetido hasta ahora es: " + entry.getValue() + " repetido: " + i);
                }
            }
        } */

        HashMap<Integer, Integer> frecuenciaNumeros = new HashMap<>();
        for (int i = 1; i < 50; i++) {
            frecuenciaNumeros.put(i, 0);
        }
        for (int i = 0; i < 5000000; i++) {
            int numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 50);
            frecuenciaNumeros.put(numeroAleatorio, frecuenciaNumeros.get(numeroAleatorio) + 1);
        }

        /* // Ordenar por frecuencia (de mayor a menor)
        List<Map.Entry<Integer, Integer>> listaEntradas = new ArrayList<>(frecuenciaNumeros.entrySet());
        listaEntradas.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Imprimir los 6 números más repetidos
        System.out.println("Los 6 números más repetidos son:");
        for (int i = 0; i < 6; i++) {
            Map.Entry<Integer, Integer> entry = listaEntradas.get(i);
            System.out.println(entry.getKey() + " (repetido " + entry.getValue() + " veces)");
        } */

        List<Map.Entry<Integer, Integer>> masRepetidos = new ArrayList<>(frecuenciaNumeros.entrySet());
        masRepetidos.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for (int i = 0; i < 6; i++) {
            Map.Entry<Integer, Integer> entry = masRepetidos.get(i);
            System.out.println(entry.getKey() + " (repetido " + entry.getValue() + " veces)");
        }
    }
}
