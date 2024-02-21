package Unidad9Java.macotas;

import java.time.LocalDate;

public class Canario extends Aves{
    enum Color {AZUL, VERDE, AMARILLO};
    private boolean canta;
    private Color color;

    public Canario(String nombre, LocalDate fechaNacimiento, String pico, Boolean vuela, boolean canta, Color color) {
        super(nombre, fechaNacimiento, pico, vuela);
        this.canta = canta;
        this.color = color;
    }

    @Override
    public String muestra() {
        return super.muestra() + " Canario [canta=" + (canta?" si canta":" no canta") + ", color=" + color + "]";
    }    

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
