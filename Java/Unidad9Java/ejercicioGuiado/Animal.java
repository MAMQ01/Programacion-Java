package Unidad9Java.ejercicioGuiado;

public class Animal {
    
    private String nombre;
    private int estancia;

    public Animal(String nombre, int estancia) {
        this.nombre = nombre;
        this.estancia = estancia;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEstancia() {
        return estancia;
    }
    public void setEstancia(int estancia) {
        this.estancia = estancia;
    }
    
}
