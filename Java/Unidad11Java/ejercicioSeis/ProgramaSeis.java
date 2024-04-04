package Unidad11Java.ejercicioSeis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ProgramaSeis {
    HashMap<String, List<Jugador>> plantilla = new HashMap<>();

    public static void main(String[] args) {

        ProgramaSeis programa = new ProgramaSeis();
        HashMap<String, List<Jugador>> plantilla = programa.getPlantilla();

        Jugador j1 = new Jugador("Rámon perez", 10);
        Jugador j2 = new Jugador("Rámonn perez", 50);
        Jugador j3 = new Jugador("Rámon perez", 10);
        Jugador j4 = new Jugador("Rámn perez", 10);

        programa.agregarJugador(plantilla, "Barcelona", j1);
        programa.agregarJugador(plantilla, "Barcelona", j2);
        programa.agregarJugador(plantilla, "Barcelona", j3);
        programa.agregarJugador(plantilla, "Barcelona", j4);

        System.out.println("______MOSTRANDO JUGADORES_____");
        programa.mostrarJugadores(plantilla);

        programa.eliminarJugador(plantilla, "Barcelona", j4);
        System.out.println("______DESPUES DE ELIMINAR______");
        programa.mostrarJugadores(plantilla);

        System.out.println("_______MOSTRANDO SALARIOS_______");
        plantilla.forEach((equipo, jugadores) -> jugadores.forEach(jugador -> System.out.println("El salario de: " + jugador.getNombre()+ " es: " + jugador.getSalario())));

        programa.mostrarMenu();
        programa.mostrarJugadores(plantilla);
    }  

    public void agregarJugador(HashMap<String, List<Jugador>> plantilla, String nombreEquipo, Jugador jugador) {
        if ((!plantilla.containsKey(nombreEquipo))) {
            plantilla.put(nombreEquipo, new ArrayList<>());
        }
        plantilla.get(nombreEquipo).add(jugador);
    }

    public void mostrarJugadores(HashMap<String, List<Jugador>> plantilla) {
        plantilla.forEach((equipo, jugadores) -> {
            System.out.println("Equipo: " + equipo);
            System.out.println("Jugadores: ");
            for (Jugador jugador : jugadores) {
                System.out.println(" - " + jugador.getNombre());
            }
        });
    }

    public void eliminarJugador(HashMap<String, List<Jugador>> plantilla, String equipo, Jugador jugador) {
        plantilla.get(equipo).remove(jugador);
    }

    public double saldoJugador(Jugador jugador) {
        return jugador.getSalario();
    }
    

    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        String opcion = "";
        do {
            System.out.println("""

                Ingrese la opción a elegir
                A) Añadir jugador
                B) Eliminar jugador
                C) Consultar salario jugador
                D) Incrementar salario jugador 10%
                E) Mostrar Jugadores
                """);
                opcion = sc.nextLine().trim().toUpperCase();
                if (!opcion.matches("^[A-E]$")) {
                    System.out.println("Opcion incorrecta, intentelo de nuevo.");
                }

        } while (!opcion.matches("^[A-E]$"));
        switch (opcion.charAt(0)) {
            case 'A':
                Scanner scannerNombreEquipo = new Scanner(System.in);
                System.out.println("Ingrese el nombre de su equipo");
                String nombreEquipo = scannerNombreEquipo.nextLine();
                if (!plantilla.containsKey(nombreEquipo)) {
                    plantilla.put(nombreEquipo, new ArrayList<>());
                }
                System.out.println("Ingrese el nombre de su jugador");
                Scanner scannerNombreJugador = new Scanner(System.in);
                String nombreJugador = scannerNombreJugador.nextLine();
                System.out.println("Ingrese el salario de ese jugador");
                Scanner scannerSalarioJugador = new Scanner(System.in);
                int salarioJugador = scannerSalarioJugador.nextInt();
                agregarJugador(plantilla, nombreEquipo, new Jugador(nombreJugador, salarioJugador));
                break;
            case 'B':
                Scanner scannerNombreEquipoEliminar = new Scanner(System.in);
                System.out.println("Ingrese el nombre de su equipo");
                String nombreEquipoEliminar = scannerNombreEquipoEliminar.nextLine();
                List<Jugador> jugadoresEquipo = plantilla.get(nombreEquipoEliminar);

                System.out.println("Ingrese el nombre del jugador que va a eliminar");
                Scanner scEliminarJugador = new Scanner(System.in);
                String nombreJugadorAEliminar = scEliminarJugador.nextLine();

                if (plantilla.containsKey(nombreEquipoEliminar)) {
                    if (!plantilla.isEmpty()) {
                        boolean jugadorEncontrado = false;
                        for (Jugador jugador : jugadoresEquipo) {
                            if (jugador.getNombre().equals(nombreJugadorAEliminar)) {
                                eliminarJugador(plantilla, nombreEquipoEliminar, jugador);
                                jugadorEncontrado = true;
                                break;
                            }
                        }
                        if (!jugadorEncontrado) {
                            try {
                                throw new Exception("El jugador no se encontro.");
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        System.err.println("No hay jugadores en ese equipo.");
                    }
                } else {
                    System.err.println("No hay equipos para eliminar con ese nombre.");
                }
                break;

            case 'C':
                
                break;
                
            case 'D':
                
                break;
                
            case 'E':
                
                break;
        
            default:
            System.err.println("Valor incorrecto.");
                break;
        }
    }

    public HashMap<String, List<Jugador>> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(HashMap<String, List<Jugador>> plantilla) {
        this.plantilla = plantilla;
    }

}