package Unidad10Java.ejercicioNueve;

public class ValorIncorrecto extends Exception {

    private int valor;

    public ValorIncorrecto(String message, int valor) {
        super(message);
        this.valor = valor;
    }

    public ValorIncorrecto(int valor){
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ValorIncorrecto [valor=" + valor + "]";
    }

}