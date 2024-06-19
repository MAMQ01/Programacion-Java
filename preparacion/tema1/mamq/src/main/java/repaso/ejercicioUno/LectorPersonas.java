package repaso.ejercicioUno;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LectorPersonas {

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        String archivo = "tema1/mamq/src/main/resources/dato.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(archivo)))) {

            String linea;
            bufferedReader.readLine();
            String[] lineasLeidas = new String[2];
            int numeroLinea = 1;

            while ((linea = bufferedReader.readLine()) != null) {
                lineasLeidas = linea.split(",");
                if (lineasLeidas.length != 3) {
                    System.err.println("Error en la linea: " + numeroLinea + " cantidad de parámetros incorrectos");
                }
                try {
                    String nombre = lineasLeidas[0];
                    int edad = Integer.parseInt(lineasLeidas[1]);
                    String correoElectronico = lineasLeidas[2];
                    if (edad <= 0) {
                        throw new IllegalArgumentException("Edad inválida");
                    }
                    if (!correoElectronico.contains("@")) {
                        throw new IllegalArgumentException("correoElectronico no contiene @ :" + correoElectronico);
                    }
                    personas.add(new Persona(nombre, edad, correoElectronico));
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                    System.err.println("Error en la linea: " + numeroLinea);
                }
                numeroLinea++;
            }

            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream("tema1/mamq/src/main/resources/personas.ser"))) {
                objectOutputStream.writeObject(personas);
                System.out.println("Objetos serializados correctamente en personas.dat");
            } catch (IOException e) {
                System.err.println("Error al serializar: " + e.getMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o2.getNombre().compareToIgnoreCase(o2.getNombre());
            }
        });

        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }

    }
}
