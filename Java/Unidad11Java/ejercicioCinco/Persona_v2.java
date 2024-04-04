package Unidad11Java.ejercicioCinco;

import java.time.LocalDate;
import java.time.Period;

public class Persona_v2 implements Comparable<Persona_v2>{
    
    protected String nombre;
    protected int telefono;
    protected LocalDate fechanacimiento;

    public Persona_v2(String nombre, int telefono, LocalDate fechanacimiento) {
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
        return "Persona_v2 [nombre=" + nombre + ", telefono=" + telefono + ", fechanacimiento=" + fechanacimiento + "]";
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + telefono;
        result = prime * result + ((fechanacimiento == null) ? 0 : fechanacimiento.hashCode());
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
        Persona_v2 other = (Persona_v2) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equalsIgnoreCase(other.nombre))
            return false;
        if (telefono != other.telefono)
            return false;
        if (fechanacimiento == null) {
            if (other.fechanacimiento != null)
                return false;
        } else if (!fechanacimiento.equals(other.fechanacimiento))
            return false;
        return true;
    }

    @Override
    public int compareTo(Persona_v2 o) {
        return this.getNombre().compareTo(o.getNombre());
    }

}
