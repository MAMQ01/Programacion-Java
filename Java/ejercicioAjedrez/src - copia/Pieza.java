package ejercicioAjedrez.src;
import java.awt.Point;

abstract class Pieza implements JuegoTablero{

    protected enum ColorPieza {BLANCO, NEGRO};
    protected Point posicion;
    protected boolean comida;
    protected ColorPieza color;

    public Pieza(ColorPieza colorPieza, Point posicion) {
        this.posicion = new Point(posicion);
        if (comprobarPosicion((int)posicion.getX()) && comprobarPosicion((int)posicion.getY())) {
            this.comida = false;
        } else {
            this.comida = true;
        }
        this.color = colorPieza;
    }

    public Pieza() {
        this(ColorPieza.BLANCO, new Point(10, 10));
    }

    public Pieza(Pieza pieza) {
        this.color = pieza.getColor();
        this.comida = pieza.isComida();
        this.posicion = pieza.getPosicion();
    }

    public Point getPosicion() {
        return posicion;
    }
    public void setPosicion(Point posicion) {
        this.posicion = posicion;
    }
    public boolean isComida() {
        return comida;
    }
    public void setComida(boolean comida) {
        this.comida = comida;
    }
    public ColorPieza getColor() {
        return color;
    }
    public void setColor(ColorPieza color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pieza other = (Pieza) obj;
        if (posicion == null) {
            if (other.posicion != null)
                return false;
        } else if (!posicion.equals(other.posicion))
            return false;
        if (color != other.color)
            return false;
        return true;
    }

    protected static boolean comprobarPosicion(int p) {
        if (p>=0 && p<=7) {
            return true;
        }
        return false;
    }

    public abstract void mover(int x, int y);

    @Override
    public String toString() {
        return "posicion=" + posicion + ", comida=" + comida + ", color=" + color + "]";
    }

}
