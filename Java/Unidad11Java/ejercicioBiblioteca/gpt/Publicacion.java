package Unidad11Java.ejercicioBiblioteca.gpt;

abstract class Publicacion {
    private int id;

    Publicacion() {
        this.id = GeneradorId.generarIdUnico();
    }

    int getId() {
        return id;
    }

    abstract void mostrarEnLinea();
}