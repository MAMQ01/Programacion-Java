package Unidad9Java;

public class Moto extends Vehiculo {

    boolean carenada;

    public Moto(String matricula, Color color, int numeroRuedas, boolean carenada) {
        super(matricula, color, 2);
        this.carenada = carenada;
        this.numeroRuedas = super.getNumeroRuedas();
    }

    public boolean isCarenada() {
        return carenada;
    }

    public void setCarenada(boolean carenada) {
        this.carenada = carenada;
    }

    @Override
    public String toString() {
        return "Moto [matricula=" + matricula + ", numeroRuedas=" + numeroRuedas + ", color=" + color + "carenada==" + carenada + "]";
    }

}
