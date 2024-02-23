package ejercicioAjedrez.src;

import java.awt.Point;

import ejercicioAjedrez.src.Pieza.ColorPieza;

public class App {
    public static void main(String[] args) {
        Peon peonA1 = new Peon(ColorPieza.BLANCO, new Point(0, 0));
        Peon peonA2 = new Peon(ColorPieza.BLANCO, new Point(0, 1));
    }
}