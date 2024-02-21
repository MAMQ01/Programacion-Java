package Unidad9Java.macotas;

import java.time.LocalDate;
import java.time.Period;
public abstract class Mascotas {
    private String nombre;
    private int edad;
    private boolean estado = true;
    private LocalDate fechaNacimiento;

    public Mascotas(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        edad = calcularEdad();
    }

    public String muestra(){
        return "Mascotas [nombre=" + nombre + ", edad=" + getEdad() + ", estado=" + (estado?" está vivo":" está muerto") + ", fechaNacimiento="
                + fechaNacimiento + "]";
    };

    public void cumpleanyos(){

    };
    public boolean morir(){
        return estado=false;
    };
    public String habla(){
        return "Mensaje metodo hablar desde mascotas";
    };

    private int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return calcularEdad();
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

}
