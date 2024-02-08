package EJerciciosArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class EjercicioCinco {
    /* Ejercicio 5 – Distribución
    Realizar un programa que cree un ArrayList con 10.000 números aleatorios entre 1 y 6
    (como si fuese lanzar un dado). Utilizando los métodos estáticos de la clase Collections
    guarda en otro ArrayList la distribución de resultados obtenidos (cuantas veces ha salido
    el uno, cuantas veces ha salido el dos, etc…) y muestra su contenido. Finalmente,
    también mediante métodos de Collections, mostrar la diferencia de veces entre el
    número que más ha salido y el que menos ha salido. */
    public static void main(String[] args) {
        // Crear ArrayList con 10,000 números aleatorios entre 1 y 6
        ArrayList<Integer> diezMilNumerosAleatorios = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int numeroAleatorio = random.nextInt(6+1);
            diezMilNumerosAleatorios.add(numeroAleatorio);
        }

        // Calcular la distribución de resultados
        ArrayList<Integer> numerosUnicos = new ArrayList<>();
        ArrayList<Integer> frecuencia = new ArrayList<>();

        for (int numero : diezMilNumerosAleatorios) {
            if (!numerosUnicos.contains(numero)) {
                numerosUnicos.add(numero);
                frecuencia.add(1);
            } else {
                int index = numerosUnicos.indexOf(numero);
                frecuencia.set(index, frecuencia.get(index) + 1);
            }
        }
                // Mostrar la distribución de resultados
        System.out.println("Distribución de resultados:");
        for (int i = 0; i < numerosUnicos.size(); i++) {
            System.out.println("Número " + numerosUnicos.get(i) + ": " + frecuencia.get(i) + " veces");
        }

        // Mostrar la diferencia entre el número que más y menos ha salido
        int numeroMasFrecuente = Collections.max(frecuencia);
        int numeroMenosFrecuente = Collections.min(frecuencia);
        System.out.println("\nDiferencia entre el número que más y menos ha salido: " +
                (numeroMasFrecuente - numeroMenosFrecuente));
    }

}
