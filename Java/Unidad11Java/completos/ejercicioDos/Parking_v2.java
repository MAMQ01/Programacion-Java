package Unidad11Java.completos.ejercicioDos;

import java.util.LinkedList;

public class Parking_v2 {
    
    private final LinkedList<Coche_v2> cochesAparcados = new LinkedList<>();

    public static void main(String[] args) {
        Parking_v2 parking_v2 = new Parking_v2();
        parking_v2.aparcar(new Coche_v2("Nueva1"));
        parking_v2.aparcar(new Coche_v2("Nueva2"));
        parking_v2.aparcar(new Coche_v2("Nueva3"));

        parking_v2.mostrarCoches();
        parking_v2.desaparcar("Nueva2");
        parking_v2.desaparcar("Nueva3");
        System.out.println("__________________");
        parking_v2.mostrarCoches();
        System.out.println("**************");
        System.out.println(parking_v2.cochesAparcados);
    }

    public void aparcar(Coche_v2 coche) {
        try {
            if (cochesAparcados.size()<10) {
                cochesAparcados.push(coche);
            } else {
                throw new Exception("No se aparcó exitosamente.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Intentar el forEach acá
    public void desaparcar(String mATRICULA) {
        try {
            if (!cochesAparcados.isEmpty()) {
                cochesAparcados.pollLast();
                System.out.println("Se desaparcó el coche: " + mATRICULA);
            } else {
                System.err.println("No se desaparcó el coche: " + mATRICULA);
                throw new Exception();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mostrarCoches() {
        for (Coche_v2 coche : cochesAparcados) {
            System.out.println(coche);
        }
    }

}