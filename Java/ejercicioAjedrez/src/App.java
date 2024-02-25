package ejercicioAjedrez.src;

import java.awt.Point;

import ejercicioAjedrez.src.Pieza.ColorPieza;

public class App {
    public static void main(String[] args) {
        Peon peonA1 = new Peon(ColorPieza.BLANCO, new Point(0, 2));
        Peon peonA2 = new Peon(ColorPieza.BLANCO, new Point(1, 2));
        Peon peonA3 = new Peon(ColorPieza.BLANCO, new Point(2, 2));
        Torre torre1 = new Torre(ColorPieza.BLANCO, new Point(0,0));
        Torre torre2 = new Torre(ColorPieza.BLANCO, new Point(7,0));
        peonA1.mover(0, 3);
        System.out.println(peonA1.toString());
        peonA2.mover(1, 3);
        System.out.println(peonA2.toString());
        peonA3.mover(2, 4);
        System.out.println(peonA3.toString());
        torre1.mover(5, 0);
        System.out.println(torre1.toString());
        torre2.mover(7, 7);
        System.out.println(torre2.toString());
    }
}