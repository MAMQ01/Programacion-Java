package Unidad9Java.macotas;

import java.time.LocalDate;

public class Gato extends Mascotas {
    enum Color {BLANCO, NEGRO, BEIGE};
    private String peloLargo;
    private Color color;
    
    public Gato(String nombre, LocalDate fechaNacimiento, String peloLargo, Color color) {
        super(nombre, fechaNacimiento);
        this.peloLargo = peloLargo;
        this.color = color;
    }

    public String getPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(String peloLargo) {
        this.peloLargo = peloLargo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String muestra() {
        return super.muestra() + "Gato [peloLargo=" + peloLargo + ", color=" + color + "]";
    }
}
