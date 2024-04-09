package Unidad11Java.completos.ejercicioTres;

import java.time.LocalDate;

public class Persona {
    private final String NOMBRE;
    private int telefono;
    private String email;
    private LocalDate fechaNacimiento;
    
    public Persona(String nOMBRE, int telefono, String email, LocalDate fechaNacimiento) {
        NOMBRE = nOMBRE;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona [NOMBRE=" + NOMBRE + ", telefono=" + telefono + ", email=" + email + ", fechaNacimiento="
                + fechaNacimiento + "]";
    }

    

}
