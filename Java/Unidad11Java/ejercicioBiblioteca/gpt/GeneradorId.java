package Unidad11Java.ejercicioBiblioteca.gpt;

class GeneradorId {
    private static int contador = 0;

    static int generarIdUnico() {
        return ++contador;
    }
}