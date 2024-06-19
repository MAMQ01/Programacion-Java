package repaso.ejercicioUno;

import java.io.Serializable;
import java.util.InputMismatchException;

public class Persona implements Comparable<Persona>, Serializable{

    private static final long SerialVersionUID = 1L;
    private String nombre;
    private int edad;
    private String correoElectronico;

    public Persona(String nombre, int edad, String correoElectronico) {
        this.nombre = nombre;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
    }

    @Override
    public int compareTo(Persona o) {
        return Integer.compare(this.edad, o.edad);
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", correoElectronico=" + correoElectronico + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    

}
