package Unidad9Java.monopoly.src;

import java.util.ArrayList;

import Unidad9Java.monopoly.src.Terreno.ColorTerreno;

public class Tablero {
    private ArrayList<Casilla> lista = new ArrayList<>();

    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        Terreno norte = new Terreno("Casita al norte", 1000, 50, ColorTerreno.ROJO, 2);
        tablero.getLista().add(norte);
        Terreno sur = new Terreno("Casita al sur", 1000, 50, ColorTerreno.AMARILLO, 2);
        tablero.getLista().add(sur);
        System.out.println(tablero.listaTerrenos(-1));
        norte.comprar(0);
        System.out.println("______________");
        System.out.println(tablero.listaTerrenos(0));
    }

    public void mostraTablero(){
        for (Casilla casilla : lista) {
            System.out.println(casilla.toString());
            System.out.println("");
        }
    }

    public ArrayList<Casilla> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Casilla> lista) {
        this.lista = lista;
    }

    public ArrayList<Terreno> listaTerrenos(int jugador){
        ArrayList<Terreno> listaPropiedadesJugador = new ArrayList<>();
            for (Casilla casilla : lista) {
                if ((casilla instanceof Terreno) && ((Terreno) casilla).getPropietario() == jugador) {
                    listaPropiedadesJugador.add((Terreno)casilla);
                }
            }
        return listaPropiedadesJugador;
    }



}
