package Unidad11Java.ejercicioBiblioteca.gpt;

class PublicacionException extends Exception {
    PublicacionException(String mensaje, String valor) {
        super(mensaje + ": " + valor);
    }
}