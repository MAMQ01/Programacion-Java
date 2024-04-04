package Unidad11Java.ejercicioBiblioteca.gpt;

class ValorIncorrecto extends Exception {
    private int valor;

    ValorIncorrecto(String mensaje, int valor) {
        super(mensaje);
        this.valor = valor;
    }

    @Override
    public String toString() {
        return super.toString() + ", valor: " + valor;
    }
}