package Unidad11Java.ejercicioBiblioteca.gpt;

class Autor {
    private String nombre;
    private String pseudonimo;

    Autor(String nombre, String pseudonimo) {
        this.nombre = nombre;
        this.pseudonimo = pseudonimo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }
}