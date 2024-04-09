package Unidad11Java.completos.ejercicioDos;

public class Coche_v2 {

    private final String MATRICULA;

    public Coche_v2(String mATRICULA) {
        this.MATRICULA = mATRICULA;
    }

    public String getMATRICULA() {
        return MATRICULA;
    }

    @Override
    public String toString() {
        return "Coche_v2 [MATRICULA=" + MATRICULA + "]";
    }

    
}