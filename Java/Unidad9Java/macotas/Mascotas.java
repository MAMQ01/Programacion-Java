package Unidad9Java.macotas;

import java.util.Date;

public abstract class Mascotas {
    private String nombre;
    private int edad;
    private boolean estado;
    private Date fechaNacimiento;

    public String muestra(){
        return "Mascotas [nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento="
                + fechaNacimiento + "]";
    };
    public void cumpleanyos(){

    };
    public boolean morir(){
        return false;
    };
    public String habla(){
        return "Mensaje metodo hablar desde mascotas";
    };

}
