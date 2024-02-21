package Unidad9Java.ejercicio;

import Unidad9Java.ejercicio.Vehiculo.Color;

public class Coche extends Vehiculo {
    
    private int peso;
    private String formaRuedas;

    @Override
    public String toString() {
        return "Coche [matricula=" + matricula + ", numeroRuedas=" + getNumeroRuedas() + ", color=" + color +
               ", peso=" + peso + ", formaRuedas=" + formaRuedas + "]";
    }

    public Coche(String matricula, Color color, String formaRuedas) {
        super(matricula, color, 4);
        this.peso = getPeso();
        this.formaRuedas = getFormaRuedas();
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int nuevoPeso){
        this.peso = nuevoPeso;
    }

    public String getFormaRuedas() {
        return formaRuedas;
    }

    public void setFormaRuedas(String nuevaFormaRuedas){
        this.formaRuedas = nuevaFormaRuedas;
    }

}