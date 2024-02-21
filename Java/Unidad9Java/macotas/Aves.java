package Unidad9Java.macotas;

import java.time.LocalDate;

abstract class Aves extends Mascotas {
    private String pico;
    private Boolean vuela;

    public Aves(String nombre, LocalDate fechaNacimiento, String pico, Boolean vuela) {
        super(nombre, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    public String volar() {
        if (vuela) {
            return "Está volando";
        } else {
            return "No puede volar";
        }
    }

    @Override
    public String muestra() {
        return super.muestra() + " Aves [pico=" + pico + ", vuela=" + (vuela?" si vuela":" no vuela") + "]";
    }
    
}
