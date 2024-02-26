package Unidad9Java.ejercicioAjedrez.src;

import java.awt.Point;

public class Peon extends Pieza {

    public Peon(ColorPieza colorPieza, Point posicion) {
        super(colorPieza, posicion);
    }

    @Override
    public void mover(int x, int y) {
        int actualX = (int) posicion.getX();
        int actualY = (int) posicion.getY();
        int variacionX = x - actualX;
        int variacionY = y - actualY;
    
        if (!comprobarPosicion(x) || !comprobarPosicion(y)) { // Verifica si la casilla es válida
            System.err.println("Posición no válida.");
            return;
        }
    
        if (actualX == x && actualY == y) { // Verifica si la casilla no es la misma en la que está
            System.err.println("Posición inválida, debe ser distinta a la actual.");
            return;
        }
    
        if (variacionX == 0 && variacionY == 1) { // Movimiento normal de una casilla hacia adelante
            posicion.setLocation(x, y);
            return;
        }
    
        if (actualY == 2 && variacionY == 2 && variacionX == 0) { // Movimiento inicial de dos casillas hacia adelante
            posicion.setLocation(x, y);
            return;
        }
    
        if (Math.abs(variacionX) == 1 && variacionY == 1) { // Movimiento diagonal
            posicion.setLocation(x, y);
            return;
        }
    
        System.err.println("Movimiento inválido para el Peón.");
    }
    

    @Override
    public String toString() {
        return "Peon [" + super.toString();
    }

}
