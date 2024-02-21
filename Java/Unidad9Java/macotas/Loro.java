package Unidad9Java.macotas;

import java.time.LocalDate;

public class Loro extends Aves {
    private String origen;
    private boolean habla;

    public Loro(String nombre, LocalDate fechaNacimiento, String pico, Boolean vuela, String origen, boolean habla) {
        super(nombre, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    @Override
    public String muestra() {
        return super.muestra() + " Loro [origen=" + origen + ", habla=" + (habla?" si habla":" no habla") + "]";
    }

}
