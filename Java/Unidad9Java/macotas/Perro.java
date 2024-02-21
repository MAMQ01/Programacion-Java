package Unidad9Java.macotas;

import java.time.LocalDate;

public class Perro extends Mascotas{
    String raza;
    int pulgas;
    

    public Perro(String nombre, LocalDate fechaNacimiento, String raza, int pulgas) {
        super(nombre, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    @Override
    public String muestra(){
        return super.muestra()  + " Perro [raza=" + raza + ", pulgas=" + pulgas + "]";
    }
    
}
