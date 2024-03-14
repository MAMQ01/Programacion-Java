package Unidad11Java.ejercicioDos;

public class Coche {

    private final String MATRICULA;
    private static int contadorCoches = 1;
    private final int idUnico;

    public Coche(String mATRICULA) {
        this.MATRICULA = mATRICULA;
        idUnico = contadorCoches;
        contadorCoches++;
    }

    public String getMATRICULA() {
        return MATRICULA;
    }

    @Override
    public String toString() {
        return "Coche [MATRICULA=" + MATRICULA + ", idUnico=" + idUnico + "]";
    }

}