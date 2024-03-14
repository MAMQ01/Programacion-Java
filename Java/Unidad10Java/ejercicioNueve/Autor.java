package Unidad10Java.ejercicioNueve;

public class Autor implements Comparable<Autor>{
    private final String NOMBRE;
    private final String PSEUDONIMO;

    public Autor(String nOMBRE, String pSEUDONIMO) {
        NOMBRE = nOMBRE;
        PSEUDONIMO = pSEUDONIMO;
    }
    
    @Override
    public String toString() {
        return "Autor [NOMBRE=" + NOMBRE + ", PSEUDONIMO=" + PSEUDONIMO + "]";
    }

    @Override
    public int compareTo(Autor otroAutor) {
        return this.NOMBRE.compareTo(otroAutor.NOMBRE);
    }

    
    
}
