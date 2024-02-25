package ejercicioAjedrez.src;

import java.awt.Point;

public class Torre extends Pieza {

    public Torre(ColorPieza colorPieza, Point posicion) {
        super(colorPieza, posicion);
    }

    @Override
    public void mover(int x, int y) {
        if (!comprobarPosicion(x) || !comprobarPosicion(y)) { // Verifica si la casilla es válida
            System.err.println("Posición no válida.");
            return;
        }
    
        if (posicion.getX() != x && posicion.getY() != y) { // Verifica si la posición a la que se mueve no es la actual
            System.err.println("Movimiento desconocido.");
            return;
        }
    
        posicion.setLocation(x, y); // Actualiza la posición a la nueva posición (x, y)
    }
    

    @Override
    public String toString() {
        return "Torre [" + super.toString();
    }

}