package Unidad11Java.ejercicioOcho;

import java.time.Year;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProgramaTemperaturas {

    public static void main(String[] args) {
        
        HashMap<Integer, Integer> mapaTemperaturas = new HashMap<>();
        HashMap<Integer, HashMap<Integer, Integer>> temperaturasAnuales = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el año");
        String anyo = sc.nextLine();
        try {
            if (anyo.matches("^\\d+$")) {
                int anyoInt = Integer.parseInt(anyo);
                int[] temperaturaMedia = new int[(Year.isLeap(anyoInt))?366:365];
                for (int i = 0; i < temperaturaMedia.length; i++) {
                    temperaturaMedia[i] = ThreadLocalRandom.current().nextInt(10,30);
                    mapaTemperaturas.put((i+1), temperaturaMedia[i]);
                }
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.err.println("Ingresaste un valor incorrecto, debe ser un numero entero");
            e.printStackTrace();
        }
        int anyoInt = Integer.parseInt(anyo);

        temperaturasAnuales.put(anyoInt, mapaTemperaturas);
        System.out.println("Temperaturas diarias del año " + anyoInt);
        for (Map.Entry<Integer, Integer> entry : mapaTemperaturas.entrySet()) {
            System.out.println("Dia " + entry.getKey() + " temperatura " + entry.getValue());
        }
        
    }
}