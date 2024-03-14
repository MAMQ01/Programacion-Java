package Unidad11Java.ejercicioTres;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Comparable<Persona>{
    
    protected String nombre;
    protected int telefono;
    protected LocalDate fechanacimiento;

    public Persona(String nombre, int telefono, LocalDate fechanacimiento) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechanacimiento = fechanacimiento;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public LocalDate getFechanacimiento() {
        return fechanacimiento;
    }
    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    
    public int calcularEdad(){
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechanacimiento, fechaActual);
        return periodo.getYears();
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", telefono=" + telefono + ", fechanacimiento=" + fechanacimiento + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    @Override
    public int compareTo(Persona o) {
        return this.getNombre().compareTo(o.getNombre());
    }

}
