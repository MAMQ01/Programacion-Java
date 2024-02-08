package Unidad9Java;


public class Vehiculo {
    enum Color {
        ROJO,
        BLANCO,
        NEGRO,
        ROSA;
    }
    protected String matricula;
    protected int numeroRuedas;
    protected Color color = Color.BLANCO;

    public Vehiculo(String matricula, Color color, int numeroRuedas){
        this.matricula = matricula;
        this.color = color;
        this.numeroRuedas = numeroRuedas;
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", numeroRuedas=" + numeroRuedas + ", color=" + color + "]";
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public Color getColor() {
        return color;
    }
    
    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public String getMatricula() {
        return matricula;
    }

}
